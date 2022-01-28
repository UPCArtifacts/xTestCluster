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
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable15 = timePeriodValues1.getKey();
        int int16 = timePeriodValues1.getMinEndIndex();
        int int17 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        java.lang.Object obj12 = timePeriodValues1.clone();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (short) -1, (int) (byte) 1);
        boolean boolean14 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int int22 = timePeriodValues14.getMinStartIndex();
        int int23 = timePeriodValues14.getMaxMiddleIndex();
        timePeriodValues14.setDescription("Time");
        java.lang.String str26 = timePeriodValues14.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "hi!", "Value");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getMinMiddleIndex();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        int int15 = timePeriodValues1.getMinMiddleIndex();
        int int16 = timePeriodValues1.getMaxStartIndex();
        java.lang.Class<?> wildcardClass17 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.String str9 = timePeriodValues3.getDescription();
        boolean boolean10 = timePeriodValues3.getNotify();
        int int11 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.fireSeriesChanged();
        boolean boolean11 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        int int7 = timePeriodValues1.getMinStartIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.lang.Object obj13 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "Value");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener16);
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "Time");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        int int7 = timePeriodValues3.getMaxMiddleIndex();
        int int8 = timePeriodValues3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setDescription("Value");
        int int9 = timePeriodValues3.getItemCount();
        boolean boolean10 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        int int12 = timePeriodValues9.getItemCount();
        timePeriodValues9.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues9.getKey();
        java.lang.Object obj16 = timePeriodValues9.clone();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues9);
        int int18 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable19 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues18.addChangeListener(seriesChangeListener19);
        timePeriodValues18.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timePeriodValues18.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimePeriodValues timePeriodValues26 = timePeriodValues18.createCopy(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertNotNull(timePeriodValues26);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues12.setDescription("hi!");
        boolean boolean15 = timePeriodValues12.isEmpty();
        int int16 = timePeriodValues12.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener17);
        int int19 = timePeriodValues12.getMaxStartIndex();
        int int20 = timePeriodValues12.getMaxMiddleIndex();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        java.lang.String str27 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.setNotify(false);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) 100);
        int int17 = timePeriodValues16.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues16.add(timePeriod18, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj12 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        timePeriodValues1.setNotify(false);
        int int17 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        int int16 = timePeriodValues1.getItemCount();
        int int17 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        int int18 = timePeriodValues1.getMaxMiddleIndex();
        int int19 = timePeriodValues1.getMinEndIndex();
        int int20 = timePeriodValues1.getMinStartIndex();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        boolean boolean11 = timePeriodValues6.equals((java.lang.Object) timePeriodValues10);
        int int12 = timePeriodValues10.getMaxEndIndex();
        int int13 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues15.setDescription("hi!");
        boolean boolean18 = timePeriodValues15.isEmpty();
        int int19 = timePeriodValues15.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues15.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues15.createCopy((int) (byte) 10, (int) '4');
        org.jfree.data.time.TimePeriodValues timePeriodValues27 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean28 = timePeriodValues27.getNotify();
        java.lang.String str29 = timePeriodValues27.getDomainDescription();
        int int30 = timePeriodValues27.getMaxMiddleIndex();
        int int31 = timePeriodValues27.getMinMiddleIndex();
        int int32 = timePeriodValues27.getMaxStartIndex();
        java.lang.String str33 = timePeriodValues27.getRangeDescription();
        boolean boolean34 = timePeriodValues15.equals((java.lang.Object) str33);
        org.jfree.data.time.TimePeriodValues timePeriodValues38 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues38.setRangeDescription("hi!");
        boolean boolean41 = timePeriodValues38.isEmpty();
        int int42 = timePeriodValues38.getMaxStartIndex();
        int int43 = timePeriodValues38.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timePeriodValues38.removePropertyChangeListener(propertyChangeListener44);
        timePeriodValues38.setKey((java.lang.Comparable) true);
        int int48 = timePeriodValues38.getMaxMiddleIndex();
        boolean boolean49 = timePeriodValues15.equals((java.lang.Object) timePeriodValues38);
        org.jfree.data.time.TimePeriodValues timePeriodValues52 = timePeriodValues15.createCopy((int) (byte) 10, (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timePeriodValues15.removeChangeListener(seriesChangeListener53);
        boolean boolean55 = timePeriodValues10.equals((java.lang.Object) seriesChangeListener53);
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timePeriodValues52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) '4', (int) (short) 10);
        java.lang.Comparable comparable16 = timePeriodValues3.getKey();
        timePeriodValues3.setDomainDescription("hi!");
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0d) + "'", comparable16, (-1.0d));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        int int4 = timePeriodValues3.getItemCount();
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj8 = timePeriodValues7.clone();
        java.lang.String str9 = timePeriodValues7.getDescription();
        int int10 = timePeriodValues7.getItemCount();
        java.lang.String str11 = timePeriodValues7.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues7.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timePeriodValues7.getDomainDescription();
        java.lang.Comparable comparable15 = timePeriodValues7.getKey();
        boolean boolean16 = timePeriodValues3.equals((java.lang.Object) comparable15);
        boolean boolean17 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        int int9 = timePeriodValues3.getItemCount();
        int int10 = timePeriodValues3.getMaxEndIndex();
        int int11 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "", "");
        int int4 = timePeriodValues3.getMinStartIndex();
        int int5 = timePeriodValues3.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "hi!", "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinStartIndex();
        int int7 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("Time");
        int int10 = timePeriodValues3.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        int int5 = timePeriodValues3.getMaxMiddleIndex();
        timePeriodValues3.setDescription("");
        timePeriodValues3.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = null; // flaky: timePeriodValues3.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0f) + "'", comparable4, (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod10 = timePeriodValues3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.lang.String str16 = timePeriodValues11.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "hi!", "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (short) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        int int26 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues28.setDescription("hi!");
        boolean boolean31 = timePeriodValues28.isEmpty();
        int int32 = timePeriodValues28.getMinEndIndex();
        timePeriodValues28.setDomainDescription("Value");
        java.lang.Object obj35 = timePeriodValues28.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timePeriodValues28.removeChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimePeriodValues timePeriodValues40 = timePeriodValues28.createCopy((int) (short) 0, (int) (short) 0);
        boolean boolean41 = timePeriodValues3.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(timePeriodValues40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        int int13 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete((int) (byte) 10, (int) (byte) -1);
        java.lang.Comparable comparable17 = timePeriodValues1.getKey();
        java.lang.String str18 = timePeriodValues1.getDescription();
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues22.removePropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues22.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = null; // flaky: timePeriodValues1.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        int int18 = timePeriodValues6.getMaxStartIndex();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        boolean boolean10 = timePeriodValues3.isEmpty();
        int int11 = timePeriodValues3.getMinEndIndex();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        timePeriodValues14.fireSeriesChanged();
        java.lang.Class<?> wildcardClass20 = timePeriodValues14.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod27 = timePeriodValues1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        int int11 = timePeriodValues3.getMinStartIndex();
        int int12 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        java.lang.String str27 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str30 = timePeriodValues1.getRangeDescription();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        int int9 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        int int11 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
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
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        timePeriodValues1.setKey((java.lang.Comparable) "Value");
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setDescription("hi!");
        boolean boolean29 = timePeriodValues1.getNotify();
        boolean boolean30 = timePeriodValues1.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        int int4 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        java.lang.Object obj10 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ');
        boolean boolean2 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("hi!");
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        boolean boolean13 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.String str12 = timePeriodValues3.getDescription();
        java.lang.String str13 = timePeriodValues3.getDescription();
        int int14 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0d) + "'", comparable10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        timePeriodValues10.setNotify(false);
        java.lang.String str16 = timePeriodValues10.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
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
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        int int11 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.update((int) (short) 1, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        boolean boolean13 = timePeriodValues1.getNotify();
        java.lang.Object obj14 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.String str8 = timePeriodValues1.getDescription();
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "Value", "");
        java.lang.Object obj4 = timePeriodValues3.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener5);
        timePeriodValues3.delete((int) (byte) 1, 0);
        java.lang.Comparable comparable10 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0f) + "'", comparable10, (-1.0f));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj14 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues11.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        int int3 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj5 = timePeriodValues3.clone();
        int int6 = timePeriodValues3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        int int6 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setRangeDescription("Time");
        boolean boolean7 = timePeriodValues3.getNotify();
        int int8 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues10.removePropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues10.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        int int23 = timePeriodValues1.getMaxStartIndex();
        int int24 = timePeriodValues1.getMinStartIndex();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy(10, (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues12.createCopy(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = timePeriodValues11.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        java.lang.Comparable comparable5 = timePeriodValues3.getKey();
        boolean boolean6 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 0 + "'", comparable5, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "Value");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "");
        boolean boolean4 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "Time");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        java.lang.String str5 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Value", "");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Time", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        timePeriodValues3.setKey((java.lang.Comparable) "Time");
        int int8 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, 0);
        int int7 = timePeriodValues3.getItemCount();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setDescription("");
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "hi!", "Time");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) '4', 1);
        java.lang.String str8 = timePeriodValues7.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "Value", "");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.setRangeDescription("");
        java.lang.Comparable comparable6 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f);
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy(0, (int) '4');
        org.junit.Assert.assertNotNull(timePeriodValues5);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        java.lang.Object obj4 = timePeriodValues3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100, "hi!", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        int int7 = timePeriodValues6.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues6.createCopy((int) (short) 1, 1);
        java.lang.Comparable comparable11 = timePeriodValues10.getKey();
        boolean boolean12 = timePeriodValues10.getNotify();
        timePeriodValues10.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues10.createCopy((int) (short) 100, 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues10.createCopy((-1), (int) '4');
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0d + "'", comparable11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertNotNull(timePeriodValues19);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        int int5 = timePeriodValues3.getMinMiddleIndex();
        timePeriodValues3.setKey((java.lang.Comparable) (byte) 0);
        timePeriodValues3.setRangeDescription("Time");
        timePeriodValues3.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Time", "Time");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.delete((int) '4', (int) (short) 0);
        timePeriodValues3.setKey((java.lang.Comparable) 0.0f);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L));
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (-1L) + "'", comparable3, (-1L));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "Value", "");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) (short) 10, 0);
        timePeriodValues3.setKey((java.lang.Comparable) 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setRangeDescription("Value");
        int int6 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
}
