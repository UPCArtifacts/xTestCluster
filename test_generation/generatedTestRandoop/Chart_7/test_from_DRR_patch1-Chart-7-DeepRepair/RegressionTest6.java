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
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        int int9 = timePeriodValues3.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues3.createCopy((int) (short) -1, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues14.createCopy((int) '#', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues17.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timePeriodValues1.getDescription();
        int int14 = timePeriodValues1.getMaxStartIndex();
        int int15 = timePeriodValues1.getMaxStartIndex();
        int int16 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getDescription();
        timePeriodValues10.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener15);
        java.lang.Class<?> wildcardClass17 = timePeriodValues10.getClass();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues10);
        java.lang.String str19 = timePeriodValues10.getRangeDescription();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.Class<?> wildcardClass13 = timePeriodValues11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int6 = timePeriodValues1.getMinEndIndex();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = null; // flaky: timePeriodValues1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.Object obj21 = timePeriodValues1.clone();
        int int22 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod23, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Value", "");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        timePeriodValues3.setNotify(false);
        int int11 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues3.getMaxStartIndex();
        int int15 = timePeriodValues3.getMinStartIndex();
        int int16 = timePeriodValues3.getMaxStartIndex();
        int int17 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Time", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        timePeriodValues3.setKey((java.lang.Comparable) "Time");
        int int8 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues15.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timePeriodValues15.getDomainDescription();
        boolean boolean19 = timePeriodValues8.equals((java.lang.Object) timePeriodValues15);
        java.lang.Class<?> wildcardClass20 = timePeriodValues15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("");
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setRangeDescription("Value");
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy((int) (short) 10, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 100, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        int int7 = timePeriodValues3.getItemCount();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setDescription("");
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues6.createCopy((int) (short) 1, 1);
        boolean boolean11 = timePeriodValues10.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues10.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        boolean boolean16 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        timePeriodValues8.setDomainDescription("");
        java.lang.String str11 = timePeriodValues8.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = null; // flaky: timePeriodValues8.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f);
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        int int15 = timePeriodValues11.getMaxMiddleIndex();
        timePeriodValues11.setRangeDescription("Value");
        int int18 = timePeriodValues11.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        timePeriodValues5.setRangeDescription("hi!");
        timePeriodValues5.setKey((java.lang.Comparable) (-1));
        int int12 = timePeriodValues5.getMaxMiddleIndex();
        java.lang.Comparable comparable13 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) timePeriodValues5);
        int int17 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod19 = null; // flaky: timePeriodValues1.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100 + "'", comparable3, 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1) + "'", comparable13, (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "hi!", "Time");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy(0, 1);
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int15 = timePeriodValues14.getMinMiddleIndex();
        int int16 = timePeriodValues14.getMinStartIndex();
        boolean boolean17 = timePeriodValues14.isEmpty();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues1.setKey((java.lang.Comparable) 1L);
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) '4', 1);
        java.lang.String str8 = timePeriodValues7.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("Value");
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (byte) 1);
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "Value", "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: timePeriodValues1.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        int int16 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.setRangeDescription("");
        java.lang.Comparable comparable6 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L);
        int int2 = timePeriodValues1.getMaxMiddleIndex();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues14.getMaxMiddleIndex();
        java.lang.Object obj23 = timePeriodValues14.clone();
        int int24 = timePeriodValues14.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriod25, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        org.jfree.data.time.TimePeriod timePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues22.add(timePeriod24, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        java.lang.String str13 = timePeriodValues3.getDomainDescription();
        boolean boolean14 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getDescription();
        int int12 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        timePeriodValues3.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        timePeriodValues6.delete(100, (int) '#');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        int int25 = timePeriodValues1.getMinEndIndex();
        int int26 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener29);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        int int13 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable14 = timePeriodValues3.getKey();
        int int15 = timePeriodValues3.getMinStartIndex();
        int int16 = timePeriodValues3.getMaxEndIndex();
        int int17 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (-1.0d) + "'", comparable14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (-1));
        int int12 = timePeriodValues11.getMaxMiddleIndex();
        timePeriodValues11.setDescription("hi!");
        timePeriodValues11.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setDomainDescription("");
        timePeriodValues11.setNotify(false);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        int int10 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.Object obj11 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        boolean boolean14 = timePeriodValues1.isEmpty();
        java.lang.Object obj15 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((-1), (java.lang.Number) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setRangeDescription("Value");
        boolean boolean10 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        int int6 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy((int) '4', 0);
        timePeriodValues3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues3.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        int int10 = timePeriodValues3.getMinEndIndex();
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        boolean boolean12 = timePeriodValues3.getNotify();
        int int13 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        timePeriodValues8.setDescription("");
        int int11 = timePeriodValues8.getItemCount();
        java.lang.String str12 = timePeriodValues8.getDescription();
        timePeriodValues8.setKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f);
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy(0, (int) '4');
        org.junit.Assert.assertNotNull(timePeriodValues5);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int12 = timePeriodValues11.getMinMiddleIndex();
        int int13 = timePeriodValues11.getMinStartIndex();
        boolean boolean14 = timePeriodValues11.isEmpty();
        java.lang.Object obj15 = timePeriodValues11.clone();
        int int16 = timePeriodValues11.getMaxStartIndex();
        int int17 = timePeriodValues11.getMaxEndIndex();
        int int18 = timePeriodValues11.getMinStartIndex();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setDomainDescription("");
        timePeriodValues11.delete((int) (byte) 1, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues7.createCopy((int) (short) 10, (int) (short) 0);
        java.lang.String str14 = timePeriodValues13.getDomainDescription();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.delete((int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = null; // flaky: timePeriodValues1.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (short) 1, (int) '4');
        java.lang.Object obj8 = null;
        boolean boolean9 = timePeriodValues7.equals(obj8);
        java.lang.String str10 = timePeriodValues7.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Class<?> wildcardClass21 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        java.lang.Comparable comparable18 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 10 + "'", comparable18, (short) 10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Time", "");
        int int4 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setRangeDescription("");
        int int7 = timePeriodValues3.getMinStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        java.lang.String str9 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1.0f + "'", comparable8, 1.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = timePeriodValues1.getNotify();
        boolean boolean17 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues7.createCopy((int) (short) 10, (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues13.add(timePeriod16, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        java.lang.String str11 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDomainDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        int int10 = timePeriodValues3.getItemCount();
        boolean boolean11 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        int int16 = timePeriodValues13.getItemCount();
        timePeriodValues13.fireSeriesChanged();
        timePeriodValues13.setRangeDescription("Value");
        timePeriodValues13.fireSeriesChanged();
        timePeriodValues13.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener22);
        timePeriodValues13.fireSeriesChanged();
        timePeriodValues13.setRangeDescription("Time");
        timePeriodValues13.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timePeriodValues13.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timePeriodValues3.equals((java.lang.Object) seriesChangeListener29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "Value", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues11.setRangeDescription("hi!");
        boolean boolean14 = timePeriodValues11.isEmpty();
        int int15 = timePeriodValues11.getMaxStartIndex();
        int int16 = timePeriodValues11.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener17);
        timePeriodValues11.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues11.removeChangeListener(seriesChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener23);
        java.lang.Comparable comparable25 = timePeriodValues11.getKey();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues11);
        java.lang.Comparable comparable27 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues30 = timePeriodValues1.createCopy((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (-1.0d) + "'", comparable25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 10 + "'", comparable27, (short) 10);
        org.junit.Assert.assertNotNull(timePeriodValues30);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = null; // flaky: timePeriodValues1.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        java.lang.Object obj8 = timePeriodValues1.clone();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues12.setRangeDescription("hi!");
        boolean boolean15 = timePeriodValues12.isEmpty();
        int int16 = timePeriodValues12.getMinStartIndex();
        timePeriodValues12.setRangeDescription("hi!");
        java.lang.String str19 = timePeriodValues12.getDomainDescription();
        int int20 = timePeriodValues12.getMinStartIndex();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) int20);
        int int22 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        int int7 = timePeriodValues3.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        java.lang.Object obj4 = timePeriodValues3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        timePeriodValues1.setNotify(false);
        boolean boolean18 = timePeriodValues1.isEmpty();
        int int19 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimePeriodValue timePeriodValue22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        timePeriodValues1.setRangeDescription("");
        int int9 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100, "hi!", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        boolean boolean7 = timePeriodValues3.isEmpty();
        boolean boolean8 = timePeriodValues3.isEmpty();
        timePeriodValues3.delete((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        timePeriodValues3.setDomainDescription("Value");
        java.lang.Object obj16 = timePeriodValues3.clone();
        org.jfree.data.time.TimePeriod timePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod17, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        int int12 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues14.setKey((java.lang.Comparable) 10.0f);
        java.lang.String str17 = timePeriodValues14.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("Value");
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.lang.String str9 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        boolean boolean8 = timePeriodValues3.getNotify();
        int int9 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setDomainDescription("Time");
        int int12 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.String str18 = timePeriodValues14.getDescription();
        int int19 = timePeriodValues14.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Object obj24 = timePeriodValues14.clone();
        java.lang.Comparable comparable25 = timePeriodValues14.getKey();
        boolean boolean26 = timePeriodValues11.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setKey((java.lang.Comparable) 100L);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener29);
        timePeriodValues14.setNotify(true);
        int int33 = timePeriodValues14.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriod34, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        int int13 = timePeriodValues3.getMaxMiddleIndex();
        int int14 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setDomainDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener17);
        timePeriodValues3.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(false);
        int int11 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        int int12 = timePeriodValues5.getMinEndIndex();
        java.lang.Class<?> wildcardClass13 = timePeriodValues5.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues14.getMaxMiddleIndex();
        java.lang.Object obj23 = timePeriodValues14.clone();
        int int24 = timePeriodValues14.getMaxMiddleIndex();
        int int25 = timePeriodValues14.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Time", "Time");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        boolean boolean7 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "hi!", "hi!");
        int int12 = timePeriodValues11.getMaxStartIndex();
        boolean boolean13 = timePeriodValues3.equals((java.lang.Object) timePeriodValues11);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.update(10, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int20 = timePeriodValues19.getMinMiddleIndex();
        int int21 = timePeriodValues19.getMinStartIndex();
        boolean boolean22 = timePeriodValues1.equals((java.lang.Object) timePeriodValues19);
        timePeriodValues19.setRangeDescription("Value");
        java.lang.Object obj25 = timePeriodValues19.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete((int) ' ', (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setNotify(true);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean16 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable19 = timePeriodValues18.getKey();
        timePeriodValues18.setDescription("hi!");
        int int22 = timePeriodValues18.getItemCount();
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues18);
        boolean boolean24 = timePeriodValues1.isEmpty();
        boolean boolean25 = timePeriodValues1.isEmpty();
        int int26 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues31 = timePeriodValues1.createCopy((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues31);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        boolean boolean9 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        int int12 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues14.setKey((java.lang.Comparable) 10.0f);
        java.lang.String str17 = timePeriodValues14.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = timePeriodValues1.createCopy((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue25 = timePeriodValues23.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timePeriodValues23);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0d);
        int int9 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int14 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        int int26 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.fireSeriesChanged();
        int int28 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.delete((int) '4', (int) (short) 0);
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.TimePeriod timePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod17, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L));
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (-1L) + "'", comparable3, (-1L));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        int int25 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        boolean boolean9 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setKey((java.lang.Comparable) (short) 1);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimePeriodValue timePeriodValue21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getDescription();
        timePeriodValues10.fireSeriesChanged();
        timePeriodValues10.setDescription("Value");
        java.lang.Comparable comparable16 = timePeriodValues10.getKey();
        boolean boolean17 = timePeriodValues8.equals((java.lang.Object) comparable16);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMaxEndIndex();
        int int8 = timePeriodValues6.getMinStartIndex();
        timePeriodValues6.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) (byte) 0);
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener16);
        boolean boolean18 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj21 = timePeriodValues20.clone();
        timePeriodValues20.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues24 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj25 = timePeriodValues24.clone();
        java.lang.String str26 = timePeriodValues24.getDescription();
        java.lang.Comparable comparable27 = timePeriodValues24.getKey();
        java.lang.String str28 = timePeriodValues24.getDescription();
        int int29 = timePeriodValues24.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timePeriodValues24.removePropertyChangeListener(propertyChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timePeriodValues24.addPropertyChangeListener(propertyChangeListener32);
        java.lang.Object obj34 = timePeriodValues24.clone();
        java.lang.Comparable comparable35 = timePeriodValues24.getKey();
        boolean boolean37 = timePeriodValues24.equals((java.lang.Object) (byte) 0);
        boolean boolean38 = timePeriodValues20.equals((java.lang.Object) boolean37);
        java.lang.Comparable comparable39 = timePeriodValues20.getKey();
        java.lang.Object obj40 = timePeriodValues20.clone();
        timePeriodValues20.setRangeDescription("Time");
        timePeriodValues20.setDescription("");
        int int45 = timePeriodValues20.getMinEndIndex();
        java.lang.String str46 = timePeriodValues20.getDescription();
        boolean boolean47 = timePeriodValues1.equals((java.lang.Object) str46);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 10 + "'", comparable27, (short) 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (short) 10 + "'", comparable39, (short) 10);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        int int10 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener15);
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "Value", "");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (byte) 100, 10);
        int int17 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        timePeriodValues3.setKey((java.lang.Comparable) 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int13 = timePeriodValues1.getMaxStartIndex();
        int int14 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str17 = timePeriodValues16.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues16.addChangeListener(seriesChangeListener18);
        timePeriodValues16.setNotify(true);
        timePeriodValues16.setDomainDescription("Value");
        int int24 = timePeriodValues16.getMinEndIndex();
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) timePeriodValues16);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.Object obj21 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.setDescription("");
        int int26 = timePeriodValues1.getMinEndIndex();
        boolean boolean27 = timePeriodValues1.getNotify();
        int int28 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        int int12 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = timePeriodValues12.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues12.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setRangeDescription("Value");
        int int6 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setKey((java.lang.Comparable) 'a');
        int int17 = timePeriodValues11.getMaxEndIndex();
        java.lang.Object obj18 = timePeriodValues11.clone();
        java.lang.String str19 = timePeriodValues11.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.delete((int) (byte) 1, (int) (byte) -1);
        boolean boolean14 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener15);
        int int17 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timePeriodValues3.getNotify();
        int int7 = timePeriodValues3.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues3.getRangeDescription();
        java.lang.Object obj9 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        timePeriodValues1.fireSeriesChanged();
        java.lang.Comparable comparable14 = timePeriodValues1.getKey();
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues19.setRangeDescription("hi!");
        boolean boolean22 = timePeriodValues19.isEmpty();
        int int23 = timePeriodValues19.getMaxStartIndex();
        int int24 = timePeriodValues19.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timePeriodValues19.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timePeriodValues19.addChangeListener(seriesChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timePeriodValues19.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timePeriodValues19.isEmpty();
        boolean boolean32 = timePeriodValues19.isEmpty();
        timePeriodValues19.setDomainDescription("");
        boolean boolean35 = timePeriodValues1.equals((java.lang.Object) timePeriodValues19);
        java.lang.Class<?> wildcardClass36 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.delete((int) (short) 10, 0);
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setNotify(true);
        int int17 = timePeriodValues1.getMinEndIndex();
        boolean boolean18 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues1.createCopy((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timePeriodValues21);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        int int13 = timePeriodValues3.getMaxStartIndex();
        int int14 = timePeriodValues3.getMinStartIndex();
        boolean boolean15 = timePeriodValues3.isEmpty();
        java.lang.String str16 = timePeriodValues3.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (-1.0d) + "'", comparable17, (-1.0d));
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) (short) 1);
        int int13 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDescription();
        boolean boolean12 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getRangeDescription();
        int int15 = timePeriodValues12.getMaxEndIndex();
        java.lang.Comparable comparable16 = timePeriodValues12.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int21 = timePeriodValues20.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues25.fireSeriesChanged();
        java.lang.Object obj27 = timePeriodValues25.clone();
        boolean boolean28 = timePeriodValues20.equals((java.lang.Object) timePeriodValues25);
        boolean boolean29 = timePeriodValues12.equals((java.lang.Object) timePeriodValues25);
        timePeriodValues25.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timePeriodValues25.addChangeListener(seriesChangeListener32);
        boolean boolean34 = timePeriodValues1.equals((java.lang.Object) seriesChangeListener32);
        boolean boolean35 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        timePeriodValues5.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues5.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timePeriodValues5.getKey();
        java.lang.String str13 = timePeriodValues5.getRangeDescription();
        timePeriodValues5.setKey((java.lang.Comparable) "Time");
        boolean boolean16 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        timePeriodValues1.setNotify(false);
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.delete((int) '4', (-1));
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener17);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0);
        timePeriodValues1.setNotify(false);
        java.lang.String str4 = timePeriodValues1.getDescription();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean7 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.lang.String str5 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) '4', (int) '#');
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int10 = timePeriodValues9.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues14.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues14.clone();
        boolean boolean17 = timePeriodValues9.equals((java.lang.Object) timePeriodValues14);
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setDomainDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = timePeriodValues14.createCopy((int) (byte) 1, (int) (short) -1);
        java.lang.String str24 = timePeriodValues23.getDescription();
        java.lang.String str25 = timePeriodValues23.getDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timePeriodValues23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        timePeriodValues1.setNotify(false);
        boolean boolean18 = timePeriodValues1.isEmpty();
        int int19 = timePeriodValues1.getMaxStartIndex();
        int int20 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1);
        java.lang.Class<?> wildcardClass2 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues7.createCopy((int) (short) 10, (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener14);
        timePeriodValues13.setDescription("Value");
        int int18 = timePeriodValues13.getMinEndIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) '#', 100);
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setKey((java.lang.Comparable) 1L);
        int int9 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener13);
        java.lang.Comparable comparable15 = timePeriodValues1.getKey();
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        int int12 = timePeriodValues11.getMaxEndIndex();
        timePeriodValues11.setDescription("hi!");
        timePeriodValues11.setKey((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        int int11 = timePeriodValues1.getMinEndIndex();
        java.lang.String str12 = timePeriodValues1.getDescription();
        boolean boolean13 = timePeriodValues1.getNotify();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues1.getMinStartIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.String str18 = timePeriodValues14.getDescription();
        int int19 = timePeriodValues14.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Object obj24 = timePeriodValues14.clone();
        java.lang.Comparable comparable25 = timePeriodValues14.getKey();
        boolean boolean26 = timePeriodValues11.equals((java.lang.Object) timePeriodValues14);
        timePeriodValues14.setKey((java.lang.Comparable) 100L);
        java.lang.Object obj29 = timePeriodValues14.clone();
        java.lang.String str30 = timePeriodValues14.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        int int11 = timePeriodValues1.getItemCount();
        boolean boolean12 = timePeriodValues1.isEmpty();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("");
        int int10 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        int int10 = timePeriodValues3.getItemCount();
        boolean boolean11 = timePeriodValues3.isEmpty();
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        int int5 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setDomainDescription("");
        boolean boolean9 = timePeriodValues3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0f) + "'", comparable4, (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        int int24 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str25 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener26);
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy(0, 1);
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean17 = timePeriodValues16.getNotify();
        java.lang.String str18 = timePeriodValues16.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues16.addPropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues16.getMaxStartIndex();
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) timePeriodValues16);
        java.lang.Object obj25 = timePeriodValues1.clone();
        java.lang.String str26 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        int int10 = timePeriodValues3.getMinEndIndex();
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ');
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues7.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues7.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues7.createCopy((int) '4', (int) (byte) 1);
        int int16 = timePeriodValues15.getMinEndIndex();
        boolean boolean17 = timePeriodValues3.equals((java.lang.Object) int16);
        timePeriodValues3.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        int int19 = timePeriodValues18.getMaxEndIndex();
        int int20 = timePeriodValues18.getMaxMiddleIndex();
        int int21 = timePeriodValues18.getMinEndIndex();
        timePeriodValues18.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) '#', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        java.lang.String str18 = timePeriodValues6.getDescription();
        timePeriodValues6.setRangeDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        boolean boolean13 = timePeriodValues12.getNotify();
        timePeriodValues12.fireSeriesChanged();
        timePeriodValues12.setKey((java.lang.Comparable) (-1.0d));
        java.lang.String str17 = timePeriodValues12.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener3);
        timePeriodValues1.setNotify(true);
        boolean boolean7 = timePeriodValues1.isEmpty();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues1.getMinStartIndex();
        int int23 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinEndIndex();
        boolean boolean9 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = timePeriodValues1.getNotify();
        int int13 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        timePeriodValues3.delete((int) (short) 100, (-1));
        int int7 = timePeriodValues3.getItemCount();
        boolean boolean8 = timePeriodValues3.getNotify();
        java.lang.Comparable comparable9 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 0.0d + "'", comparable9, 0.0d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = timePeriodValues12.clone();
        java.lang.String str14 = timePeriodValues12.getDescription();
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timePeriodValues12.getMaxStartIndex();
        java.lang.Object obj19 = timePeriodValues12.clone();
        boolean boolean20 = timePeriodValues12.getNotify();
        int int21 = timePeriodValues12.getMaxEndIndex();
        int int22 = timePeriodValues12.getMaxStartIndex();
        java.lang.Comparable comparable23 = timePeriodValues12.getKey();
        java.lang.Object obj24 = timePeriodValues12.clone();
        java.lang.Object obj25 = timePeriodValues12.clone();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        boolean boolean27 = timePeriodValues1.getNotify();
        java.lang.String str28 = timePeriodValues1.getDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        int int10 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d);
        java.lang.Object obj17 = timePeriodValues16.clone();
        boolean boolean18 = timePeriodValues3.equals((java.lang.Object) timePeriodValues16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "Value", "hi!");
        int int4 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(0, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        int int24 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str25 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener26);
        boolean boolean28 = timePeriodValues1.isEmpty();
        int int29 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("Value");
        int int13 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        java.lang.String str11 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "Value", "hi!");
        int int20 = timePeriodValues19.getItemCount();
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues19);
        boolean boolean22 = timePeriodValues19.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.Comparable comparable18 = timePeriodValues3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0d) + "'", comparable18, (-1.0d));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.delete((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        boolean boolean13 = timePeriodValues12.getNotify();
        timePeriodValues12.fireSeriesChanged();
        java.lang.String str15 = timePeriodValues12.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues4.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues4.getMaxStartIndex();
        int int8 = timePeriodValues4.getMaxEndIndex();
        timePeriodValues4.setRangeDescription("");
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.delete(1, 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        boolean boolean5 = timePeriodValues3.isEmpty();
        timePeriodValues3.setDomainDescription("");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues11.createCopy((int) (byte) 10, (int) (byte) 0);
        int int15 = timePeriodValues14.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues14.createCopy((int) (short) 1, 1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues18.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timePeriodValues14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.Class<?> wildcardClass7 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 100.0f + "'", comparable4, 100.0f);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.isEmpty();
        int int7 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        int int11 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMaxStartIndex();
        boolean boolean12 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.Object obj7 = timePeriodValues6.clone();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        boolean boolean16 = timePeriodValues15.getNotify();
        int int17 = timePeriodValues15.getMaxMiddleIndex();
        java.lang.String str18 = timePeriodValues15.getRangeDescription();
        java.lang.String str19 = timePeriodValues15.getDescription();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        int int12 = timePeriodValues1.getMinEndIndex();
        int int13 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        boolean boolean7 = timePeriodValues3.isEmpty();
        int int8 = timePeriodValues3.getMaxEndIndex();
        java.lang.String str9 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues1.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues12.setRangeDescription("hi!");
        boolean boolean15 = timePeriodValues12.isEmpty();
        int int16 = timePeriodValues12.getMinStartIndex();
        timePeriodValues12.setRangeDescription("hi!");
        java.lang.String str19 = timePeriodValues12.getDomainDescription();
        int int20 = timePeriodValues12.getMinStartIndex();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) int20);
        timePeriodValues1.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener24);
        int int26 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean7 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        timePeriodValues8.setDescription("");
        int int14 = timePeriodValues8.getMinMiddleIndex();
        java.lang.Comparable comparable15 = timePeriodValues8.getKey();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues8.addPropertyChangeListener(propertyChangeListener16);
        timePeriodValues8.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 0 + "'", comparable15, (short) 0);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 1);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.Object obj21 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str24 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues12.fireSeriesChanged();
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        java.lang.String str15 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues10.setRangeDescription("hi!");
        boolean boolean13 = timePeriodValues10.isEmpty();
        int int14 = timePeriodValues10.getMaxStartIndex();
        int int15 = timePeriodValues10.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues10.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues10.getMaxMiddleIndex();
        timePeriodValues10.setRangeDescription("Time");
        boolean boolean25 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        int int26 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setDomainDescription("Value");
        int int29 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0d);
        int int9 = timePeriodValues3.getMaxStartIndex();
        int int10 = timePeriodValues3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod12, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.String str18 = timePeriodValues14.getDescription();
        int int19 = timePeriodValues14.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Object obj24 = timePeriodValues14.clone();
        java.lang.Comparable comparable25 = timePeriodValues14.getKey();
        boolean boolean26 = timePeriodValues11.equals((java.lang.Object) timePeriodValues14);
        java.lang.String str27 = timePeriodValues14.getRangeDescription();
        java.lang.Comparable comparable28 = timePeriodValues14.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        timePeriodValues3.setKey((java.lang.Comparable) (-1));
        boolean boolean18 = timePeriodValues3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener19);
        int int21 = timePeriodValues3.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        boolean boolean13 = timePeriodValues11.getNotify();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setNotify(false);
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod7, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setKey((java.lang.Comparable) (byte) 0);
        int int8 = timePeriodValues3.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.String str21 = timePeriodValues1.getRangeDescription();
        java.lang.Object obj22 = timePeriodValues1.clone();
        java.lang.Comparable comparable23 = timePeriodValues1.getKey();
        timePeriodValues1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = timePeriodValues1.createCopy(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = timePeriodValues28.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertNotNull(timePeriodValues28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinEndIndex();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        java.lang.String str9 = timePeriodValues3.getDescription();
        boolean boolean10 = timePeriodValues3.isEmpty();
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        java.lang.String str13 = timePeriodValues3.getDomainDescription();
        int int14 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue16 = timePeriodValues3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues6.setDescription("hi!");
        java.lang.Object obj9 = timePeriodValues6.clone();
        boolean boolean10 = timePeriodValues1.equals(obj9);
        int int11 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 100);
        boolean boolean14 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        boolean boolean11 = timePeriodValues3.getNotify();
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod15, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0d) + "'", comparable10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) "hi!");
        int int18 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener19);
        int int21 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Comparable comparable24 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        int int12 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.fireSeriesChanged();
        int int14 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj15 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        int int13 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy(1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        java.lang.String str9 = timePeriodValues1.getDescription();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        int int9 = timePeriodValues3.getItemCount();
        int int10 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setKey((java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable13 = timePeriodValues3.getKey();
        timePeriodValues3.setDescription("");
        int int16 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        boolean boolean10 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((-1), 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener15);
        timePeriodValues11.fireSeriesChanged();
        java.lang.Object obj18 = timePeriodValues11.clone();
        org.jfree.data.time.TimePeriod timePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod19, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "Time", "hi!");
        int int4 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setKey((java.lang.Comparable) '4');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass12 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener15);
        timePeriodValues11.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue19 = timePeriodValues11.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getMinStartIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj24 = timePeriodValues23.clone();
        java.lang.String str25 = timePeriodValues23.getDescription();
        int int26 = timePeriodValues23.getItemCount();
        timePeriodValues23.fireSeriesChanged();
        timePeriodValues23.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timePeriodValues23.removeChangeListener(seriesChangeListener30);
        int int32 = timePeriodValues23.getMaxEndIndex();
        int int33 = timePeriodValues23.getMinMiddleIndex();
        boolean boolean34 = timePeriodValues23.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timePeriodValues23.addPropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = timePeriodValues14.equals((java.lang.Object) timePeriodValues23);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0d);
        int int9 = timePeriodValues3.getMaxStartIndex();
        boolean boolean10 = timePeriodValues3.getNotify();
        int int11 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f, "Time", "Value");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 0, "Value", "hi!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) "Time");
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDescription("Time");
        timePeriodValues1.fireSeriesChanged();
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 1, 1);
        boolean boolean12 = timePeriodValues11.getNotify();
        java.lang.Object obj13 = timePeriodValues11.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        int int15 = timePeriodValues11.getMaxMiddleIndex();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.setKey(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues13.addChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues13.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "Value", "hi!");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        timePeriodValues3.setNotify(true);
        java.lang.Comparable comparable11 = timePeriodValues3.getKey();
        java.lang.Object obj12 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (-1.0d) + "'", comparable11, (-1.0d));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete((int) (short) 0, (int) (short) -1);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        timePeriodValues3.setDomainDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj18 = timePeriodValues17.clone();
        java.lang.String str19 = timePeriodValues17.getDescription();
        int int20 = timePeriodValues17.getItemCount();
        timePeriodValues17.fireSeriesChanged();
        timePeriodValues17.setRangeDescription("Value");
        int int24 = timePeriodValues17.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timePeriodValues17.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timePeriodValues17.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimePeriodValues timePeriodValues31 = timePeriodValues17.createCopy((int) (short) 0, (int) (short) 1);
        timePeriodValues31.setKey((java.lang.Comparable) 10.0f);
        boolean boolean34 = timePeriodValues3.equals((java.lang.Object) timePeriodValues31);
        java.lang.Comparable comparable35 = timePeriodValues31.getKey();
        timePeriodValues31.setDescription("Value");
        java.lang.String str38 = timePeriodValues31.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0f + "'", comparable35, 10.0f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 0, "Time", "");
        timePeriodValues3.setRangeDescription("Value");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setKey((java.lang.Comparable) (byte) 0);
        timePeriodValues3.setRangeDescription("Time");
        timePeriodValues3.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod14, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        int int13 = timePeriodValues10.getMaxMiddleIndex();
        boolean boolean14 = timePeriodValues10.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L);
        int int17 = timePeriodValues16.getMaxMiddleIndex();
        int int18 = timePeriodValues16.getMaxMiddleIndex();
        java.lang.Object obj19 = timePeriodValues16.clone();
        boolean boolean20 = timePeriodValues10.equals((java.lang.Object) timePeriodValues16);
        int int21 = timePeriodValues10.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (-1));
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        int int5 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("");
        java.lang.String str8 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0f) + "'", comparable4, (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        int int24 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener27);
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        java.lang.String str31 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        int int16 = timePeriodValues10.getMinStartIndex();
        boolean boolean17 = timePeriodValues10.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        int int6 = timePeriodValues1.getMinEndIndex();
        boolean boolean7 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getDescription();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setDomainDescription("Value");
        java.lang.Object obj16 = timePeriodValues1.clone();
        java.lang.Comparable comparable17 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 100L + "'", comparable17, 100L);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(true);
        int int9 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        int int8 = timePeriodValues1.getItemCount();
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        int int11 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDomainDescription("");
        boolean boolean14 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues10.setRangeDescription("hi!");
        boolean boolean13 = timePeriodValues10.isEmpty();
        int int14 = timePeriodValues10.getMaxStartIndex();
        int int15 = timePeriodValues10.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues10.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues10.getMaxMiddleIndex();
        timePeriodValues10.setRangeDescription("Time");
        boolean boolean25 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        java.lang.Comparable comparable26 = timePeriodValues10.getKey();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (-1.0d) + "'", comparable26, (-1.0d));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, (-1));
        java.lang.Comparable comparable5 = timePeriodValues4.getKey();
        java.lang.Object obj6 = timePeriodValues4.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues4.createCopy(10, 0);
        java.lang.Class<?> wildcardClass10 = timePeriodValues4.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100 + "'", comparable5, 100);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 0, "Value", "");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.getNotify();
        int int15 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj19 = timePeriodValues18.clone();
        java.lang.String str20 = timePeriodValues18.getDescription();
        int int21 = timePeriodValues18.getItemCount();
        timePeriodValues18.fireSeriesChanged();
        timePeriodValues18.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues18.removeChangeListener(seriesChangeListener25);
        int int27 = timePeriodValues18.getMaxEndIndex();
        int int28 = timePeriodValues18.getMinMiddleIndex();
        int int29 = timePeriodValues18.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timePeriodValues18.addPropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = timePeriodValues1.equals((java.lang.Object) timePeriodValues18);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getItemCount();
        timePeriodValues5.fireSeriesChanged();
        timePeriodValues5.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues5.removeChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues5.getMaxEndIndex();
        int int15 = timePeriodValues5.getMinStartIndex();
        java.lang.String str16 = timePeriodValues5.getRangeDescription();
        boolean boolean17 = timePeriodValues5.getNotify();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) timePeriodValues5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues5.removeChangeListener(seriesChangeListener19);
        java.lang.String str21 = timePeriodValues5.getDescription();
        java.lang.String str22 = timePeriodValues5.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues6.createCopy((int) (short) 1, 1);
        java.lang.Comparable comparable11 = timePeriodValues10.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues13.setDescription("hi!");
        boolean boolean16 = timePeriodValues13.isEmpty();
        int int17 = timePeriodValues13.getMinEndIndex();
        timePeriodValues13.setDomainDescription("Value");
        java.lang.Object obj20 = timePeriodValues13.clone();
        boolean boolean21 = timePeriodValues10.equals((java.lang.Object) timePeriodValues13);
        java.lang.Object obj22 = timePeriodValues13.clone();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0d + "'", comparable11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        int int13 = timePeriodValues3.getMaxStartIndex();
        boolean boolean14 = timePeriodValues3.isEmpty();
        java.lang.Class<?> wildcardClass15 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        timePeriodValues11.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues18.createCopy(0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues25.setRangeDescription("hi!");
        boolean boolean28 = timePeriodValues25.isEmpty();
        int int29 = timePeriodValues25.getMaxStartIndex();
        int int30 = timePeriodValues25.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timePeriodValues25.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timePeriodValues25.addChangeListener(seriesChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timePeriodValues25.removeChangeListener(seriesChangeListener35);
        int int37 = timePeriodValues25.getMaxMiddleIndex();
        timePeriodValues25.setRangeDescription("Time");
        boolean boolean40 = timePeriodValues18.equals((java.lang.Object) timePeriodValues25);
        int int41 = timePeriodValues18.getMinMiddleIndex();
        boolean boolean42 = timePeriodValues11.equals((java.lang.Object) int41);
        int int43 = timePeriodValues11.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        int int8 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues27 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean28 = timePeriodValues27.getNotify();
        int int29 = timePeriodValues27.getMinEndIndex();
        java.lang.Object obj30 = timePeriodValues27.clone();
        int int31 = timePeriodValues27.getItemCount();
        boolean boolean32 = timePeriodValues1.equals((java.lang.Object) int31);
        java.lang.Class<?> wildcardClass33 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener15);
        int int17 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj18 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        int int12 = timePeriodValues5.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues5.add(timePeriod13, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        timePeriodValues11.fireSeriesChanged();
        timePeriodValues11.setNotify(false);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.getNotify();
        int int15 = timePeriodValues1.getMaxStartIndex();
        int int16 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Comparable comparable12 = timePeriodValues3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod16 = timePeriodValues3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMinStartIndex();
        java.lang.Object obj10 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        int int6 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (-1));
        java.lang.Object obj12 = timePeriodValues11.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "hi!", "Time");
        int int4 = timePeriodValues3.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        int int7 = timePeriodValues3.getItemCount();
        java.lang.String str8 = timePeriodValues3.getDescription();
        java.lang.Object obj9 = timePeriodValues3.clone();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int12 = timePeriodValues1.getMinStartIndex();
        java.lang.Object obj13 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) "hi!");
        int int18 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener19);
        timePeriodValues1.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        java.lang.String str10 = timePeriodValues1.getDescription();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        int int9 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        java.lang.String str15 = timePeriodValues11.getDescription();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod16, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener12);
        timePeriodValues3.setDomainDescription("");
        boolean boolean16 = timePeriodValues3.isEmpty();
        boolean boolean17 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0, "", "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "hi!");
        boolean boolean20 = timePeriodValues3.equals((java.lang.Object) "Time");
        java.lang.Comparable comparable21 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0d) + "'", comparable21, (-1.0d));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        boolean boolean16 = timePeriodValues15.getNotify();
        org.jfree.data.time.TimePeriodValue timePeriodValue17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues15.add(timePeriodValue17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        timePeriodValues6.delete((int) (byte) 1, 0);
        timePeriodValues6.setNotify(true);
        boolean boolean23 = timePeriodValues6.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getDescription();
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        timePeriodValues3.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues3.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L);
        int int2 = timePeriodValues1.getMaxMiddleIndex();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (-1.0d));
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDomainDescription("");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        timePeriodValues3.setDescription("");
        int int7 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((int) (byte) -1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDescription("Time");
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "hi!", "hi!");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues1.getMaxEndIndex();
        int int17 = timePeriodValues1.getMinStartIndex();
        boolean boolean18 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMaxEndIndex();
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "Value", "Time");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.delete(100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) '4', (int) '#');
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod11, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.delete((int) '4', (int) (short) 10);
        int int13 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 0, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        timePeriodValues1.setNotify(true);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        int int7 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("Time");
        int int10 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 1, 1);
        boolean boolean12 = timePeriodValues11.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean16 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable19 = timePeriodValues18.getKey();
        timePeriodValues18.setDescription("hi!");
        int int22 = timePeriodValues18.getItemCount();
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues18);
        boolean boolean24 = timePeriodValues1.isEmpty();
        boolean boolean25 = timePeriodValues1.isEmpty();
        int int26 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        timePeriodValues1.setNotify(true);
        int int31 = timePeriodValues1.getMaxEndIndex();
        int int32 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str33 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj5 = timePeriodValues3.clone();
        int int6 = timePeriodValues3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        timePeriodValues3.setDescription("");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener3);
        timePeriodValues1.setNotify(true);
        boolean boolean7 = timePeriodValues1.isEmpty();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "Time", "");
        timePeriodValues3.setDomainDescription("hi!");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        java.lang.String str24 = timePeriodValues22.getDomainDescription();
        java.lang.Object obj25 = timePeriodValues22.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = null; // flaky: timePeriodValues1.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues6.createCopy((int) (short) 1, 1);
        java.lang.Comparable comparable11 = timePeriodValues10.getKey();
        boolean boolean12 = timePeriodValues10.getNotify();
        timePeriodValues10.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues10.createCopy((int) (short) 100, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues10.createCopy((-1), (int) '4');
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues19.add(timePeriod20, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0d + "'", comparable11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertNotNull(timePeriodValues19);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((-1), (-1));
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues10.createCopy((int) (short) 10, (int) (short) 10);
        int int14 = timePeriodValues10.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timePeriodValues3.getDomainDescription();
        int int7 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.isEmpty();
        java.lang.String str7 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        int int12 = timePeriodValues10.getMinStartIndex();
        int int13 = timePeriodValues10.getMaxMiddleIndex();
        boolean boolean14 = timePeriodValues10.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L);
        int int17 = timePeriodValues16.getMaxMiddleIndex();
        int int18 = timePeriodValues16.getMaxMiddleIndex();
        java.lang.Object obj19 = timePeriodValues16.clone();
        boolean boolean20 = timePeriodValues10.equals((java.lang.Object) timePeriodValues16);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues22.createCopy((int) '4', (int) 'a');
        boolean boolean26 = timePeriodValues16.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timePeriodValues25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        timePeriodValues1.setRangeDescription("Value");
        int int14 = timePeriodValues1.getItemCount();
        int int15 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues9.getNotify();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int24 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod27, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        timePeriodValues1.fireSeriesChanged();
        int int17 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener18);
        int int20 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.delete((int) (short) 10, 0);
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "");
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, 10);
        int int5 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues8.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod13, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("Time");
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, (-1));
        java.lang.Comparable comparable5 = timePeriodValues4.getKey();
        int int6 = timePeriodValues4.getMinStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100 + "'", comparable5, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues11.createCopy((int) '4', (int) 'a');
        java.lang.String str17 = timePeriodValues11.getDomainDescription();
        int int18 = timePeriodValues11.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.setNotify(false);
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (short) -1, (int) (short) 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj16 = timePeriodValues15.clone();
        java.lang.Comparable comparable17 = timePeriodValues15.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj20 = timePeriodValues19.clone();
        java.lang.String str21 = timePeriodValues19.getDescription();
        int int22 = timePeriodValues19.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = timePeriodValues19.isEmpty();
        java.lang.String str26 = timePeriodValues19.getDomainDescription();
        boolean boolean27 = timePeriodValues15.equals((java.lang.Object) str26);
        boolean boolean28 = timePeriodValues15.isEmpty();
        boolean boolean29 = timePeriodValues3.equals((java.lang.Object) boolean28);
        boolean boolean30 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod31 = null;
        java.lang.Number number32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod31, number32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Time");
        int int15 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Value", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        java.lang.String str7 = timePeriodValues3.getDescription();
        int int8 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timePeriodValues3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        java.lang.String str17 = timePeriodValues13.getDescription();
        int int18 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues13.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener21);
        java.lang.Object obj23 = timePeriodValues13.clone();
        boolean boolean24 = timePeriodValues1.equals(obj23);
        int int25 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDomainDescription("");
        int int6 = timePeriodValues1.getMinMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + "hi!" + "'", comparable2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.getNotify();
        int int15 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        int int7 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) (byte) 0);
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener16);
        boolean boolean18 = timePeriodValues1.isEmpty();
        boolean boolean19 = timePeriodValues1.getNotify();
        java.lang.String str20 = timePeriodValues1.getDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues3.getItemCount();
        int int13 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.isEmpty();
        java.lang.String str16 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "Value");
        int int4 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues10.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues10.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean16 = timePeriodValues10.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener17);
        java.lang.Object obj19 = timePeriodValues10.clone();
        java.lang.Class<?> wildcardClass20 = timePeriodValues10.getClass();
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        int int22 = timePeriodValues10.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        int int12 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.delete(0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.String str20 = timePeriodValues19.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues4.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues4.getMinEndIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (byte) 1);
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setKey((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue11 = timePeriodValues3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        timePeriodValues5.setKey((java.lang.Comparable) (byte) 1);
        int int14 = timePeriodValues5.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) 0);
        java.lang.Object obj14 = timePeriodValues13.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        int int12 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        int int15 = timePeriodValues1.getMinStartIndex();
        boolean boolean16 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        java.lang.String str17 = timePeriodValues13.getDescription();
        int int18 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues13.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener21);
        java.lang.Object obj23 = timePeriodValues13.clone();
        boolean boolean24 = timePeriodValues1.equals(obj23);
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}
