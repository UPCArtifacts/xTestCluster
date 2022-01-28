import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries21.add(xYDataItem36, false);
        xYSeries15.add(xYDataItem36, true);
        xYSeries11.add(xYDataItem36);
        xYSeries1.add(xYDataItem36);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (-2), false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((int) (short) -1, (java.lang.Number) 10.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries5.getKey();
        boolean boolean13 = xYSeries5.getAutoSort();
        boolean boolean14 = xYSeries5.getAutoSort();
        boolean boolean15 = xYSeries5.isEmpty();
        java.lang.Object obj16 = xYSeries5.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 1);
        xYSeries1.add((double) 3, (double) 3, false);
        double[][] doubleArray18 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = null; // flaky: xYSeries1.getDataItem((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries11.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean19 = xYSeries1.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((-2), (java.lang.Number) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 2147483647, (java.lang.Number) (byte) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) (short) 10, (java.lang.Number) 10L, true);
        boolean boolean16 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.getAutoSort();
        xYSeries15.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number31 = xYSeries21.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries21.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        java.lang.Object obj37 = xYSeries35.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries35.addChangeListener(seriesChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries43.add(xYDataItem58);
        xYSeries35.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean64 = xYSeries63.isEmpty();
        java.lang.Object obj65 = xYSeries63.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener66 = null;
        xYSeries63.addChangeListener(seriesChangeListener66);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean74 = xYSeries73.isEmpty();
        xYSeries73.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries73.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries73.removePropertyChangeListener(propertyChangeListener82);
        boolean boolean84 = xYSeries73.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem86 = xYSeries73.remove((int) (short) 0);
        xYSeries71.add(xYDataItem86);
        xYSeries63.add(xYDataItem86);
        xYSeries61.setKey((java.lang.Comparable) xYDataItem86);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, true);
        xYSeries21.add(xYDataItem86);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem86);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, false, true);
        xYSeries1.add(xYDataItem86, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 100 + "'", comparable13, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + (short) 1 + "'", number31, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(xYDataItem86);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        double[][] doubleArray16 = xYSeries1.toArray();
        int int17 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        int int6 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        xYSeries1.add(52.0d, (double) 0, true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries14.clear();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener16);
        int int18 = xYSeries14.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries14.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        int int22 = xYSeries14.getItemCount();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) 3);
        xYSeries1.setMaximumItemCount(2147483647);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (short) 0, false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        xYSeries23.clear();
        xYSeries23.add(0.0d, (double) (short) 10, false);
        java.util.List list30 = xYSeries23.getItems();
        int int31 = xYSeries23.getItemCount();
        int int33 = xYSeries23.indexOf((java.lang.Number) (byte) 100);
        boolean boolean34 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries23.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        java.lang.Class<?> wildcardClass11 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = xYSeries1.equals(obj13);
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number15, (java.lang.Number) (-2), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean18 = xYSeries1.equals((java.lang.Object) ' ');
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        java.lang.Object obj22 = xYSeries20.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries20.addChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries28.add(xYDataItem43);
        xYSeries20.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43);
        xYSeries1.add(xYDataItem43, true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, true);
        java.lang.Class<?> wildcardClass52 = xYSeries51.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        int int60 = xYSeries58.indexOf((java.lang.Number) (-1.0f));
        xYSeries58.add((java.lang.Number) 100.0f, (java.lang.Number) 1.0f, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) 100.0f, (java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries21 = null; // flaky: xYSeries1.createCopy((-1), 32);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, false, true);
        int int84 = xYSeries82.indexOf((java.lang.Number) 4);
        java.lang.Number number86 = null;
        xYSeries82.add((java.lang.Number) 10, number86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.add((double) 100, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove((int) (short) 0);
        xYSeries1.add(xYDataItem16, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries20.createCopy((int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries23.delete((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.delete(2147483647, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = null; // flaky: xYSeries1.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        java.lang.Number number13 = xYSeries1.getY((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-2) + "'", number13, (-2));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((double) 35, (double) (-1L));
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        xYSeries1.add((double) ' ', (double) 'a');
        boolean boolean7 = xYSeries1.getNotify();
        boolean boolean8 = xYSeries1.isEmpty();
        xYSeries1.add((double) '4', (java.lang.Number) 1, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 0L);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean13 = xYSeries3.getAutoSort();
        int int15 = xYSeries3.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (byte) 1, (int) (byte) 0);
        xYSeries1.setKey((java.lang.Comparable) 100.0f);
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        double[][] doubleArray16 = xYSeries1.toArray();
        int int17 = xYSeries1.getMaximumItemCount();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean3 = xYSeries1.getAutoSort();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setDescription("hi!");
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries25.setDescription("");
        xYSeries25.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        xYSeries35.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries39.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60, false);
        xYSeries39.add(xYDataItem60, true);
        xYSeries35.add(xYDataItem60);
        xYSeries25.add(xYDataItem60);
        boolean boolean67 = xYSeries13.equals((java.lang.Object) xYDataItem60);
        xYSeries1.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, false, true);
        xYSeries71.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries21.createCopy((int) (byte) 1, 10);
        int int26 = xYSeries21.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = xYSeries28.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries28.remove((int) (short) 0);
        xYSeries21.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str45 = xYSeries44.getDescription();
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries44.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries52.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener61);
        boolean boolean63 = xYSeries52.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries52.remove((int) (short) 0);
        xYSeries50.add(xYDataItem65, false);
        xYSeries44.add(xYDataItem65, true);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, true);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem65);
        boolean boolean73 = xYSeries1.equals((java.lang.Object) xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries32.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str39 = xYSeries38.getDescription();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries38.createCopy((int) (byte) 1, 10);
        int int43 = xYSeries38.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries38.add(xYDataItem58);
        xYSeries32.add(xYDataItem58);
        boolean boolean61 = xYSeries32.getNotify();
        boolean boolean62 = xYSeries32.getAutoSort();
        java.lang.String str63 = xYSeries32.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries32.remove(1);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem65);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        xYSeries71.setMaximumItemCount(100);
        java.util.List list74 = xYSeries71.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem76 = null; // flaky: xYSeries71.remove((java.lang.Number) (-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        xYSeries1.add(0.0d, (double) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        java.lang.Comparable comparable9 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = null; // flaky: xYSeries3.remove((java.lang.Number) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1.0f + "'", comparable9, 1.0f);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        boolean boolean46 = xYSeries17.getNotify();
        boolean boolean47 = xYSeries17.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries17.createCopy((int) (byte) 0, (int) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries17.removeChangeListener(seriesChangeListener51);
        boolean boolean53 = xYSeries17.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        double[][] doubleArray10 = xYSeries5.toArray();
        int int11 = xYSeries5.getItemCount();
        xYSeries5.add((double) 1L, (java.lang.Number) (-1.0d), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true);
        int int3 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        int int7 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        boolean boolean10 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10);
        int int10 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number84 = xYSeries1.getX(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        double[][] doubleArray16 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) 0, true);
        xYSeries1.updateByIndex(3, (java.lang.Number) 0.0f);
        java.lang.Object obj26 = xYSeries1.clone();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.delete((int) '4', (int) (byte) 10);
        xYSeries1.clear();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 2, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 32, false);
        boolean boolean3 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((double) 0, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries3.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, false);
        xYSeries3.setNotify(true);
        int int15 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 10.0f, (double) 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        xYSeries1.delete((int) 'a', 35);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 32);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        boolean boolean9 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries21.add(xYDataItem36, false);
        xYSeries15.add(xYDataItem36, true);
        xYSeries11.add(xYDataItem36);
        xYSeries1.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, true);
        double[][] doubleArray46 = xYSeries45.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries45.removeChangeListener(seriesChangeListener47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries45.addPropertyChangeListener(propertyChangeListener49);
        int int52 = xYSeries45.indexOf((java.lang.Number) 100.0f);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = null; // flaky: xYSeries6.getY((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        xYSeries1.update((java.lang.Number) 100, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        xYSeries5.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries5.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = xYSeries5.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 0);
        xYSeries3.add(xYDataItem18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.removeChangeListener(seriesChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((double) (short) 1, (double) (byte) 100);
        boolean boolean14 = xYSeries3.isEmpty();
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.String str5 = xYSeries1.getDescription();
        xYSeries1.add((double) 1, (double) (-1.0f));
        int int9 = xYSeries1.getItemCount();
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) 100 + "'", comparable10, (byte) 100);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        xYSeries1.setNotify(false);
        xYSeries1.setMaximumItemCount((int) '#');
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number85 = xYSeries83.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        int int9 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries12 = null; // flaky: xYSeries1.createCopy((int) (byte) -1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.lang.Number number11 = xYSeries1.getY(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(4, (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = xYSeries14.clone();
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 1 + "'", number11, (byte) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries15.setDescription("");
        xYSeries15.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries21.createCopy((int) (byte) 1, 10);
        xYSeries25.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        xYSeries37.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries37.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener46);
        boolean boolean48 = xYSeries37.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries37.remove((int) (short) 0);
        xYSeries35.add(xYDataItem50, false);
        xYSeries29.add(xYDataItem50, true);
        xYSeries25.add(xYDataItem50);
        xYSeries15.add(xYDataItem50);
        xYSeries1.add(xYDataItem50, false);
        int int59 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        xYSeries1.setNotify(true);
        java.lang.Object obj25 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        java.lang.Object obj14 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.update((java.lang.Number) 100L, (java.lang.Number) 1);
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) 2);
        boolean boolean22 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean23 = xYSeries3.isEmpty();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        xYSeries1.fireSeriesChanged();
        java.util.List list3 = xYSeries1.getItems();
        xYSeries1.add((double) 0.0f, (double) (-1), true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0f, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.getAutoSort();
        java.lang.Object obj13 = xYSeries11.clone();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener28);
        boolean boolean30 = xYSeries19.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries19.remove((int) (short) 0);
        xYSeries17.add(xYDataItem32);
        xYSeries11.add(xYDataItem32, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32);
        xYSeries1.add(xYDataItem32, false);
        xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        boolean boolean11 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) 1.0f, (double) 0);
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        int int18 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        int int49 = xYSeries17.indexOf((java.lang.Number) 2147483647);
        java.lang.Comparable comparable50 = xYSeries17.getKey();
        xYSeries17.delete(4, 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-3) + "'", int49 == (-3));
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (short) 0 + "'", comparable50, (short) 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        int int61 = xYSeries49.getItemCount();
        java.lang.String str62 = xYSeries49.getDescription();
        java.lang.Number number64 = xYSeries49.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries66.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries66.add(xYDataItem85);
        xYSeries49.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries17.add(xYDataItem85, false);
        xYSeries17.add((java.lang.Number) 1L, (java.lang.Number) (short) 0, false);
        java.lang.Number number97 = xYSeries17.getY(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + number64 + "' != '" + (byte) -1 + "'", number64, (byte) -1);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertEquals("'" + number97 + "' != '" + (short) 0 + "'", number97, (short) 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        java.util.List list27 = xYSeries1.getItems();
        boolean boolean28 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries31.add((java.lang.Number) (-2), (java.lang.Number) 10);
        boolean boolean35 = xYSeries31.isEmpty();
        xYSeries31.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list15 = xYSeries1.getItems();
        boolean boolean16 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries17.createCopy(100, (-1));
        java.lang.Class<?> wildcardClass25 = xYSeries24.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false);
        int int3 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries10.setDescription("");
        xYSeries10.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        xYSeries20.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries30.add(xYDataItem45, false);
        xYSeries24.add(xYDataItem45, true);
        xYSeries20.add(xYDataItem45);
        xYSeries10.add(xYDataItem45);
        xYSeries1.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true, false);
        xYSeries55.fireSeriesChanged();
        double[][] doubleArray57 = xYSeries55.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(doubleArray57);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        int int28 = xYSeries1.indexOf((java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = null; // flaky: xYSeries1.getX((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        java.lang.Object obj28 = xYSeries26.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries26.addChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries34.add(xYDataItem49);
        xYSeries26.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str54 = xYSeries53.getDescription();
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries53.createCopy((int) (byte) 1, 10);
        int int58 = xYSeries53.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean61 = xYSeries60.isEmpty();
        xYSeries60.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries60.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener69);
        boolean boolean71 = xYSeries60.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries60.remove((int) (short) 0);
        xYSeries53.add(xYDataItem73);
        xYSeries26.add(xYDataItem73, false);
        xYSeries3.add(xYDataItem73);
        int int78 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        xYSeries1.add((double) 'a', (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        int int12 = xYSeries7.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries14.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = xYSeries14.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries14.remove((int) (short) 0);
        xYSeries7.add(xYDataItem27);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add((double) (byte) 1, (java.lang.Number) (short) 0, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries1.equals((java.lang.Object) xYSeries29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = xYSeries29.getY(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        xYSeries1.add((double) (-2), (double) ' ', false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((double) (short) 1, (double) (byte) 100);
        boolean boolean14 = xYSeries3.isEmpty();
        xYSeries3.setMaximumItemCount(3);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 100);
        java.lang.Number number16 = xYSeries1.getX(0);
        int int18 = xYSeries1.indexOf((java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list15 = xYSeries1.getItems();
        int int16 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1, (java.lang.Number) 52.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.lang.String str23 = xYSeries13.getDescription();
        java.util.List list24 = xYSeries13.getItems();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries26.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str31 = xYSeries30.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries30.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries30.add(xYDataItem49);
        xYSeries26.setKey((java.lang.Comparable) xYDataItem49);
        xYSeries13.add(xYDataItem49);
        int int53 = xYSeries13.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove((int) (short) 0);
        xYSeries1.add(xYDataItem16, false);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (byte) 10, 0);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries21.addOrUpdate((double) 10.0f, (double) (short) 10);
        boolean boolean25 = xYSeries21.getAutoSort();
        xYSeries21.add((double) (-2), (java.lang.Number) (-3));
        java.lang.Object obj29 = xYSeries21.clone();
        double[][] doubleArray30 = xYSeries21.toArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(doubleArray30);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) (-3));
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries5.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNotNull(xYDataItem11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean18 = xYSeries1.equals((java.lang.Object) ' ');
        int int19 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0d, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.lang.String str23 = xYSeries13.getDescription();
        java.util.List list24 = xYSeries13.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries13.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) 2);
        xYSeries13.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(xYDataItem27);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.add(52.0d, (-1.0d), true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        xYSeries13.add(xYDataItem28);
        xYSeries13.fireSeriesChanged();
        java.util.List list31 = xYSeries13.getItems();
        boolean boolean32 = xYSeries1.equals((java.lang.Object) xYSeries13);
        xYSeries13.add((double) 100.0f, (java.lang.Number) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries13.updateByIndex((int) (byte) 10, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        xYSeries1.add((double) 35, (java.lang.Number) (-1), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, true);
        boolean boolean30 = xYSeries29.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.update((java.lang.Number) 35, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 35");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = null; // flaky: xYSeries3.remove((java.lang.Number) 10.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = xYSeries3.isEmpty();
        int int26 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) ' ', (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 4, true, false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries7.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries7.getItems();
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        xYSeries1.add((double) (-1.0f), (double) '4', true);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries5.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = xYSeries1.equals(obj13);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (short) -1, 0);
        double[][] doubleArray18 = xYSeries17.toArray();
        int int19 = xYSeries17.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 0L);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((-2), (java.lang.Number) 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        boolean boolean46 = xYSeries17.getNotify();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries48.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean59 = xYSeries48.getAutoSort();
        int int60 = xYSeries48.getItemCount();
        java.lang.String str61 = xYSeries48.getDescription();
        java.lang.Number number63 = xYSeries48.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str66 = xYSeries65.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries65.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean72 = xYSeries71.isEmpty();
        xYSeries71.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries71.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener80);
        boolean boolean82 = xYSeries71.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries71.remove((int) (short) 0);
        xYSeries65.add(xYDataItem84);
        xYSeries48.setKey((java.lang.Comparable) xYDataItem84);
        xYSeries17.add(xYDataItem84, false);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + number63 + "' != '" + (byte) -1 + "'", number63, (byte) -1);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(xYDataItem69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        java.util.List list27 = xYSeries1.getItems();
        int int29 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 100L, false);
        int int34 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) 100, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = xYSeries17.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries17.remove((int) (short) 0);
        xYSeries15.add(xYDataItem30, false);
        xYSeries9.add(xYDataItem30, true);
        xYSeries5.add(xYDataItem30);
        int int37 = xYSeries5.indexOf((java.lang.Number) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries5.addChangeListener(seriesChangeListener38);
        xYSeries5.add((double) (byte) 1, (double) 'a', true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries24.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries24.removeChangeListener(seriesChangeListener27);
        java.lang.Object obj29 = xYSeries24.clone();
        boolean boolean30 = xYSeries1.equals((java.lang.Object) xYSeries24);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries1.addOrUpdate(1.0d, (double) 2147483647);
        xYSeries1.add((double) (short) 1, (double) (byte) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(xYDataItem33);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        xYSeries1.add((double) 'a', (java.lang.Number) 10.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 0L, (double) (short) 1);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        int int18 = xYSeries1.indexOf((java.lang.Number) 100.0f);
        boolean boolean19 = xYSeries1.isEmpty();
        xYSeries1.setMaximumItemCount(35);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, false, true);
        int int84 = xYSeries82.indexOf((java.lang.Number) 4);
        java.lang.Object obj85 = xYSeries82.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        boolean boolean24 = xYSeries13.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries13.remove((int) (short) 0);
        xYSeries11.add(xYDataItem26, false);
        xYSeries1.add(xYDataItem26, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false, true);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26);
        double[][] doubleArray35 = xYSeries34.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries34.update((java.lang.Number) 10.0d, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(doubleArray35);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        boolean boolean15 = xYSeries1.getNotify();
        boolean boolean16 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 1.0f, (double) 3, true);
        java.util.List list13 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setDescription("hi!");
        xYSeries1.setDescription("hi!");
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        java.lang.Comparable comparable58 = xYSeries57.getKey();
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries(comparable58);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries(comparable58, true);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries(comparable58, false);
        xYSeries63.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries63.update((java.lang.Number) 10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(comparable58);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) 100, (double) (short) 1);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        java.lang.Object obj11 = xYSeries3.clone();
        int int12 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray10 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        int int9 = xYSeries5.indexOf((java.lang.Number) 100L);
        double[][] doubleArray10 = xYSeries5.toArray();
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        int int11 = xYSeries1.getItemCount();
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (-1), false);
        java.lang.Object obj18 = xYSeries1.clone();
        xYSeries1.add((double) (-1.0f), (java.lang.Number) 3, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        int int16 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        int int20 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        boolean boolean14 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries14.createCopy((int) (byte) 1, 10);
        int int19 = xYSeries14.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries21.remove((int) (short) 0);
        xYSeries14.add(xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem34);
        boolean boolean38 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        xYSeries81.add((double) (-1L), (java.lang.Number) (short) 10, false);
        java.lang.Number number87 = null;
        org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries81.addOrUpdate((java.lang.Number) 10.0d, number87);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries81.update((java.lang.Number) 4, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertNull(xYDataItem88);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        xYSeries47.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (short) 100, (java.lang.Number) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = xYSeries17.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries17.remove((int) (short) 0);
        xYSeries17.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 10);
        java.lang.Object obj34 = xYSeries17.clone();
        boolean boolean35 = xYSeries17.getNotify();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries40.setDescription("");
        xYSeries40.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str47 = xYSeries46.getDescription();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries46.createCopy((int) (byte) 1, 10);
        xYSeries50.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str55 = xYSeries54.getDescription();
        org.jfree.data.xy.XYSeries xYSeries58 = xYSeries54.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean63 = xYSeries62.isEmpty();
        xYSeries62.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries62.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries62.removePropertyChangeListener(propertyChangeListener71);
        boolean boolean73 = xYSeries62.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries62.remove((int) (short) 0);
        xYSeries60.add(xYDataItem75, false);
        xYSeries54.add(xYDataItem75, true);
        xYSeries50.add(xYDataItem75);
        xYSeries40.add(xYDataItem75);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem75);
        xYSeries17.add(xYDataItem75, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(xYSeries58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate((double) 2147483647, (double) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.delete(3, 0);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(xYDataItem16);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Object obj8 = xYSeries1.clone();
        double[][] doubleArray9 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) -1, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-2), (double) (-1L));
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((-3), number10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        int int9 = xYSeries1.getItemCount();
        java.lang.Number number11 = xYSeries1.getX(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0d + "'", number11, 100.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        xYSeries1.clear();
        xYSeries1.setDescription("");
        int int19 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        boolean boolean16 = xYSeries5.isEmpty();
        boolean boolean17 = xYSeries5.getAutoSort();
        xYSeries5.update((java.lang.Number) 10L, (java.lang.Number) 100L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries9.addChangeListener(seriesChangeListener18);
        xYSeries9.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries31.setDescription("");
        xYSeries31.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        xYSeries41.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries45.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries51.add(xYDataItem66, false);
        xYSeries45.add(xYDataItem66, true);
        xYSeries41.add(xYDataItem66);
        xYSeries31.add(xYDataItem66);
        xYSeries22.add(xYDataItem66);
        xYSeries9.add(xYDataItem66, false);
        xYSeries1.add(xYDataItem66);
        xYSeries1.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        xYSeries1.removeChangeListener(seriesChangeListener79);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener81 = null;
        xYSeries1.removeChangeListener(seriesChangeListener81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        xYSeries1.setNotify(false);
        xYSeries1.delete((int) (short) 10, (-1));
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        int int35 = xYSeries29.getItemCount();
        int int37 = xYSeries29.indexOf((java.lang.Number) (byte) -1);
        xYSeries29.add((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        boolean boolean41 = xYSeries1.equals((java.lang.Object) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.delete(10, (int) (byte) -1);
        boolean boolean16 = xYSeries1.getAutoSort();
        int int17 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 4, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = null; // flaky: xYSeries1.remove((java.lang.Number) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 32, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.delete(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        xYSeries1.setMaximumItemCount((int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 10, (double) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        xYSeries15.clear();
        xYSeries15.add(0.0d, (double) (short) 10, false);
        java.util.List list22 = xYSeries15.getItems();
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries15.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int38 = xYSeries29.getMaximumItemCount();
        xYSeries29.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries29.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries48.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean59 = xYSeries48.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries48.remove((int) (short) 0);
        xYSeries46.add(xYDataItem61, false);
        xYSeries29.add(xYDataItem61, true);
        xYSeries15.add(xYDataItem61, false);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries15.remove(0);
        xYSeries1.add(xYDataItem69, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries72.updateByIndex((int) (byte) 10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        int int28 = xYSeries1.indexOf((java.lang.Number) 0.0f);
        int int30 = xYSeries1.indexOf((java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) 1L, (double) (byte) 100);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        xYSeries1.setMaximumItemCount(10);
        xYSeries1.add((double) (short) 1, (double) 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 2);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass12 = xYSeries11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str9 = xYSeries8.getDescription();
        boolean boolean10 = xYSeries8.isEmpty();
        boolean boolean11 = xYSeries8.getAllowDuplicateXValues();
        xYSeries8.setMaximumItemCount((int) (short) 100);
        xYSeries8.add((double) 100.0f, 10.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries8.removeChangeListener(seriesChangeListener17);
        boolean boolean19 = xYSeries6.equals((java.lang.Object) xYSeries8);
        java.lang.Object obj20 = xYSeries6.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: xYSeries3.getY((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries15.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries32.add(xYDataItem47, false);
        xYSeries15.add(xYDataItem47, true);
        xYSeries1.add(xYDataItem47, false);
        int int54 = xYSeries1.getMaximumItemCount();
        int int55 = xYSeries1.getMaximumItemCount();
        boolean boolean56 = xYSeries1.getAutoSort();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        double[][] doubleArray7 = xYSeries6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.update((java.lang.Number) 52.0d, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 52.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.String str5 = xYSeries1.getDescription();
        java.lang.Class<?> wildcardClass6 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) 3, (double) 35);
        xYSeries1.delete((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener28);
        boolean boolean30 = xYSeries19.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries19.remove((int) (short) 0);
        xYSeries17.add(xYDataItem32, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        java.lang.Number number37 = xYSeries1.getY((int) (byte) 1);
        boolean boolean38 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 1L + "'", number37, 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.delete((int) (short) 10, 0);
        java.util.List list7 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        java.lang.String str4 = xYSeries2.getDescription();
        java.lang.Comparable comparable5 = xYSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries2.getDataItem(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-1.0d) + "'", comparable5, (-1.0d));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries11.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean19 = xYSeries1.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.setKey((java.lang.Comparable) 35);
        int int14 = xYSeries1.getItemCount();
        java.lang.String str15 = xYSeries1.getDescription();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        java.lang.Object obj13 = xYSeries5.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries5.getKey();
        boolean boolean13 = xYSeries5.getAutoSort();
        boolean boolean14 = xYSeries5.getAutoSort();
        boolean boolean15 = xYSeries5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = null; // flaky: xYSeries5.getDataItem((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries21.add(xYDataItem36, false);
        xYSeries15.add(xYDataItem36, true);
        xYSeries11.add(xYDataItem36);
        xYSeries1.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, true);
        double[][] doubleArray46 = xYSeries45.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries45.removeChangeListener(seriesChangeListener47);
        java.lang.Object obj49 = xYSeries45.clone();
        xYSeries45.add((double) 0, 52.0d, true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) (short) -1, (int) '4');
        java.lang.String str12 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (short) 0, (java.lang.Number) (short) 0, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        java.lang.Comparable comparable19 = xYSeries17.getKey();
        xYSeries17.add(0.0d, (double) '4');
        xYSeries17.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries28.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries28.add(xYDataItem47);
        xYSeries17.add(xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        boolean boolean52 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = null; // flaky: xYSeries1.getY((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int22 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries1.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true);
        boolean boolean31 = xYSeries30.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        int int61 = xYSeries49.getItemCount();
        java.lang.String str62 = xYSeries49.getDescription();
        java.lang.Number number64 = xYSeries49.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries66.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries66.add(xYDataItem85);
        xYSeries49.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries17.add(xYDataItem85, false);
        xYSeries17.add((java.lang.Number) (short) 10, (java.lang.Number) 10.0d);
        xYSeries17.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + number64 + "' != '" + (byte) -1 + "'", number64, (byte) -1);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        double[][] doubleArray15 = xYSeries1.toArray();
        xYSeries1.setDescription("");
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        int int20 = xYSeries5.indexOf((java.lang.Number) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        xYSeries1.setNotify(false);
        xYSeries1.delete((int) (short) 10, (-1));
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1.0d), true);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries1.removeChangeListener(seriesChangeListener33);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem37);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries23.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = xYSeries1.equals(obj13);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (short) -1, 0);
        double[][] doubleArray18 = xYSeries17.toArray();
        int int20 = xYSeries17.indexOf((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries17.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        boolean boolean16 = xYSeries5.isEmpty();
        xYSeries5.add((double) 100, (java.lang.Number) (-2));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        int int11 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        boolean boolean16 = xYSeries5.isEmpty();
        xYSeries5.setKey((java.lang.Comparable) (short) -1);
        int int19 = xYSeries5.getMaximumItemCount();
        boolean boolean20 = xYSeries5.getNotify();
        xYSeries5.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        java.util.List list27 = xYSeries1.getItems();
        boolean boolean28 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries31.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries31.addChangeListener(seriesChangeListener33);
        xYSeries31.add((java.lang.Number) 0, (java.lang.Number) 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries52.setDescription("");
        xYSeries52.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str59 = xYSeries58.getDescription();
        org.jfree.data.xy.XYSeries xYSeries62 = xYSeries58.createCopy((int) (byte) 1, 10);
        xYSeries62.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYSeries xYSeries70 = xYSeries66.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean75 = xYSeries74.isEmpty();
        xYSeries74.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries74.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener83);
        boolean boolean85 = xYSeries74.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries74.remove((int) (short) 0);
        xYSeries72.add(xYDataItem87, false);
        xYSeries66.add(xYDataItem87, true);
        xYSeries62.add(xYDataItem87);
        xYSeries52.add(xYDataItem87);
        boolean boolean94 = xYSeries40.equals((java.lang.Object) xYDataItem87);
        xYSeries31.setKey((java.lang.Comparable) boolean94);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(xYSeries62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(xYSeries70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.clear();
        java.lang.Comparable comparable21 = xYSeries18.getKey();
        double[][] doubleArray22 = xYSeries18.toArray();
        xYSeries18.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str27 = xYSeries18.getDescription();
        double[][] doubleArray28 = xYSeries18.toArray();
        int int30 = xYSeries18.indexOf((java.lang.Number) (short) 100);
        xYSeries18.delete((int) 'a', 35);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries18.remove((java.lang.Number) 32);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35, false, false);
        xYSeries1.add(xYDataItem35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (byte) 100 + "'", comparable21, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(4);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        int int14 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 100 + "'", comparable13, (byte) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy((int) (byte) 1, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries12.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Comparable comparable30 = xYSeries27.getKey();
        java.lang.Comparable comparable31 = xYSeries27.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNotNull(comparable30);
        org.junit.Assert.assertNotNull(comparable31);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.remove(1);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem16);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) 0, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        xYSeries1.setKey((java.lang.Comparable) (-2));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add((double) (-2), (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((-1.0d), 10.0d);
        xYSeries1.setDescription("");
        boolean boolean11 = xYSeries1.getNotify();
        int int12 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        boolean boolean7 = xYSeries3.getNotify();
        java.util.List list8 = xYSeries3.getItems();
        int int10 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.lang.Object obj12 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add(0.0d, (double) '4');
        xYSeries9.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str21 = xYSeries20.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries20.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries20.add(xYDataItem39);
        xYSeries9.add(xYDataItem39);
        xYSeries1.add(xYDataItem39);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries1.addOrUpdate((double) (-1L), (double) 2);
        java.lang.Comparable comparable46 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 100 + "'", comparable11, (byte) 100);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNull(xYDataItem45);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (byte) 100 + "'", comparable46, (byte) 100);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean18 = xYSeries1.equals((java.lang.Object) ' ');
        int int19 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries9.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 10);
        java.lang.Object obj26 = xYSeries9.clone();
        boolean boolean27 = xYSeries9.getNotify();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries32.setDescription("");
        xYSeries32.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str39 = xYSeries38.getDescription();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries38.createCopy((int) (byte) 1, 10);
        xYSeries42.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str47 = xYSeries46.getDescription();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries46.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean55 = xYSeries54.isEmpty();
        xYSeries54.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries54.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener63);
        boolean boolean65 = xYSeries54.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries54.remove((int) (short) 0);
        xYSeries52.add(xYDataItem67, false);
        xYSeries46.add(xYDataItem67, true);
        xYSeries42.add(xYDataItem67);
        xYSeries32.add(xYDataItem67);
        xYSeries29.setKey((java.lang.Comparable) xYDataItem67);
        xYSeries9.add(xYDataItem67, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem67);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number30 = xYSeries20.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries20.addChangeListener(seriesChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        java.lang.Object obj36 = xYSeries34.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries34.addChangeListener(seriesChangeListener37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean45 = xYSeries44.isEmpty();
        xYSeries44.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries44.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener53);
        boolean boolean55 = xYSeries44.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries44.remove((int) (short) 0);
        xYSeries42.add(xYDataItem57);
        xYSeries34.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean63 = xYSeries62.isEmpty();
        java.lang.Object obj64 = xYSeries62.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener65 = null;
        xYSeries62.addChangeListener(seriesChangeListener65);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries70.add(xYDataItem85);
        xYSeries62.add(xYDataItem85);
        xYSeries60.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries20.add(xYDataItem85);
        xYSeries14.add(xYDataItem85, false);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + (short) 1 + "'", number30, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 1, 10);
        xYSeries7.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.equals((java.lang.Object) xYSeries7);
        java.lang.String str13 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = null; // flaky: xYSeries1.getY((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries28.createCopy((int) (byte) 1, 10);
        int int33 = xYSeries28.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean46 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries35.remove((int) (short) 0);
        xYSeries28.add(xYDataItem48);
        xYSeries1.add(xYDataItem48, false);
        xYSeries1.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        int int61 = xYSeries49.getItemCount();
        java.lang.String str62 = xYSeries49.getDescription();
        java.lang.Number number64 = xYSeries49.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries66.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries66.add(xYDataItem85);
        xYSeries49.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries17.add(xYDataItem85, false);
        xYSeries17.add((java.lang.Number) (short) 10, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries97 = xYSeries17.createCopy(100, (int) (byte) -1);
        int int98 = xYSeries17.getItemCount();
        double[][] doubleArray99 = xYSeries17.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + number64 + "' != '" + (byte) -1 + "'", number64, (byte) -1);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNotNull(xYSeries97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 4 + "'", int98 == 4);
        org.junit.Assert.assertNotNull(doubleArray99);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean18 = xYSeries1.equals((java.lang.Object) ' ');
        java.lang.String str19 = xYSeries1.getDescription();
        boolean boolean20 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries1.removeChangeListener(seriesChangeListener23);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.add(10.0d, (java.lang.Number) 0L);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries22.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries22.removeChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries1.equals((java.lang.Object) xYSeries22);
        xYSeries1.delete((int) 'a', (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        boolean boolean10 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries14.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.getAutoSort();
        xYSeries18.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number34 = xYSeries24.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries24.addChangeListener(seriesChangeListener35);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean39 = xYSeries38.isEmpty();
        java.lang.Object obj40 = xYSeries38.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries38.addChangeListener(seriesChangeListener41);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries48.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean59 = xYSeries48.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries48.remove((int) (short) 0);
        xYSeries46.add(xYDataItem61);
        xYSeries38.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        java.lang.Object obj68 = xYSeries66.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        xYSeries66.addChangeListener(seriesChangeListener69);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean77 = xYSeries76.isEmpty();
        xYSeries76.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries76.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        xYSeries76.removePropertyChangeListener(propertyChangeListener85);
        boolean boolean87 = xYSeries76.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries76.remove((int) (short) 0);
        xYSeries74.add(xYDataItem89);
        xYSeries66.add(xYDataItem89);
        xYSeries64.setKey((java.lang.Comparable) xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, true);
        xYSeries24.add(xYDataItem89);
        xYSeries18.setKey((java.lang.Comparable) xYDataItem89);
        xYSeries14.setKey((java.lang.Comparable) xYDataItem89);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + (short) 1 + "'", number34, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries15.setDescription("");
        xYSeries15.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries21.createCopy((int) (byte) 1, 10);
        xYSeries25.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        xYSeries37.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries37.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener46);
        boolean boolean48 = xYSeries37.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries37.remove((int) (short) 0);
        xYSeries35.add(xYDataItem50, false);
        xYSeries29.add(xYDataItem50, true);
        xYSeries25.add(xYDataItem50);
        xYSeries15.add(xYDataItem50);
        xYSeries1.add(xYDataItem50, false);
        int int60 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-3) + "'", int60 == (-3));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        xYSeries1.setDescription("hi!");
        boolean boolean20 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (short) 1, (java.lang.Number) 0);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = xYSeries1.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 100);
        java.lang.Number number16 = xYSeries1.getX(0);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 100 + "'", comparable17, (byte) 100);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22);
        xYSeries1.add(xYDataItem22, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = null; // flaky: xYSeries1.remove((java.lang.Number) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount(35);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem18, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries20.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        xYSeries1.delete((int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem28 = null; // flaky: xYSeries1.remove((java.lang.Number) (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        xYSeries5.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries5.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = xYSeries5.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 0);
        xYSeries3.add(xYDataItem18);
        xYSeries3.fireSeriesChanged();
        java.util.List list21 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100.0f, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        boolean boolean12 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 0.0f, true);
        java.lang.Object obj17 = xYSeries1.clone();
        xYSeries1.add((double) (-1L), (java.lang.Number) 10.0f);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 0, true);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.getDataItem(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean18 = xYSeries1.equals((java.lang.Object) ' ');
        int int19 = xYSeries1.getItemCount();
        int int21 = xYSeries1.indexOf((java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getNotify();
        boolean boolean9 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean10 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries3.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries23.setDescription("");
        xYSeries23.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries43.add(xYDataItem58, false);
        xYSeries37.add(xYDataItem58, true);
        xYSeries33.add(xYDataItem58);
        xYSeries23.add(xYDataItem58);
        xYSeries14.add(xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        int int12 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) 100.0f, (java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
        xYSeries3.fireSeriesChanged();
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries32.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str39 = xYSeries38.getDescription();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries38.createCopy((int) (byte) 1, 10);
        int int43 = xYSeries38.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries38.add(xYDataItem58);
        xYSeries32.add(xYDataItem58);
        boolean boolean61 = xYSeries32.getNotify();
        boolean boolean62 = xYSeries32.getAutoSort();
        java.lang.String str63 = xYSeries32.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries32.remove(1);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem65);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries1.getDataItem(0);
        int int70 = xYSeries1.indexOf((java.lang.Number) (-3));
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        double[][] doubleArray10 = xYSeries5.toArray();
        int int11 = xYSeries5.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = null; // flaky: xYSeries5.remove((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries25.setDescription("");
        xYSeries25.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        xYSeries35.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries39.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60, false);
        xYSeries39.add(xYDataItem60, true);
        xYSeries35.add(xYDataItem60);
        xYSeries25.add(xYDataItem60);
        boolean boolean67 = xYSeries13.equals((java.lang.Object) xYDataItem60);
        xYSeries1.add(xYDataItem60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number70 = xYSeries1.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        xYSeries18.add(xYDataItem33);
        xYSeries3.add(xYDataItem33, false);
        xYSeries3.add((double) 10L, (double) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries3.removeChangeListener(seriesChangeListener40);
        xYSeries3.clear();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        java.util.List list4 = xYSeries1.getItems();
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (byte) 100 + "'", comparable5, (byte) 100);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.delete((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        xYSeries1.setDescription("hi!");
        boolean boolean20 = xYSeries1.getAutoSort();
        xYSeries1.update((java.lang.Number) (short) 0, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries29 = xYSeries1.createCopy(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 1, true);
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) 1L, (java.lang.Number) (-3), true);
        int int24 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = null; // flaky: xYSeries1.remove((java.lang.Number) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        double[][] doubleArray20 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = null; // flaky: xYSeries1.remove((java.lang.Number) (-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.clear();
        xYSeries18.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries18.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int28 = xYSeries18.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries5.equals((java.lang.Object) xYSeries18);
        int int34 = xYSeries18.getItemCount();
        int int36 = xYSeries18.indexOf((java.lang.Number) 1.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (short) 1);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        int int11 = xYSeries1.indexOf((java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        boolean boolean19 = xYSeries5.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        int int23 = xYSeries21.getMaximumItemCount();
        boolean boolean24 = xYSeries21.getAutoSort();
        xYSeries21.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries21.removeChangeListener(seriesChangeListener27);
        int int29 = xYSeries21.getMaximumItemCount();
        java.lang.String str30 = xYSeries21.getDescription();
        int int31 = xYSeries21.getItemCount();
        int int32 = xYSeries21.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries34.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        xYSeries42.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries42.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries42.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries42.remove((int) (short) 0);
        xYSeries40.add(xYDataItem55, false);
        xYSeries34.add(xYDataItem55, true);
        java.util.List list60 = xYSeries34.getItems();
        boolean boolean61 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries34.remove(0);
        xYSeries21.add(xYDataItem63);
        xYSeries5.setKey((java.lang.Comparable) xYDataItem63);
        java.lang.Number number67 = xYSeries5.getY(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertEquals("'" + number67 + "' != '" + 100L + "'", number67, 100L);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        boolean boolean16 = xYSeries5.isEmpty();
        xYSeries5.setKey((java.lang.Comparable) (short) -1);
        boolean boolean19 = xYSeries5.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.clear();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0);
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number16, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = null; // flaky: xYSeries3.remove((java.lang.Number) 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        int int61 = xYSeries49.getItemCount();
        java.lang.String str62 = xYSeries49.getDescription();
        java.lang.Number number64 = xYSeries49.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries66.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries66.add(xYDataItem85);
        xYSeries49.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries17.add(xYDataItem85, false);
        xYSeries17.add((java.lang.Number) 1L, (java.lang.Number) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries17.delete((int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + number64 + "' != '" + (byte) -1 + "'", number64, (byte) -1);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number27 = xYSeries17.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries17.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        java.lang.Object obj33 = xYSeries31.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries31.addChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean42 = xYSeries41.isEmpty();
        xYSeries41.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries41.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries41.remove((int) (short) 0);
        xYSeries39.add(xYDataItem54);
        xYSeries31.add(xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        java.lang.Object obj61 = xYSeries59.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        xYSeries59.addChangeListener(seriesChangeListener62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean70 = xYSeries69.isEmpty();
        xYSeries69.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries69.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener78);
        boolean boolean80 = xYSeries69.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries69.remove((int) (short) 0);
        xYSeries67.add(xYDataItem82);
        xYSeries59.add(xYDataItem82);
        xYSeries57.setKey((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true);
        xYSeries17.add(xYDataItem82);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem82);
        java.util.List list90 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (short) 1 + "'", number27, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(xYDataItem82);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        xYSeries1.setNotify(true);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries15.removeChangeListener(seriesChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) propertyChangeListener19);
        xYSeries1.add((java.lang.Number) 35, (java.lang.Number) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.delete((int) (short) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries25.setDescription("");
        xYSeries25.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        xYSeries35.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries39.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60, false);
        xYSeries39.add(xYDataItem60, true);
        xYSeries35.add(xYDataItem60);
        xYSeries25.add(xYDataItem60);
        boolean boolean67 = xYSeries13.equals((java.lang.Object) xYDataItem60);
        xYSeries1.add(xYDataItem60);
        xYSeries1.setMaximumItemCount((int) '#');
        xYSeries1.add(52.0d, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries9.addChangeListener(seriesChangeListener18);
        xYSeries9.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries31.setDescription("");
        xYSeries31.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        xYSeries41.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries45.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries51.add(xYDataItem66, false);
        xYSeries45.add(xYDataItem66, true);
        xYSeries41.add(xYDataItem66);
        xYSeries31.add(xYDataItem66);
        xYSeries22.add(xYDataItem66);
        xYSeries9.add(xYDataItem66, false);
        xYSeries1.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean79 = xYSeries78.isEmpty();
        int int80 = xYSeries78.getMaximumItemCount();
        boolean boolean81 = xYSeries78.getAutoSort();
        xYSeries78.setDescription("hi!");
        xYSeries78.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        xYSeries78.fireSeriesChanged();
        boolean boolean89 = xYSeries1.equals((java.lang.Object) xYSeries78);
        boolean boolean90 = xYSeries78.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2147483647 + "'", int80 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        xYSeries1.delete((int) ' ', (int) (short) 0);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0f, false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number27 = xYSeries17.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries17.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        java.lang.Object obj33 = xYSeries31.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries31.addChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean42 = xYSeries41.isEmpty();
        xYSeries41.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries41.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries41.remove((int) (short) 0);
        xYSeries39.add(xYDataItem54);
        xYSeries31.add(xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        java.lang.Object obj61 = xYSeries59.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        xYSeries59.addChangeListener(seriesChangeListener62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean70 = xYSeries69.isEmpty();
        xYSeries69.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries69.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener78);
        boolean boolean80 = xYSeries69.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries69.remove((int) (short) 0);
        xYSeries67.add(xYDataItem82);
        xYSeries59.add(xYDataItem82);
        xYSeries57.setKey((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true);
        xYSeries17.add(xYDataItem82);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (short) 1 + "'", number27, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.delete(10, (int) (byte) -1);
        boolean boolean16 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        int int21 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries1.addChangeListener(seriesChangeListener22);
        java.lang.Object obj24 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        boolean boolean24 = xYSeries13.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries13.remove((int) (short) 0);
        xYSeries11.add(xYDataItem26, false);
        xYSeries1.add(xYDataItem26, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false, true);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries34.addChangeListener(seriesChangeListener35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        xYSeries9.clear();
        java.lang.Comparable comparable12 = xYSeries9.getKey();
        double[][] doubleArray13 = xYSeries9.toArray();
        xYSeries9.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str18 = xYSeries9.getDescription();
        double[][] doubleArray19 = xYSeries9.toArray();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries9.getY(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) 0, (double) (-1));
        java.util.List list18 = xYSeries3.getItems();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = xYSeries1.getDescription();
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 1 + "'", comparable18, (short) 1);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.clear();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        xYSeries3.setMaximumItemCount(10);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        boolean boolean16 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number15 = xYSeries1.getY(2);
        java.util.List list16 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries1.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        double[][] doubleArray16 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) 0, true);
        xYSeries1.updateByIndex(3, (java.lang.Number) 0.0f);
        java.lang.Object obj26 = xYSeries1.clone();
        java.util.List list27 = xYSeries1.getItems();
        java.util.List list28 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 1, true);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 1, (double) 'a');
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.add(52.0d, (-1.0d), true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        xYSeries13.add(xYDataItem28);
        xYSeries13.fireSeriesChanged();
        java.util.List list31 = xYSeries13.getItems();
        boolean boolean32 = xYSeries1.equals((java.lang.Object) xYSeries13);
        boolean boolean33 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries2.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries9.setDescription("");
        xYSeries9.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        xYSeries19.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44, false);
        xYSeries23.add(xYDataItem44, true);
        xYSeries19.add(xYDataItem44);
        xYSeries9.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false, true);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        xYSeries2.add(xYDataItem44);
        boolean boolean57 = xYSeries2.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries2.addPropertyChangeListener(propertyChangeListener58);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        java.lang.Comparable comparable23 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 100 + "'", comparable23, (byte) 100);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
        double[][] doubleArray14 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        java.util.List list19 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getY(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        xYSeries1.add((double) 10L, (double) 100.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Comparable comparable16 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (-1), false);
        xYSeries1.setMaximumItemCount((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) 10, (java.lang.Number) 4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        boolean boolean46 = xYSeries17.getNotify();
        boolean boolean47 = xYSeries17.getAutoSort();
        java.lang.String str48 = xYSeries17.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries17.remove(1);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        xYSeries51.add((double) 10, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        boolean boolean7 = xYSeries3.getNotify();
        java.util.List list8 = xYSeries3.getItems();
        int int10 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean11 = xYSeries3.getAutoSort();
        xYSeries3.add((double) '#', (double) 4);
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = xYSeries3.indexOf(number15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) '4', 32);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        xYSeries7.clear();
        xYSeries7.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries7.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int17 = xYSeries7.getMaximumItemCount();
        xYSeries7.delete((int) (short) 100, 0);
        xYSeries7.add((-1.0d), (java.lang.Number) 1L);
        boolean boolean24 = xYSeries5.equals((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries5.updateByIndex((-2), (java.lang.Number) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list15 = xYSeries1.getItems();
        int int16 = xYSeries1.getItemCount();
        xYSeries1.add(0.0d, (java.lang.Number) 10.0f, true);
        java.util.List list21 = xYSeries1.getItems();
        double[][] doubleArray22 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        xYSeries14.add((java.lang.Number) 10.0f, (java.lang.Number) (-1), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        xYSeries17.add((double) (-3), 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries17.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries17.addOrUpdate((java.lang.Number) 10.0f, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (short) 0, false);
        xYSeries1.setMaximumItemCount((int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries1.removeChangeListener(seriesChangeListener24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0.0f, true);
        int int15 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.getAutoSort();
        java.lang.Object obj19 = xYSeries17.clone();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries17.addOrUpdate((double) (short) 1, (double) 100L);
        int int23 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries17.remove((java.lang.Number) (short) 100);
        xYSeries1.add(xYDataItem25, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, false);
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        xYSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100.0d + "'", comparable13, 100.0d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener21);
        int int23 = xYSeries1.getItemCount();
        int int24 = xYSeries1.getMaximumItemCount();
        int int25 = xYSeries1.getItemCount();
        xYSeries1.add((-1.0d), (java.lang.Number) (-3));
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list15 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate(0.0d, (double) (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.add(52.0d, (-1.0d), true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        xYSeries13.add(xYDataItem28);
        xYSeries13.fireSeriesChanged();
        java.util.List list31 = xYSeries13.getItems();
        boolean boolean32 = xYSeries1.equals((java.lang.Object) xYSeries13);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries27.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        int int9 = xYSeries3.getItemCount();
        boolean boolean10 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = null; // flaky: xYSeries1.remove((java.lang.Number) (-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) 10, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getNotify();
        boolean boolean5 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        java.util.List list7 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (short) 1);
        xYSeries1.fireSeriesChanged();
        int int8 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setNotify(true);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        double[][] doubleArray15 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy((int) (short) 100, 1);
        java.lang.Number number20 = null;
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), number20);
        xYSeries1.add((double) 100, 1.0d, true);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.add((double) ' ', (double) (short) 1, false);
        xYSeries1.add((double) ' ', (double) ' ');
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries23.setDescription("");
        xYSeries23.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries43.add(xYDataItem58, false);
        xYSeries37.add(xYDataItem58, true);
        xYSeries33.add(xYDataItem58);
        xYSeries23.add(xYDataItem58);
        xYSeries14.add(xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        int int69 = xYSeries68.getItemCount();
        int int71 = xYSeries68.indexOf((java.lang.Number) (-1.0d));
        boolean boolean72 = xYSeries68.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries25.setDescription("");
        xYSeries25.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        xYSeries35.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries39.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60, false);
        xYSeries39.add(xYDataItem60, true);
        xYSeries35.add(xYDataItem60);
        xYSeries25.add(xYDataItem60);
        boolean boolean67 = xYSeries13.equals((java.lang.Object) xYDataItem60);
        xYSeries1.add(xYDataItem60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number70 = xYSeries1.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        xYSeries18.add(xYDataItem33);
        xYSeries3.add(xYDataItem33, false);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (-2));
        double[][] doubleArray40 = xYSeries3.toArray();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNull(xYDataItem39);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        boolean boolean20 = xYSeries1.getAutoSort();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((-1), (-3));
        int int16 = xYSeries15.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries15.addOrUpdate((java.lang.Number) 5, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries15.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries32.add(xYDataItem47, false);
        xYSeries15.add(xYDataItem47, true);
        xYSeries1.add(xYDataItem47, false);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries56.delete((int) (short) 1, (-3));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) 2147483647, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = null; // flaky: xYSeries1.remove((java.lang.Number) 10.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries13.setDescription("");
        xYSeries13.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries13.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries31.add(xYDataItem46, false);
        xYSeries25.add(xYDataItem46, true);
        java.util.List list51 = xYSeries25.getItems();
        boolean boolean52 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries25.remove(0);
        xYSeries13.add(xYDataItem54, false);
        xYSeries1.add(xYDataItem54, false);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        int int21 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        int int23 = xYSeries1.indexOf((java.lang.Number) 0.0d);
        boolean boolean24 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries24.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries24.removeChangeListener(seriesChangeListener27);
        java.lang.Object obj29 = xYSeries24.clone();
        boolean boolean30 = xYSeries1.equals((java.lang.Object) xYSeries24);
        int int31 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Comparable comparable36 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (byte) 100 + "'", comparable36, (byte) 100);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (byte) 100, 0);
        xYSeries6.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getAutoSort();
        xYSeries1.fireSeriesChanged();
        java.lang.String str11 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        boolean boolean7 = xYSeries3.getNotify();
        xYSeries3.clear();
        boolean boolean9 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        xYSeries3.setMaximumItemCount(100);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22);
        xYSeries1.add(xYDataItem22, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem22);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem22, true, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries29.addChangeListener(seriesChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener32);
        int int34 = xYSeries29.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries29.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        xYSeries3.add(10.0d, (double) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries3.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 1, true);
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        int int20 = xYSeries1.indexOf((java.lang.Number) 10L);
        xYSeries1.add((double) 10.0f, (double) 35, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3) + "'", int20 == (-3));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        java.lang.Comparable comparable15 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 100 + "'", comparable15, (byte) 100);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        java.lang.Object obj28 = xYSeries26.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries26.addChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries34.add(xYDataItem49);
        xYSeries26.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str54 = xYSeries53.getDescription();
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries53.createCopy((int) (byte) 1, 10);
        int int58 = xYSeries53.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean61 = xYSeries60.isEmpty();
        xYSeries60.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries60.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener69);
        boolean boolean71 = xYSeries60.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries60.remove((int) (short) 0);
        xYSeries53.add(xYDataItem73);
        xYSeries26.add(xYDataItem73, false);
        xYSeries3.add(xYDataItem73);
        java.lang.Number number79 = xYSeries3.getY(1);
        int int81 = xYSeries3.indexOf((java.lang.Number) 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertEquals("'" + number79 + "' != '" + 10.0d + "'", number79, 10.0d);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-2) + "'", int81 == (-2));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        java.lang.Number number16 = xYSeries1.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries18.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries18.add(xYDataItem37);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false, false);
        boolean boolean43 = xYSeries42.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries42.addOrUpdate((double) 0.0f, (double) (-1.0f));
        java.lang.Class<?> wildcardClass47 = xYSeries42.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) -1 + "'", number16, (byte) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(xYDataItem46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        java.util.List list58 = xYSeries57.getItems();
        xYSeries57.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        java.lang.Object obj31 = xYSeries29.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries29.addChangeListener(seriesChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52);
        xYSeries29.add(xYDataItem52);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, true);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        int int60 = xYSeries58.indexOf((java.lang.Number) (-1.0f));
        xYSeries58.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list14 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getX(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (short) 0, false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        xYSeries23.clear();
        xYSeries23.add(0.0d, (double) (short) 10, false);
        java.util.List list30 = xYSeries23.getItems();
        int int31 = xYSeries23.getItemCount();
        int int33 = xYSeries23.indexOf((java.lang.Number) (byte) 100);
        boolean boolean34 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries23.add((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 0, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        xYSeries1.add((double) 32, (double) (-1), true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        boolean boolean47 = xYSeries1.getAutoSort();
        boolean boolean48 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 10);
        java.lang.Class<?> wildcardClass52 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 100, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(xYSeries11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries31.setDescription("");
        xYSeries31.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        xYSeries41.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries45.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries51.add(xYDataItem66, false);
        xYSeries45.add(xYDataItem66, true);
        xYSeries41.add(xYDataItem66);
        xYSeries31.add(xYDataItem66);
        xYSeries22.add(xYDataItem66);
        xYSeries14.add(xYDataItem66, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries28.createCopy((int) (byte) 1, 10);
        int int33 = xYSeries28.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean46 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries35.remove((int) (short) 0);
        xYSeries28.add(xYDataItem48);
        xYSeries1.add(xYDataItem48, false);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries54.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d);
        xYSeries54.add((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries54.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNull(xYDataItem57);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (byte) 100);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries3.getY(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 10.0f, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = xYSeries1.equals(obj13);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (short) -1, 0);
        int int18 = xYSeries1.getItemCount();
        int int20 = xYSeries1.indexOf((java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        int int21 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((double) 5, 0.0d, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        boolean boolean19 = xYSeries5.isEmpty();
        int int20 = xYSeries5.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        int int34 = xYSeries22.getItemCount();
        java.lang.String str35 = xYSeries22.getDescription();
        java.lang.Number number37 = xYSeries22.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries39.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries39.add(xYDataItem58);
        xYSeries22.setKey((java.lang.Comparable) xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, false, false);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true);
        xYSeries5.add(xYDataItem58, false);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener68);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (byte) -1 + "'", number37, (byte) -1);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) 0, (double) (-1));
        xYSeries3.add((double) 10.0f, 1.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries24 = xYSeries3.createCopy(0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        xYSeries22.add((java.lang.Number) 0L, (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        int int49 = xYSeries17.indexOf((java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        boolean boolean62 = xYSeries51.getAutoSort();
        int int63 = xYSeries51.getItemCount();
        java.lang.String str64 = xYSeries51.getDescription();
        java.lang.Number number66 = xYSeries51.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str69 = xYSeries68.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries68.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean75 = xYSeries74.isEmpty();
        xYSeries74.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries74.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener83);
        boolean boolean85 = xYSeries74.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries74.remove((int) (short) 0);
        xYSeries68.add(xYDataItem87);
        xYSeries51.setKey((java.lang.Comparable) xYDataItem87);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, true);
        xYSeries17.add(xYDataItem87, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-3) + "'", int49 == (-3));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + number66 + "' != '" + (byte) -1 + "'", number66, (byte) -1);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(xYDataItem72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 0L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        boolean boolean46 = xYSeries17.getNotify();
        boolean boolean47 = xYSeries17.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries17.createCopy((int) (byte) 0, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        int int54 = xYSeries52.getMaximumItemCount();
        boolean boolean55 = xYSeries52.getAutoSort();
        xYSeries52.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        xYSeries52.removeChangeListener(seriesChangeListener58);
        int int60 = xYSeries52.getMaximumItemCount();
        java.lang.String str61 = xYSeries52.getDescription();
        int int62 = xYSeries52.getItemCount();
        int int63 = xYSeries52.getMaximumItemCount();
        xYSeries52.add((double) '4', (java.lang.Number) (short) 100);
        java.util.List list67 = xYSeries52.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries52.addChangeListener(seriesChangeListener68);
        boolean boolean70 = xYSeries17.equals((java.lang.Object) xYSeries52);
        org.jfree.data.xy.XYSeries xYSeries73 = xYSeries17.createCopy((int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries17.updateByIndex((int) (short) 10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(xYSeries73);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.getAutoSort();
        xYSeries7.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number23 = xYSeries13.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries13.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        java.lang.Object obj29 = xYSeries27.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries27.addChangeListener(seriesChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        xYSeries37.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries37.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener46);
        boolean boolean48 = xYSeries37.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries37.remove((int) (short) 0);
        xYSeries35.add(xYDataItem50);
        xYSeries27.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean56 = xYSeries55.isEmpty();
        java.lang.Object obj57 = xYSeries55.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        xYSeries55.addChangeListener(seriesChangeListener58);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean66 = xYSeries65.isEmpty();
        xYSeries65.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries65.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        xYSeries65.removePropertyChangeListener(propertyChangeListener74);
        boolean boolean76 = xYSeries65.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries65.remove((int) (short) 0);
        xYSeries63.add(xYDataItem78);
        xYSeries55.add(xYDataItem78);
        xYSeries53.setKey((java.lang.Comparable) xYDataItem78);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78, true);
        xYSeries13.add(xYDataItem78);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem78);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem78);
        boolean boolean87 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (short) 1 + "'", number23, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(xYDataItem78);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        int int7 = xYSeries1.getItemCount();
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 1L, true);
        xYSeries1.add(1.0d, (java.lang.Number) 10.0d, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries23.setDescription("");
        xYSeries23.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries43.add(xYDataItem58, false);
        xYSeries37.add(xYDataItem58, true);
        xYSeries33.add(xYDataItem58);
        xYSeries23.add(xYDataItem58);
        xYSeries14.add(xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        int int69 = xYSeries68.getItemCount();
        int int71 = xYSeries68.indexOf((java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries68.addOrUpdate((double) 100, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(xYDataItem74);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        double[][] doubleArray15 = xYSeries1.toArray();
        xYSeries1.setDescription("");
        java.lang.String str18 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy(2, (int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries21.createCopy(0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNotNull(xYSeries24);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        java.lang.Object obj18 = xYSeries1.clone();
        java.util.List list19 = xYSeries1.getItems();
        java.util.List list20 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = null; // flaky: xYSeries1.getY((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        int int27 = xYSeries21.getItemCount();
        int int29 = xYSeries21.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries21.removeChangeListener(seriesChangeListener30);
        int int33 = xYSeries21.indexOf((java.lang.Number) 100.0d);
        boolean boolean34 = xYSeries1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 35, number10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 35");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        xYSeries1.setNotify(true);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries15.removeChangeListener(seriesChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) propertyChangeListener19);
        xYSeries1.add((java.lang.Number) 35, (java.lang.Number) 100, true);
        int int26 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, false);
        java.lang.Object obj13 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) (byte) 100, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        int int11 = xYSeries1.getItemCount();
        int int12 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) '4', (java.lang.Number) (short) 100);
        xYSeries1.setMaximumItemCount(2147483647);
        int int19 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        java.lang.Number number20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number20, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Object obj8 = xYSeries1.clone();
        xYSeries1.add((double) 1, (double) 100L);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean16 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries27.setDescription("");
        xYSeries27.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str34 = xYSeries33.getDescription();
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries33.createCopy((int) (byte) 1, 10);
        xYSeries37.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries41.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries47.add(xYDataItem62, false);
        xYSeries41.add(xYDataItem62, true);
        xYSeries37.add(xYDataItem62);
        xYSeries27.add(xYDataItem62);
        xYSeries18.add(xYDataItem62);
        xYSeries15.add(xYDataItem62);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        xYSeries1.removeChangeListener(seriesChangeListener72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        int int61 = xYSeries49.getItemCount();
        java.lang.String str62 = xYSeries49.getDescription();
        java.lang.Number number64 = xYSeries49.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries66.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries66.add(xYDataItem85);
        xYSeries49.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries17.add(xYDataItem85, false);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem95 = xYSeries93.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + number64 + "' != '" + (byte) -1 + "'", number64, (byte) -1);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4');
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.add((double) 1.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries1.createCopy(2147483647, (int) '4');
        boolean boolean21 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.remove((java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries7.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries7.getItems();
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) 10, (double) 35);
        xYSeries3.add((double) (-1.0f), (double) 10, true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries10.setDescription("");
        xYSeries10.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        xYSeries20.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries30.add(xYDataItem45, false);
        xYSeries24.add(xYDataItem45, true);
        xYSeries20.add(xYDataItem45);
        xYSeries10.add(xYDataItem45);
        xYSeries1.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true, false);
        xYSeries55.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries55.removeChangeListener(seriesChangeListener57);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries55.createCopy((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass62 = xYSeries61.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        xYSeries1.setNotify(false);
        xYSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.clear();
        xYSeries18.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries18.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int28 = xYSeries18.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries42.setDescription("");
        xYSeries42.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str49 = xYSeries48.getDescription();
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries48.createCopy((int) (byte) 1, 10);
        xYSeries52.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str57 = xYSeries56.getDescription();
        org.jfree.data.xy.XYSeries xYSeries60 = xYSeries56.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean65 = xYSeries64.isEmpty();
        xYSeries64.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries64.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries64.remove((int) (short) 0);
        xYSeries62.add(xYDataItem77, false);
        xYSeries56.add(xYDataItem77, true);
        xYSeries52.add(xYDataItem77);
        xYSeries42.add(xYDataItem77);
        boolean boolean84 = xYSeries30.equals((java.lang.Object) xYDataItem77);
        xYSeries18.add(xYDataItem77);
        xYSeries1.add(xYDataItem77, true);
        boolean boolean88 = xYSeries1.getAutoSort();
        xYSeries1.delete(2, (int) (byte) -1);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(xYSeries60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (byte) 1, (int) (byte) 0);
        int int15 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        java.lang.Object obj18 = xYSeries1.clone();
        java.util.List list19 = xYSeries1.getItems();
        boolean boolean20 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int60 = xYSeries51.getMaximumItemCount();
        xYSeries51.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries51.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        int int68 = xYSeries51.indexOf((java.lang.Number) 100.0f);
        boolean boolean69 = xYSeries1.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy((int) (byte) 1, (-2));
        xYSeries12.setNotify(false);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries12.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries12.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries12.setKey((java.lang.Comparable) (byte) 0);
        xYSeries12.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.remove((int) (short) 0);
        xYSeries27.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, false);
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries12.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (-2));
        boolean boolean49 = xYSeries3.equals((java.lang.Object) xYDataItem48);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries12.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        xYSeries23.clear();
        java.lang.Comparable comparable26 = xYSeries23.getKey();
        double[][] doubleArray27 = xYSeries23.toArray();
        int int28 = xYSeries23.getMaximumItemCount();
        int int30 = xYSeries23.indexOf((java.lang.Number) (short) 10);
        boolean boolean31 = xYSeries12.equals((java.lang.Object) int30);
        boolean boolean32 = xYSeries1.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (byte) 100 + "'", comparable26, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 2147483647, true);
        xYSeries1.add((double) 32, (java.lang.Number) (-1));
        xYSeries1.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate(0.0d, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        java.lang.Number number25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries24.addOrUpdate(number25, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 10.0f, (double) (byte) 0);
        xYSeries1.add((double) 32, (double) 4, false);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 10, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.add(0.0d, 0.0d, false);
        boolean boolean20 = xYSeries3.getNotify();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries11.remove((int) (short) 0);
        xYSeries9.add(xYDataItem24);
        xYSeries1.add(xYDataItem24);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries28.createCopy((int) (byte) 1, 10);
        int int33 = xYSeries28.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean46 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries35.remove((int) (short) 0);
        xYSeries28.add(xYDataItem48);
        xYSeries1.add(xYDataItem48, false);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries54.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d);
        int int58 = xYSeries54.getMaximumItemCount();
        boolean boolean59 = xYSeries54.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.removeChangeListener(seriesChangeListener6);
        xYSeries1.setKey((java.lang.Comparable) false);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.clear();
        boolean boolean9 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        java.lang.Comparable comparable19 = xYSeries17.getKey();
        xYSeries17.add(0.0d, (double) '4');
        xYSeries17.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries28.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries28.add(xYDataItem47);
        xYSeries17.add(xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        boolean boolean52 = xYSeries1.getAutoSort();
        int int53 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries56 = null; // flaky: xYSeries1.createCopy((int) (byte) -1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        java.lang.String str48 = xYSeries47.getDescription();
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries66.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str73 = xYSeries72.getDescription();
        org.jfree.data.xy.XYSeries xYSeries76 = xYSeries72.createCopy((int) (byte) 1, 10);
        int int77 = xYSeries72.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean80 = xYSeries79.isEmpty();
        xYSeries79.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries79.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener88 = null;
        xYSeries79.removePropertyChangeListener(propertyChangeListener88);
        boolean boolean90 = xYSeries79.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries79.remove((int) (short) 0);
        xYSeries72.add(xYDataItem92);
        xYSeries66.add(xYDataItem92);
        xYSeries47.add(xYDataItem92);
        java.util.List list96 = xYSeries47.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(xYSeries76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(xYDataItem92);
        org.junit.Assert.assertNotNull(list96);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        int int51 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2) + "'", int51 == (-2));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) 100, (double) (short) 1);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass10 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries32.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str39 = xYSeries38.getDescription();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries38.createCopy((int) (byte) 1, 10);
        int int43 = xYSeries38.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries38.add(xYDataItem58);
        xYSeries32.add(xYDataItem58);
        boolean boolean61 = xYSeries32.getNotify();
        boolean boolean62 = xYSeries32.getAutoSort();
        java.lang.String str63 = xYSeries32.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries32.remove(1);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem65);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries1.getDataItem(0);
        int int70 = xYSeries1.indexOf((java.lang.Number) (-3));
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 10);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number17 = xYSeries7.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries7.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries29.add(xYDataItem44);
        xYSeries21.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        java.lang.Object obj51 = xYSeries49.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72);
        xYSeries49.add(xYDataItem72);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries7.add(xYDataItem72);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        xYSeries81.add((double) (-1L), (java.lang.Number) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem87 = null; // flaky: xYSeries81.remove((java.lang.Number) 4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        int int11 = xYSeries3.indexOf((java.lang.Number) (byte) 1);
        int int12 = xYSeries3.getItemCount();
        xYSeries3.add((double) (-3), 1.0d, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 1.0f, 0.0d);
        xYSeries1.add((double) (short) 10, (double) 100L, false);
        xYSeries1.updateByIndex((int) (short) 0, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        double[][] doubleArray16 = xYSeries1.toArray();
        int int17 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) -1);
        boolean boolean14 = xYSeries1.getNotify();
        boolean boolean15 = xYSeries1.isEmpty();
        int int17 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        java.lang.Comparable comparable16 = xYSeries13.getKey();
        double[][] doubleArray17 = xYSeries13.toArray();
        int int18 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries13);
        java.lang.String str23 = xYSeries13.getDescription();
        java.util.List list24 = xYSeries13.getItems();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries26.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str31 = xYSeries30.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries30.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries30.add(xYDataItem49);
        xYSeries26.setKey((java.lang.Comparable) xYDataItem49);
        xYSeries13.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, false, false);
        java.lang.Class<?> wildcardClass56 = xYSeries55.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str13 = xYSeries12.getDescription();
        xYSeries12.clear();
        java.lang.Comparable comparable15 = xYSeries12.getKey();
        double[][] doubleArray16 = xYSeries12.toArray();
        int int17 = xYSeries12.getMaximumItemCount();
        int int19 = xYSeries12.indexOf((java.lang.Number) (short) 10);
        boolean boolean20 = xYSeries1.equals((java.lang.Object) int19);
        boolean boolean21 = xYSeries1.isEmpty();
        xYSeries1.add((double) 100L, (java.lang.Number) 100.0f);
        boolean boolean25 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries1.addChangeListener(seriesChangeListener26);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 100 + "'", comparable15, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        java.lang.String str48 = xYSeries47.getDescription();
        xYSeries47.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        boolean boolean24 = xYSeries13.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries13.remove((int) (short) 0);
        xYSeries11.add(xYDataItem26, false);
        xYSeries1.add(xYDataItem26, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false, true);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries45.setDescription("");
        xYSeries45.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str52 = xYSeries51.getDescription();
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries51.createCopy((int) (byte) 1, 10);
        xYSeries55.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str60 = xYSeries59.getDescription();
        org.jfree.data.xy.XYSeries xYSeries63 = xYSeries59.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean68 = xYSeries67.isEmpty();
        xYSeries67.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries67.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener76);
        boolean boolean78 = xYSeries67.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries67.remove((int) (short) 0);
        xYSeries65.add(xYDataItem80, false);
        xYSeries59.add(xYDataItem80, true);
        xYSeries55.add(xYDataItem80);
        xYSeries45.add(xYDataItem80);
        xYSeries36.add(xYDataItem80);
        java.lang.String str88 = xYSeries36.getDescription();
        boolean boolean89 = xYSeries34.equals((java.lang.Object) xYSeries36);
        xYSeries34.add((java.lang.Number) 0L, (java.lang.Number) (byte) 100, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        int int15 = xYSeries10.getMaximumItemCount();
        double[][] doubleArray16 = xYSeries10.toArray();
        double[][] doubleArray17 = xYSeries10.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries10.removeChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries10.addChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        int int27 = xYSeries25.getMaximumItemCount();
        boolean boolean28 = xYSeries25.getAutoSort();
        xYSeries25.setDescription("hi!");
        xYSeries25.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries25.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries25.setMaximumItemCount((int) ' ');
        boolean boolean40 = xYSeries23.equals((java.lang.Object) ' ');
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        java.lang.Object obj44 = xYSeries42.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries42.addChangeListener(seriesChangeListener45);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries52.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener61);
        boolean boolean63 = xYSeries52.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries52.remove((int) (short) 0);
        xYSeries50.add(xYDataItem65);
        xYSeries42.add(xYDataItem65);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65);
        xYSeries23.add(xYDataItem65, true);
        xYSeries10.add(xYDataItem65, true);
        xYSeries2.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false, false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.add(10.0d, (java.lang.Number) 0L);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries22.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries22.removeChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries1.equals((java.lang.Object) xYSeries22);
        xYSeries1.delete((int) 'a', (int) (byte) 0);
        boolean boolean33 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries13.createCopy((int) (byte) 1, 10);
        xYSeries17.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries21.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.remove((int) (short) 0);
        xYSeries27.add(xYDataItem42, false);
        xYSeries21.add(xYDataItem42, true);
        xYSeries17.add(xYDataItem42);
        int int49 = xYSeries17.indexOf((java.lang.Number) 100.0f);
        xYSeries17.setNotify(false);
        boolean boolean52 = xYSeries1.equals((java.lang.Object) xYSeries17);
        xYSeries1.setMaximumItemCount(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setNotify(true);
        double[][] doubleArray21 = xYSeries1.toArray();
        int int23 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        java.util.List list18 = xYSeries1.getItems();
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        java.lang.Number number22 = null;
        xYSeries1.add((double) 2, number22);
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries1.createCopy(0, 100);
        java.lang.Class<?> wildcardClass27 = xYSeries26.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        java.lang.Number number11 = null;
        xYSeries1.add((java.lang.Number) 1L, number11, false);
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 2);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 1);
        xYSeries1.add((double) (-1L), (java.lang.Number) 1.0d, true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = xYSeries17.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries17.remove((int) (short) 0);
        xYSeries15.add(xYDataItem30, false);
        xYSeries9.add(xYDataItem30, true);
        xYSeries5.add(xYDataItem30);
        int int37 = xYSeries5.indexOf((java.lang.Number) 100.0f);
        java.lang.String str38 = xYSeries5.getDescription();
        boolean boolean39 = xYSeries5.isEmpty();
        xYSeries5.setMaximumItemCount(32);
        xYSeries5.add((double) ' ', (double) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.updateByIndex((int) (short) 10, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) (byte) 100);
        java.lang.Number number16 = xYSeries1.getX(0);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem12);
        xYSeries13.add((double) 10L, 0.0d);
        java.util.List list17 = xYSeries13.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries20 = xYSeries13.createCopy((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        int int15 = xYSeries3.getMaximumItemCount();
        int int16 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        xYSeries1.setNotify(false);
        xYSeries1.delete((int) (short) 10, (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries1.removeChangeListener(seriesChangeListener28);
        xYSeries1.setDescription("");
        java.lang.String str32 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str13 = xYSeries12.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries12.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries12.add(xYDataItem31);
        xYSeries1.add(xYDataItem31);
        xYSeries1.add((double) '4', (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = null;
        boolean boolean17 = xYSeries1.equals(obj16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        xYSeries18.add(xYDataItem33);
        xYSeries3.add(xYDataItem33, false);
        xYSeries3.add((double) 10L, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        xYSeries1.setKey((java.lang.Comparable) (short) 10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (byte) 1, 1);
        xYSeries21.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        java.lang.Object obj21 = xYSeries19.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries19.addChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.remove((int) (short) 0);
        xYSeries27.add(xYDataItem42);
        xYSeries19.add(xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str47 = xYSeries46.getDescription();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries46.createCopy((int) (byte) 1, 10);
        int int51 = xYSeries46.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries46.add(xYDataItem66);
        xYSeries19.add(xYDataItem66, false);
        xYSeries1.add(xYDataItem66, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number73 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate(0.0d, 0.0d);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        boolean boolean19 = xYSeries5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = null; // flaky: xYSeries5.remove((java.lang.Number) 10.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries21.add(xYDataItem36, false);
        xYSeries15.add(xYDataItem36, true);
        xYSeries11.add(xYDataItem36);
        xYSeries1.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, true);
        double[][] doubleArray46 = xYSeries45.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries45.removeChangeListener(seriesChangeListener47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries52.clear();
        xYSeries52.clear();
        xYSeries52.add(10.0d, (double) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries52.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10);
        boolean boolean61 = xYSeries45.equals((java.lang.Object) xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries45.createCopy((int) (short) 10, (-2));
        java.lang.String str65 = xYSeries45.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener66);
        xYSeries45.fireSeriesChanged();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.clear();
        xYSeries17.add(0.0d, (double) (short) 10, false);
        java.util.List list24 = xYSeries17.getItems();
        int int25 = xYSeries17.getItemCount();
        int int27 = xYSeries17.indexOf((java.lang.Number) (byte) 100);
        xYSeries17.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj32 = xYSeries17.clone();
        int int33 = xYSeries17.getMaximumItemCount();
        java.util.List list34 = xYSeries17.getItems();
        xYSeries17.setMaximumItemCount((int) (byte) 0);
        boolean boolean37 = xYSeries1.equals((java.lang.Object) xYSeries17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries1.addChangeListener(seriesChangeListener38);
        java.lang.Class<?> wildcardClass40 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        double[][] doubleArray16 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) 0, true);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) (short) -1);
        boolean boolean26 = xYSeries1.getNotify();
        xYSeries1.add((double) ' ', (double) 100.0f);
        xYSeries1.add((double) (-1L), (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        double[][] doubleArray19 = xYSeries1.toArray();
        boolean boolean20 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        boolean boolean11 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) 1.0f, (double) 0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (short) 10);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        xYSeries1.delete((int) 'a', 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries23.setDescription("");
        xYSeries23.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries43.add(xYDataItem58, false);
        xYSeries37.add(xYDataItem58, true);
        xYSeries33.add(xYDataItem58);
        xYSeries23.add(xYDataItem58);
        xYSeries14.add(xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        int int69 = xYSeries68.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number71 = null; // flaky: xYSeries68.getY((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries15.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries32.add(xYDataItem47, false);
        xYSeries15.add(xYDataItem47, true);
        xYSeries1.add(xYDataItem47, false);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries1.remove(0);
        java.lang.Class<?> wildcardClass56 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (-1));
        xYSeries1.setDescription("");
        int int17 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray18 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass19 = doubleArray18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries1.createCopy((int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = null; // flaky: xYSeries24.remove((java.lang.Number) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(xYSeries24);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        xYSeries1.add((double) 3, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = null; // flaky: xYSeries1.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        java.lang.String str7 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = xYSeries1.equals(obj13);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22, false);
        xYSeries1.add(xYDataItem22, true);
        java.util.List list27 = xYSeries1.getItems();
        int int29 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 100L, false);
        int int34 = xYSeries1.getMaximumItemCount();
        boolean boolean35 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add(0.0d, (double) (short) 1, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-2), (double) (-1L));
        int int9 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        double[][] doubleArray15 = xYSeries1.toArray();
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean5 = xYSeries4.isEmpty();
        xYSeries4.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries4.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries4.removePropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = xYSeries4.getAutoSort();
        int int16 = xYSeries4.getItemCount();
        java.lang.String str17 = xYSeries4.getDescription();
        java.lang.Number number19 = xYSeries4.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries21.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries21.add(xYDataItem40);
        xYSeries4.setKey((java.lang.Comparable) xYDataItem40);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, false, false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, true);
        xYSeries1.add(xYDataItem40, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (byte) -1 + "'", number19, (byte) -1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries17.createCopy(100, (-1));
        xYSeries17.delete((int) (short) 10, 0);
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries17.createCopy((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertNotNull(xYSeries30);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries21.add(xYDataItem36, false);
        xYSeries15.add(xYDataItem36, true);
        xYSeries11.add(xYDataItem36);
        xYSeries1.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, true);
        double[][] doubleArray46 = xYSeries45.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries45.removeChangeListener(seriesChangeListener47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries52.clear();
        xYSeries52.clear();
        xYSeries52.add(10.0d, (double) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries52.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10);
        boolean boolean61 = xYSeries45.equals((java.lang.Object) xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries45.createCopy((int) (short) 10, (-2));
        java.lang.String str65 = xYSeries45.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener66);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries45.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.delete(10, (int) (byte) -1);
        boolean boolean16 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        int int20 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        boolean boolean13 = xYSeries1.getNotify();
        java.lang.Class<?> wildcardClass14 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 1);
        java.lang.String str15 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        xYSeries1.add((double) (-1), (double) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass15 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 'a', (double) (byte) 10);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: xYSeries1.getX((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = xYSeries3.getDescription();
        xYSeries3.add(0.0d, (java.lang.Number) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100, true);
        xYSeries2.add((double) (short) 1, (double) 'a');
        java.lang.String str6 = xYSeries2.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries2.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.clear();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) -1, false);
        xYSeries1.updateByIndex(0, (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (-1));
        xYSeries14.add((double) (byte) 100, (double) (short) 10, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries14.removeChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries14.addOrUpdate((double) ' ', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        xYSeries1.delete((int) 'a', 35);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 32);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        int int23 = xYSeries18.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries18.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        xYSeries1.add(xYDataItem38);
        xYSeries1.delete(32, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean47 = xYSeries46.isEmpty();
        int int48 = xYSeries46.getMaximumItemCount();
        boolean boolean49 = xYSeries46.getAutoSort();
        xYSeries46.setDescription("hi!");
        xYSeries46.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj56 = xYSeries46.clone();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean59 = xYSeries58.isEmpty();
        xYSeries58.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries58.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int67 = xYSeries58.getMaximumItemCount();
        xYSeries58.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean71 = xYSeries46.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries46.getDataItem((int) (short) 0);
        xYSeries1.add(xYDataItem73, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number77 = xYSeries1.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) 10.0f);
        xYSeries1.add((java.lang.Number) (short) 100, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries15.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries32.add(xYDataItem47, false);
        xYSeries15.add(xYDataItem47, true);
        xYSeries1.add(xYDataItem47, false);
        int int54 = xYSeries1.getMaximumItemCount();
        int int55 = xYSeries1.getMaximumItemCount();
        boolean boolean56 = xYSeries1.getAutoSort();
        boolean boolean57 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str9 = xYSeries8.getDescription();
        xYSeries8.clear();
        xYSeries8.add(0.0d, (double) (short) 10, false);
        java.util.List list15 = xYSeries8.getItems();
        xYSeries8.setKey((java.lang.Comparable) '4');
        xYSeries8.setNotify(true);
        boolean boolean20 = xYSeries8.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries8.getAllowDuplicateXValues();
        boolean boolean24 = xYSeries1.equals((java.lang.Object) boolean23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((double) 2147483647, (java.lang.Number) 10, false);
        java.lang.Comparable comparable11 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 100 + "'", comparable11, (byte) 100);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        boolean boolean11 = xYSeries3.getNotify();
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0d, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        xYSeries1.setNotify(true);
        boolean boolean13 = xYSeries1.getNotify();
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        xYSeries15.clear();
        xYSeries15.add(0.0d, (double) (short) 10, false);
        java.util.List list22 = xYSeries15.getItems();
        int int23 = xYSeries15.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries15.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) seriesChangeListener24);
        xYSeries1.add((double) '#', 1.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = xYSeries1.getY(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAutoSort();
        xYSeries3.add((double) '4', (java.lang.Number) 10L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.addChangeListener(seriesChangeListener5);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 1, 10);
        xYSeries7.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.equals((java.lang.Object) xYSeries7);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "hi!" + "'", comparable13, "hi!");
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries12.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries28.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries34.createCopy((int) (byte) 1, 10);
        int int39 = xYSeries34.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean42 = xYSeries41.isEmpty();
        xYSeries41.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries41.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries41.remove((int) (short) 0);
        xYSeries34.add(xYDataItem54);
        xYSeries28.add(xYDataItem54);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener57);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries28.getDataItem((int) (byte) 0);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (byte) 1, (int) (byte) 0);
        xYSeries1.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(0.0d, 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        boolean boolean16 = xYSeries1.getAutoSort();
        int int17 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove((int) (short) 0);
        xYSeries1.add(xYDataItem16, false);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (byte) 10, 0);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries21.addOrUpdate((double) 10.0f, (double) (short) 10);
        boolean boolean25 = xYSeries21.getAutoSort();
        xYSeries21.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries21.addChangeListener(seriesChangeListener28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.setMaximumItemCount((int) (byte) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.lang.Object obj7 = xYSeries1.clone();
        java.lang.String str8 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        xYSeries23.setMaximumItemCount(32);
        double[][] doubleArray26 = xYSeries23.toArray();
        xYSeries23.add((double) 2, (double) (-2), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries1.add(xYDataItem21);
        xYSeries1.setNotify(false);
        xYSeries1.delete((int) (short) 10, (-1));
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1.0d), true);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries1.removeChangeListener(seriesChangeListener33);
        double[][] doubleArray35 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        xYSeries37.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries37.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener46);
        boolean boolean48 = xYSeries37.getAutoSort();
        int int49 = xYSeries37.getItemCount();
        java.lang.String str50 = xYSeries37.getDescription();
        java.lang.Number number52 = xYSeries37.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str55 = xYSeries54.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries54.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean61 = xYSeries60.isEmpty();
        xYSeries60.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries60.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener69);
        boolean boolean71 = xYSeries60.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries60.remove((int) (short) 0);
        xYSeries54.add(xYDataItem73);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true);
        xYSeries1.add(xYDataItem73);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + (byte) -1 + "'", number52, (byte) -1);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.removeChangeListener(seriesChangeListener6);
        xYSeries1.setKey((java.lang.Comparable) false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        xYSeries11.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries42.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str49 = xYSeries48.getDescription();
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries48.createCopy((int) (byte) 1, 10);
        int int53 = xYSeries48.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean56 = xYSeries55.isEmpty();
        xYSeries55.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries55.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener64);
        boolean boolean66 = xYSeries55.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries55.remove((int) (short) 0);
        xYSeries48.add(xYDataItem68);
        xYSeries42.add(xYDataItem68);
        boolean boolean71 = xYSeries42.getNotify();
        boolean boolean72 = xYSeries42.getAutoSort();
        java.lang.String str73 = xYSeries42.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries42.remove(1);
        xYSeries11.setKey((java.lang.Comparable) xYDataItem75);
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries11.getDataItem(0);
        xYSeries1.add(xYDataItem78, true);
        java.lang.Class<?> wildcardClass81 = xYDataItem78.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNotNull(xYDataItem78);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-1.0f), (double) 2147483647, false);
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        int int21 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        int int23 = xYSeries1.indexOf((java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        boolean boolean9 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        java.lang.Number number13 = null;
        xYSeries1.add((java.lang.Number) 2147483647, number13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number23 = xYSeries13.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries13.removeChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries27.setDescription("");
        xYSeries27.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str34 = xYSeries33.getDescription();
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries33.createCopy((int) (byte) 1, 10);
        xYSeries37.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries41.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries47.add(xYDataItem62, false);
        xYSeries41.add(xYDataItem62, true);
        xYSeries37.add(xYDataItem62);
        xYSeries27.add(xYDataItem62);
        xYSeries13.add(xYDataItem62, false);
        boolean boolean71 = xYSeries1.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (short) 1 + "'", number23, (short) 1);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 4, 100.0d, true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        double[][] doubleArray20 = xYSeries1.toArray();
        boolean boolean21 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false);
        boolean boolean3 = xYSeries2.getNotify();
        java.lang.Class<?> wildcardClass4 = xYSeries2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        boolean boolean7 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        xYSeries13.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries13.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean21 = xYSeries13.isEmpty();
        xYSeries13.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries13.remove((int) (short) 1);
        xYSeries13.add((double) ' ', (java.lang.Number) 0, true);
        boolean boolean31 = xYSeries1.equals((java.lang.Object) xYSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries1.remove(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        int int9 = xYSeries5.indexOf((java.lang.Number) 100L);
        double[][] doubleArray10 = xYSeries5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.delete((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        java.lang.Class<?> wildcardClass14 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        java.lang.Number number16 = xYSeries1.getY((int) (short) 0);
        xYSeries1.updateByIndex((int) (short) 1, (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) -1 + "'", number16, (byte) -1);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        int int21 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        double[][] doubleArray22 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.add(10.0d, (java.lang.Number) 0L);
        boolean boolean18 = xYSeries1.isEmpty();
        java.lang.String str19 = xYSeries1.getDescription();
        boolean boolean20 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.setMaximumItemCount((int) '#');
        int int12 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj13 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        int int28 = xYSeries23.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries23.add(xYDataItem43);
        xYSeries17.add(xYDataItem43);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries17.getDataItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries17.setMaximumItemCount((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ');
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        xYSeries7.add(xYDataItem22);
        xYSeries1.add(xYDataItem22, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        java.util.List list29 = xYSeries28.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries4.setDescription("");
        xYSeries4.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        xYSeries14.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39, false);
        xYSeries18.add(xYDataItem39, true);
        xYSeries14.add(xYDataItem39);
        xYSeries4.add(xYDataItem39);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        boolean boolean47 = xYSeries1.getAutoSort();
        boolean boolean48 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) 1L, true);
        xYSeries1.add((double) ' ', (java.lang.Number) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getNotify();
        java.lang.Object obj14 = xYSeries1.clone();
        int int15 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        xYSeries1.fireSeriesChanged();
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 100 + "'", comparable13, (byte) 100);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        double[][] doubleArray6 = xYSeries1.toArray();
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}
