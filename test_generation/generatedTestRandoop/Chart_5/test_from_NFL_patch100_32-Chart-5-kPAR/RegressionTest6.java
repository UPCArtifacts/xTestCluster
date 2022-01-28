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
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add(1.0d, 0.0d);
        java.lang.Object obj7 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.addChangeListener(seriesChangeListener8);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        int int9 = xYSeries3.indexOf((java.lang.Number) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries3.getAutoSort();
        java.util.List list13 = xYSeries3.getItems();
        xYSeries3.clear();
        xYSeries3.add((double) 32, (double) (-4), false);
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        boolean boolean6 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str13 = xYSeries12.getDescription();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries12.createCopy((int) (byte) 1, 10);
        int int17 = xYSeries12.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener28);
        boolean boolean30 = xYSeries19.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries19.remove((int) (short) 0);
        xYSeries12.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32);
        xYSeries1.add(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete(1, (-2));
        boolean boolean9 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getY((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 0.0f, (double) 100L);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean22 = xYSeries21.getAllowDuplicateXValues();
        int int23 = xYSeries21.getItemCount();
        java.lang.String str24 = xYSeries21.getDescription();
        boolean boolean25 = xYSeries21.getAllowDuplicateXValues();
        java.lang.Number number27 = null;
        xYSeries21.add((java.lang.Number) (byte) -1, number27);
        int int30 = xYSeries21.indexOf((java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy(10, (int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        double[][] doubleArray11 = xYSeries8.toArray();
        boolean boolean12 = xYSeries8.getAutoSort();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYSeries8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        boolean boolean12 = xYSeries10.isEmpty();
        xYSeries10.fireSeriesChanged();
        xYSeries10.add((double) (byte) 1, (double) (byte) 1, true);
        boolean boolean18 = xYSeries10.isEmpty();
        boolean boolean19 = xYSeries10.getAutoSort();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.clear();
        xYSeries10.clear();
        xYSeries10.add(0.0d, (java.lang.Number) (short) 100, true);
        int int28 = xYSeries10.indexOf((java.lang.Number) 4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries8.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries8.remove((int) (short) 0);
        xYSeries3.add(xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(0, (-1));
        boolean boolean12 = xYSeries11.getNotify();
        java.util.List list13 = xYSeries11.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = null; // flaky: xYSeries11.remove((java.lang.Number) (-1.0d));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries9.clear();
        xYSeries9.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        int int15 = xYSeries9.getMaximumItemCount();
        boolean boolean16 = xYSeries1.equals((java.lang.Object) xYSeries9);
        xYSeries1.add((double) ' ', (double) (-2));
        xYSeries1.add(0.0d, (java.lang.Number) (short) 0);
        java.util.List list23 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((double) 1.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, true);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 100, false);
        java.lang.Comparable comparable7 = xYSeries2.getKey();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100L + "'", comparable7, 100L);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries1.add(xYDataItem38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries1.addChangeListener(seriesChangeListener40);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        int int45 = xYSeries43.getMaximumItemCount();
        boolean boolean46 = xYSeries43.getAutoSort();
        xYSeries43.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries43.removeChangeListener(seriesChangeListener49);
        xYSeries43.clear();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str54 = xYSeries53.getDescription();
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries53.createCopy((int) (byte) 1, 10);
        xYSeries57.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries57.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries57.getDataItem(0);
        xYSeries43.add(xYDataItem69);
        xYSeries1.add(xYDataItem69);
        java.lang.Comparable comparable72 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0d));
        boolean boolean76 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertNotNull(xYDataItem69);
        org.junit.Assert.assertEquals("'" + comparable72 + "' != '" + (byte) 100 + "'", comparable72, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }
}
