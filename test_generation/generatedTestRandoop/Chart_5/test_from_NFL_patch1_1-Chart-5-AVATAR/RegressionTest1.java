import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = null; // flaky: xYSeries1.getY((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        boolean boolean13 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = null; // flaky: xYSeries1.remove((java.lang.Number) 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        xYSeries13.add(10.0d, (java.lang.Number) 100.0d);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.Object obj55 = xYSeries1.clone();
        java.lang.Object obj56 = null;
        boolean boolean57 = xYSeries1.equals(obj56);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        xYSeries1.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.update((java.lang.Number) 100L, (java.lang.Number) 1);
        xYSeries3.add((java.lang.Number) 32, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: xYSeries1.getX((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        int int11 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) (-1.0d), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        double[][] doubleArray7 = xYSeries6.toArray();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        int int21 = xYSeries9.getItemCount();
        java.lang.String str22 = xYSeries9.getDescription();
        java.lang.Number number24 = xYSeries9.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str27 = xYSeries26.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries26.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries26.add(xYDataItem45);
        xYSeries9.setKey((java.lang.Comparable) xYDataItem45);
        xYSeries6.add(xYDataItem45, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = xYSeries51.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (byte) -1 + "'", number24, (byte) -1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.String str33 = xYSeries31.getDescription();
        xYSeries31.add((java.lang.Number) (-1.0f), (java.lang.Number) 100L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries31.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.lang.Object obj4 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: xYSeries1.getY((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = xYSeries1.clone();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        xYSeries1.add((double) (short) 10, (java.lang.Number) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = null; // flaky: xYSeries1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAutoSort();
        double[][] doubleArray14 = xYSeries3.toArray();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int22 = xYSeries13.getMaximumItemCount();
        xYSeries13.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries13.setDescription("hi!");
        xYSeries13.update((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        double[][] doubleArray31 = xYSeries13.toArray();
        boolean boolean32 = xYSeries1.equals((java.lang.Object) doubleArray31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 100.0f, false);
        xYSeries1.setMaximumItemCount(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = null; // flaky: xYSeries1.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        xYSeries1.add((double) (short) 0, (double) (-1));
        java.lang.Number number53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries1.addOrUpdate((java.lang.Number) 1L, number53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem31);
        xYSeries34.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 100 + "'", comparable15, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.Class<?> wildcardClass18 = xYSeries17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        xYSeries1.setNotify(true);
        xYSeries1.delete((int) (byte) 10, 4);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str21 = xYSeries20.getDescription();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries20.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = xYSeries28.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries28.remove((int) (short) 0);
        xYSeries26.add(xYDataItem41, false);
        xYSeries20.add(xYDataItem41, true);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, true);
        xYSeries18.add(xYDataItem41, false);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, false, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries52.updateByIndex(100, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        int int9 = xYSeries5.indexOf((java.lang.Number) (short) -1);
        xYSeries5.add(100.0d, (java.lang.Number) 0.0d, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        xYSeries1.delete((int) (byte) 1, (int) (byte) -1);
        xYSeries1.add(0.0d, (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((java.lang.Number) 3, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        xYSeries5.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str21 = xYSeries20.getDescription();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries20.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = xYSeries28.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries28.remove((int) (short) 0);
        xYSeries26.add(xYDataItem41, false);
        xYSeries20.add(xYDataItem41, true);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, true);
        xYSeries18.add(xYDataItem41, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.delete((int) (byte) 100, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((double) (-3), (java.lang.Number) 100.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        java.lang.Object obj27 = xYSeries1.clone();
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = xYSeries1.indexOf(number28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj7 = xYSeries1.clone();
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 32, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        int int15 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-2), (double) 100);
        xYSeries1.setDescription("");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) (byte) 100, (double) 35);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        int int15 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        boolean boolean17 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries5.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries5.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
// flaky:             xYSeries1.delete((int) (short) -1, 2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        xYSeries42.add((java.lang.Number) (short) 0, (java.lang.Number) 35, false);
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
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        java.lang.Comparable comparable9 = xYSeries7.getKey();
        xYSeries7.add(0.0d, (double) '4');
        xYSeries7.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries7.fireSeriesChanged();
        xYSeries7.clear();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries7.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list21 = xYSeries7.getItems();
        java.lang.Object obj22 = xYSeries7.clone();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) xYSeries7);
        xYSeries1.add((double) 2147483647, (double) 4, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number33 = xYSeries23.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries23.addChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        java.lang.Object obj39 = xYSeries37.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries37.addChangeListener(seriesChangeListener40);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60);
        xYSeries37.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean66 = xYSeries65.isEmpty();
        java.lang.Object obj67 = xYSeries65.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries65.addChangeListener(seriesChangeListener68);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean76 = xYSeries75.isEmpty();
        xYSeries75.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries75.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener84 = null;
        xYSeries75.removePropertyChangeListener(propertyChangeListener84);
        boolean boolean86 = xYSeries75.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries75.remove((int) (short) 0);
        xYSeries73.add(xYDataItem88);
        xYSeries65.add(xYDataItem88);
        xYSeries63.setKey((java.lang.Comparable) xYDataItem88);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem88, true);
        xYSeries23.add(xYDataItem88);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem88, false);
        xYSeries21.add(xYDataItem88, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + (short) 1 + "'", number33, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(xYDataItem88);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (short) 10);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 100.0d, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) (-1.0f), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries11.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean19 = xYSeries1.equals((java.lang.Object) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        xYSeries21.clear();
        xYSeries21.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries21.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int31 = xYSeries21.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
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
        boolean boolean87 = xYSeries33.equals((java.lang.Object) xYDataItem80);
        xYSeries21.add(xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, false, false);
        xYSeries1.add(xYDataItem80, false);
        xYSeries1.delete(10, 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        int int9 = xYSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.update((java.lang.Number) 100L, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getAutoSort();
        boolean boolean9 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Class<?> wildcardClass10 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.removeChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        xYSeries5.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.delete((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
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
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries17.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 10L);
        java.lang.Object obj53 = xYSeries17.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = xYSeries17.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-3) + "'", int49 == (-3));
        org.junit.Assert.assertNull(xYDataItem52);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        xYSeries17.add(0.0d, (double) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries53 = xYSeries17.createCopy((int) (byte) 10, (-3));
        int int54 = xYSeries53.getMaximumItemCount();
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
        org.junit.Assert.assertNotNull(xYSeries53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = xYSeries3.getDescription();
        double[][] doubleArray12 = xYSeries3.toArray();
        java.lang.Class<?> wildcardClass13 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.add((double) 100.0f, 10.0d);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) 10L, false);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = null; // flaky: xYSeries1.remove((java.lang.Number) (-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getAutoSort();
        boolean boolean9 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.Object obj6 = xYSeries1.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.Object obj62 = xYSeries61.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        xYSeries5.clear();
        double[][] doubleArray9 = xYSeries5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries5.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
            org.jfree.data.xy.XYDataItem xYDataItem21 = null; // flaky: xYSeries5.remove((java.lang.Number) 2147483647);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries31.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        xYSeries1.update((java.lang.Number) 100.0d, (java.lang.Number) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        boolean boolean11 = xYSeries3.getNotify();
        java.lang.Class<?> wildcardClass12 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = xYSeries7.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries7.remove((int) (short) 0);
        xYSeries1.add(xYDataItem20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        boolean boolean24 = xYSeries23.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries23.update((java.lang.Number) 2, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 2147483647, (java.lang.Number) (byte) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        xYSeries5.setDescription("");
        java.lang.Number number40 = null;
        java.lang.Number number41 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.add(number40, number41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        xYSeries9.clear();
        xYSeries9.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        double[][] doubleArray22 = xYSeries9.toArray();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) doubleArray22);
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = null; // flaky: xYSeries1.remove((java.lang.Number) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false, false);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false);
        boolean boolean72 = xYSeries71.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = null; // flaky: xYSeries5.remove((java.lang.Number) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        java.util.List list4 = xYSeries1.getItems();
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (byte) 100 + "'", comparable5, (byte) 100);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Class<?> wildcardClass27 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        xYSeries1.add((double) 4, (java.lang.Number) (-1));
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(3, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.Class<?> wildcardClass50 = xYSeries17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        xYSeries1.delete((int) (short) 100, 0);
        xYSeries1.add((-1.0d), (java.lang.Number) 1L);
        xYSeries1.add((double) 100L, (double) (-1.0f), false);
        xYSeries1.updateByIndex(0, (java.lang.Number) 2147483647);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        int int21 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.addOrUpdate((java.lang.Number) 1.0d, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        boolean boolean8 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        int int38 = xYSeries5.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries5.addChangeListener(seriesChangeListener39);
        java.util.List list41 = xYSeries5.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        int int9 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = null; // flaky: xYSeries1.getX((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries3.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (byte) 100);
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries3.setMaximumItemCount((int) (short) 10);
        xYSeries3.setKey((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        xYSeries20.delete((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYSeries20);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = null; // flaky: xYSeries1.remove((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries13.setDescription("");
        xYSeries13.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        xYSeries23.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str28 = xYSeries27.getDescription();
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries27.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener44);
        boolean boolean46 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries35.remove((int) (short) 0);
        xYSeries33.add(xYDataItem48, false);
        xYSeries27.add(xYDataItem48, true);
        xYSeries23.add(xYDataItem48);
        xYSeries13.add(xYDataItem48);
        boolean boolean55 = xYSeries1.equals((java.lang.Object) xYDataItem48);
        int int57 = xYSeries1.indexOf((java.lang.Number) 0L);
        boolean boolean58 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 1.0f, (double) 3, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.setDescription("hi!");
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
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 0 + "'", comparable51, (short) 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((double) (-1L), (double) (short) 10);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        boolean boolean23 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) 3, true);
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, false);
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Comparable comparable21 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (byte) 100 + "'", comparable21, (byte) 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries3.getNotify();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries20 = xYSeries1.createCopy((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        boolean boolean9 = xYSeries7.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d, true);
        xYSeries1.add(0.0d, (java.lang.Number) 10.0d, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean13 = xYSeries5.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries5.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number15 = xYSeries1.getY(2);
        java.util.List list16 = xYSeries1.getItems();
        int int17 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list54 = xYSeries48.getItems();
        java.lang.Class<?> wildcardClass55 = xYSeries48.getClass();
        boolean boolean56 = xYSeries1.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        int int38 = xYSeries5.getMaximumItemCount();
        boolean boolean39 = xYSeries5.getAutoSort();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        boolean boolean24 = xYSeries23.isEmpty();
        java.lang.Class<?> wildcardClass25 = xYSeries23.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        boolean boolean19 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        int int8 = xYSeries1.getMaximumItemCount();
        int int9 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 100.0f, false);
        xYSeries1.setMaximumItemCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        xYSeries17.add(0.0d, (double) (byte) 0, false);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries17.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        boolean boolean8 = xYSeries3.getNotify();
        boolean boolean9 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Class<?> wildcardClass10 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        xYSeries9.clear();
        xYSeries9.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        double[][] doubleArray22 = xYSeries9.toArray();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) doubleArray22);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 100, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        int int6 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 2147483647, (java.lang.Number) (byte) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        java.lang.Object obj7 = xYSeries1.clone();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        java.lang.Number number13 = xYSeries1.getY((int) (byte) 1);
        boolean boolean14 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-2) + "'", number13, (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((double) 35, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10.0d, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
// flaky:             xYSeries1.delete((-2), (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.Number number15 = xYSeries1.getX((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries3.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        xYSeries85.add(0.0d, (java.lang.Number) 0.0f, true);
        xYSeries85.setKey((java.lang.Comparable) (-1.0d));
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        int int15 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) 10L, false);
        double[][] doubleArray7 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries1.createCopy(35, 2147483647);
        xYSeries1.delete(1, (int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(xYSeries7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.Class<?> wildcardClass32 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        xYSeries57.setKey((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem61 = null; // flaky: xYSeries57.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.clear();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setKey(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 100.0d + "'", comparable4, 100.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.add((double) 100, (double) (-1L));
        java.lang.String str14 = xYSeries3.getDescription();
        int int15 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        xYSeries3.updateByIndex(0, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries17 = xYSeries3.createCopy((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem66 = null; // flaky: xYSeries45.getDataItem((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(xYSeries64);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0f);
        xYSeries1.add((double) (short) 10, (double) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true);
        int int3 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries17.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries30.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable34 = xYSeries30.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries30.remove((int) (short) 0);
        xYSeries1.add(xYDataItem36, false);
        xYSeries1.add((double) '#', (double) 10.0f, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (short) 1 + "'", number27, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (byte) 100 + "'", comparable34, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true);
        java.lang.Class<?> wildcardClass3 = xYSeries2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        xYSeries1.add((double) 100.0f, (double) (short) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = null; // flaky: xYSeries1.getX((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) 3);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries27.updateByIndex(0, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy(3, 10);
        java.lang.Object obj14 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
            xYSeries81.updateByIndex(35, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.lang.String str92 = xYSeries1.getDescription();
        double[][] doubleArray93 = xYSeries1.toArray();
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
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(doubleArray93);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false, false);
        xYSeries69.add((java.lang.Number) 4, (java.lang.Number) (-1.0d));
        boolean boolean73 = xYSeries69.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy(3, 10);
        boolean boolean14 = xYSeries1.getAutoSort();
        java.util.List list15 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries1.getX(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = xYSeries7.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries7.remove((int) (short) 0);
        xYSeries1.add(xYDataItem20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = null; // flaky: xYSeries23.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        int int24 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.Class<?> wildcardClass7 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        double[][] doubleArray18 = xYSeries17.toArray();
        boolean boolean19 = xYSeries17.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries17.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries11.setDescription("");
        xYSeries11.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        xYSeries21.setNotify(true);
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
        xYSeries21.add(xYDataItem46);
        xYSeries11.add(xYDataItem46);
        xYSeries8.setKey((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries13.delete((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        boolean boolean24 = xYSeries20.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = null; // flaky: xYSeries20.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries17.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
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
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        boolean boolean15 = xYSeries1.getNotify();
        xYSeries1.add((double) 10L, (double) (-1.0f), true);
        xYSeries1.add((double) 1L, (java.lang.Number) (byte) 0, false);
        boolean boolean24 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener7);
        int int10 = xYSeries3.indexOf((java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries12.removeChangeListener(seriesChangeListener14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = xYSeries12.equals(obj16);
        boolean boolean18 = xYSeries3.equals(obj16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10, false);
        xYSeries2.clear();
        boolean boolean4 = xYSeries2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.add((double) 100, (double) (-1L));
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate(0.0d, (double) 0);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 2, (double) 3, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        xYSeries1.fireSeriesChanged();
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((java.lang.Number) 32, (java.lang.Number) (-1.0f), false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false);
        xYSeries2.add((double) 2147483647, 0.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries2.removeChangeListener(seriesChangeListener7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries17.update((java.lang.Number) 3, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.delete((-3), (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((-1), (-3));
        xYSeries1.setMaximumItemCount(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYSeries15);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (short) 10, (int) ' ');
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj11 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        xYSeries5.add((double) ' ', (java.lang.Number) 0, true);
        xYSeries5.add((double) 1.0f, (java.lang.Number) 1.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 'a', (double) 10L);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        boolean boolean17 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries(comparable0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        boolean boolean7 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        java.lang.Class<?> wildcardClass70 = xYDataItem60.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        int int34 = xYSeries1.indexOf((java.lang.Number) 10);
        boolean boolean35 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) 1, (double) (byte) 0);
        java.lang.String str39 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.removeChangeListener(seriesChangeListener6);
        xYSeries1.setKey((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(32, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((-1), (java.lang.Number) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10, false);
        xYSeries2.delete(100, 32);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.util.List list18 = xYSeries14.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.updateByIndex(4, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        xYSeries18.add(xYDataItem33, false);
        xYSeries1.add(xYDataItem33, true);
        boolean boolean38 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        boolean boolean29 = xYSeries1.isEmpty();
        java.lang.Comparable comparable30 = xYSeries1.getKey();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (byte) 100 + "'", comparable30, (byte) 100);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        int int18 = xYSeries1.indexOf((java.lang.Number) 100.0f);
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) 10.0d);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Object obj8 = xYSeries1.clone();
        xYSeries1.add((double) 1, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        java.lang.Object obj16 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.update((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 0);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.lang.String str10 = xYSeries1.getDescription();
        java.util.List list11 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.removeChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries81.delete(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 32, false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean13 = xYSeries3.getAutoSort();
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100L, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100.0d + "'", comparable14, 100.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.setMaximumItemCount((int) '#');
        int int12 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        int int15 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((double) (-1), (double) (-1.0f));
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = null; // flaky: xYSeries1.remove((java.lang.Number) 10.0f);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries41.createCopy((int) (byte) 1, 10);
        int int46 = xYSeries41.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries48.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean59 = xYSeries48.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries48.remove((int) (short) 0);
        xYSeries41.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str65 = xYSeries64.getDescription();
        org.jfree.data.xy.XYSeries xYSeries68 = xYSeries64.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries70.add(xYDataItem85, false);
        xYSeries64.add(xYDataItem85, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem85);
        xYSeries1.add(xYDataItem85);
        java.lang.Class<?> wildcardClass94 = xYDataItem85.getClass();
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(xYSeries68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        double[][] doubleArray57 = xYSeries56.toArray();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNotNull(doubleArray57);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.getAutoSort();
        java.lang.Object obj16 = xYSeries14.clone();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries22.remove((int) (short) 0);
        xYSeries20.add(xYDataItem35);
        xYSeries14.add(xYDataItem35, false);
        xYSeries3.add(xYDataItem35, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.removeChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((int) '#', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem72 = null; // flaky: xYSeries52.remove((java.lang.Number) 1.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        xYSeries18.add(xYDataItem33, false);
        xYSeries1.add(xYDataItem33, true);
        boolean boolean38 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries1.getDataItem(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add(0.0d, 0.0d);
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.removeChangeListener(seriesChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (short) 10, (double) 10);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) 1L, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) 3);
        java.lang.Number number16 = null;
        xYSeries1.add((java.lang.Number) (-1.0d), number16, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        int int9 = xYSeries5.indexOf((java.lang.Number) 100L);
        double[][] doubleArray10 = xYSeries5.toArray();
        xYSeries5.add((java.lang.Number) 35, (java.lang.Number) 2, false);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 2147483647, true);
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) (-3), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries29.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str34 = xYSeries29.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries29.addChangeListener(seriesChangeListener37);
        boolean boolean39 = xYSeries27.equals((java.lang.Object) seriesChangeListener37);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries27.updateByIndex(1, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add(0.0d, (java.lang.Number) 35, false);
        xYSeries5.add((java.lang.Number) 100.0f, (java.lang.Number) 2, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        int int7 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj8 = xYSeries1.clone();
        boolean boolean9 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.delete((int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) ' ', (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
            java.lang.Number number32 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getNotify();
        java.lang.Object obj14 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        int int20 = xYSeries1.indexOf((java.lang.Number) 4);
        xYSeries1.add((double) (short) 0, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        boolean boolean56 = xYSeries55.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        java.lang.Comparable comparable9 = xYSeries7.getKey();
        xYSeries7.add(0.0d, (double) '4');
        xYSeries7.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries7.fireSeriesChanged();
        xYSeries7.clear();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries7.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 0);
        java.util.List list21 = xYSeries7.getItems();
        java.lang.Object obj22 = xYSeries7.clone();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) xYSeries7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries7.update((java.lang.Number) (-1L), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) '4', 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries5.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1, false, false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem36 = null; // flaky: xYSeries31.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        xYSeries1.add((double) (byte) 0, (double) 2147483647);
        boolean boolean42 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        java.lang.Object obj12 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.Comparable comparable49 = xYSeries1.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (byte) -1 + "'", comparable49, (byte) -1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.setMaximumItemCount((int) '#');
        int int12 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        int int15 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        java.lang.String str7 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        xYSeries1.clear();
        boolean boolean22 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((java.lang.Number) (short) 10);
        xYSeries3.add((double) (byte) 1, (double) (-1), true);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(xYDataItem8);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        boolean boolean24 = xYSeries3.getAutoSort();
        xYSeries3.setMaximumItemCount(4);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        xYSeries6.add((double) (short) -1, (java.lang.Number) 1.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.updateByIndex((int) (short) 100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(3, (int) (byte) 100);
        java.util.List list10 = xYSeries9.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (short) 0);
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str34 = xYSeries33.getDescription();
        xYSeries33.clear();
        xYSeries33.add(0.0d, (double) (short) 10, false);
        java.util.List list40 = xYSeries33.getItems();
        xYSeries33.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries33.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int56 = xYSeries47.getMaximumItemCount();
        xYSeries47.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries47.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        boolean boolean77 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries66.remove((int) (short) 0);
        xYSeries64.add(xYDataItem79, false);
        xYSeries47.add(xYDataItem79, true);
        xYSeries33.add(xYDataItem79, false);
        xYSeries1.add(xYDataItem79, false);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        xYSeries9.clear();
        xYSeries9.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        double[][] doubleArray22 = xYSeries9.toArray();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        int int9 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        xYSeries5.setNotify(true);
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        xYSeries1.setKey((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.setMaximumItemCount(2147483647);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.lang.String str33 = xYSeries31.getDescription();
        xYSeries31.add((double) 10L, 0.0d, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.lang.String str49 = xYSeries17.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = xYSeries17.getY((int) (byte) 10);
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
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false);
        boolean boolean3 = xYSeries2.getNotify();
        xYSeries2.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) 3, true);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 1.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        java.util.List list15 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = null; // flaky: xYSeries3.remove((java.lang.Number) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        boolean boolean2 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.delete((-1), 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.setMaximumItemCount((int) ' ');
        java.lang.String str13 = xYSeries3.getDescription();
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries3.updateByIndex((-1), (java.lang.Number) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        xYSeries71.fireSeriesChanged();
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
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        boolean boolean9 = xYSeries7.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        java.util.List list13 = xYSeries7.getItems();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.lang.Class<?> wildcardClass25 = xYSeries5.getClass();
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getAutoSort();
        java.lang.Object obj8 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries54 = xYSeries1.createCopy(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        xYSeries1.add((java.lang.Number) (short) 100, (java.lang.Number) 100.0f, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list14 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: xYSeries3.getX((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        xYSeries1.update((java.lang.Number) 100.0d, (java.lang.Number) 1.0f);
        boolean boolean19 = xYSeries1.getNotify();
        boolean boolean20 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str10 = xYSeries1.getDescription();
        double[][] doubleArray11 = xYSeries1.toArray();
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 1, (double) 1.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((double) '#', (java.lang.Number) 10);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = null; // flaky: xYSeries1.getDataItem((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries27.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries27.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable33 = xYSeries27.getKey();
        xYSeries27.setDescription("hi!");
        xYSeries27.clear();
        boolean boolean37 = xYSeries1.equals((java.lang.Object) xYSeries27);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((int) (byte) -1, (java.lang.Number) (-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (byte) 100 + "'", comparable33, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        int int18 = xYSeries1.indexOf((java.lang.Number) 100.0f);
        boolean boolean19 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = null; // flaky: xYSeries1.getDataItem((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        int int68 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 'a', (double) 10L);
        java.util.List list14 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(5, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        int int9 = xYSeries2.getMaximumItemCount();
        boolean boolean10 = xYSeries2.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries2.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries2.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        xYSeries1.add((double) 1, (double) ' ');
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1.0f), (java.lang.Number) 1);
        double[][] doubleArray17 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        boolean boolean7 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Object obj15 = xYSeries3.clone();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 1, 10);
        xYSeries7.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.equals((java.lang.Object) xYSeries7);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) ' ', (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "hi!" + "'", comparable13, "hi!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        int int16 = xYSeries1.indexOf((java.lang.Number) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.lang.String str86 = xYSeries81.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries81.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: xYSeries1.getY((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        boolean boolean17 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        xYSeries1.add((double) 2, (java.lang.Number) 100.0f, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj15 = xYSeries1.clone();
        double[][] doubleArray16 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy(1, 0);
        java.lang.Class<?> wildcardClass18 = xYSeries17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        int int15 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        int int4 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.String str92 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem95 = xYSeries1.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) 32);
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
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(xYDataItem95);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((double) (-2), (double) (byte) 0);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Object obj16 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) -1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!");
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((int) (byte) -1, (java.lang.Number) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries17.createCopy((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = null; // flaky: xYSeries17.remove((java.lang.Number) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries20);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true);
        boolean boolean3 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        xYSeries42.setDescription("");
        int int50 = xYSeries42.indexOf((java.lang.Number) (-1));
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries17.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 10L);
        xYSeries17.add((double) 1, (java.lang.Number) 100.0f);
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
        org.junit.Assert.assertNull(xYDataItem52);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true, true);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str6 = xYSeries5.getDescription();
        xYSeries5.clear();
        xYSeries5.add(0.0d, (double) (short) 10, false);
        java.util.List list12 = xYSeries5.getItems();
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries5.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int28 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries19.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean39 = xYSeries38.isEmpty();
        xYSeries38.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries38.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener47);
        boolean boolean49 = xYSeries38.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries38.remove((int) (short) 0);
        xYSeries36.add(xYDataItem51, false);
        xYSeries19.add(xYDataItem51, true);
        xYSeries5.add(xYDataItem51, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem51, false);
        xYSeries3.add(xYDataItem51, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries90.delete((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        xYSeries17.add(0.0d, (double) (byte) 0, false);
        xYSeries17.add((double) 100.0f, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = xYSeries17.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 4");
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
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        int int7 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        xYSeries15.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries15.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean23 = xYSeries15.isEmpty();
        xYSeries15.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        xYSeries28.clear();
        xYSeries28.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries28.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int38 = xYSeries28.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries15.equals((java.lang.Object) xYSeries28);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries45.createCopy((int) (byte) 1, 10);
        int int50 = xYSeries45.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries52.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener61);
        boolean boolean63 = xYSeries52.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries52.remove((int) (short) 0);
        xYSeries45.add(xYDataItem65);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str69 = xYSeries68.getDescription();
        org.jfree.data.xy.XYSeries xYSeries72 = xYSeries68.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean77 = xYSeries76.isEmpty();
        xYSeries76.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries76.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        xYSeries76.removePropertyChangeListener(propertyChangeListener85);
        boolean boolean87 = xYSeries76.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries76.remove((int) (short) 0);
        xYSeries74.add(xYDataItem89, false);
        xYSeries68.add(xYDataItem89, true);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, true);
        xYSeries45.setKey((java.lang.Comparable) xYDataItem89);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem89);
        xYSeries1.add(xYDataItem89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(xYSeries72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries1.addOrUpdate((double) 0, (double) (-1.0f));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem27);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.Object obj27 = xYSeries1.clone();
        java.lang.Comparable comparable28 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (byte) 100 + "'", comparable28, (byte) 100);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        int int8 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Number number12 = null;
        xYSeries1.add((java.lang.Number) 100.0f, number12);
        java.lang.String str14 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-2), (double) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        java.lang.Object obj18 = xYSeries16.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries16.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries24.add(xYDataItem39);
        xYSeries16.add(xYDataItem39);
        xYSeries1.add(xYDataItem39, false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        xYSeries17.add((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        xYSeries17.clear();
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        xYSeries17.add((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        int int95 = xYSeries17.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 4 + "'", int95 == 4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 10);
        java.lang.Object obj18 = xYSeries1.clone();
        java.lang.Object obj19 = xYSeries1.clone();
        boolean boolean20 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.clear();
        xYSeries3.add((double) 1, (java.lang.Number) (byte) 10, true);
        xYSeries3.setKey((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.removeChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        xYSeries1.add((double) 100, (double) 10L);
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        xYSeries3.clear();
        double[][] doubleArray7 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        xYSeries1.fireSeriesChanged();
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 1);
        xYSeries1.add((double) 3, (double) 3, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (-1));
        xYSeries1.add(0.0d, (double) 1, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries20.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        xYSeries34.add((double) (byte) 1, (double) 2147483647, false);
        xYSeries34.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries34.remove(0);
        xYSeries1.add(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries1.getAutoSort();
        java.lang.Class<?> wildcardClass22 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.Number number14 = xYSeries1.getY((int) (byte) 0);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 52.0d + "'", number14, 52.0d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        xYSeries17.add(0.0d, (double) (byte) 0, false);
        xYSeries17.add((double) (byte) 10, (double) (short) -1, true);
        xYSeries17.add((java.lang.Number) 0L, (java.lang.Number) (short) 10, true);
        xYSeries17.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 100, true);
        xYSeries17.setDescription("hi!");
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
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        xYSeries83.setDescription("");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        boolean boolean18 = xYSeries1.getNotify();
        xYSeries1.setMaximumItemCount(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (byte) -1, false);
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        xYSeries17.add((double) (-1.0f), (double) 100.0f, true);
        xYSeries17.add((java.lang.Number) 1.0d, (java.lang.Number) (-1), true);
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
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.setMaximumItemCount(0);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 0L, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10.0d, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        xYSeries23.add(10.0d, (java.lang.Number) 100L, true);
        xYSeries23.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number33 = xYSeries23.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries23.addChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean38 = xYSeries37.isEmpty();
        java.lang.Object obj39 = xYSeries37.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries37.addChangeListener(seriesChangeListener40);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries45.add(xYDataItem60);
        xYSeries37.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean66 = xYSeries65.isEmpty();
        java.lang.Object obj67 = xYSeries65.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries65.addChangeListener(seriesChangeListener68);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean76 = xYSeries75.isEmpty();
        xYSeries75.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries75.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener84 = null;
        xYSeries75.removePropertyChangeListener(propertyChangeListener84);
        boolean boolean86 = xYSeries75.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries75.remove((int) (short) 0);
        xYSeries73.add(xYDataItem88);
        xYSeries65.add(xYDataItem88);
        xYSeries63.setKey((java.lang.Comparable) xYDataItem88);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem88, true);
        xYSeries23.add(xYDataItem88);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem88, false);
        xYSeries17.add(xYDataItem88);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + (short) 1 + "'", number33, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(xYDataItem88);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) (-1L), (double) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        xYSeries54.add((double) '#', (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries54.update((java.lang.Number) 5, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 5");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        boolean boolean18 = xYSeries17.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem57 = null; // flaky: xYSeries1.remove((java.lang.Number) 52.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        boolean boolean59 = xYSeries57.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy((int) (byte) 1, (-2));
        java.lang.Class<?> wildcardClass13 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries41.createCopy((int) (byte) 1, 10);
        int int46 = xYSeries41.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean49 = xYSeries48.isEmpty();
        xYSeries48.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries48.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener57);
        boolean boolean59 = xYSeries48.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries48.remove((int) (short) 0);
        xYSeries41.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str65 = xYSeries64.getDescription();
        org.jfree.data.xy.XYSeries xYSeries68 = xYSeries64.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean73 = xYSeries72.isEmpty();
        xYSeries72.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries72.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener81);
        boolean boolean83 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries72.remove((int) (short) 0);
        xYSeries70.add(xYDataItem85, false);
        xYSeries64.add(xYDataItem85, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem85);
        xYSeries1.add(xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, false);
        org.jfree.data.xy.XYSeries xYSeries98 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true, false);
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(xYSeries68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        int int6 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.setMaximumItemCount((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 1, true);
        xYSeries1.setDescription("hi!");
        boolean boolean18 = xYSeries1.isEmpty();
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        java.lang.Object obj6 = xYSeries1.clone();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        xYSeries1.setMaximumItemCount((int) (short) 1);
        int int22 = xYSeries1.getMaximumItemCount();
        boolean boolean23 = xYSeries1.getAutoSort();
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate(number24, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        java.lang.Number number9 = xYSeries1.getY(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100.0d + "'", number9, 100.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((-2), (java.lang.Number) 3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean5 = xYSeries4.isEmpty();
        xYSeries4.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries4.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries4.removePropertyChangeListener(propertyChangeListener13);
        double[][] doubleArray15 = xYSeries4.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries4.removeChangeListener(seriesChangeListener16);
        double[][] doubleArray18 = xYSeries4.toArray();
        xYSeries4.setDescription("");
        java.lang.String str21 = xYSeries4.getDescription();
        int int22 = xYSeries4.getItemCount();
        java.lang.Class<?> wildcardClass23 = xYSeries4.getClass();
        boolean boolean24 = xYSeries2.equals((java.lang.Object) xYSeries4);
        xYSeries2.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        boolean boolean15 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.Object obj14 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        java.lang.Number number13 = xYSeries1.getY((int) (byte) 1);
        boolean boolean14 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-2) + "'", number13, (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = xYSeries1.clone();
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
            org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        xYSeries54.add((-1.0d), (java.lang.Number) 0.0d);
        java.util.List list61 = xYSeries54.getItems();
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries54.addPropertyChangeListener(propertyChangeListener62);
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
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        xYSeries1.add(100.0d, (double) 4);
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.remove((int) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries14.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        xYSeries17.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries48.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str55 = xYSeries54.getDescription();
        org.jfree.data.xy.XYSeries xYSeries58 = xYSeries54.createCopy((int) (byte) 1, 10);
        int int59 = xYSeries54.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean62 = xYSeries61.isEmpty();
        xYSeries61.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries61.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries61.removePropertyChangeListener(propertyChangeListener70);
        boolean boolean72 = xYSeries61.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries61.remove((int) (short) 0);
        xYSeries54.add(xYDataItem74);
        xYSeries48.add(xYDataItem74);
        boolean boolean77 = xYSeries48.getNotify();
        boolean boolean78 = xYSeries48.getAutoSort();
        java.lang.String str79 = xYSeries48.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries48.remove(1);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false, false);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem81);
        java.lang.Number number90 = xYSeries3.getY((int) (byte) 1);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(xYSeries58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(xYDataItem81);
        org.junit.Assert.assertEquals("'" + number90 + "' != '" + (-1.0f) + "'", number90, (-1.0f));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        xYSeries17.add((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem97 = xYSeries17.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (-2));
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
        org.junit.Assert.assertNull(xYDataItem97);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean13 = xYSeries5.getAllowDuplicateXValues();
        xYSeries5.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries5.addOrUpdate((double) '#', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = xYSeries17.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries24);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.lang.String str10 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        java.lang.Number number11 = null;
        xYSeries1.add((java.lang.Number) 1L, number11, false);
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 2);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        xYSeries1.add((double) ' ', (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getAutoSort();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean11 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        boolean boolean6 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (short) 10, (double) 10);
        boolean boolean13 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        boolean boolean12 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getX(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries17.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries17.remove((java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries17.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-3) + "'", int49 == (-3));
        org.junit.Assert.assertNull(xYDataItem52);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) 1L, (-1.0d));
        java.lang.String str12 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) 100.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.setDescription("");
        boolean boolean12 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries16.add(xYDataItem31);
        xYSeries1.add(xYDataItem31, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.setMaximumItemCount((int) ' ');
        java.lang.String str13 = xYSeries3.getDescription();
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        xYSeries10.clear();
        xYSeries10.add(0.0d, (double) (short) 10, false);
        java.util.List list17 = xYSeries10.getItems();
        int int18 = xYSeries10.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries10.removeChangeListener(seriesChangeListener19);
        xYSeries10.setMaximumItemCount((int) (short) 100);
        xYSeries10.setMaximumItemCount((int) (byte) 100);
        boolean boolean25 = xYSeries1.equals((java.lang.Object) (byte) 100);
        xYSeries1.add(10.0d, 10.0d, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number15 = xYSeries1.getY(2);
        java.util.List list16 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries1.createCopy((int) (byte) 100, (int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries19.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(xYSeries19);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries3.setMaximumItemCount((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        java.lang.String str14 = xYSeries3.getDescription();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (-1.0f), true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
            java.lang.Number number20 = xYSeries1.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries17.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries17.remove((java.lang.Number) (short) 10);
        xYSeries17.clear();
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
        org.junit.Assert.assertNull(xYDataItem52);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries1.add((double) 'a', (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = null; // flaky: xYSeries1.remove((-2));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        xYSeries13.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries13.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) (byte) 1);
        boolean boolean22 = xYSeries1.equals((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.setDescription("hi!");
        boolean boolean10 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) 100, (double) 1, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getNotify();
        java.lang.String str5 = xYSeries1.getDescription();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        xYSeries17.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries48.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str55 = xYSeries54.getDescription();
        org.jfree.data.xy.XYSeries xYSeries58 = xYSeries54.createCopy((int) (byte) 1, 10);
        int int59 = xYSeries54.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean62 = xYSeries61.isEmpty();
        xYSeries61.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries61.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries61.removePropertyChangeListener(propertyChangeListener70);
        boolean boolean72 = xYSeries61.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries61.remove((int) (short) 0);
        xYSeries54.add(xYDataItem74);
        xYSeries48.add(xYDataItem74);
        boolean boolean77 = xYSeries48.getNotify();
        boolean boolean78 = xYSeries48.getAutoSort();
        java.lang.String str79 = xYSeries48.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries48.remove(1);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false, false);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries91.updateByIndex((int) (byte) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(xYSeries58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        boolean boolean39 = xYSeries31.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        double[][] doubleArray24 = xYSeries13.toArray();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) doubleArray24);
        java.lang.Number number26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number26, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        boolean boolean16 = xYSeries5.isEmpty();
        xYSeries5.setKey((java.lang.Comparable) (short) -1);
        java.util.List list19 = xYSeries5.getItems();
        xYSeries5.add((double) 0L, 1.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = null; // flaky: xYSeries21.getY((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false, false);
        xYSeries69.add((java.lang.Number) 4, (java.lang.Number) (-1.0d));
        java.lang.String str73 = xYSeries69.getDescription();
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
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) (byte) -1, true);
        boolean boolean21 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-1.0f), (double) 2147483647, false);
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        int int9 = xYSeries3.getItemCount();
        java.lang.Class<?> wildcardClass10 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        int int21 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        xYSeries1.add((double) '#', (double) (byte) 10, true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener20);
        java.lang.String str22 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) '4', 32);
        xYSeries5.setKey((java.lang.Comparable) 1L);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean12 = xYSeries11.getAutoSort();
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
        xYSeries11.add(xYDataItem58);
        xYSeries5.add(xYDataItem58, false);
        xYSeries5.add((double) 0L, 0.0d);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.update((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 0);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Number number14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove(number14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) 1L, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries3.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries14.addChangeListener(seriesChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries19 = xYSeries14.createCopy(5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.update((java.lang.Number) (-1.0d), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        int int38 = xYSeries5.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries5.addChangeListener(seriesChangeListener39);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        xYSeries42.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries42.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries42.getAutoSort();
        int int54 = xYSeries42.getItemCount();
        java.lang.String str55 = xYSeries42.getDescription();
        java.lang.Number number57 = xYSeries42.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str60 = xYSeries59.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries59.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean66 = xYSeries65.isEmpty();
        xYSeries65.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries65.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        xYSeries65.removePropertyChangeListener(propertyChangeListener74);
        boolean boolean76 = xYSeries65.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries65.remove((int) (short) 0);
        xYSeries59.add(xYDataItem78);
        xYSeries42.setKey((java.lang.Comparable) xYDataItem78);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78, true);
        xYSeries5.setKey((java.lang.Comparable) true);
        double[][] doubleArray84 = xYSeries5.toArray();
        xYSeries5.setNotify(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + number57 + "' != '" + (byte) -1 + "'", number57, (byte) -1);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(xYDataItem78);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.setMaximumItemCount((int) (byte) 10);
        xYSeries5.setNotify(true);
        boolean boolean18 = xYSeries5.getAllowDuplicateXValues();
        xYSeries5.delete((int) (short) 0, (-3));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem22, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        int int31 = xYSeries28.getMaximumItemCount();
        xYSeries28.setDescription("");
        java.lang.Comparable comparable34 = xYSeries28.getKey();
        java.lang.String str35 = xYSeries28.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(comparable34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        int int19 = xYSeries14.getItemCount();
        java.lang.Comparable comparable20 = xYSeries14.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries14.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) 100 + "'", comparable20, (byte) 100);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((double) (-2), (double) (byte) 0);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Class<?> wildcardClass9 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        double[][] doubleArray16 = xYSeries1.toArray();
        xYSeries1.add(0.0d, (double) 'a', true);
        boolean boolean21 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-2), (double) (-1L));
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries19 = xYSeries1.createCopy(0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        boolean boolean10 = xYSeries1.getNotify();
        xYSeries1.fireSeriesChanged();
        int int12 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        xYSeries3.delete(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        xYSeries5.add((java.lang.Number) 2, (java.lang.Number) 0.0f, false);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        java.lang.Object obj17 = xYSeries15.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries15.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries23.add(xYDataItem38);
        xYSeries15.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        java.lang.Object obj45 = xYSeries43.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries43.addChangeListener(seriesChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries51.add(xYDataItem66);
        xYSeries43.add(xYDataItem66);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true);
        xYSeries1.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number75 = xYSeries73.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.update((java.lang.Number) (byte) 10, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
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
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        xYSeries1.setKey((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = null; // flaky: xYSeries1.getY((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((double) (short) 1, (double) (byte) 100);
        int int15 = xYSeries3.indexOf((java.lang.Number) 52.0d);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.setMaximumItemCount((int) ' ');
        boolean boolean13 = xYSeries3.getAutoSort();
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        xYSeries3.delete((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100.0d + "'", comparable14, 100.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAutoSort();
        xYSeries3.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy(2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) (byte) 10, (java.lang.Number) 52.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj11 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        xYSeries1.setDescription("");
        xYSeries1.delete((int) (short) 100, (int) (short) 10);
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean4 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries3.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        int int16 = xYSeries1.indexOf((java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.delete((int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        int int19 = xYSeries14.getItemCount();
        xYSeries14.add((double) 10L, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.delete(2147483647, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        java.util.List list17 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(5, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f);
        java.lang.Class<?> wildcardClass2 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.Number number8 = null;
        xYSeries1.add((double) 10L, number8, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        xYSeries1.add(xYDataItem61, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number28, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        boolean boolean12 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.add((double) 100, (java.lang.Number) 4, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        xYSeries1.fireSeriesChanged();
        int int22 = xYSeries1.indexOf((java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.add(0.0d, (double) 0L, true);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = xYSeries1.clone();
        xYSeries1.add((double) ' ', 0.0d);
        java.lang.Number number20 = xYSeries1.getY(0);
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (byte) -1 + "'", number20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        java.lang.Object obj7 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        xYSeries1.add((java.lang.Number) 35, (java.lang.Number) 5, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        xYSeries5.setMaximumItemCount(0);
        java.util.List list36 = xYSeries5.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((java.lang.Number) 35, (java.lang.Number) (-1), true);
        xYSeries5.setMaximumItemCount(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        boolean boolean5 = xYSeries1.getAutoSort();
        java.lang.Class<?> wildcardClass6 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        xYSeries6.add((double) (short) -1, (java.lang.Number) 1.0d, true);
        java.lang.Comparable comparable11 = xYSeries6.getKey();
        boolean boolean12 = xYSeries6.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 100 + "'", comparable11, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        boolean boolean9 = xYSeries7.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        double[][] doubleArray13 = xYSeries7.toArray();
        xYSeries7.add((double) 100L, (java.lang.Number) 32);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.util.List list18 = xYSeries14.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries14.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 10L);
        int int11 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(4);
        int int14 = xYSeries1.indexOf((java.lang.Number) 100L);
        xYSeries1.add((double) 100.0f, 1.0d, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        int int19 = xYSeries1.getItemCount();
        java.lang.String str20 = xYSeries1.getDescription();
        java.lang.Object obj21 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries11.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean19 = xYSeries1.equals((java.lang.Object) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        xYSeries21.clear();
        xYSeries21.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries21.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int31 = xYSeries21.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
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
        boolean boolean87 = xYSeries33.equals((java.lang.Object) xYDataItem80);
        xYSeries21.add(xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, false, false);
        xYSeries1.add(xYDataItem80, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries36.delete(4, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
}
