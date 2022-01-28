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
        java.lang.Object obj39 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        boolean boolean18 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset16.hasListener(eventListener19);
        java.util.List list21 = defaultStatisticalCategoryDataset16.getRowKeys();
        int int22 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number25 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset10", obj7.equals(defaultStatisticalCategoryDataset10) ? obj7.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        int int16 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.util.List list21 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) '#', (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener25);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.hasListener(eventListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj6", obj5.equals(obj6) ? obj5.hashCode() == obj6.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        java.lang.Object obj33 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj34 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable38 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 10, (java.lang.Number) 97.0d, (java.lang.Comparable) (short) 0, comparable38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj33 and obj34", obj33.equals(obj34) ? obj33.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.util.List list17 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        int int21 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.util.List list22 = defaultStatisticalCategoryDataset18.getColumnKeys();
        java.lang.Number number25 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int27 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean28 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        int int29 = defaultStatisticalCategoryDataset14.getRowCount();
        int int30 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
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
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.util.List list23 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.util.List list24 = defaultStatisticalCategoryDataset20.getColumnKeys();
        int int26 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset32.addChangeListener(datasetChangeListener33);
        int int35 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset32.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        java.lang.Number number11 = defaultStatisticalCategoryDataset7.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        java.lang.Number number14 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener25);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int33 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Comparable comparable35 = null;
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1.0d, comparable35);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = defaultStatisticalCategoryDataset27.hasListener(eventListener37);
        defaultStatisticalCategoryDataset27.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup40);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset27", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset27) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int21 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) -1);
        int int23 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup28);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset16.getGroup();
        int int33 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list34 = defaultStatisticalCategoryDataset16.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset16.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset16.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        double double15 = defaultStatisticalCategoryDataset12.getRangeUpperBound(false);
        double double17 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        int int18 = defaultStatisticalCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup19);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset12", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset12) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int16 = defaultStatisticalCategoryDataset10.getRowCount();
        double double18 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        boolean boolean20 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) (short) 10);
        double double22 = defaultStatisticalCategoryDataset10.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number26 = defaultStatisticalCategoryDataset23.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int29 = defaultStatisticalCategoryDataset23.getColumnCount();
        java.lang.Comparable comparable31 = null;
        java.lang.Number number32 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 1.0d, comparable31);
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset23.hasListener(eventListener33);
        defaultStatisticalCategoryDataset23.validateObject();
        boolean boolean36 = defaultStatisticalCategoryDataset10.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.lang.Number number39 = defaultStatisticalCategoryDataset10.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.Class<?> wildcardClass27 = defaultStatisticalCategoryDataset13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        double double13 = defaultStatisticalCategoryDataset6.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) -1);
        int int21 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener22);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset14.hasListener(eventListener24);
        int int27 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (-1.0f));
        double double29 = defaultStatisticalCategoryDataset14.getRangeLowerBound(false);
        boolean boolean30 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) double29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        defaultStatisticalCategoryDataset13.add(1.0d, 100.0d, (java.lang.Comparable) 1.0f, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        int int25 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        java.lang.Number number16 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0d));
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup12", datasetGroup4.equals(datasetGroup12) ? datasetGroup4.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        defaultStatisticalCategoryDataset0.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int24 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) -1);
        int int26 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup31);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup18 and datasetGroup34", datasetGroup18.equals(datasetGroup34) ? datasetGroup18.hashCode() == datasetGroup34.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        defaultStatisticalCategoryDataset20.validateObject();
        java.lang.Number number26 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj27 = defaultStatisticalCategoryDataset20.clone();
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset20.validateObject();
        java.lang.Number number35 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double37 = defaultStatisticalCategoryDataset20.getRangeUpperBound(true);
        int int38 = defaultStatisticalCategoryDataset20.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int20 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Comparable comparable22 = null;
        java.lang.Number number23 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) 1.0d, comparable22);
        int int25 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset14.getRangeBounds(false);
        boolean boolean28 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) range27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        defaultStatisticalCategoryDataset8.validateObject();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset8.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int21 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) -1);
        int int23 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener24);
        boolean boolean26 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int32 = defaultStatisticalCategoryDataset27.getColumnCount();
        defaultStatisticalCategoryDataset27.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number40 = defaultStatisticalCategoryDataset27.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int41 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number44 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup45 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup45);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number27 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double29 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj19", defaultStatisticalCategoryDataset12.equals(obj19) ? defaultStatisticalCategoryDataset12.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        defaultStatisticalCategoryDataset3.add((double) (short) 100, (double) (byte) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1);
        java.lang.Number number14 = defaultStatisticalCategoryDataset3.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        java.util.List list15 = defaultStatisticalCategoryDataset3.getColumnKeys();
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
        double double32 = defaultStatisticalCategoryDataset16.getRangeLowerBound(false);
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset16.getRangeBounds(false);
        boolean boolean35 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) range34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        int int21 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset18.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset18.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number37 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number40 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset18.hasListener(eventListener41);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset43 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list44 = defaultStatisticalCategoryDataset43.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener45 = null;
        defaultStatisticalCategoryDataset43.addChangeListener(datasetChangeListener45);
        double double48 = defaultStatisticalCategoryDataset43.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset43.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup54 = defaultStatisticalCategoryDataset43.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup54);
        boolean boolean56 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup10 and datasetGroup54", datasetGroup10.equals(datasetGroup54) ? datasetGroup10.hashCode() == datasetGroup54.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        double double10 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        defaultStatisticalCategoryDataset28.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int35 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset28.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener44 = null;
        boolean boolean45 = defaultStatisticalCategoryDataset28.hasListener(eventListener44);
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup46);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
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
        double double25 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        double double29 = defaultStatisticalCategoryDataset26.getRangeUpperBound(false);
        double double31 = defaultStatisticalCategoryDataset26.getRangeUpperBound(true);
        org.jfree.data.Range range33 = defaultStatisticalCategoryDataset26.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset26", obj7.equals(defaultStatisticalCategoryDataset26) ? obj7.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number20 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number29 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double31 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        int int32 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset14.getGroup();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        int int35 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        java.lang.Number number8 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list12 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        double double22 = defaultStatisticalCategoryDataset17.getRangeLowerBound(true);
        java.util.List list23 = defaultStatisticalCategoryDataset17.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        java.util.List list29 = defaultStatisticalCategoryDataset24.getColumnKeys();
        int int30 = defaultStatisticalCategoryDataset24.getRowCount();
        int int32 = defaultStatisticalCategoryDataset24.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list34 = defaultStatisticalCategoryDataset33.getRowKeys();
        defaultStatisticalCategoryDataset33.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number42 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset24.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup43);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset17.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset17.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int25 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        defaultStatisticalCategoryDataset12.add((double) 1, (double) (byte) 100, (java.lang.Comparable) (short) 1, (java.lang.Comparable) true);
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset34.validateObject();
        org.jfree.data.Range range42 = defaultStatisticalCategoryDataset34.getRangeBounds(true);
        int int44 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener45 = null;
        defaultStatisticalCategoryDataset34.removeChangeListener(datasetChangeListener45);
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset34", obj7.equals(defaultStatisticalCategoryDataset34) ? obj7.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset6.getColumnCount();
        defaultStatisticalCategoryDataset6.validateObject();
        double double17 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        java.lang.Number number20 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        defaultStatisticalCategoryDataset6.add((double) 100L, (double) 100, (java.lang.Comparable) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj5", defaultStatisticalCategoryDataset0.equals(obj5) ? defaultStatisticalCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        int int26 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup24", datasetGroup8.equals(datasetGroup24) ? datasetGroup8.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number15 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int17 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) -1);
        double double19 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener20);
        int int23 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list25 = defaultStatisticalCategoryDataset24.getRowKeys();
        defaultStatisticalCategoryDataset24.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int31 = defaultStatisticalCategoryDataset24.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset24.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset24.addChangeListener(datasetChangeListener35);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number40 = defaultStatisticalCategoryDataset37.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int42 = defaultStatisticalCategoryDataset37.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int43 = defaultStatisticalCategoryDataset37.getColumnCount();
        java.lang.Comparable comparable45 = null;
        java.lang.Number number46 = defaultStatisticalCategoryDataset37.getMeanValue((java.lang.Comparable) 1.0d, comparable45);
        java.util.EventListener eventListener47 = null;
        boolean boolean48 = defaultStatisticalCategoryDataset37.hasListener(eventListener47);
        defaultStatisticalCategoryDataset37.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset37.getGroup();
        defaultStatisticalCategoryDataset24.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset37", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset37) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset37.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener18);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.util.List list23 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.util.List list24 = defaultStatisticalCategoryDataset20.getColumnKeys();
        int int26 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener30);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultStatisticalCategoryDataset32.addChangeListener(datasetChangeListener33);
        int int35 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset32.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset3.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener17);
        double double20 = defaultStatisticalCategoryDataset15.getRangeUpperBound(true);
        boolean boolean21 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset21.getColumnKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int4 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) -1);
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) -1);
        int int21 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset14.getGroup();
        int int31 = defaultStatisticalCategoryDataset14.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list32 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset14.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup34", datasetGroup4.equals(datasetGroup34) ? datasetGroup4.hashCode() == datasetGroup34.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset8.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        java.lang.Object obj22 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup11", datasetGroup8.equals(datasetGroup11) ? datasetGroup8.hashCode() == datasetGroup11.hashCode() : true);
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number29 = defaultStatisticalCategoryDataset26.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int31 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) -1);
        int int33 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int35 = defaultStatisticalCategoryDataset34.getColumnCount();
        int int37 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset26.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset26.getGroup();
        int int43 = defaultStatisticalCategoryDataset26.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list44 = defaultStatisticalCategoryDataset26.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener45 = null;
        defaultStatisticalCategoryDataset26.removeChangeListener(datasetChangeListener45);
        defaultStatisticalCategoryDataset26.add((java.lang.Number) 0L, (java.lang.Number) 2, (java.lang.Comparable) 0, (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetGroup datasetGroup52 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset5.hasListener(eventListener6);
        defaultStatisticalCategoryDataset5.validateObject();
        java.util.List list9 = defaultStatisticalCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        java.lang.Class<?> wildcardClass14 = datasetGroup12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset5", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset5) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number9 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int11 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) -1);
        double double13 = defaultStatisticalCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener14);
        int int17 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        defaultStatisticalCategoryDataset18.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int25 = defaultStatisticalCategoryDataset18.getColumnCount();
        java.lang.Number number28 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener29);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number34 = defaultStatisticalCategoryDataset31.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int36 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int37 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.lang.Comparable comparable39 = null;
        java.lang.Number number40 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 1.0d, comparable39);
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset31.hasListener(eventListener41);
        defaultStatisticalCategoryDataset31.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup44);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list20 = defaultStatisticalCategoryDataset16.getColumnKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int25 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset16.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj31 = defaultStatisticalCategoryDataset16.clone();
        boolean boolean32 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.lang.Comparable comparable35 = null;
        defaultStatisticalCategoryDataset6.add((java.lang.Number) 97.0d, (java.lang.Number) 10.0d, comparable35, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and obj31", defaultStatisticalCategoryDataset16.equals(obj31) ? defaultStatisticalCategoryDataset16.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double27 = defaultStatisticalCategoryDataset22.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int29 = defaultStatisticalCategoryDataset28.getColumnCount();
        int int31 = defaultStatisticalCategoryDataset28.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset28.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup32);
        int int35 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) '#');
        int int36 = defaultStatisticalCategoryDataset22.getRowCount();
        defaultStatisticalCategoryDataset22.add((double) '4', (double) 0L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset22.getGroup();
        java.lang.Number number45 = defaultStatisticalCategoryDataset22.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup32", datasetGroup4.equals(datasetGroup32) ? datasetGroup4.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        int int24 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Number number27 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset14", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset14) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset8.clone();
        org.jfree.data.Range range12 = defaultStatisticalCategoryDataset8.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener13);
        java.lang.Comparable comparable15 = null;
        int int16 = defaultStatisticalCategoryDataset8.getRowIndex(comparable15);
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) comparable15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup28);
        java.util.List list30 = defaultStatisticalCategoryDataset18.getRowKeys();
        double double32 = defaultStatisticalCategoryDataset18.getRangeLowerBound(true);
        int int34 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) 100);
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset18", obj7.equals(defaultStatisticalCategoryDataset18) ? obj7.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
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
        int int12 = defaultStatisticalCategoryDataset6.getColumnCount();
        java.lang.Number number15 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset6.clone();
        double double20 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj18", defaultStatisticalCategoryDataset0.equals(obj18) ? defaultStatisticalCategoryDataset0.hashCode() == obj18.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener22);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset12.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) Double.NaN, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0d);
        int int20 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset21.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset21.getRowCount();
        java.lang.Number number30 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup25", datasetGroup12.equals(datasetGroup25) ? datasetGroup12.hashCode() == datasetGroup25.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup11", datasetGroup8.equals(datasetGroup11) ? datasetGroup8.hashCode() == datasetGroup11.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int14 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int21 = defaultStatisticalCategoryDataset20.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset20.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset20.removeChangeListener(datasetChangeListener25);
        int int27 = defaultStatisticalCategoryDataset20.getColumnCount();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup19 and datasetGroup24", datasetGroup19.equals(datasetGroup24) ? datasetGroup19.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list18 = defaultStatisticalCategoryDataset17.getRowKeys();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        int int22 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number28 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double30 = defaultStatisticalCategoryDataset25.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        defaultStatisticalCategoryDataset25.setGroup(datasetGroup35);
        java.util.List list37 = defaultStatisticalCategoryDataset25.getColumnKeys();
        int int39 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) 0);
        int int41 = defaultStatisticalCategoryDataset25.getRowIndex((java.lang.Comparable) 1.0f);
        defaultStatisticalCategoryDataset25.add((double) ' ', (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset17.setGroup(datasetGroup47);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset17", obj7.equals(defaultStatisticalCategoryDataset17) ? obj7.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        double double26 = defaultStatisticalCategoryDataset23.getRangeUpperBound(false);
        double double28 = defaultStatisticalCategoryDataset23.getRangeUpperBound(true);
        int int29 = defaultStatisticalCategoryDataset23.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup30);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset8.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
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
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset20.getGroup();
        java.util.List list31 = defaultStatisticalCategoryDataset20.getRowKeys();
        double double33 = defaultStatisticalCategoryDataset20.getRangeLowerBound(true);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list17 = defaultStatisticalCategoryDataset6.getRowKeys();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset6.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        defaultStatisticalCategoryDataset19.validateObject();
        java.lang.Number number25 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) -1);
        int int34 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset27.removeChangeListener(datasetChangeListener35);
        boolean boolean37 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int39 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number42 = defaultStatisticalCategoryDataset38.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int43 = defaultStatisticalCategoryDataset38.getColumnCount();
        defaultStatisticalCategoryDataset38.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number51 = defaultStatisticalCategoryDataset38.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int52 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number55 = defaultStatisticalCategoryDataset38.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup56 = defaultStatisticalCategoryDataset38.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup56);
        defaultStatisticalCategoryDataset6.setGroup(datasetGroup56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj18", defaultStatisticalCategoryDataset0.equals(obj18) ? defaultStatisticalCategoryDataset0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int8 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultStatisticalCategoryDataset10.getColumnCount();
        java.util.List list14 = defaultStatisticalCategoryDataset10.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        defaultStatisticalCategoryDataset15.validateObject();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset15.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset10.setGroup(datasetGroup22);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) 10, (java.lang.Comparable) "", (java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int27 = defaultStatisticalCategoryDataset26.getColumnCount();
        int int29 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset26.getGroup();
        java.util.List list31 = defaultStatisticalCategoryDataset26.getColumnKeys();
        int int32 = defaultStatisticalCategoryDataset26.getRowCount();
        java.lang.Object obj33 = defaultStatisticalCategoryDataset26.clone();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset26.getGroup();
        java.util.List list35 = defaultStatisticalCategoryDataset26.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset26.addChangeListener(datasetChangeListener36);
        double double39 = defaultStatisticalCategoryDataset26.getRangeUpperBound(false);
        int int41 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset42 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list43 = defaultStatisticalCategoryDataset42.getRowKeys();
        defaultStatisticalCategoryDataset42.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int49 = defaultStatisticalCategoryDataset42.getColumnCount();
        java.lang.Number number52 = defaultStatisticalCategoryDataset42.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double54 = defaultStatisticalCategoryDataset42.getRangeLowerBound(false);
        double double56 = defaultStatisticalCategoryDataset42.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup57 = defaultStatisticalCategoryDataset42.getGroup();
        defaultStatisticalCategoryDataset26.setGroup(datasetGroup57);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset26 and obj33", defaultStatisticalCategoryDataset26.equals(obj33) ? defaultStatisticalCategoryDataset26.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        java.util.List list39 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number12 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double14 = defaultStatisticalCategoryDataset9.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        double double24 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset16.clone();
        boolean boolean26 = defaultStatisticalCategoryDataset9.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset9", obj6.equals(defaultStatisticalCategoryDataset9) ? obj6.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        java.lang.Object obj23 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj24 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj23", defaultStatisticalCategoryDataset8.equals(obj23) ? defaultStatisticalCategoryDataset8.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset6.getColumnCount();
        defaultStatisticalCategoryDataset6.validateObject();
        double double17 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        java.lang.Number number20 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        defaultStatisticalCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and defaultStatisticalCategoryDataset6", obj5.equals(defaultStatisticalCategoryDataset6) ? obj5.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        java.lang.Comparable comparable14 = null;
        java.lang.Number number15 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) 1L, comparable14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultStatisticalCategoryDataset8.getGroup();
        int int18 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup7 and datasetGroup19", datasetGroup7.equals(datasetGroup19) ? datasetGroup7.hashCode() == datasetGroup19.hashCode() : true);
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
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        double double15 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1.0f), comparable17);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        defaultStatisticalCategoryDataset19.validateObject();
        java.lang.Number number25 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset19.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset31.hasListener(eventListener32);
        java.lang.Number number36 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list38 = defaultStatisticalCategoryDataset37.getRowKeys();
        boolean boolean39 = defaultStatisticalCategoryDataset31.equals((java.lang.Object) defaultStatisticalCategoryDataset37);
        boolean boolean40 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener41 = null;
        defaultStatisticalCategoryDataset31.addChangeListener(datasetChangeListener41);
        int int43 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.lang.Number number46 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener47 = null;
        boolean boolean48 = defaultStatisticalCategoryDataset31.hasListener(eventListener47);
        boolean boolean49 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset31 and defaultStatisticalCategoryDataset37", defaultStatisticalCategoryDataset31.equals(defaultStatisticalCategoryDataset37) ? defaultStatisticalCategoryDataset31.hashCode() == defaultStatisticalCategoryDataset37.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        java.lang.Class<?> wildcardClass21 = datasetGroup19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        java.lang.Number number25 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj22", defaultStatisticalCategoryDataset18.equals(obj22) ? defaultStatisticalCategoryDataset18.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        defaultStatisticalCategoryDataset0.add((double) '#', (double) 0L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        defaultStatisticalCategoryDataset18.validateObject();
        java.lang.Number number24 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj25 = defaultStatisticalCategoryDataset18.clone();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset18.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener28);
        defaultStatisticalCategoryDataset18.validateObject();
        java.lang.Number number33 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double35 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int36 = defaultStatisticalCategoryDataset18.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj11", defaultStatisticalCategoryDataset0.equals(obj11) ? defaultStatisticalCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
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
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and defaultStatisticalCategoryDataset31", defaultStatisticalCategoryDataset25.equals(defaultStatisticalCategoryDataset31) ? defaultStatisticalCategoryDataset25.hashCode() == defaultStatisticalCategoryDataset31.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range13 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1L, (java.lang.Number) (-1L), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) 100, (java.lang.Number) 32.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Object obj23 = defaultStatisticalCategoryDataset17.clone();
        double double25 = defaultStatisticalCategoryDataset17.getRangeLowerBound(true);
        int int26 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and obj23", defaultStatisticalCategoryDataset17.equals(obj23) ? defaultStatisticalCategoryDataset17.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        defaultStatisticalCategoryDataset16.validateObject();
        java.lang.Number number22 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number27 = defaultStatisticalCategoryDataset24.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int29 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) -1);
        int int31 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset24.removeChangeListener(datasetChangeListener32);
        boolean boolean34 = defaultStatisticalCategoryDataset16.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        defaultStatisticalCategoryDataset16.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener40);
        defaultStatisticalCategoryDataset16.add((double) (short) 1, (double) 1, (java.lang.Comparable) "", (java.lang.Comparable) 100L);
        boolean boolean47 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset24", obj7.equals(defaultStatisticalCategoryDataset24) ? obj7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list17 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        double double10 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int12 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.util.List list17 = defaultStatisticalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset13.getGroup();
        java.lang.Number number23 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) 0L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup24", datasetGroup4.equals(datasetGroup24) ? datasetGroup4.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.util.List list16 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.util.List list21 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int26 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean27 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener28);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int31 = defaultStatisticalCategoryDataset30.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset30.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int35 = defaultStatisticalCategoryDataset30.getColumnCount();
        defaultStatisticalCategoryDataset30.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number43 = defaultStatisticalCategoryDataset30.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int45 = defaultStatisticalCategoryDataset30.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup46);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.lang.Number number30 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) 2, (java.lang.Comparable) 100L);
        java.lang.Object obj31 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset12.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj31", defaultStatisticalCategoryDataset18.equals(obj31) ? defaultStatisticalCategoryDataset18.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset0.hasListener(eventListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset17.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset23.hasListener(eventListener26);
        double double29 = defaultStatisticalCategoryDataset23.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset23.getGroup();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup12", datasetGroup4.equals(datasetGroup12) ? datasetGroup4.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultStatisticalCategoryDataset0.hasListener(eventListener7);
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int11 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int13 = defaultStatisticalCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset10.getGroup();
        java.util.List list15 = defaultStatisticalCategoryDataset10.getColumnKeys();
        int int16 = defaultStatisticalCategoryDataset10.getRowCount();
        java.lang.Object obj17 = defaultStatisticalCategoryDataset10.clone();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultStatisticalCategoryDataset10.getGroup();
        java.util.List list19 = defaultStatisticalCategoryDataset10.getRowKeys();
        java.lang.Class<?> wildcardClass20 = defaultStatisticalCategoryDataset10.getClass();
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup14", datasetGroup4.equals(datasetGroup14) ? datasetGroup4.hashCode() == datasetGroup14.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass10 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj9", obj6.equals(obj9) ? obj6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        int int40 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.lang.Number number18 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset11.getGroup();
        int int20 = defaultStatisticalCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup21", datasetGroup8.equals(datasetGroup21) ? datasetGroup8.hashCode() == datasetGroup21.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
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
        int int24 = defaultStatisticalCategoryDataset9.getRowCount();
        int int25 = defaultStatisticalCategoryDataset9.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset9.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset9", obj6.equals(defaultStatisticalCategoryDataset9) ? obj6.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (-1.0d), (java.lang.Comparable) 1.0f, (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double16 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset13.clone();
        double double21 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj19", defaultStatisticalCategoryDataset13.equals(obj19) ? defaultStatisticalCategoryDataset13.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list13 = defaultStatisticalCategoryDataset12.getRowKeys();
        double double15 = defaultStatisticalCategoryDataset12.getRangeUpperBound(false);
        double double17 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener18);
        java.lang.Comparable comparable20 = null;
        java.lang.Number number22 = defaultStatisticalCategoryDataset12.getStdDevValue(comparable20, (java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset12.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset24.hasListener(eventListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset24.validateObject();
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset24.getRangeBounds(true);
        int int34 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Number number37 = defaultStatisticalCategoryDataset24.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        boolean boolean16 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset14.hasListener(eventListener17);
        java.util.List list19 = defaultStatisticalCategoryDataset14.getRowKeys();
        int int20 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number23 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list25 = defaultStatisticalCategoryDataset14.getRowKeys();
        boolean boolean26 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup24", datasetGroup4.equals(datasetGroup24) ? datasetGroup4.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        java.lang.Number number26 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int26 = defaultStatisticalCategoryDataset25.getColumnCount();
        int int28 = defaultStatisticalCategoryDataset25.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset25.getGroup();
        java.util.List list30 = defaultStatisticalCategoryDataset25.getColumnKeys();
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        java.lang.Object obj32 = defaultStatisticalCategoryDataset25.clone();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset25.getGroup();
        java.util.List list34 = defaultStatisticalCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener35);
        boolean boolean37 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double16 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list24 = defaultStatisticalCategoryDataset13.getRowKeys();
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset13.getRangeBounds(false);
        boolean boolean27 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) range26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 1L, comparable23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0L);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup13 and datasetGroup21", datasetGroup13.equals(datasetGroup21) ? datasetGroup13.hashCode() == datasetGroup21.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset9.getGroup();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and defaultStatisticalCategoryDataset9", obj8.equals(defaultStatisticalCategoryDataset9) ? obj8.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.lang.Comparable comparable11 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        defaultStatisticalCategoryDataset12.validateObject();
        java.lang.Number number18 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj19 = defaultStatisticalCategoryDataset12.clone();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener22);
        java.lang.Comparable comparable24 = null;
        java.lang.Number number26 = defaultStatisticalCategoryDataset12.getStdDevValue(comparable24, (java.lang.Comparable) 100);
        int int28 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) 1L);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj19", defaultStatisticalCategoryDataset12.equals(obj19) ? defaultStatisticalCategoryDataset12.hashCode() == obj19.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        java.lang.Comparable comparable27 = null;
        java.lang.Number number28 = defaultStatisticalCategoryDataset21.getMeanValue((java.lang.Comparable) 1L, comparable27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset21", obj7.equals(defaultStatisticalCategoryDataset21) ? obj7.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 10, (java.lang.Number) 10.0d, (java.lang.Comparable) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int25 = defaultStatisticalCategoryDataset20.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int26 = defaultStatisticalCategoryDataset20.getColumnCount();
        java.lang.Comparable comparable28 = null;
        java.lang.Number number29 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) 1.0d, comparable28);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset20.hasListener(eventListener30);
        defaultStatisticalCategoryDataset20.validateObject();
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list41 = defaultStatisticalCategoryDataset40.getRowKeys();
        boolean boolean42 = defaultStatisticalCategoryDataset34.equals((java.lang.Object) defaultStatisticalCategoryDataset40);
        java.util.EventListener eventListener43 = null;
        boolean boolean44 = defaultStatisticalCategoryDataset40.hasListener(eventListener43);
        java.lang.Number number47 = defaultStatisticalCategoryDataset40.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 97.0d);
        org.jfree.data.Range range49 = defaultStatisticalCategoryDataset40.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset40.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset20.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset20.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset8.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (-1.0d), (java.lang.Comparable) 0L, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        java.lang.Number number29 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) 2, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        defaultStatisticalCategoryDataset18.add((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
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
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        java.util.List list12 = defaultStatisticalCategoryDataset7.getColumnKeys();
        int int13 = defaultStatisticalCategoryDataset7.getRowCount();
        int int15 = defaultStatisticalCategoryDataset7.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        defaultStatisticalCategoryDataset16.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number25 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset7.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup26);
        java.lang.Number number31 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup11 and datasetGroup26", datasetGroup11.equals(datasetGroup26) ? datasetGroup11.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        java.lang.Class<?> wildcardClass19 = list18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list20 = defaultStatisticalCategoryDataset16.getColumnKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int25 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset16.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj31 = defaultStatisticalCategoryDataset16.clone();
        boolean boolean32 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.lang.Number number35 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) 1L, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset6", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset6) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj12", obj7.equals(obj12) ? obj7.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset6.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        double double26 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        boolean boolean28 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) (short) 10);
        double double30 = defaultStatisticalCategoryDataset18.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number34 = defaultStatisticalCategoryDataset31.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int36 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int37 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.lang.Comparable comparable39 = null;
        java.lang.Number number40 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 1.0d, comparable39);
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset31.hasListener(eventListener41);
        defaultStatisticalCategoryDataset31.validateObject();
        boolean boolean44 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        java.lang.Number number47 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset18.getGroup();
        boolean boolean49 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) datasetGroup48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        int int14 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj13", defaultStatisticalCategoryDataset0.equals(obj13) ? defaultStatisticalCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int13 = defaultStatisticalCategoryDataset7.getRowCount();
        double double15 = defaultStatisticalCategoryDataset7.getRangeUpperBound(true);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset7.clone();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        boolean boolean19 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj16", defaultStatisticalCategoryDataset0.equals(obj16) ? defaultStatisticalCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        java.lang.Class<?> wildcardClass15 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number20 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number25 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int27 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) -1);
        int int29 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset22.removeChangeListener(datasetChangeListener30);
        boolean boolean32 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) defaultStatisticalCategoryDataset22);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int34 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.lang.Number number37 = defaultStatisticalCategoryDataset33.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int38 = defaultStatisticalCategoryDataset33.getColumnCount();
        defaultStatisticalCategoryDataset33.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number46 = defaultStatisticalCategoryDataset33.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int47 = defaultStatisticalCategoryDataset33.getColumnCount();
        java.lang.Number number50 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset22.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        java.lang.Object obj15 = defaultStatisticalCategoryDataset3.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj10", defaultStatisticalCategoryDataset4.equals(obj10) ? defaultStatisticalCategoryDataset4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int9 = defaultStatisticalCategoryDataset8.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 2);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int19 = defaultStatisticalCategoryDataset18.getColumnCount();
        int int21 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset18.getGroup();
        java.util.List list23 = defaultStatisticalCategoryDataset18.getColumnKeys();
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        java.lang.Object obj25 = defaultStatisticalCategoryDataset18.clone();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset18.getGroup();
        java.util.List list27 = defaultStatisticalCategoryDataset18.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number20 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj21 = defaultStatisticalCategoryDataset14.clone();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset14.validateObject();
        java.lang.Number number29 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double31 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        int int32 = defaultStatisticalCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset14.getGroup();
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset6.getRangeBounds(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultStatisticalCategoryDataset16.hasListener(eventListener17);
        java.lang.Number number21 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset16.validateObject();
        org.jfree.data.Range range24 = defaultStatisticalCategoryDataset16.getRangeBounds(true);
        int int25 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number28 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset16.getGroup();
        java.lang.Object obj30 = defaultStatisticalCategoryDataset16.clone();
        int int32 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 0L);
        double double34 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        boolean boolean35 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) double34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.util.List list29 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset24.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener30);
        double double33 = defaultStatisticalCategoryDataset28.getRangeUpperBound(true);
        java.lang.Object obj34 = defaultStatisticalCategoryDataset28.clone();
        double double36 = defaultStatisticalCategoryDataset28.getRangeUpperBound(true);
        java.lang.Number number39 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        java.util.List list40 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean41 = defaultStatisticalCategoryDataset24.equals((java.lang.Object) list40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0f), (java.lang.Number) 32.0d, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        java.util.List list30 = defaultStatisticalCategoryDataset27.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset31.addChangeListener(datasetChangeListener32);
        int int34 = defaultStatisticalCategoryDataset31.getColumnCount();
        java.util.List list35 = defaultStatisticalCategoryDataset31.getColumnKeys();
        java.lang.Number number38 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int40 = defaultStatisticalCategoryDataset31.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean41 = defaultStatisticalCategoryDataset27.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        defaultStatisticalCategoryDataset31.validateObject();
        defaultStatisticalCategoryDataset31.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, (java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        java.lang.Number number50 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 2);
        defaultStatisticalCategoryDataset31.add((java.lang.Number) 100.0d, (java.lang.Number) 0.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 97.0d);
        org.jfree.data.Range range57 = defaultStatisticalCategoryDataset31.getRangeBounds(true);
        java.util.EventListener eventListener58 = null;
        boolean boolean59 = defaultStatisticalCategoryDataset31.hasListener(eventListener58);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener60 = null;
        defaultStatisticalCategoryDataset31.addChangeListener(datasetChangeListener60);
        boolean boolean62 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener60);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset63 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener64 = null;
        boolean boolean65 = defaultStatisticalCategoryDataset63.hasListener(eventListener64);
        defaultStatisticalCategoryDataset63.validateObject();
        java.lang.Number number69 = defaultStatisticalCategoryDataset63.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset63.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset75 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener76 = null;
        boolean boolean77 = defaultStatisticalCategoryDataset75.hasListener(eventListener76);
        java.lang.Number number80 = defaultStatisticalCategoryDataset75.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset81 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list82 = defaultStatisticalCategoryDataset81.getRowKeys();
        boolean boolean83 = defaultStatisticalCategoryDataset75.equals((java.lang.Object) defaultStatisticalCategoryDataset81);
        boolean boolean84 = defaultStatisticalCategoryDataset63.equals((java.lang.Object) defaultStatisticalCategoryDataset75);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener85 = null;
        defaultStatisticalCategoryDataset75.addChangeListener(datasetChangeListener85);
        java.lang.Number number89 = defaultStatisticalCategoryDataset75.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
        int int91 = defaultStatisticalCategoryDataset75.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean92 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and defaultStatisticalCategoryDataset75", defaultStatisticalCategoryDataset27.equals(defaultStatisticalCategoryDataset75) ? defaultStatisticalCategoryDataset27.hashCode() == defaultStatisticalCategoryDataset75.hashCode() : true);
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
        java.lang.Number number11 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double16 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(true);
        int int19 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset8.setGroup(datasetGroup20);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
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
        int int28 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        int int30 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        java.util.List list15 = defaultStatisticalCategoryDataset4.getColumnKeys();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset4", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset4) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int9 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 100);
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list16 = defaultStatisticalCategoryDataset15.getRowKeys();
        defaultStatisticalCategoryDataset15.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int22 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int23 = defaultStatisticalCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup24", datasetGroup8.equals(datasetGroup24) ? datasetGroup8.hashCode() == datasetGroup24.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        defaultStatisticalCategoryDataset19.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int26 = defaultStatisticalCategoryDataset19.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset19.getGroup();
        int int29 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset19.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset19.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener36 = null;
        boolean boolean37 = defaultStatisticalCategoryDataset35.hasListener(eventListener36);
        defaultStatisticalCategoryDataset35.validateObject();
        java.lang.Number number41 = defaultStatisticalCategoryDataset35.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset35.removeChangeListener(datasetChangeListener42);
        java.lang.Number number46 = defaultStatisticalCategoryDataset35.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        java.lang.Number number49 = defaultStatisticalCategoryDataset35.getStdDevValue((java.lang.Comparable) '4', (java.lang.Comparable) (short) 10);
        boolean boolean50 = defaultStatisticalCategoryDataset19.equals((java.lang.Object) defaultStatisticalCategoryDataset35);
        boolean boolean51 = defaultStatisticalCategoryDataset8.equals((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset35", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset35) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset35.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset24.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset24", obj7.equals(defaultStatisticalCategoryDataset24) ? obj7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.List list9 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range11 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultStatisticalCategoryDataset18.hasListener(eventListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset18.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int24 = defaultStatisticalCategoryDataset18.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset18.removeChangeListener(datasetChangeListener25);
        java.lang.Number number29 = defaultStatisticalCategoryDataset18.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        int int30 = defaultStatisticalCategoryDataset18.getColumnCount();
        org.jfree.data.Range range32 = defaultStatisticalCategoryDataset18.getRangeBounds(false);
        boolean boolean33 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        int int29 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number32 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        java.lang.Object obj33 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj34 = defaultStatisticalCategoryDataset0.clone();
        int int35 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj33 and obj34", obj33.equals(obj34) ? obj33.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int24 = defaultStatisticalCategoryDataset23.getColumnCount();
        int int26 = defaultStatisticalCategoryDataset23.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset23.getGroup();
        java.lang.Comparable comparable29 = null;
        java.lang.Number number30 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 1L, comparable29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset23", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset23) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        java.lang.Comparable comparable26 = defaultStatisticalCategoryDataset0.getRowKey((int) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        java.util.List list30 = defaultStatisticalCategoryDataset27.getColumnKeys();
        java.util.List list31 = defaultStatisticalCategoryDataset27.getColumnKeys();
        int int33 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number36 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset27.removeChangeListener(datasetChangeListener37);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultStatisticalCategoryDataset39.getColumnCount();
        java.lang.Number number45 = defaultStatisticalCategoryDataset39.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset39.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset39.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup51);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup51);
        java.lang.Comparable comparable55 = null;
        java.lang.Number number56 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup51", datasetGroup4.equals(datasetGroup51) ? datasetGroup4.hashCode() == datasetGroup51.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        double double29 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup26", datasetGroup8.equals(datasetGroup26) ? datasetGroup8.hashCode() == datasetGroup26.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.util.List list15 = defaultStatisticalCategoryDataset11.getColumnKeys();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset11.hasListener(eventListener16);
        boolean boolean18 = defaultStatisticalCategoryDataset4.equals((java.lang.Object) eventListener16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset11", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset11) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        defaultStatisticalCategoryDataset20.validateObject();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset20.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number31 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list32 = defaultStatisticalCategoryDataset20.getColumnKeys();
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        java.util.List list35 = defaultStatisticalCategoryDataset20.getColumnKeys();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0d, (java.lang.Number) 1.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        int int33 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) 10.0f);
        double double35 = defaultStatisticalCategoryDataset27.getRangeUpperBound(false);
        java.lang.Comparable comparable37 = null;
        java.lang.Number number38 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) '4', comparable37);
        java.util.List list39 = defaultStatisticalCategoryDataset27.getColumnKeys();
        defaultStatisticalCategoryDataset27.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset27.getGroup();
        boolean boolean42 = defaultStatisticalCategoryDataset14.equals((java.lang.Object) datasetGroup41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup18 and datasetGroup41", datasetGroup18.equals(datasetGroup41) ? datasetGroup18.hashCode() == datasetGroup41.hashCode() : true);
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
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset16.removeChangeListener(datasetChangeListener31);
        java.lang.Number number35 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        java.lang.Number number38 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) '#');
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset20", obj7.equals(defaultStatisticalCategoryDataset20) ? obj7.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.util.List list3 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        int int21 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset12.getGroup();
        java.lang.Object obj26 = defaultStatisticalCategoryDataset12.clone();
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset12.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and obj26", defaultStatisticalCategoryDataset12.equals(obj26) ? defaultStatisticalCategoryDataset12.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.util.List list12 = defaultStatisticalCategoryDataset11.getRowKeys();
        defaultStatisticalCategoryDataset11.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset11.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset11.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset11.hasListener(eventListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultStatisticalCategoryDataset11.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener31 = null;
        boolean boolean32 = defaultStatisticalCategoryDataset30.hasListener(eventListener31);
        java.lang.Number number35 = defaultStatisticalCategoryDataset30.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset30.validateObject();
        org.jfree.data.Range range38 = defaultStatisticalCategoryDataset30.getRangeBounds(true);
        int int39 = defaultStatisticalCategoryDataset30.getColumnCount();
        java.lang.Number number42 = defaultStatisticalCategoryDataset30.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int44 = defaultStatisticalCategoryDataset30.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range46 = defaultStatisticalCategoryDataset30.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener47 = null;
        defaultStatisticalCategoryDataset30.addChangeListener(datasetChangeListener47);
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset11.setGroup(datasetGroup49);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset30", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset30) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset30.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0f));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number19 = defaultStatisticalCategoryDataset16.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double21 = defaultStatisticalCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup26);
        int int29 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) '#');
        int int30 = defaultStatisticalCategoryDataset16.getRowCount();
        defaultStatisticalCategoryDataset16.add((double) '4', (double) 0L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = defaultStatisticalCategoryDataset38.hasListener(eventListener39);
        java.lang.Number number43 = defaultStatisticalCategoryDataset38.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset38.validateObject();
        org.jfree.data.Range range46 = defaultStatisticalCategoryDataset38.getRangeBounds(true);
        int int47 = defaultStatisticalCategoryDataset38.getColumnCount();
        java.lang.Number number50 = defaultStatisticalCategoryDataset38.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultStatisticalCategoryDataset38.getGroup();
        java.lang.Object obj52 = defaultStatisticalCategoryDataset38.clone();
        defaultStatisticalCategoryDataset38.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset38.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup59 = defaultStatisticalCategoryDataset38.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup26 and datasetGroup59", datasetGroup26.equals(datasetGroup59) ? datasetGroup26.hashCode() == datasetGroup59.hashCode() : true);
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list15 = defaultStatisticalCategoryDataset14.getRowKeys();
        defaultStatisticalCategoryDataset14.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int21 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset14.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double26 = defaultStatisticalCategoryDataset14.getRangeLowerBound(false);
        double double28 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        double double30 = defaultStatisticalCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        java.lang.Class<?> wildcardClass33 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup31", datasetGroup12.equals(datasetGroup31) ? datasetGroup12.hashCode() == datasetGroup31.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset9.getGroup();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        double double25 = defaultStatisticalCategoryDataset9.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj8", defaultStatisticalCategoryDataset0.equals(obj8) ? defaultStatisticalCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        double double16 = defaultStatisticalCategoryDataset7.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        double double13 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        int int15 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list17 = defaultStatisticalCategoryDataset16.getRowKeys();
        defaultStatisticalCategoryDataset16.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int23 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset16.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        double double28 = defaultStatisticalCategoryDataset16.getRangeLowerBound(false);
        double double30 = defaultStatisticalCategoryDataset16.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        java.lang.Class<?> wildcardClass33 = datasetGroup31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
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
        int int28 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.util.List list30 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        java.lang.Number number16 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        int int18 = defaultStatisticalCategoryDataset10.getRowIndex((java.lang.Comparable) (-1.0f));
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset10", obj6.equals(defaultStatisticalCategoryDataset10) ? obj6.hashCode() == defaultStatisticalCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        defaultStatisticalCategoryDataset22.validateObject();
        java.lang.Number number28 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset22.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list41 = defaultStatisticalCategoryDataset40.getRowKeys();
        boolean boolean42 = defaultStatisticalCategoryDataset34.equals((java.lang.Object) defaultStatisticalCategoryDataset40);
        boolean boolean43 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultStatisticalCategoryDataset34.addChangeListener(datasetChangeListener44);
        int int46 = defaultStatisticalCategoryDataset34.getColumnCount();
        java.lang.Number number49 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener50 = null;
        boolean boolean51 = defaultStatisticalCategoryDataset34.hasListener(eventListener50);
        java.util.List list52 = defaultStatisticalCategoryDataset34.getColumnKeys();
        boolean boolean53 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset34 and defaultStatisticalCategoryDataset40", defaultStatisticalCategoryDataset34.equals(defaultStatisticalCategoryDataset40) ? defaultStatisticalCategoryDataset34.hashCode() == defaultStatisticalCategoryDataset40.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        int int19 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 10.0f);
        double double21 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) '4', comparable23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 1);
        java.lang.Number number30 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1L));
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) number30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup17", datasetGroup4.equals(datasetGroup17) ? datasetGroup4.hashCode() == datasetGroup17.hashCode() : true);
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
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset12.hasListener(eventListener29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj28", defaultStatisticalCategoryDataset18.equals(obj28) ? defaultStatisticalCategoryDataset18.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number24 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup31);
        java.util.List list33 = defaultStatisticalCategoryDataset21.getColumnKeys();
        java.lang.Number number36 = defaultStatisticalCategoryDataset21.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset21.validateObject();
        defaultStatisticalCategoryDataset21.add((double) (byte) 1, (double) 'a', (java.lang.Comparable) 10L, (java.lang.Comparable) 10.0f);
        int int44 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Comparable comparable45 = null;
        java.lang.Number number47 = defaultStatisticalCategoryDataset21.getValue(comparable45, (java.lang.Comparable) 1);
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup13 and datasetGroup31", datasetGroup13.equals(datasetGroup31) ? datasetGroup13.hashCode() == datasetGroup31.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        double double33 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.util.List list34 = defaultStatisticalCategoryDataset25.getRowKeys();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset25.hasListener(eventListener35);
        java.lang.Object obj37 = defaultStatisticalCategoryDataset25.clone();
        defaultStatisticalCategoryDataset25.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) "");
        double double44 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.lang.Number number47 = defaultStatisticalCategoryDataset25.getStdDevValue(0, 0);
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and obj37", defaultStatisticalCategoryDataset25.equals(obj37) ? defaultStatisticalCategoryDataset25.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        double double27 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
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
        int int46 = defaultStatisticalCategoryDataset28.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset28.getGroup();
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        int int50 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset28 and obj35", defaultStatisticalCategoryDataset28.equals(obj35) ? defaultStatisticalCategoryDataset28.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.util.List list30 = defaultStatisticalCategoryDataset12.getRowKeys();
        java.lang.Class<?> wildcardClass31 = list30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultStatisticalCategoryDataset0.hasListener(eventListener3);
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultStatisticalCategoryDataset0.getColumnKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) Double.NaN, (java.lang.Comparable) 100L, (java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list19 = defaultStatisticalCategoryDataset18.getRowKeys();
        double double21 = defaultStatisticalCategoryDataset18.getRangeUpperBound(false);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        int int24 = defaultStatisticalCategoryDataset18.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup25);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultStatisticalCategoryDataset13.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset13.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset13.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int31 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range33 = defaultStatisticalCategoryDataset13.getRangeBounds(true);
        java.lang.Object obj34 = defaultStatisticalCategoryDataset13.clone();
        boolean boolean35 = defaultStatisticalCategoryDataset0.equals(obj34);
        org.jfree.data.Range range37 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and obj34", defaultStatisticalCategoryDataset13.equals(obj34) ? defaultStatisticalCategoryDataset13.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        double double11 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number23 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double25 = defaultStatisticalCategoryDataset20.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int27 = defaultStatisticalCategoryDataset26.getColumnCount();
        int int29 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset20.setGroup(datasetGroup30);
        java.util.List list32 = defaultStatisticalCategoryDataset20.getRowKeys();
        java.util.List list33 = defaultStatisticalCategoryDataset20.getColumnKeys();
        java.lang.Number number36 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) '#');
        java.lang.Number number39 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1L);
        int int41 = defaultStatisticalCategoryDataset20.getRowIndex((java.lang.Comparable) 2);
        boolean boolean42 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset20", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset20) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number9 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, number9, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int14 = defaultStatisticalCategoryDataset0.getRowCount();
        int int16 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number23 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset17.clone();
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener27);
        defaultStatisticalCategoryDataset17.validateObject();
        java.lang.Number number32 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        double double34 = defaultStatisticalCategoryDataset17.getRangeUpperBound(true);
        int int35 = defaultStatisticalCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and obj24", defaultStatisticalCategoryDataset17.equals(obj24) ? defaultStatisticalCategoryDataset17.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        java.lang.Class<?> wildcardClass11 = datasetGroup10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset3", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset3) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener13);
        int int16 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultStatisticalCategoryDataset19.hasListener(eventListener20);
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int28 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range35 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset19", obj7.equals(defaultStatisticalCategoryDataset19) ? obj7.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset21.hasListener(eventListener22);
        defaultStatisticalCategoryDataset21.validateObject();
        java.lang.Number number27 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener28);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset30 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list31 = defaultStatisticalCategoryDataset30.getRowKeys();
        double double33 = defaultStatisticalCategoryDataset30.getRangeUpperBound(false);
        double double35 = defaultStatisticalCategoryDataset30.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset30.removeChangeListener(datasetChangeListener36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset30.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup38);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number13 = defaultStatisticalCategoryDataset10.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double15 = defaultStatisticalCategoryDataset10.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset10.setGroup(datasetGroup20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset10.removeChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultStatisticalCategoryDataset10.getRowKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset16", obj6.equals(defaultStatisticalCategoryDataset16) ? obj6.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        int int20 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj21 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Comparable comparable22 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset0.getStdDevValue(comparable22, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj21", defaultStatisticalCategoryDataset4.equals(obj21) ? defaultStatisticalCategoryDataset4.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
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
        defaultStatisticalCategoryDataset12.validateObject();
        defaultStatisticalCategoryDataset12.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, (java.lang.Comparable) "hi!", (java.lang.Comparable) ' ');
        java.lang.Number number31 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) 0L, (java.lang.Comparable) 2);
        double double33 = defaultStatisticalCategoryDataset12.getRangeUpperBound(true);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset8", obj7.equals(defaultStatisticalCategoryDataset8) ? obj7.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Comparable comparable11 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, comparable11);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        int int16 = defaultStatisticalCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset13.getGroup();
        java.util.List list18 = defaultStatisticalCategoryDataset13.getColumnKeys();
        int int19 = defaultStatisticalCategoryDataset13.getRowCount();
        defaultStatisticalCategoryDataset13.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup17", datasetGroup4.equals(datasetGroup17) ? datasetGroup4.hashCode() == datasetGroup17.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset0.getGroup();
        int int8 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        defaultStatisticalCategoryDataset9.validateObject();
        double double14 = defaultStatisticalCategoryDataset9.getRangeLowerBound(true);
        java.util.List list15 = defaultStatisticalCategoryDataset9.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        java.util.List list21 = defaultStatisticalCategoryDataset16.getColumnKeys();
        int int22 = defaultStatisticalCategoryDataset16.getRowCount();
        int int24 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list26 = defaultStatisticalCategoryDataset25.getRowKeys();
        defaultStatisticalCategoryDataset25.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Number number34 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset9.setGroup(datasetGroup35);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup6 and datasetGroup20", datasetGroup6.equals(datasetGroup20) ? datasetGroup6.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultStatisticalCategoryDataset17.hasListener(eventListener18);
        java.lang.Number number22 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset17.validateObject();
        org.jfree.data.Range range25 = defaultStatisticalCategoryDataset17.getRangeBounds(true);
        int int27 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultStatisticalCategoryDataset17.removeChangeListener(datasetChangeListener28);
        int int30 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Object obj31 = defaultStatisticalCategoryDataset17.clone();
        boolean boolean32 = defaultStatisticalCategoryDataset0.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset6.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset6.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        defaultStatisticalCategoryDataset8.validateObject();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset8.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset8.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number19 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list20 = defaultStatisticalCategoryDataset8.getColumnKeys();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset8.getRangeBounds(true);
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) true);
        int int24 = defaultStatisticalCategoryDataset0.getRowCount();
        double double26 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number30 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int32 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) -1);
        int int34 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset35 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int36 = defaultStatisticalCategoryDataset35.getColumnCount();
        int int38 = defaultStatisticalCategoryDataset35.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset35.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset27.add((java.lang.Number) 1L, (java.lang.Number) Double.NaN, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0d);
        boolean boolean46 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset35", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset35) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset35.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) true, (java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.util.List list14 = defaultStatisticalCategoryDataset11.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset15.addChangeListener(datasetChangeListener16);
        int int18 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.util.List list19 = defaultStatisticalCategoryDataset15.getColumnKeys();
        java.lang.Number number22 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int24 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean25 = defaultStatisticalCategoryDataset11.equals((java.lang.Object) defaultStatisticalCategoryDataset15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset11.removeChangeListener(datasetChangeListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset11.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset11);
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 100.0d, (java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0d);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        defaultStatisticalCategoryDataset0.add((double) 0L, (double) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0, (java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) '4');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100L, (java.lang.Number) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable21 = null;
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 100.0f, (java.lang.Number) 1L, (java.lang.Comparable) (byte) 10, comparable21);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list24 = defaultStatisticalCategoryDataset23.getRowKeys();
        defaultStatisticalCategoryDataset23.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int30 = defaultStatisticalCategoryDataset23.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset23.getGroup();
        int int33 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) (short) 0);
        int int35 = defaultStatisticalCategoryDataset23.getRowIndex((java.lang.Comparable) '#');
        java.lang.Number number38 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) 100.0f);
        boolean boolean39 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset40.hasListener(eventListener41);
        java.lang.Number number45 = defaultStatisticalCategoryDataset40.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list47 = defaultStatisticalCategoryDataset46.getRowKeys();
        boolean boolean48 = defaultStatisticalCategoryDataset40.equals((java.lang.Object) defaultStatisticalCategoryDataset46);
        java.util.EventListener eventListener49 = null;
        boolean boolean50 = defaultStatisticalCategoryDataset46.hasListener(eventListener49);
        double double52 = defaultStatisticalCategoryDataset46.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup53 = defaultStatisticalCategoryDataset46.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset40 and defaultStatisticalCategoryDataset46", defaultStatisticalCategoryDataset40.equals(defaultStatisticalCategoryDataset46) ? defaultStatisticalCategoryDataset40.hashCode() == defaultStatisticalCategoryDataset46.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) (-1), (double) 1L, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int18 = defaultStatisticalCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener19);
        java.lang.Number number23 = defaultStatisticalCategoryDataset12.getStdDevValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10L);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset12.hasListener(eventListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset12.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number31 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double33 = defaultStatisticalCategoryDataset28.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int35 = defaultStatisticalCategoryDataset34.getColumnCount();
        int int37 = defaultStatisticalCategoryDataset34.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset28.setGroup(datasetGroup38);
        java.util.List list40 = defaultStatisticalCategoryDataset28.getColumnKeys();
        int int42 = defaultStatisticalCategoryDataset28.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultStatisticalCategoryDataset28.removeChangeListener(datasetChangeListener43);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener45 = null;
        defaultStatisticalCategoryDataset28.removeChangeListener(datasetChangeListener45);
        java.lang.Object obj47 = defaultStatisticalCategoryDataset28.clone();
        boolean boolean48 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset34 and obj47", defaultStatisticalCategoryDataset34.equals(obj47) ? defaultStatisticalCategoryDataset34.hashCode() == obj47.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener31);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        java.lang.Number number38 = defaultStatisticalCategoryDataset33.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list40 = defaultStatisticalCategoryDataset39.getRowKeys();
        boolean boolean41 = defaultStatisticalCategoryDataset33.equals((java.lang.Object) defaultStatisticalCategoryDataset39);
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset39.hasListener(eventListener42);
        java.util.List list44 = defaultStatisticalCategoryDataset39.getRowKeys();
        int int45 = defaultStatisticalCategoryDataset39.getColumnCount();
        java.lang.Number number48 = defaultStatisticalCategoryDataset39.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup49 = defaultStatisticalCategoryDataset39.getGroup();
        java.util.List list50 = defaultStatisticalCategoryDataset39.getRowKeys();
        java.lang.Object obj51 = defaultStatisticalCategoryDataset39.clone();
        boolean boolean52 = defaultStatisticalCategoryDataset0.equals(obj51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset33", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset33) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset33.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.util.List list11 = defaultStatisticalCategoryDataset3.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 10L);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        java.lang.Object obj15 = defaultStatisticalCategoryDataset3.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.util.List list7 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number14 = defaultStatisticalCategoryDataset8.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset8.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable10 = null;
        java.lang.Number number12 = defaultStatisticalCategoryDataset0.getValue(comparable10, (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        java.util.List list16 = defaultStatisticalCategoryDataset13.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultStatisticalCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.util.List list21 = defaultStatisticalCategoryDataset17.getColumnKeys();
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int26 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean27 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset17);
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset17", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset17) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset12.removeChangeListener(datasetChangeListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and obj24", defaultStatisticalCategoryDataset18.equals(obj24) ? defaultStatisticalCategoryDataset18.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset5.addChangeListener(datasetChangeListener6);
        int int8 = defaultStatisticalCategoryDataset5.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int10 = defaultStatisticalCategoryDataset9.getColumnCount();
        int int12 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultStatisticalCategoryDataset9.getGroup();
        java.util.List list14 = defaultStatisticalCategoryDataset9.getColumnKeys();
        boolean boolean15 = defaultStatisticalCategoryDataset5.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset5.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset5 and defaultStatisticalCategoryDataset9", defaultStatisticalCategoryDataset5.equals(defaultStatisticalCategoryDataset9) ? defaultStatisticalCategoryDataset5.hashCode() == defaultStatisticalCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) '4', (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
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
        java.util.List list35 = defaultStatisticalCategoryDataset17.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Number number39 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset17 and defaultStatisticalCategoryDataset25", defaultStatisticalCategoryDataset17.equals(defaultStatisticalCategoryDataset25) ? defaultStatisticalCategoryDataset17.hashCode() == defaultStatisticalCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        double double26 = defaultStatisticalCategoryDataset14.getRangeLowerBound(false);
        double double28 = defaultStatisticalCategoryDataset14.getRangeUpperBound(true);
        double double30 = defaultStatisticalCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup31);
        int int34 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup12 and datasetGroup31", datasetGroup12.equals(datasetGroup31) ? datasetGroup12.hashCode() == datasetGroup31.hashCode() : true);
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
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultStatisticalCategoryDataset10.hasListener(eventListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset10.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset10.validateObject();
        org.jfree.data.Range range18 = defaultStatisticalCategoryDataset10.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset10.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset10.getRowCount();
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        defaultStatisticalCategoryDataset22.validateObject();
        java.lang.Number number28 = defaultStatisticalCategoryDataset22.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset22.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset34.hasListener(eventListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset34.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list41 = defaultStatisticalCategoryDataset40.getRowKeys();
        boolean boolean42 = defaultStatisticalCategoryDataset34.equals((java.lang.Object) defaultStatisticalCategoryDataset40);
        boolean boolean43 = defaultStatisticalCategoryDataset22.equals((java.lang.Object) defaultStatisticalCategoryDataset34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultStatisticalCategoryDataset34.addChangeListener(datasetChangeListener44);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultStatisticalCategoryDataset34.removeChangeListener(datasetChangeListener46);
        defaultStatisticalCategoryDataset34.add((java.lang.Number) 100L, (java.lang.Number) 100, (java.lang.Comparable) 100, (java.lang.Comparable) (-1L));
        defaultStatisticalCategoryDataset34.add((double) (-1), (double) (byte) 10, (java.lang.Comparable) true, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset34.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup59 = defaultStatisticalCategoryDataset34.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and defaultStatisticalCategoryDataset40", defaultStatisticalCategoryDataset10.equals(defaultStatisticalCategoryDataset40) ? defaultStatisticalCategoryDataset10.hashCode() == defaultStatisticalCategoryDataset40.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        java.lang.Number number32 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int33 = defaultStatisticalCategoryDataset27.getRowCount();
        double double35 = defaultStatisticalCategoryDataset27.getRangeUpperBound(true);
        double double37 = defaultStatisticalCategoryDataset27.getRangeUpperBound(false);
        java.lang.Comparable comparable40 = null;
        defaultStatisticalCategoryDataset27.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 10, comparable40, (java.lang.Comparable) '#');
        java.lang.Number number45 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        java.lang.Number number48 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        java.lang.Object obj49 = defaultStatisticalCategoryDataset27.clone();
        java.lang.Number number52 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset53 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list54 = defaultStatisticalCategoryDataset53.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener55 = null;
        defaultStatisticalCategoryDataset53.addChangeListener(datasetChangeListener55);
        double double58 = defaultStatisticalCategoryDataset53.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset53.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup64 = defaultStatisticalCategoryDataset53.getGroup();
        defaultStatisticalCategoryDataset27.setGroup(datasetGroup64);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and obj49", defaultStatisticalCategoryDataset27.equals(obj49) ? defaultStatisticalCategoryDataset27.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        java.lang.Object obj24 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        double double33 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.lang.Number number36 = defaultStatisticalCategoryDataset25.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        java.lang.Number number39 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj24", defaultStatisticalCategoryDataset11.equals(obj24) ? defaultStatisticalCategoryDataset11.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass12 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj11", obj7.equals(obj11) ? obj7.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        int int13 = defaultStatisticalCategoryDataset7.getRowIndex((java.lang.Comparable) 10.0f);
        double double15 = defaultStatisticalCategoryDataset7.getRangeUpperBound(false);
        java.lang.Comparable comparable17 = null;
        java.lang.Number number18 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) '4', comparable17);
        java.util.List list19 = defaultStatisticalCategoryDataset7.getColumnKeys();
        defaultStatisticalCategoryDataset7.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset7", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset7) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        java.lang.Object obj16 = defaultStatisticalCategoryDataset4.clone();
        java.lang.Number number19 = defaultStatisticalCategoryDataset4.getMeanValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj16", defaultStatisticalCategoryDataset0.equals(obj16) ? defaultStatisticalCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        java.util.List list12 = defaultStatisticalCategoryDataset3.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj11", defaultStatisticalCategoryDataset0.equals(obj11) ? defaultStatisticalCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        double double8 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        int int9 = defaultStatisticalCategoryDataset0.getRowCount();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        int int11 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj10", obj6.equals(obj10) ? obj6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        java.util.List list12 = defaultStatisticalCategoryDataset7.getColumnKeys();
        boolean boolean13 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener14);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset3.hasListener(eventListener16);
        int int18 = defaultStatisticalCategoryDataset3.getColumnCount();
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset7", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset7) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        double double27 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
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
        int int46 = defaultStatisticalCategoryDataset28.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultStatisticalCategoryDataset28.getGroup();
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        int int49 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset28 and obj35", defaultStatisticalCategoryDataset28.equals(obj35) ? defaultStatisticalCategoryDataset28.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int6 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        defaultStatisticalCategoryDataset7.validateObject();
        java.lang.Number number13 = defaultStatisticalCategoryDataset7.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset7.add((java.lang.Number) 1.0f, (java.lang.Number) (short) -1, (java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        defaultStatisticalCategoryDataset7.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset7.validateObject();
        java.lang.Number number24 = defaultStatisticalCategoryDataset7.getStdDevValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener25);
        int int27 = defaultStatisticalCategoryDataset7.getRowCount();
        java.lang.Comparable comparable28 = null;
        int int29 = defaultStatisticalCategoryDataset7.getColumnIndex(comparable28);
        boolean boolean30 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup20", datasetGroup4.equals(datasetGroup20) ? datasetGroup4.hashCode() == datasetGroup20.hashCode() : true);
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset12 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultStatisticalCategoryDataset12.hasListener(eventListener13);
        java.lang.Number number17 = defaultStatisticalCategoryDataset12.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset12.getRangeBounds(true);
        int int21 = defaultStatisticalCategoryDataset12.getColumnCount();
        java.lang.Number number24 = defaultStatisticalCategoryDataset12.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset12.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset12.getRowKeys();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup25", datasetGroup4.equals(datasetGroup25) ? datasetGroup4.hashCode() == datasetGroup25.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int32 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        java.lang.Object obj35 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass36 = defaultStatisticalCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj35", defaultStatisticalCategoryDataset4.equals(obj35) ? defaultStatisticalCategoryDataset4.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj5", defaultStatisticalCategoryDataset0.equals(obj5) ? defaultStatisticalCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int9 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        int int10 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset11 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultStatisticalCategoryDataset11.hasListener(eventListener12);
        java.lang.Number number16 = defaultStatisticalCategoryDataset11.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset11.validateObject();
        org.jfree.data.Range range19 = defaultStatisticalCategoryDataset11.getRangeBounds(true);
        int int21 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset11.removeChangeListener(datasetChangeListener22);
        java.lang.Object obj24 = defaultStatisticalCategoryDataset11.clone();
        int int26 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) 1L);
        java.lang.Number number28 = null;
        defaultStatisticalCategoryDataset11.add((java.lang.Number) 10.0d, number28, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset11.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.Range range35 = defaultStatisticalCategoryDataset11.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset11.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset11 and obj24", defaultStatisticalCategoryDataset11.equals(obj24) ? defaultStatisticalCategoryDataset11.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        java.lang.Number number17 = defaultStatisticalCategoryDataset3.getMeanValue((java.lang.Comparable) 100, (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        java.util.List list26 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range28 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset29 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset29.hasListener(eventListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int35 = defaultStatisticalCategoryDataset29.getRowCount();
        double double37 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        boolean boolean39 = defaultStatisticalCategoryDataset29.equals((java.lang.Object) (short) 10);
        double double41 = defaultStatisticalCategoryDataset29.getRangeLowerBound(false);
        java.lang.Number number44 = defaultStatisticalCategoryDataset29.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 10);
        defaultStatisticalCategoryDataset29.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultStatisticalCategoryDataset29.removeChangeListener(datasetChangeListener46);
        double double49 = defaultStatisticalCategoryDataset29.getRangeUpperBound(true);
        java.util.List list50 = defaultStatisticalCategoryDataset29.getRowKeys();
        boolean boolean51 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset29);
        java.lang.Object obj52 = defaultStatisticalCategoryDataset29.clone();
        java.lang.Number number55 = defaultStatisticalCategoryDataset29.getStdDevValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and obj52", defaultStatisticalCategoryDataset8.equals(obj52) ? defaultStatisticalCategoryDataset8.hashCode() == obj52.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list9 = defaultStatisticalCategoryDataset8.getRowKeys();
        double double11 = defaultStatisticalCategoryDataset8.getRangeUpperBound(false);
        double double13 = defaultStatisticalCategoryDataset8.getRangeUpperBound(true);
        int int14 = defaultStatisticalCategoryDataset8.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        java.lang.Number number20 = defaultStatisticalCategoryDataset8.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset8.removeChangeListener(datasetChangeListener21);
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset8", obj7.equals(defaultStatisticalCategoryDataset8) ? obj7.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
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
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset12.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset33 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = defaultStatisticalCategoryDataset33.hasListener(eventListener34);
        java.util.List list36 = defaultStatisticalCategoryDataset33.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultStatisticalCategoryDataset37.addChangeListener(datasetChangeListener38);
        int int40 = defaultStatisticalCategoryDataset37.getColumnCount();
        java.util.List list41 = defaultStatisticalCategoryDataset37.getColumnKeys();
        java.lang.Number number44 = defaultStatisticalCategoryDataset37.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int46 = defaultStatisticalCategoryDataset37.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean47 = defaultStatisticalCategoryDataset33.equals((java.lang.Object) defaultStatisticalCategoryDataset37);
        int int48 = defaultStatisticalCategoryDataset33.getRowCount();
        int int49 = defaultStatisticalCategoryDataset33.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset33.getGroup();
        defaultStatisticalCategoryDataset33.add((java.lang.Number) (byte) 1, (java.lang.Number) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 1L);
        java.lang.Object obj56 = defaultStatisticalCategoryDataset33.clone();
        boolean boolean57 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset37", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset37) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset37.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
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
        int int28 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        java.util.List list30 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset12 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset12.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset12.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.validateObject();
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int17 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double19 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int21 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        double double23 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset24.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        java.lang.Object obj28 = defaultStatisticalCategoryDataset24.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj7", defaultStatisticalCategoryDataset0.equals(obj7) ? defaultStatisticalCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset13.hasListener(eventListener29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number18 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int20 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int21 = defaultStatisticalCategoryDataset15.getColumnCount();
        defaultStatisticalCategoryDataset15.add((java.lang.Number) 100L, (java.lang.Number) 100.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset27.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int32 = defaultStatisticalCategoryDataset27.getColumnCount();
        defaultStatisticalCategoryDataset27.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number40 = defaultStatisticalCategoryDataset27.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int41 = defaultStatisticalCategoryDataset27.getColumnCount();
        boolean boolean42 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        java.util.List list43 = defaultStatisticalCategoryDataset27.getColumnKeys();
        org.jfree.data.Range range45 = defaultStatisticalCategoryDataset27.getRangeBounds(false);
        java.util.EventListener eventListener46 = null;
        boolean boolean47 = defaultStatisticalCategoryDataset27.hasListener(eventListener46);
        boolean boolean48 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double3 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset10 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list11 = defaultStatisticalCategoryDataset10.getRowKeys();
        double double13 = defaultStatisticalCategoryDataset10.getRangeUpperBound(false);
        double double15 = defaultStatisticalCategoryDataset10.getRangeUpperBound(true);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset10.clone();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset10.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset10 and obj16", defaultStatisticalCategoryDataset10.equals(obj16) ? defaultStatisticalCategoryDataset10.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        int int9 = defaultStatisticalCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset6.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number17 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) '#');
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset0.getGroup();
        double double21 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset22.hasListener(eventListener23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset22.validateObject();
        org.jfree.data.Range range30 = defaultStatisticalCategoryDataset22.getRangeBounds(true);
        int int31 = defaultStatisticalCategoryDataset22.getColumnCount();
        java.lang.Number number34 = defaultStatisticalCategoryDataset22.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int36 = defaultStatisticalCategoryDataset22.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range38 = defaultStatisticalCategoryDataset22.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset22.addChangeListener(datasetChangeListener39);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup41);
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
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        int int15 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        java.lang.Number number18 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset23 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset23.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset23.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int29 = defaultStatisticalCategoryDataset23.getRowCount();
        double double31 = defaultStatisticalCategoryDataset23.getRangeUpperBound(true);
        double double33 = defaultStatisticalCategoryDataset23.getRangeUpperBound(false);
        java.util.List list34 = defaultStatisticalCategoryDataset23.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset23.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset23", obj7.equals(defaultStatisticalCategoryDataset23) ? obj7.hashCode() == defaultStatisticalCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        java.util.List list16 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (byte) 0, (double) 100, (java.lang.Comparable) 2, (java.lang.Comparable) '4');
        java.util.List list22 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 0, (double) (short) 100, (java.lang.Comparable) '#', (java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener29);
        int int31 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.util.List list32 = defaultStatisticalCategoryDataset28.getColumnKeys();
        java.lang.Number number35 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int37 = defaultStatisticalCategoryDataset28.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list38 = defaultStatisticalCategoryDataset28.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset39 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultStatisticalCategoryDataset39.getColumnCount();
        java.util.List list43 = defaultStatisticalCategoryDataset39.getColumnKeys();
        java.lang.Number number46 = defaultStatisticalCategoryDataset39.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int48 = defaultStatisticalCategoryDataset39.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.List list49 = defaultStatisticalCategoryDataset39.getColumnKeys();
        boolean boolean50 = defaultStatisticalCategoryDataset28.equals((java.lang.Object) defaultStatisticalCategoryDataset39);
        int int51 = defaultStatisticalCategoryDataset39.getColumnCount();
        boolean boolean52 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) int51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset28", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset28) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number30 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        java.lang.Comparable comparable37 = null;
        java.lang.Number number38 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 1L, comparable37);
        int int39 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int40 = defaultStatisticalCategoryDataset31.getRowCount();
        boolean boolean41 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup18 and datasetGroup35", datasetGroup18.equals(datasetGroup35) ? datasetGroup18.hashCode() == datasetGroup35.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        double double33 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.util.List list34 = defaultStatisticalCategoryDataset25.getRowKeys();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset25.hasListener(eventListener35);
        java.lang.Object obj37 = defaultStatisticalCategoryDataset25.clone();
        defaultStatisticalCategoryDataset25.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) "");
        double double44 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.lang.Number number47 = defaultStatisticalCategoryDataset25.getStdDevValue(0, 0);
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        java.lang.Comparable comparable49 = null;
        java.lang.Number number51 = defaultStatisticalCategoryDataset0.getValue(comparable49, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset25 and obj37", defaultStatisticalCategoryDataset25.equals(obj37) ? defaultStatisticalCategoryDataset25.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (short) 1, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener24);
        defaultStatisticalCategoryDataset0.add((double) (short) 1, (double) 1, (java.lang.Comparable) "", (java.lang.Comparable) 100L);
        java.lang.Object obj31 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj32 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj33 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj31 and obj32", obj31.equals(obj32) ? obj31.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        int int13 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        int int14 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.Range range16 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset20 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list27 = defaultStatisticalCategoryDataset26.getRowKeys();
        boolean boolean28 = defaultStatisticalCategoryDataset20.equals((java.lang.Object) defaultStatisticalCategoryDataset26);
        java.lang.Number number31 = defaultStatisticalCategoryDataset20.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset20.addChangeListener(datasetChangeListener32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset20.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset20 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset20.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset20.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        double double5 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.util.List list6 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 100);
        int int11 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number16 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double18 = defaultStatisticalCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int20 = defaultStatisticalCategoryDataset19.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset13.setGroup(datasetGroup23);
        java.util.List list25 = defaultStatisticalCategoryDataset13.getRowKeys();
        double double27 = defaultStatisticalCategoryDataset13.getRangeLowerBound(true);
        int int29 = defaultStatisticalCategoryDataset13.getRowIndex((java.lang.Comparable) 100);
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultStatisticalCategoryDataset13.hasListener(eventListener30);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultStatisticalCategoryDataset13.hasListener(eventListener32);
        boolean boolean34 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        java.lang.Number number20 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener21);
        java.lang.Number number25 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener26);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list29 = defaultStatisticalCategoryDataset28.getRowKeys();
        defaultStatisticalCategoryDataset28.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int35 = defaultStatisticalCategoryDataset28.getColumnCount();
        java.lang.Number number38 = defaultStatisticalCategoryDataset28.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number41 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range43 = defaultStatisticalCategoryDataset28.getRangeBounds(false);
        java.lang.Number number46 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 10);
        defaultStatisticalCategoryDataset28.validateObject();
        java.util.List list48 = defaultStatisticalCategoryDataset28.getRowKeys();
        boolean boolean49 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset28);
        int int50 = defaultStatisticalCategoryDataset28.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list7 = defaultStatisticalCategoryDataset6.getRowKeys();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset6.hasListener(eventListener9);
        java.lang.Number number13 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 97.0d);
        defaultStatisticalCategoryDataset6.add((double) 100.0f, (double) 10L, (java.lang.Comparable) 1.0f, (java.lang.Comparable) true);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultStatisticalCategoryDataset6.getGroup();
        java.util.List list20 = defaultStatisticalCategoryDataset6.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        java.util.List list26 = defaultStatisticalCategoryDataset21.getColumnKeys();
        int int27 = defaultStatisticalCategoryDataset21.getRowCount();
        java.lang.Object obj28 = defaultStatisticalCategoryDataset21.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener29);
        boolean boolean31 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj28", defaultStatisticalCategoryDataset0.equals(obj28) ? defaultStatisticalCategoryDataset0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int3 = defaultStatisticalCategoryDataset2.getColumnCount();
        int int5 = defaultStatisticalCategoryDataset2.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultStatisticalCategoryDataset2.getGroup();
        java.util.List list7 = defaultStatisticalCategoryDataset2.getColumnKeys();
        int int8 = defaultStatisticalCategoryDataset2.getRowCount();
        java.lang.Object obj9 = defaultStatisticalCategoryDataset2.clone();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultStatisticalCategoryDataset2.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset2 and obj9", defaultStatisticalCategoryDataset2.equals(obj9) ? defaultStatisticalCategoryDataset2.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset8.hasListener(eventListener9);
        int int12 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) '4');
        int int14 = defaultStatisticalCategoryDataset8.getRowIndex((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultStatisticalCategoryDataset8.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (-1), (java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup7 and datasetGroup15", datasetGroup7.equals(datasetGroup15) ? datasetGroup7.hashCode() == datasetGroup15.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 100.0f);
        int int17 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int23 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (short) -1);
        int int25 = defaultStatisticalCategoryDataset18.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int27 = defaultStatisticalCategoryDataset26.getColumnCount();
        int int29 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultStatisticalCategoryDataset26.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup30);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset18.getGroup();
        int int35 = defaultStatisticalCategoryDataset18.getRowIndex((java.lang.Comparable) (-1L));
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultStatisticalCategoryDataset20.hasListener(eventListener21);
        defaultStatisticalCategoryDataset20.validateObject();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset20.hasListener(eventListener24);
        java.lang.Number number28 = defaultStatisticalCategoryDataset20.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
        java.lang.Number number31 = defaultStatisticalCategoryDataset20.getStdDevValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
        java.util.List list32 = defaultStatisticalCategoryDataset20.getColumnKeys();
        org.jfree.data.Range range34 = defaultStatisticalCategoryDataset20.getRangeBounds(true);
        java.util.List list35 = defaultStatisticalCategoryDataset20.getColumnKeys();
        boolean boolean36 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset20);
        defaultStatisticalCategoryDataset20.add((java.lang.Number) 100, (java.lang.Number) 10L, (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset0.hasListener(eventListener14);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset0.clone();
        int int18 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj16", defaultStatisticalCategoryDataset7.equals(obj16) ? defaultStatisticalCategoryDataset7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int2 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        int int6 = defaultStatisticalCategoryDataset3.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int8 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int10 = defaultStatisticalCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset7.getGroup();
        java.util.List list12 = defaultStatisticalCategoryDataset7.getColumnKeys();
        boolean boolean13 = defaultStatisticalCategoryDataset3.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultStatisticalCategoryDataset3.removeChangeListener(datasetChangeListener14);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset3.hasListener(eventListener16);
        int int18 = defaultStatisticalCategoryDataset3.getColumnCount();
        boolean boolean19 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        double double21 = defaultStatisticalCategoryDataset3.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset7", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset7) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset24.getGroup();
        boolean boolean27 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset24);
        double double29 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset24", obj7.equals(defaultStatisticalCategoryDataset24) ? obj7.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number4 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int5 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int7 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 0.0d);
        java.util.List list14 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number18 = defaultStatisticalCategoryDataset15.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double20 = defaultStatisticalCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int22 = defaultStatisticalCategoryDataset21.getColumnCount();
        int int24 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup25);
        double double28 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        int int29 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.util.List list30 = defaultStatisticalCategoryDataset15.getRowKeys();
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset5 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultStatisticalCategoryDataset5.hasListener(eventListener6);
        defaultStatisticalCategoryDataset5.validateObject();
        java.util.List list9 = defaultStatisticalCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset5.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset5.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup12);
        double double15 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int17 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int19 = defaultStatisticalCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset5 and defaultStatisticalCategoryDataset16", defaultStatisticalCategoryDataset5.equals(defaultStatisticalCategoryDataset16) ? defaultStatisticalCategoryDataset5.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        int int6 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0d, comparable8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset0.hasListener(eventListener10);
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
        int int28 = defaultStatisticalCategoryDataset12.getRowIndex((java.lang.Comparable) 1.0f);
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset12);
        int int31 = defaultStatisticalCategoryDataset12.getColumnIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset18", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset18) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultStatisticalCategoryDataset0.equals(obj9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        java.lang.Number number15 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 'a');
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
        java.lang.Comparable comparable42 = defaultStatisticalCategoryDataset16.getRowKey((int) (byte) 0);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset43 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener44 = null;
        boolean boolean45 = defaultStatisticalCategoryDataset43.hasListener(eventListener44);
        java.util.List list46 = defaultStatisticalCategoryDataset43.getColumnKeys();
        java.util.List list47 = defaultStatisticalCategoryDataset43.getColumnKeys();
        int int49 = defaultStatisticalCategoryDataset43.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number52 = defaultStatisticalCategoryDataset43.getStdDevValue((java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener53 = null;
        defaultStatisticalCategoryDataset43.removeChangeListener(datasetChangeListener53);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset55 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener56 = null;
        defaultStatisticalCategoryDataset55.addChangeListener(datasetChangeListener56);
        int int58 = defaultStatisticalCategoryDataset55.getColumnCount();
        java.lang.Number number61 = defaultStatisticalCategoryDataset55.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset55.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup67 = defaultStatisticalCategoryDataset55.getGroup();
        defaultStatisticalCategoryDataset43.setGroup(datasetGroup67);
        defaultStatisticalCategoryDataset16.setGroup(datasetGroup67);
        boolean boolean70 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup20 and datasetGroup67", datasetGroup20.equals(datasetGroup67) ? datasetGroup20.hashCode() == datasetGroup67.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        int int18 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0.0f, (java.lang.Number) 100.0f, (java.lang.Comparable) '#', (java.lang.Comparable) 100);
        java.lang.Number number26 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultStatisticalCategoryDataset27.hasListener(eventListener28);
        defaultStatisticalCategoryDataset27.validateObject();
        java.lang.Number number33 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        java.lang.Object obj34 = defaultStatisticalCategoryDataset27.clone();
        org.jfree.data.Range range36 = defaultStatisticalCategoryDataset27.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener37);
        defaultStatisticalCategoryDataset27.validateObject();
        java.lang.Number number42 = defaultStatisticalCategoryDataset27.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 1);
        int int44 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (byte) 100);
        double double46 = defaultStatisticalCategoryDataset27.getRangeUpperBound(true);
        int int48 = defaultStatisticalCategoryDataset27.getRowIndex((java.lang.Comparable) false);
        double double50 = defaultStatisticalCategoryDataset27.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener51 = null;
        defaultStatisticalCategoryDataset27.addChangeListener(datasetChangeListener51);
        boolean boolean53 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset27);
        double double55 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset27 and obj34", defaultStatisticalCategoryDataset27.equals(obj34) ? defaultStatisticalCategoryDataset27.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        defaultStatisticalCategoryDataset0.add(0.0d, (double) (byte) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int14 = defaultStatisticalCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        double double24 = defaultStatisticalCategoryDataset21.getRangeUpperBound(false);
        double double26 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        int int27 = defaultStatisticalCategoryDataset21.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset21.getGroup();
        boolean boolean29 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) datasetGroup28);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
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
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        double double14 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj17 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj18 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset6 and obj17", defaultStatisticalCategoryDataset6.equals(obj17) ? defaultStatisticalCategoryDataset6.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        java.lang.Number number21 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int22 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int32 = defaultStatisticalCategoryDataset17.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup33);
        java.lang.Object obj35 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset36 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list37 = defaultStatisticalCategoryDataset36.getRowKeys();
        double double39 = defaultStatisticalCategoryDataset36.getRangeUpperBound(false);
        double double41 = defaultStatisticalCategoryDataset36.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultStatisticalCategoryDataset36.removeChangeListener(datasetChangeListener42);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset36.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and obj35", defaultStatisticalCategoryDataset4.equals(obj35) ? defaultStatisticalCategoryDataset4.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
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
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup32", datasetGroup4.equals(datasetGroup32) ? datasetGroup4.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        org.jfree.data.Range range15 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        double double17 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number21 = defaultStatisticalCategoryDataset18.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double23 = defaultStatisticalCategoryDataset18.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset24 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int25 = defaultStatisticalCategoryDataset24.getColumnCount();
        int int27 = defaultStatisticalCategoryDataset24.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset24.getGroup();
        defaultStatisticalCategoryDataset18.setGroup(datasetGroup28);
        java.util.List list30 = defaultStatisticalCategoryDataset18.getColumnKeys();
        double double32 = defaultStatisticalCategoryDataset18.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset18.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultStatisticalCategoryDataset18.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset24", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset24) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        int int24 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number27 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int29 = defaultStatisticalCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range31 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        defaultStatisticalCategoryDataset15.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultStatisticalCategoryDataset15.getGroup();
        defaultStatisticalCategoryDataset7.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj6", defaultStatisticalCategoryDataset0.equals(obj6) ? defaultStatisticalCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultStatisticalCategoryDataset0.hasListener(eventListener4);
        defaultStatisticalCategoryDataset0.add((double) (-1.0f), (double) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 10);
        double double12 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
        defaultStatisticalCategoryDataset0.add((double) 2, (double) 10.0f, (java.lang.Comparable) 10, (java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset18 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset18.addChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset21.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultStatisticalCategoryDataset18.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        int int26 = defaultStatisticalCategoryDataset21.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Comparable comparable6 = null;
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, comparable6);
        java.lang.Number number10 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 3, (java.lang.Number) 97.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 1L, comparable23);
        java.lang.Number number27 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 1L);
        java.lang.Number number30 = defaultStatisticalCategoryDataset17.getStdDevValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0L);
        boolean boolean31 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup21", datasetGroup4.equals(datasetGroup21) ? datasetGroup4.hashCode() == datasetGroup21.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Number number11 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        int int13 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener15);
        int int17 = defaultStatisticalCategoryDataset14.getColumnCount();
        int int18 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.util.List list19 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.Range range21 = defaultStatisticalCategoryDataset14.getRangeBounds(false);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultStatisticalCategoryDataset14.hasListener(eventListener22);
        java.util.List list24 = defaultStatisticalCategoryDataset14.getRowKeys();
        boolean boolean25 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list24);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset26 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = defaultStatisticalCategoryDataset26.hasListener(eventListener27);
        java.lang.Number number31 = defaultStatisticalCategoryDataset26.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int32 = defaultStatisticalCategoryDataset26.getRowCount();
        double double34 = defaultStatisticalCategoryDataset26.getRangeUpperBound(true);
        int int36 = defaultStatisticalCategoryDataset26.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset37 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list38 = defaultStatisticalCategoryDataset37.getRowKeys();
        defaultStatisticalCategoryDataset37.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int44 = defaultStatisticalCategoryDataset37.getColumnCount();
        java.lang.Number number47 = defaultStatisticalCategoryDataset37.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset37.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener53 = null;
        boolean boolean54 = defaultStatisticalCategoryDataset37.hasListener(eventListener53);
        org.jfree.data.general.DatasetGroup datasetGroup55 = defaultStatisticalCategoryDataset37.getGroup();
        java.lang.Comparable comparable57 = null;
        java.lang.Number number58 = defaultStatisticalCategoryDataset37.getValue((java.lang.Comparable) (short) 10, comparable57);
        defaultStatisticalCategoryDataset37.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        java.lang.Number number66 = defaultStatisticalCategoryDataset37.getValue((java.lang.Comparable) 1, (java.lang.Comparable) 2);
        int int67 = defaultStatisticalCategoryDataset37.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener68 = null;
        defaultStatisticalCategoryDataset37.removeChangeListener(datasetChangeListener68);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener70 = null;
        defaultStatisticalCategoryDataset37.addChangeListener(datasetChangeListener70);
        boolean boolean72 = defaultStatisticalCategoryDataset26.equals((java.lang.Object) datasetChangeListener70);
        boolean boolean73 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetChangeListener70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset26", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset26) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.lang.Number number7 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Comparable comparable11 = null;
        defaultStatisticalCategoryDataset0.add((double) (short) 100, (double) 0L, (java.lang.Comparable) '4', comparable11);
        defaultStatisticalCategoryDataset0.add((double) 100, (double) 1, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 1L);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number22 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int24 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (short) -1);
        int int26 = defaultStatisticalCategoryDataset19.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset19.setGroup(datasetGroup31);
        defaultStatisticalCategoryDataset19.validateObject();
        java.util.List list34 = defaultStatisticalCategoryDataset19.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener35);
        java.lang.Number number39 = defaultStatisticalCategoryDataset19.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener40);
        int int42 = defaultStatisticalCategoryDataset19.getColumnCount();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup31", datasetGroup4.equals(datasetGroup31) ? datasetGroup4.hashCode() == datasetGroup31.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        java.lang.Number number24 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset19.validateObject();
        org.jfree.data.Range range27 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        int int28 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.lang.Number number31 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
        int int33 = defaultStatisticalCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.Range range35 = defaultStatisticalCategoryDataset19.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup38);
        int int41 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 32.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup18 and datasetGroup38", datasetGroup18.equals(datasetGroup38) ? datasetGroup18.hashCode() == datasetGroup38.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable13 = null;
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 100.0f, comparable13);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset15.hasListener(eventListener16);
        java.lang.Number number20 = defaultStatisticalCategoryDataset15.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list22 = defaultStatisticalCategoryDataset21.getRowKeys();
        boolean boolean23 = defaultStatisticalCategoryDataset15.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset21.hasListener(eventListener24);
        double double27 = defaultStatisticalCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultStatisticalCategoryDataset21.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset15 and defaultStatisticalCategoryDataset21", defaultStatisticalCategoryDataset15.equals(defaultStatisticalCategoryDataset21) ? defaultStatisticalCategoryDataset15.hashCode() == defaultStatisticalCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        defaultStatisticalCategoryDataset0.validateObject();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (byte) -1, (java.lang.Number) (-1), (java.lang.Comparable) "hi!", (java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset17 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int18 = defaultStatisticalCategoryDataset17.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultStatisticalCategoryDataset17.getGroup();
        java.lang.Comparable comparable23 = null;
        java.lang.Number number24 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 1L, comparable23);
        int int25 = defaultStatisticalCategoryDataset17.getColumnCount();
        defaultStatisticalCategoryDataset17.add(0.0d, (double) 100L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable32 = null;
        java.lang.Number number33 = defaultStatisticalCategoryDataset17.getMeanValue((java.lang.Comparable) 1, comparable32);
        defaultStatisticalCategoryDataset17.add((java.lang.Number) (short) -1, (java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '#');
        java.lang.Number number41 = defaultStatisticalCategoryDataset17.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = defaultStatisticalCategoryDataset17.hasListener(eventListener42);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultStatisticalCategoryDataset17.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup44", datasetGroup8.equals(datasetGroup44) ? datasetGroup8.hashCode() == datasetGroup44.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        defaultStatisticalCategoryDataset0.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int7 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultStatisticalCategoryDataset0.getGroup();
        int int10 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int12 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        defaultStatisticalCategoryDataset0.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        java.util.List list18 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset19.addChangeListener(datasetChangeListener20);
        int int22 = defaultStatisticalCategoryDataset19.getColumnCount();
        java.util.List list23 = defaultStatisticalCategoryDataset19.getColumnKeys();
        java.lang.Number number26 = defaultStatisticalCategoryDataset19.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset19.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup27);
        int int29 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup8 and datasetGroup27", datasetGroup8.equals(datasetGroup27) ? datasetGroup8.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list26 = defaultStatisticalCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultStatisticalCategoryDataset25.addChangeListener(datasetChangeListener27);
        double double30 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        defaultStatisticalCategoryDataset25.add((double) 100, (double) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset25.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup36);
        java.lang.Object obj38 = defaultStatisticalCategoryDataset0.clone();
        int int39 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset40 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list41 = defaultStatisticalCategoryDataset40.getRowKeys();
        defaultStatisticalCategoryDataset40.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int47 = defaultStatisticalCategoryDataset40.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultStatisticalCategoryDataset40.getGroup();
        int int49 = defaultStatisticalCategoryDataset40.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset50 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int51 = defaultStatisticalCategoryDataset50.getColumnCount();
        java.lang.Number number54 = defaultStatisticalCategoryDataset50.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int55 = defaultStatisticalCategoryDataset50.getColumnCount();
        defaultStatisticalCategoryDataset50.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number63 = defaultStatisticalCategoryDataset50.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int65 = defaultStatisticalCategoryDataset50.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetGroup datasetGroup66 = defaultStatisticalCategoryDataset50.getGroup();
        boolean boolean67 = defaultStatisticalCategoryDataset40.equals((java.lang.Object) datasetGroup66);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup36 and datasetGroup48", datasetGroup36.equals(datasetGroup48) ? datasetGroup36.hashCode() == datasetGroup48.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double7 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultStatisticalCategoryDataset9.hasListener(eventListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset9.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultStatisticalCategoryDataset9.getRangeBounds(true);
        int int19 = defaultStatisticalCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultStatisticalCategoryDataset9.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset9.getGroup();
        boolean boolean23 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset9);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultStatisticalCategoryDataset9.hasListener(eventListener24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj8", defaultStatisticalCategoryDataset0.equals(obj8) ? defaultStatisticalCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list10 = defaultStatisticalCategoryDataset9.getRowKeys();
        defaultStatisticalCategoryDataset9.add((double) (short) 10, (double) (-1L), (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        int int16 = defaultStatisticalCategoryDataset9.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset9.getStdDevValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100);
        defaultStatisticalCategoryDataset9.add((java.lang.Number) 100.0d, (java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultStatisticalCategoryDataset9.hasListener(eventListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset9.getGroup();
        java.lang.Comparable comparable29 = null;
        java.lang.Number number30 = defaultStatisticalCategoryDataset9.getValue((java.lang.Comparable) (short) 10, comparable29);
        defaultStatisticalCategoryDataset9.add((double) (byte) 10, (double) '4', (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultStatisticalCategoryDataset9.getGroup();
        java.lang.Comparable comparable39 = null;
        defaultStatisticalCategoryDataset9.add(1.0d, (double) (byte) 0, comparable39, (java.lang.Comparable) (short) 10);
        java.util.List list42 = defaultStatisticalCategoryDataset9.getColumnKeys();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Number number19 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
        java.lang.Number number22 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultStatisticalCategoryDataset0.hasListener(eventListener23);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset25 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultStatisticalCategoryDataset25.hasListener(eventListener26);
        java.lang.Number number30 = defaultStatisticalCategoryDataset25.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int31 = defaultStatisticalCategoryDataset25.getRowCount();
        double double33 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.util.List list34 = defaultStatisticalCategoryDataset25.getRowKeys();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset25.hasListener(eventListener35);
        java.lang.Object obj37 = defaultStatisticalCategoryDataset25.clone();
        defaultStatisticalCategoryDataset25.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) "");
        double double44 = defaultStatisticalCategoryDataset25.getRangeUpperBound(true);
        java.lang.Number number47 = defaultStatisticalCategoryDataset25.getStdDevValue(0, 0);
        boolean boolean48 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset25);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset49 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number52 = defaultStatisticalCategoryDataset49.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double54 = defaultStatisticalCategoryDataset49.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset55 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int56 = defaultStatisticalCategoryDataset55.getColumnCount();
        int int58 = defaultStatisticalCategoryDataset55.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup59 = defaultStatisticalCategoryDataset55.getGroup();
        defaultStatisticalCategoryDataset49.setGroup(datasetGroup59);
        java.util.List list61 = defaultStatisticalCategoryDataset49.getColumnKeys();
        java.lang.Number number64 = defaultStatisticalCategoryDataset49.getStdDevValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset49.validateObject();
        java.lang.Number number68 = defaultStatisticalCategoryDataset49.getValue((java.lang.Comparable) '#', (java.lang.Comparable) '#');
        double double70 = defaultStatisticalCategoryDataset49.getRangeUpperBound(false);
        boolean boolean71 = defaultStatisticalCategoryDataset25.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset49 and defaultStatisticalCategoryDataset55", defaultStatisticalCategoryDataset49.equals(defaultStatisticalCategoryDataset55) ? defaultStatisticalCategoryDataset49.hashCode() == defaultStatisticalCategoryDataset55.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        java.util.List list30 = defaultStatisticalCategoryDataset12.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset31 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int32 = defaultStatisticalCategoryDataset31.getColumnCount();
        int int34 = defaultStatisticalCategoryDataset31.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup35 = defaultStatisticalCategoryDataset31.getGroup();
        java.lang.Comparable comparable37 = null;
        java.lang.Number number38 = defaultStatisticalCategoryDataset31.getMeanValue((java.lang.Comparable) 1L, comparable37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset31.getGroup();
        double double41 = defaultStatisticalCategoryDataset31.getRangeLowerBound(true);
        int int42 = defaultStatisticalCategoryDataset31.getRowCount();
        double double44 = defaultStatisticalCategoryDataset31.getRangeLowerBound(true);
        java.util.List list45 = defaultStatisticalCategoryDataset31.getColumnKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset46 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int47 = defaultStatisticalCategoryDataset46.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener48 = null;
        defaultStatisticalCategoryDataset46.removeChangeListener(datasetChangeListener48);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener50 = null;
        defaultStatisticalCategoryDataset46.addChangeListener(datasetChangeListener50);
        int int52 = defaultStatisticalCategoryDataset46.getRowCount();
        java.util.List list53 = defaultStatisticalCategoryDataset46.getColumnKeys();
        java.util.List list54 = defaultStatisticalCategoryDataset46.getColumnKeys();
        defaultStatisticalCategoryDataset46.add((java.lang.Number) Double.NaN, (java.lang.Number) 10.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100L);
        double double61 = defaultStatisticalCategoryDataset46.getRangeLowerBound(false);
        java.lang.Object obj62 = defaultStatisticalCategoryDataset46.clone();
        boolean boolean63 = defaultStatisticalCategoryDataset31.equals(obj62);
        boolean boolean64 = defaultStatisticalCategoryDataset12.equals((java.lang.Object) defaultStatisticalCategoryDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset46 and obj62", defaultStatisticalCategoryDataset46.equals(obj62) ? defaultStatisticalCategoryDataset46.hashCode() == obj62.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        java.lang.Number number5 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list14 = defaultStatisticalCategoryDataset13.getRowKeys();
        boolean boolean15 = defaultStatisticalCategoryDataset7.equals((java.lang.Object) defaultStatisticalCategoryDataset13);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultStatisticalCategoryDataset13.hasListener(eventListener16);
        java.util.List list18 = defaultStatisticalCategoryDataset13.getRowKeys();
        java.lang.Number number21 = defaultStatisticalCategoryDataset13.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultStatisticalCategoryDataset13.addChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultStatisticalCategoryDataset13.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset7.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset7.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
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
        java.lang.Object obj7 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range9 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 10);
        int int15 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset16 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        int int20 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list21 = defaultStatisticalCategoryDataset16.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultStatisticalCategoryDataset16.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultStatisticalCategoryDataset16.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultStatisticalCategoryDataset16", obj7.equals(defaultStatisticalCategoryDataset16) ? obj7.hashCode() == defaultStatisticalCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener9);
        double double12 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset13 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultStatisticalCategoryDataset13.hasListener(eventListener14);
        defaultStatisticalCategoryDataset13.validateObject();
        java.lang.Number number19 = defaultStatisticalCategoryDataset13.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultStatisticalCategoryDataset13.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset21 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number24 = defaultStatisticalCategoryDataset21.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int26 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) -1);
        int int28 = defaultStatisticalCategoryDataset21.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultStatisticalCategoryDataset21.removeChangeListener(datasetChangeListener29);
        boolean boolean31 = defaultStatisticalCategoryDataset13.equals((java.lang.Object) defaultStatisticalCategoryDataset21);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int33 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number36 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int37 = defaultStatisticalCategoryDataset32.getColumnCount();
        defaultStatisticalCategoryDataset32.add((double) 100.0f, (double) '4', (java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
        java.lang.Number number45 = defaultStatisticalCategoryDataset32.getMeanValue((int) (byte) 0, (int) (short) 0);
        int int46 = defaultStatisticalCategoryDataset32.getColumnCount();
        java.lang.Number number49 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup50 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset21.setGroup(datasetGroup50);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset3 and defaultStatisticalCategoryDataset13", defaultStatisticalCategoryDataset3.equals(defaultStatisticalCategoryDataset13) ? defaultStatisticalCategoryDataset3.hashCode() == defaultStatisticalCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        java.lang.Class<?> wildcardClass20 = list19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and defaultStatisticalCategoryDataset8", defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset8) ? defaultStatisticalCategoryDataset0.hashCode() == defaultStatisticalCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultStatisticalCategoryDataset0.getGroup();
        int int21 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup13 and datasetGroup20", datasetGroup13.equals(datasetGroup20) ? datasetGroup13.hashCode() == datasetGroup20.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        int int21 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup19", datasetGroup4.equals(datasetGroup19) ? datasetGroup4.hashCode() == datasetGroup19.hashCode() : true);
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
        defaultStatisticalCategoryDataset0.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number14 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        java.util.List list15 = defaultStatisticalCategoryDataset0.getRowKeys();
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup30", datasetGroup4.equals(datasetGroup30) ? datasetGroup4.hashCode() == datasetGroup30.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        java.util.List list13 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset15 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int16 = defaultStatisticalCategoryDataset15.getColumnCount();
        java.lang.Number number19 = defaultStatisticalCategoryDataset15.getStdDevValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        int int20 = defaultStatisticalCategoryDataset15.getColumnCount();
        int int22 = defaultStatisticalCategoryDataset15.getColumnIndex((java.lang.Comparable) "");
        double double24 = defaultStatisticalCategoryDataset15.getRangeLowerBound(false);
        org.jfree.data.Range range26 = defaultStatisticalCategoryDataset15.getRangeBounds(true);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset27 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int28 = defaultStatisticalCategoryDataset27.getColumnCount();
        int int30 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultStatisticalCategoryDataset27.getGroup();
        java.lang.Comparable comparable33 = null;
        java.lang.Number number34 = defaultStatisticalCategoryDataset27.getMeanValue((java.lang.Comparable) 1L, comparable33);
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultStatisticalCategoryDataset27.hasListener(eventListener35);
        int int38 = defaultStatisticalCategoryDataset27.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset27.getGroup();
        defaultStatisticalCategoryDataset15.setGroup(datasetGroup39);
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset4 and defaultStatisticalCategoryDataset15", defaultStatisticalCategoryDataset4.equals(defaultStatisticalCategoryDataset15) ? defaultStatisticalCategoryDataset4.hashCode() == defaultStatisticalCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (byte) 10, (double) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.util.List list12 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number17 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        int int19 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) -1);
        int int21 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset22 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int23 = defaultStatisticalCategoryDataset22.getColumnCount();
        int int25 = defaultStatisticalCategoryDataset22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset22.getGroup();
        defaultStatisticalCategoryDataset14.setGroup(datasetGroup26);
        defaultStatisticalCategoryDataset14.validateObject();
        java.util.List list29 = defaultStatisticalCategoryDataset14.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset14.addChangeListener(datasetChangeListener30);
        java.lang.Number number34 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '#');
        java.lang.Number number37 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetGroup datasetGroup38 = defaultStatisticalCategoryDataset14.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultStatisticalCategoryDataset14.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and defaultStatisticalCategoryDataset22", defaultStatisticalCategoryDataset14.equals(defaultStatisticalCategoryDataset22) ? defaultStatisticalCategoryDataset14.hashCode() == defaultStatisticalCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultStatisticalCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultStatisticalCategoryDataset16.getColumnCount();
        java.util.List list20 = defaultStatisticalCategoryDataset16.getColumnKeys();
        java.lang.Number number23 = defaultStatisticalCategoryDataset16.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) "hi!");
        int int25 = defaultStatisticalCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0d);
        defaultStatisticalCategoryDataset16.add((double) (short) -1, (double) 10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        java.lang.Object obj31 = defaultStatisticalCategoryDataset16.clone();
        boolean boolean32 = defaultStatisticalCategoryDataset6.equals((java.lang.Object) defaultStatisticalCategoryDataset16);
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset6.hasListener(eventListener33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset16 and obj31", defaultStatisticalCategoryDataset16.equals(obj31) ? defaultStatisticalCategoryDataset16.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        java.lang.Number number27 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset14 and obj21", defaultStatisticalCategoryDataset14.equals(obj21) ? defaultStatisticalCategoryDataset14.hashCode() == obj21.hashCode() : true);
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
        java.lang.Number number9 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultStatisticalCategoryDataset0.getRowKeys();
        java.lang.Number number13 = defaultStatisticalCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        int int24 = defaultStatisticalCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultStatisticalCategoryDataset14.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset14.getGroup();
        boolean boolean28 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset3.addChangeListener(datasetChangeListener4);
        boolean boolean6 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset3);
        int int8 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset3.getRangeBounds(false);
        java.util.List list11 = defaultStatisticalCategoryDataset3.getRowKeys();
        int int13 = defaultStatisticalCategoryDataset3.getRowIndex((java.lang.Comparable) 10L);
        java.lang.Object obj14 = defaultStatisticalCategoryDataset3.clone();
        defaultStatisticalCategoryDataset3.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj14", defaultStatisticalCategoryDataset0.equals(obj14) ? defaultStatisticalCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list1 = defaultStatisticalCategoryDataset0.getRowKeys();
        org.jfree.data.Range range3 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        int int5 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj6 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        org.jfree.data.Range range10 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener19);
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 0L, (java.lang.Number) 2, (java.lang.Comparable) 0, (java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.add((java.lang.Number) 97.0d, (java.lang.Number) (short) 100, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset32 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultStatisticalCategoryDataset32.hasListener(eventListener33);
        java.lang.Number number37 = defaultStatisticalCategoryDataset32.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int38 = defaultStatisticalCategoryDataset32.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultStatisticalCategoryDataset32.removeChangeListener(datasetChangeListener39);
        java.lang.Object obj41 = null;
        boolean boolean42 = defaultStatisticalCategoryDataset32.equals(obj41);
        double double44 = defaultStatisticalCategoryDataset32.getRangeLowerBound(false);
        java.lang.Number number47 = defaultStatisticalCategoryDataset32.getStdDevValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 'a');
        double double49 = defaultStatisticalCategoryDataset32.getRangeLowerBound(false);
        org.jfree.data.Range range51 = defaultStatisticalCategoryDataset32.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup52 = defaultStatisticalCategoryDataset32.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset8 and defaultStatisticalCategoryDataset32", defaultStatisticalCategoryDataset8.equals(defaultStatisticalCategoryDataset32) ? defaultStatisticalCategoryDataset8.hashCode() == defaultStatisticalCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        org.jfree.data.Range range29 = defaultStatisticalCategoryDataset12.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultStatisticalCategoryDataset12.addChangeListener(datasetChangeListener30);
        defaultStatisticalCategoryDataset12.validateObject();
        defaultStatisticalCategoryDataset12.add((double) (byte) 0, (double) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset38 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int39 = defaultStatisticalCategoryDataset38.getColumnCount();
        int int41 = defaultStatisticalCategoryDataset38.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset38.getGroup();
        java.util.List list43 = defaultStatisticalCategoryDataset38.getColumnKeys();
        int int44 = defaultStatisticalCategoryDataset38.getRowCount();
        defaultStatisticalCategoryDataset38.add((double) 1, 0.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Number number52 = defaultStatisticalCategoryDataset38.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) 1);
        java.util.List list53 = defaultStatisticalCategoryDataset38.getRowKeys();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset54 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener55 = null;
        boolean boolean56 = defaultStatisticalCategoryDataset54.hasListener(eventListener55);
        java.lang.Number number59 = defaultStatisticalCategoryDataset54.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset54.validateObject();
        org.jfree.data.Range range62 = defaultStatisticalCategoryDataset54.getRangeBounds(true);
        int int64 = defaultStatisticalCategoryDataset54.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Number number67 = defaultStatisticalCategoryDataset54.getMeanValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup68 = defaultStatisticalCategoryDataset54.getGroup();
        defaultStatisticalCategoryDataset38.setGroup(datasetGroup68);
        defaultStatisticalCategoryDataset12.setGroup(datasetGroup68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset18 and defaultStatisticalCategoryDataset54", defaultStatisticalCategoryDataset18.equals(defaultStatisticalCategoryDataset54) ? defaultStatisticalCategoryDataset18.hashCode() == defaultStatisticalCategoryDataset54.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getColumnKeys();
        java.lang.Object obj5 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int7 = defaultStatisticalCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultStatisticalCategoryDataset6.addChangeListener(datasetChangeListener12);
        int int14 = defaultStatisticalCategoryDataset6.getColumnCount();
        defaultStatisticalCategoryDataset6.validateObject();
        double double17 = defaultStatisticalCategoryDataset6.getRangeLowerBound(true);
        java.lang.Number number20 = defaultStatisticalCategoryDataset6.getStdDevValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
        boolean boolean21 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset6);
        java.lang.Number number24 = defaultStatisticalCategoryDataset6.getValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset0 and obj5", defaultStatisticalCategoryDataset0.equals(obj5) ? defaultStatisticalCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        int int27 = defaultStatisticalCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset13 and defaultStatisticalCategoryDataset19", defaultStatisticalCategoryDataset13.equals(defaultStatisticalCategoryDataset19) ? defaultStatisticalCategoryDataset13.hashCode() == defaultStatisticalCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.lang.Number number3 = defaultStatisticalCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100);
        double double5 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultStatisticalCategoryDataset7.hasListener(eventListener8);
        java.lang.Number number12 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        int int13 = defaultStatisticalCategoryDataset7.getRowCount();
        double double15 = defaultStatisticalCategoryDataset7.getRangeUpperBound(true);
        java.lang.Object obj16 = defaultStatisticalCategoryDataset7.clone();
        boolean boolean17 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) defaultStatisticalCategoryDataset7);
        int int19 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj16", defaultStatisticalCategoryDataset7.equals(obj16) ? defaultStatisticalCategoryDataset7.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        int int5 = defaultStatisticalCategoryDataset0.getRowCount();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset7 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultStatisticalCategoryDataset7.addChangeListener(datasetChangeListener8);
        int int10 = defaultStatisticalCategoryDataset7.getColumnCount();
        int int11 = defaultStatisticalCategoryDataset7.getColumnCount();
        java.util.List list12 = defaultStatisticalCategoryDataset7.getColumnKeys();
        java.lang.Object obj13 = defaultStatisticalCategoryDataset7.clone();
        java.lang.Number number16 = defaultStatisticalCategoryDataset7.getMeanValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultStatisticalCategoryDataset7.getGroup();
        defaultStatisticalCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset7 and obj13", defaultStatisticalCategoryDataset7.equals(obj13) ? defaultStatisticalCategoryDataset7.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultStatisticalCategoryDataset0.getColumnCount();
        java.lang.Number number6 = defaultStatisticalCategoryDataset0.getStdDevValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        defaultStatisticalCategoryDataset0.add((double) 10.0f, (double) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultStatisticalCategoryDataset0.add((double) (-1L), (double) 0L, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        int int18 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.Range range20 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
        java.util.List list21 = defaultStatisticalCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range23 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener24);
        double double27 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset28 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultStatisticalCategoryDataset28.hasListener(eventListener29);
        java.lang.Number number33 = defaultStatisticalCategoryDataset28.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset34 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list35 = defaultStatisticalCategoryDataset34.getRowKeys();
        boolean boolean36 = defaultStatisticalCategoryDataset28.equals((java.lang.Object) defaultStatisticalCategoryDataset34);
        java.lang.Number number39 = defaultStatisticalCategoryDataset28.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultStatisticalCategoryDataset28.addChangeListener(datasetChangeListener40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = defaultStatisticalCategoryDataset28.getGroup();
        boolean boolean43 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) datasetGroup42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultStatisticalCategoryDataset28 and defaultStatisticalCategoryDataset34", defaultStatisticalCategoryDataset28.equals(defaultStatisticalCategoryDataset34) ? defaultStatisticalCategoryDataset28.hashCode() == defaultStatisticalCategoryDataset34.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        int int3 = defaultStatisticalCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultStatisticalCategoryDataset0.getGroup();
        java.util.List list5 = defaultStatisticalCategoryDataset0.getColumnKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowCount();
        boolean boolean8 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) "");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultStatisticalCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultStatisticalCategoryDataset0.getGroup();
        defaultStatisticalCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset14 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultStatisticalCategoryDataset14.hasListener(eventListener15);
        java.lang.Number number19 = defaultStatisticalCategoryDataset14.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultStatisticalCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultStatisticalCategoryDataset14.getRangeBounds(true);
        int int23 = defaultStatisticalCategoryDataset14.getColumnCount();
        java.lang.Number number26 = defaultStatisticalCategoryDataset14.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) Double.NaN);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultStatisticalCategoryDataset14.getGroup();
        java.util.List list28 = defaultStatisticalCategoryDataset14.getRowKeys();
        boolean boolean29 = defaultStatisticalCategoryDataset0.equals((java.lang.Object) list28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup27", datasetGroup4.equals(datasetGroup27) ? datasetGroup4.hashCode() == datasetGroup27.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultStatisticalCategoryDataset0.hasListener(eventListener1);
        defaultStatisticalCategoryDataset0.validateObject();
        java.util.List list4 = defaultStatisticalCategoryDataset0.getRowKeys();
        int int6 = defaultStatisticalCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        double double8 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj12 = defaultStatisticalCategoryDataset0.clone();
        org.jfree.data.Range range14 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and obj12", obj11.equals(obj12) ? obj11.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        double double16 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and defaultStatisticalCategoryDataset7", obj6.equals(defaultStatisticalCategoryDataset7) ? obj6.hashCode() == defaultStatisticalCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        int int1 = defaultStatisticalCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultStatisticalCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultStatisticalCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj9 = defaultStatisticalCategoryDataset0.clone();
        java.lang.Object obj10 = defaultStatisticalCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }
}

