import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) 52.0d, (java.lang.Number) 35);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        xYSeries12.setKey((java.lang.Comparable) 100);
        boolean boolean25 = xYSeries12.isEmpty();
        xYSeries12.delete(32, 3);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries32.clear();
        xYSeries32.setKey((java.lang.Comparable) '#');
        boolean boolean36 = xYSeries32.getAllowDuplicateXValues();
        xYSeries32.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        xYSeries42.clear();
        java.lang.Comparable comparable45 = xYSeries42.getKey();
        double[][] doubleArray46 = xYSeries42.toArray();
        int int47 = xYSeries42.getMaximumItemCount();
        xYSeries42.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean51 = xYSeries32.equals((java.lang.Object) xYSeries42);
        java.lang.String str52 = xYSeries42.getDescription();
        java.util.List list53 = xYSeries42.getItems();
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries55.setDescription("");
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
        xYSeries55.setKey((java.lang.Comparable) xYDataItem78);
        xYSeries42.add(xYDataItem78);
        xYSeries12.add(xYDataItem78, true);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78, false);
        xYSeries1.add(xYDataItem78, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (byte) 100 + "'", comparable45, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((-1.0d), (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = xYSeries3.getDescription();
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        xYSeries1.add((java.lang.Number) 5, (java.lang.Number) (-1.0d), true);
        int int36 = xYSeries1.indexOf((java.lang.Number) 2);
        int int37 = xYSeries1.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        boolean boolean13 = xYSeries1.getNotify();
        java.util.List list14 = xYSeries1.getItems();
        java.util.List list15 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.lang.Comparable comparable46 = xYSeries45.getKey();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries(comparable46, true, false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(comparable46);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = xYSeries1.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        double[][] doubleArray16 = xYSeries1.toArray();
        xYSeries1.add(0.0d, (double) 'a', true);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.remove((java.lang.Number) 1L);
        boolean boolean23 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.delete((int) (short) 10, 0);
        java.lang.String str7 = xYSeries1.getDescription();
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.setKey((java.lang.Comparable) (-1.0d));
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        int int13 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        boolean boolean11 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) 1.0f, (double) 0);
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        java.lang.Number number18 = xYSeries3.getY(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        double[][] doubleArray32 = xYSeries1.toArray();
        boolean boolean33 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        java.lang.Comparable comparable32 = xYSeries30.getKey();
        xYSeries30.add(0.0d, (double) '4');
        xYSeries30.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries30.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries30.remove((java.lang.Number) (short) 0);
        xYSeries1.add(xYDataItem41, true);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (byte) 100 + "'", comparable32, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) 1L, (java.lang.Number) (short) 100);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove(2);
        java.lang.Class<?> wildcardClass18 = xYDataItem17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries12.setDescription("");
        xYSeries12.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.update((java.lang.Number) (short) 1, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries5.clear();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries5.createCopy((int) (byte) 0, 0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries18.addOrUpdate((double) (-1L), (double) (short) 10);
        xYSeries18.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, true);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener37);
        boolean boolean39 = xYSeries28.getAutoSort();
        int int40 = xYSeries28.getItemCount();
        java.lang.String str41 = xYSeries28.getDescription();
        java.lang.Number number43 = xYSeries28.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries45.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        boolean boolean62 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries51.remove((int) (short) 0);
        xYSeries45.add(xYDataItem64);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64, false, false);
        xYSeries18.add(xYDataItem64, false);
        xYSeries16.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + number43 + "' != '" + (byte) -1 + "'", number43, (byte) -1);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        int int7 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy(3, (int) (short) 100);
        xYSeries10.add((java.lang.Number) 2, (java.lang.Number) (short) 0);
        xYSeries10.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true);
        boolean boolean42 = xYSeries41.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries41.removeChangeListener(seriesChangeListener43);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.lang.Object obj9 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        boolean boolean18 = xYSeries17.getAllowDuplicateXValues();
        xYSeries17.add((double) (short) 0, (double) (-1.0f), true);
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries17.createCopy(32, (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries17.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        int int47 = xYSeries45.getMaximumItemCount();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries1.addChangeListener(seriesChangeListener46);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNull(xYDataItem45);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: xYSeries1.getY((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        xYSeries1.setMaximumItemCount(2);
        double[][] doubleArray9 = xYSeries1.toArray();
        java.util.List list10 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries19.fireSeriesChanged();
        java.lang.Object obj29 = xYSeries19.clone();
        boolean boolean30 = xYSeries1.equals(obj29);
        xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) 1);
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) 0, (double) (-1));
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries20.addOrUpdate((double) 3, (double) (short) 10);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        boolean boolean9 = xYSeries7.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        java.lang.Comparable comparable16 = xYSeries14.getKey();
        xYSeries14.add(0.0d, (double) '4');
        xYSeries14.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries25.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries25.add(xYDataItem44);
        xYSeries14.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        xYSeries3.add(xYDataItem44, false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        int int9 = xYSeries5.indexOf((java.lang.Number) (short) -1);
        boolean boolean10 = xYSeries5.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries5.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        int int16 = xYSeries1.indexOf((java.lang.Number) (-1L));
        java.lang.String str17 = xYSeries1.getDescription();
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43, true, false);
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        java.lang.Comparable comparable25 = xYSeries23.getKey();
        xYSeries23.add(0.0d, (double) '4');
        xYSeries23.add((double) 2147483647, (java.lang.Number) 10, false);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries34.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries34.add(xYDataItem53);
        xYSeries23.add(xYDataItem53);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (byte) 100 + "'", comparable25, (byte) 100);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 'a', (double) (byte) 10);
        java.lang.Number number11 = xYSeries1.getY(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10.0d + "'", number11, 10.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        boolean boolean21 = xYSeries1.getAllowDuplicateXValues();
        int int22 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries33.setDescription("");
        xYSeries33.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries39.createCopy((int) (byte) 1, 10);
        xYSeries43.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str48 = xYSeries47.getDescription();
        org.jfree.data.xy.XYSeries xYSeries51 = xYSeries47.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean56 = xYSeries55.isEmpty();
        xYSeries55.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries55.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener64);
        boolean boolean66 = xYSeries55.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries55.remove((int) (short) 0);
        xYSeries53.add(xYDataItem68, false);
        xYSeries47.add(xYDataItem68, true);
        xYSeries43.add(xYDataItem68);
        xYSeries33.add(xYDataItem68);
        xYSeries24.add(xYDataItem68);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(xYSeries51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        java.util.List list6 = xYSeries1.getItems();
        java.util.List list7 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0d, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false);
        xYSeries2.clear();
        xYSeries2.fireSeriesChanged();
        int int6 = xYSeries2.indexOf((java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.lang.Number number27 = null;
        xYSeries1.add((double) (short) 0, number27, true);
        java.lang.Object obj30 = xYSeries1.clone();
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 'a', (double) (byte) 10);
        xYSeries1.setNotify(true);
        java.util.List list12 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean57 = xYSeries56.isEmpty();
        xYSeries56.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj62 = xYSeries56.clone();
        boolean boolean63 = xYSeries56.getAutoSort();
        boolean boolean64 = xYSeries56.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        double[][] doubleArray77 = xYSeries66.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries66.removeChangeListener(seriesChangeListener78);
        double[][] doubleArray80 = xYSeries66.toArray();
        org.jfree.data.xy.XYSeries xYSeries83 = xYSeries66.createCopy((int) (short) 100, 1);
        boolean boolean84 = xYSeries83.getAllowDuplicateXValues();
        boolean boolean85 = xYSeries56.equals((java.lang.Object) xYSeries83);
        boolean boolean86 = xYSeries56.getAllowDuplicateXValues();
        boolean boolean87 = xYSeries56.getAllowDuplicateXValues();
        boolean boolean88 = xYSeries17.equals((java.lang.Object) boolean87);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(xYSeries83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 10.0f, (double) (byte) 0);
        xYSeries1.add((double) 32, (double) 4, false);
        int int15 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 2147483647, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2147483647");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.delete((int) (short) 10, 0);
        java.lang.String str7 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Class<?> wildcardClass9 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        xYSeries3.clear();
        xYSeries3.add(100.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        java.lang.Object obj35 = xYSeries18.clone();
        xYSeries18.add((java.lang.Number) 0, (java.lang.Number) 10L, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries5.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean4 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener12);
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
        xYSeries6.add(xYDataItem50);
        xYSeries3.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        int int18 = xYSeries1.indexOf((java.lang.Number) 100.0f);
        xYSeries1.add((double) (short) 0, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.lang.Comparable comparable52 = xYSeries1.getKey();
        java.lang.Number number54 = null;
        xYSeries1.add((java.lang.Number) 100L, number54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (byte) 100 + "'", comparable52, (byte) 100);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        xYSeries1.setNotify(false);
        xYSeries1.add((double) 'a', (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) (byte) 100, 52.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        boolean boolean69 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        xYSeries1.addChangeListener(seriesChangeListener70);
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        int int23 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        int int15 = xYSeries1.getItemCount();
        xYSeries1.add((java.lang.Number) 5, (java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries20.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int29 = xYSeries20.getMaximumItemCount();
        xYSeries20.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj34 = xYSeries20.clone();
        xYSeries20.clear();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str38 = xYSeries37.getDescription();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries37.createCopy((int) (byte) 1, 10);
        int int42 = xYSeries37.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean45 = xYSeries44.isEmpty();
        xYSeries44.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries44.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener53);
        boolean boolean55 = xYSeries44.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries44.remove((int) (short) 0);
        xYSeries37.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57);
        xYSeries20.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57);
        xYSeries1.add(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, true);
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
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        java.lang.Object obj40 = xYSeries1.clone();
        xYSeries1.add(1.0d, (double) ' ');
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
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true);
        int int45 = xYSeries44.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        int int16 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 100, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.getDataItem(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.setKey((java.lang.Comparable) 35);
        java.util.List list14 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        xYSeries25.setKey((java.lang.Comparable) 100);
        boolean boolean38 = xYSeries25.isEmpty();
        int int39 = xYSeries25.getItemCount();
        boolean boolean40 = xYSeries23.equals((java.lang.Object) xYSeries25);
        xYSeries25.setNotify(false);
        boolean boolean43 = xYSeries25.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries25.updateByIndex((-2), (java.lang.Number) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.lang.Number number11 = xYSeries1.getY(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(4, (int) (short) 0);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 1 + "'", number11, (byte) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        java.lang.Object obj11 = xYSeries1.clone();
        xYSeries1.setKey((java.lang.Comparable) 35);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        xYSeries3.clear();
        boolean boolean81 = xYSeries3.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        boolean boolean46 = xYSeries45.isEmpty();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        xYSeries1.add((double) (-2), (double) '4');
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (byte) 1, false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 0L);
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries17.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem93, false, false);
        xYSeries96.add((double) 2, (double) 1);
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
        org.junit.Assert.assertNotNull(xYDataItem93);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (short) 10, (int) ' ');
        boolean boolean10 = xYSeries9.getAutoSort();
        java.lang.Object obj11 = xYSeries9.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        boolean boolean7 = xYSeries3.getNotify();
        java.util.List list8 = xYSeries3.getItems();
        int int10 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean11 = xYSeries3.getAutoSort();
        xYSeries3.add((double) '#', (double) 4);
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100.0d + "'", comparable15, 100.0d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        xYSeries1.add((double) 1, (double) ' ');
        xYSeries1.setDescription("");
        int int14 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        xYSeries47.add((double) 10L, (double) (-1.0f));
        xYSeries47.setMaximumItemCount((int) '#');
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        boolean boolean27 = xYSeries1.getNotify();
        int int28 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        java.util.List list17 = xYSeries1.getItems();
        xYSeries1.clear();
        xYSeries1.setDescription("");
        boolean boolean21 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries1.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, false);
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = null; // flaky: xYSeries1.remove((java.lang.Number) (-1L));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        xYSeries1.setMaximumItemCount(10);
        xYSeries1.add((double) (byte) 0, (double) (byte) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) 10.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        xYSeries26.add((double) '#', (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean42 = xYSeries41.isEmpty();
        xYSeries41.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries41.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries41.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries57.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str64 = xYSeries63.getDescription();
        org.jfree.data.xy.XYSeries xYSeries67 = xYSeries63.createCopy((int) (byte) 1, 10);
        int int68 = xYSeries63.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean71 = xYSeries70.isEmpty();
        xYSeries70.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries70.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries70.removePropertyChangeListener(propertyChangeListener79);
        boolean boolean81 = xYSeries70.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries70.remove((int) (short) 0);
        xYSeries63.add(xYDataItem83);
        xYSeries57.add(xYDataItem83);
        boolean boolean86 = xYSeries57.getNotify();
        boolean boolean87 = xYSeries57.getAutoSort();
        java.lang.String str88 = xYSeries57.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem90 = xYSeries57.remove(1);
        xYSeries26.setKey((java.lang.Comparable) xYDataItem90);
        xYSeries13.add(xYDataItem90, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(xYSeries67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(xYDataItem83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(xYDataItem90);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        java.util.List list17 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 1, 10);
        xYSeries7.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.equals((java.lang.Object) xYSeries7);
        int int13 = xYSeries7.getItemCount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 1);
        boolean boolean19 = xYSeries1.getNotify();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount(2);
        java.lang.Object obj10 = xYSeries3.clone();
        xYSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries26.setDescription("");
        xYSeries26.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str33 = xYSeries32.getDescription();
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries32.createCopy((int) (byte) 1, 10);
        xYSeries36.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str41 = xYSeries40.getDescription();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries40.createCopy((int) (byte) 1, 10);
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
        xYSeries40.add(xYDataItem61, true);
        xYSeries36.add(xYDataItem61);
        xYSeries26.add(xYDataItem61);
        xYSeries17.add(xYDataItem61);
        xYSeries1.add(xYDataItem61, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true);
        java.lang.Object obj73 = xYSeries72.clone();
        java.lang.Comparable comparable74 = xYSeries72.getKey();
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries(comparable74, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(comparable74);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy(3, 10);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 32, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.Object obj22 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        xYSeries1.add(10.0d, (double) (-1));
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.getAutoSort();
        java.lang.Object obj21 = xYSeries19.clone();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40);
        xYSeries19.add(xYDataItem40, false);
        xYSeries1.add(xYDataItem40);
        int int45 = xYSeries1.getItemCount();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove(2);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        boolean boolean11 = xYSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        double[][] doubleArray10 = xYSeries5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: xYSeries5.getX((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.util.List list16 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        java.lang.Object obj19 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.removeChangeListener(seriesChangeListener20);
        double[][] doubleArray22 = xYSeries1.toArray();
        xYSeries1.add((double) '4', (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 10);
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        xYSeries1.add((double) 2147483647, (java.lang.Number) 0.0f, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries(comparable30, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNotNull(comparable30);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries7.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries7.getItems();
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        xYSeries7.add((double) 0, (java.lang.Number) 10.0f);
        boolean boolean16 = xYSeries7.getNotify();
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = xYSeries1.getDescription();
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2, number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        xYSeries1.add((double) 1.0f, (double) (short) 1, true);
        xYSeries1.add((double) (short) -1, (java.lang.Number) 3, true);
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        int int19 = xYSeries14.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        xYSeries21.clear();
        xYSeries21.add(0.0d, (double) (short) 10, false);
        java.util.List list28 = xYSeries21.getItems();
        xYSeries21.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries21.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int44 = xYSeries35.getMaximumItemCount();
        xYSeries35.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries35.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
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
        xYSeries35.add(xYDataItem67, true);
        xYSeries21.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false);
        xYSeries14.setKey((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass77 = xYSeries14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        xYSeries26.add((double) (short) 10, (java.lang.Number) (short) 0, true);
        java.lang.Number number31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries26.remove(number31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        xYSeries1.delete((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        xYSeries1.add(100.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        boolean boolean25 = xYSeries1.getAutoSort();
        int int26 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        boolean boolean59 = xYSeries54.getNotify();
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int12 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number17 = xYSeries3.getY(2);
        java.util.List list18 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries3.createCopy((int) (byte) 100, (int) (byte) 0);
        boolean boolean22 = xYSeries1.equals((java.lang.Object) (byte) 0);
        java.lang.String str23 = xYSeries1.getDescription();
        java.lang.String str24 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (-1.0d) + "'", number17, (-1.0d));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        xYSeries23.add((double) (byte) 1, (java.lang.Number) (short) 0, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener29);
        xYSeries23.setNotify(false);
        java.util.List list33 = xYSeries23.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        int int9 = xYSeries3.getItemCount();
        java.lang.Comparable comparable10 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1.0f + "'", comparable10, 1.0f);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) 35, (java.lang.Number) (-2), true);
        java.lang.String str11 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean5 = xYSeries4.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries4.addOrUpdate((double) 35, (double) (-1L));
        boolean boolean9 = xYSeries4.getAutoSort();
        xYSeries4.add((double) (byte) 1, (double) 1L, false);
        boolean boolean14 = xYSeries2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Number number19 = xYSeries14.getY((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries21.remove((int) (short) 0);
        xYSeries21.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 10);
        java.lang.Object obj38 = xYSeries21.clone();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        int int42 = xYSeries40.getMaximumItemCount();
        boolean boolean43 = xYSeries40.getAutoSort();
        xYSeries40.setDescription("hi!");
        xYSeries40.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj50 = xYSeries40.clone();
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries52.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int61 = xYSeries52.getMaximumItemCount();
        xYSeries52.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean65 = xYSeries40.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries40.getDataItem((int) (short) 0);
        xYSeries21.add(xYDataItem67, false);
        xYSeries14.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        xYSeries72.add((double) 100, (double) (-3), false);
        boolean boolean77 = xYSeries72.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (-1.0d) + "'", number19, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) (-2), (java.lang.Number) 2, true);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        double[][] doubleArray29 = xYSeries1.toArray();
        double[][] doubleArray30 = xYSeries1.toArray();
        boolean boolean31 = xYSeries1.getAllowDuplicateXValues();
        int int32 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy(0, 1);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        xYSeries82.add((double) 100, 0.0d, false);
        xYSeries82.setDescription("");
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        int int22 = xYSeries1.indexOf((java.lang.Number) 0L);
        int int23 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        xYSeries1.add((double) 'a', (java.lang.Number) 10.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number19 = xYSeries9.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries9.removeChangeListener(seriesChangeListener20);
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
        xYSeries9.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, false, false);
        xYSeries1.add(xYDataItem58);
        int int71 = xYSeries1.getItemCount();
        boolean boolean72 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean75 = xYSeries74.isEmpty();
        xYSeries74.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries74.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number84 = xYSeries74.getX(0);
        org.jfree.data.xy.XYSeries xYSeries87 = xYSeries74.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem90 = xYSeries87.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable91 = xYSeries87.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries87.remove((int) (short) 0);
        xYSeries1.add(xYDataItem93, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (short) 1 + "'", number19, (short) 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + number84 + "' != '" + (short) 1 + "'", number84, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries87);
        org.junit.Assert.assertNull(xYDataItem90);
        org.junit.Assert.assertEquals("'" + comparable91 + "' != '" + (byte) 100 + "'", comparable91, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem93);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        double[][] doubleArray23 = xYSeries12.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries12.removeChangeListener(seriesChangeListener24);
        double[][] doubleArray26 = xYSeries12.toArray();
        xYSeries12.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener29);
        xYSeries12.setMaximumItemCount((int) (short) 1);
        int int33 = xYSeries12.getMaximumItemCount();
        xYSeries12.setNotify(false);
        boolean boolean36 = xYSeries1.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        xYSeries3.clear();
        xYSeries3.delete((int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        java.lang.Object obj7 = xYSeries1.clone();
        java.lang.String str8 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0d, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 2147483647, (java.lang.Number) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        xYSeries20.setMaximumItemCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        int int22 = xYSeries20.getMaximumItemCount();
        boolean boolean23 = xYSeries20.getAutoSort();
        xYSeries20.setDescription("hi!");
        xYSeries20.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj30 = xYSeries20.clone();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int41 = xYSeries32.getMaximumItemCount();
        xYSeries32.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean45 = xYSeries20.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries20.getDataItem((int) (short) 0);
        xYSeries1.add(xYDataItem47, false);
        xYSeries1.add(1.0d, (java.lang.Number) 10L, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true);
        xYSeries2.add((java.lang.Number) 5, (java.lang.Number) 10.0f, true);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        double[][] doubleArray92 = xYSeries1.toArray();
        boolean boolean93 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean94 = xYSeries1.getNotify();
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
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        xYSeries1.add((double) 'a', (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries7.fireSeriesChanged();
        xYSeries7.setMaximumItemCount(4);
        int int20 = xYSeries7.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        double[][] doubleArray33 = xYSeries22.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries22.removeChangeListener(seriesChangeListener34);
        double[][] doubleArray36 = xYSeries22.toArray();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries22.createCopy((int) (short) 100, 1);
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
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true);
        xYSeries39.add(xYDataItem62, false);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, false, true);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem62);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) '4', (double) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        xYSeries14.clear();
        xYSeries14.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        xYSeries22.clear();
        java.lang.Comparable comparable25 = xYSeries22.getKey();
        double[][] doubleArray26 = xYSeries22.toArray();
        xYSeries22.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str31 = xYSeries22.getDescription();
        double[][] doubleArray32 = xYSeries22.toArray();
        boolean boolean33 = xYSeries14.equals((java.lang.Object) xYSeries22);
        boolean boolean34 = xYSeries1.equals((java.lang.Object) boolean33);
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries39.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries51.setDescription("");
        xYSeries51.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries51.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str64 = xYSeries63.getDescription();
        org.jfree.data.xy.XYSeries xYSeries67 = xYSeries63.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean72 = xYSeries71.isEmpty();
        xYSeries71.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries71.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener80);
        boolean boolean82 = xYSeries71.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries71.remove((int) (short) 0);
        xYSeries69.add(xYDataItem84, false);
        xYSeries63.add(xYDataItem84, true);
        java.util.List list89 = xYSeries63.getItems();
        boolean boolean90 = xYSeries63.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries63.remove(0);
        xYSeries51.add(xYDataItem92, false);
        xYSeries39.add(xYDataItem92, false);
        xYSeries1.add(xYDataItem92, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (byte) 100 + "'", comparable25, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(xYSeries67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(xYDataItem92);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 35);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) (-1.0d));
        xYSeries1.fireSeriesChanged();
        int int22 = xYSeries1.indexOf((java.lang.Number) 52.0d);
        boolean boolean23 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3) + "'", int22 == (-3));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) 0.0f, (double) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries3.createCopy((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-2), (double) (-1L));
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate(0.0d, (double) (byte) 1);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        boolean boolean16 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 0);
        java.util.List list20 = xYSeries1.getItems();
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
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true);
        xYSeries1.add(xYDataItem58, true);
        xYSeries1.add((double) 0L, (java.lang.Number) 3, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(list20);
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        java.util.List list16 = xYSeries1.getItems();
        java.lang.Object obj17 = xYSeries1.clone();
        java.lang.Object obj18 = null;
        boolean boolean19 = xYSeries1.equals(obj18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        xYSeries23.add((double) 'a', (double) 2, false);
        xYSeries23.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        int int7 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((java.lang.Number) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem9, true);
        double[][] doubleArray12 = xYSeries11.toArray();
        java.lang.Comparable comparable13 = xYSeries11.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(comparable13);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        int int7 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries9.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries25.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        int int36 = xYSeries31.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean39 = xYSeries38.isEmpty();
        xYSeries38.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries38.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener47);
        boolean boolean49 = xYSeries38.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries38.remove((int) (short) 0);
        xYSeries31.add(xYDataItem51);
        xYSeries25.add(xYDataItem51);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener54);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries25.getDataItem((int) (byte) 0);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57, false, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = null; // flaky: xYSeries1.getX((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        double[][] doubleArray23 = xYSeries22.toArray();
        boolean boolean24 = xYSeries1.equals((java.lang.Object) xYSeries22);
        boolean boolean25 = xYSeries22.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        int int29 = xYSeries27.getMaximumItemCount();
        boolean boolean30 = xYSeries27.getAutoSort();
        xYSeries27.setDescription("hi!");
        xYSeries27.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj37 = xYSeries27.clone();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int48 = xYSeries39.getMaximumItemCount();
        xYSeries39.add((double) 100, (java.lang.Number) 0.0d);
        boolean boolean52 = xYSeries27.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries27.getDataItem((int) (short) 0);
        xYSeries22.add(xYDataItem54);
        xYSeries22.setDescription("hi!");
        xYSeries22.add(10.0d, 0.0d, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.util.List list18 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries23.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        xYSeries1.add((double) 3, (java.lang.Number) 100L);
        int int13 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 32, false);
        xYSeries2.add((double) (byte) 10, (double) (-1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Object obj8 = xYSeries1.clone();
        xYSeries1.add((double) 1, (double) 100L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries17.addOrUpdate(0.0d, (double) 0.0f);
        java.lang.Comparable comparable23 = xYSeries17.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 0 + "'", comparable23, (short) 0);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener7);
        xYSeries3.delete(2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        int int7 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((java.lang.Number) (short) 100);
        java.lang.Object obj10 = xYSeries1.clone();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((double) (byte) 10, (double) (short) 10);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.add((-1.0d), (double) (-1L), true);
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) (-3), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 0);
        boolean boolean9 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        int int9 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        boolean boolean13 = xYSeries1.getNotify();
        java.util.List list14 = xYSeries1.getItems();
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (byte) 100, false);
        xYSeries1.delete((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 1);
        boolean boolean19 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number15 = xYSeries1.getY(2);
        boolean boolean16 = xYSeries1.getAutoSort();
        int int18 = xYSeries1.indexOf((java.lang.Number) 1L);
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        int int8 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        int int12 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        xYSeries14.add((double) 'a', (java.lang.Number) 10.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number32 = xYSeries22.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries22.removeChangeListener(seriesChangeListener33);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries36.setDescription("");
        xYSeries36.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        xYSeries46.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str51 = xYSeries50.getDescription();
        org.jfree.data.xy.XYSeries xYSeries54 = xYSeries50.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean59 = xYSeries58.isEmpty();
        xYSeries58.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries58.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener67);
        boolean boolean69 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries58.remove((int) (short) 0);
        xYSeries56.add(xYDataItem71, false);
        xYSeries50.add(xYDataItem71, true);
        xYSeries46.add(xYDataItem71);
        xYSeries36.add(xYDataItem71);
        xYSeries22.add(xYDataItem71, false);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false, false);
        xYSeries14.add(xYDataItem71);
        xYSeries1.add(xYDataItem71);
        xYSeries1.add((java.lang.Number) 5, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (short) 1 + "'", number32, (short) 1);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(xYSeries54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        xYSeries17.setDescription("");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false);
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
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.Object obj40 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries1.remove((int) (byte) 0);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (short) 1, true);
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener3);
        java.util.List list5 = xYSeries2.getItems();
        xYSeries2.setMaximumItemCount((int) '#');
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        int int9 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 100.0f);
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNull(xYDataItem45);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        boolean boolean22 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = null; // flaky: xYSeries1.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (short) 10, (double) 10);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        xYSeries14.clear();
        java.lang.Comparable comparable17 = xYSeries14.getKey();
        double[][] doubleArray18 = xYSeries14.toArray();
        xYSeries14.add((double) ' ', (double) (byte) 100, true);
        java.lang.String str23 = xYSeries14.getDescription();
        double[][] doubleArray24 = xYSeries14.toArray();
        int int26 = xYSeries14.indexOf((java.lang.Number) (short) 100);
        xYSeries14.delete((int) 'a', 35);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries14.remove((java.lang.Number) 32);
        xYSeries1.add(xYDataItem31, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 100 + "'", comparable17, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        boolean boolean94 = xYSeries1.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, false, false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        xYSeries54.fireSeriesChanged();
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        boolean boolean9 = xYSeries7.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) xYSeries7);
        int int13 = xYSeries7.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries7.updateByIndex((int) (short) 10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries2.addChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.lang.String str53 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries56 = xYSeries1.createCopy(2147483647, 0);
        java.lang.Comparable comparable57 = xYSeries56.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(xYSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (byte) 100 + "'", comparable57, (byte) 100);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        boolean boolean81 = xYSeries80.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        xYSeries1.delete((int) (short) 100, 0);
        xYSeries1.add((-1.0d), (java.lang.Number) 1L);
        boolean boolean18 = xYSeries1.isEmpty();
        boolean boolean19 = xYSeries1.getAutoSort();
        java.lang.Object obj20 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.beans.PropertyChangeListener propertyChangeListener84 = null;
        xYSeries83.addPropertyChangeListener(propertyChangeListener84);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries83.update((java.lang.Number) (byte) 10, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
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
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        xYSeries1.add((double) (-3), (double) 5);
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
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        double[][] doubleArray8 = xYSeries1.toArray();
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) 0.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries13.clear();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener15);
        int int17 = xYSeries13.getItemCount();
        java.lang.Number number19 = null;
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries13.addOrUpdate((java.lang.Number) 2, number19);
        xYSeries13.add((double) (byte) 0, (double) (-1.0f), false);
        boolean boolean25 = xYSeries13.getAllowDuplicateXValues();
        boolean boolean26 = xYSeries3.equals((java.lang.Object) xYSeries13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        xYSeries1.add((double) (short) 10, 0.0d, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries21.createCopy((int) (byte) 1, 10);
        xYSeries25.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries25.addChangeListener(seriesChangeListener30);
        java.lang.Comparable comparable32 = xYSeries25.getKey();
        boolean boolean33 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        xYSeries39.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries39.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean47 = xYSeries39.isEmpty();
        xYSeries39.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 1);
        xYSeries25.setKey((java.lang.Comparable) xYDataItem52);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, false, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (byte) 100 + "'", comparable32, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        xYSeries51.add((double) 0.0f, (java.lang.Number) (byte) 10);
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
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
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        int int16 = xYSeries1.indexOf((java.lang.Number) 0);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries1.addChangeListener(seriesChangeListener24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries5.createCopy(5, 0);
        xYSeries5.add((java.lang.Number) 35, (java.lang.Number) (byte) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries5.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = xYSeries3.getDescription();
        xYSeries3.setMaximumItemCount(35);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate(52.0d, (double) (byte) 10);
        xYSeries3.delete((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.setKey((java.lang.Comparable) (-1.0d));
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        int int13 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        boolean boolean12 = xYSeries1.getNotify();
        xYSeries1.add((double) 35, (java.lang.Number) 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = null; // flaky: xYSeries1.remove((java.lang.Number) 3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = xYSeries17.getAutoSort();
        int int29 = xYSeries17.getItemCount();
        java.lang.String str30 = xYSeries17.getDescription();
        java.lang.Number number32 = xYSeries17.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries34.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries34.add(xYDataItem53);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries1.add(xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (byte) -1 + "'", number32, (byte) -1);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        xYSeries2.add((double) 0, (java.lang.Number) 4);
        xYSeries2.add((double) (-1.0f), (double) (byte) -1, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.setNotify(false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) 10L, false);
        double[][] doubleArray7 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) (byte) 10, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) (byte) 0, true);
        xYSeries1.fireSeriesChanged();
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
            xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        boolean boolean32 = xYSeries1.isEmpty();
        java.lang.Comparable comparable33 = xYSeries1.getKey();
        java.util.List list34 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (byte) 100 + "'", comparable33, (byte) 100);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        xYSeries5.add((double) 10, (double) 32);
        java.lang.Object obj45 = xYSeries5.clone();
        java.lang.String str46 = xYSeries5.getDescription();
        boolean boolean47 = xYSeries5.getAutoSort();
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
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setNotify(true);
        java.lang.Comparable comparable8 = xYSeries5.getKey();
        xYSeries5.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        int int75 = xYSeries71.getMaximumItemCount();
        java.lang.Object obj76 = xYSeries71.clone();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 10, false);
        xYSeries1.add(0.0d, (double) 2147483647, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        java.lang.Object obj25 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number22 = xYSeries12.getX(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries12.addChangeListener(seriesChangeListener23);
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
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean55 = xYSeries54.isEmpty();
        java.lang.Object obj56 = xYSeries54.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries54.addChangeListener(seriesChangeListener57);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean65 = xYSeries64.isEmpty();
        xYSeries64.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries64.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries64.remove((int) (short) 0);
        xYSeries62.add(xYDataItem77);
        xYSeries54.add(xYDataItem77);
        xYSeries52.setKey((java.lang.Comparable) xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true);
        xYSeries12.add(xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77);
        xYSeries1.add(xYDataItem77, true);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (short) 1 + "'", number22, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.lang.Object obj4 = xYSeries1.clone();
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (-1.0d));
        xYSeries1.setMaximumItemCount((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries3.add((double) '4', (java.lang.Number) 10.0f, true);
        xYSeries3.setNotify(true);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) 1.0f, 0.0d);
        xYSeries1.add((double) (short) 10, (double) 100L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = null; // flaky: xYSeries1.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        boolean boolean16 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        int int9 = xYSeries2.getMaximumItemCount();
        boolean boolean10 = xYSeries2.getAutoSort();
        double[][] doubleArray11 = xYSeries2.toArray();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        int int4 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj5 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Number number12 = xYSeries1.getY((int) (byte) 0);
        java.lang.String str13 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0d + "'", number12, 10.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries34.addOrUpdate((double) (-1), (double) '4');
        int int38 = xYSeries34.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 0, (int) '4');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.delete(32, 3);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries21.clear();
        xYSeries21.setKey((java.lang.Comparable) '#');
        boolean boolean25 = xYSeries21.getAllowDuplicateXValues();
        xYSeries21.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        xYSeries31.clear();
        java.lang.Comparable comparable34 = xYSeries31.getKey();
        double[][] doubleArray35 = xYSeries31.toArray();
        int int36 = xYSeries31.getMaximumItemCount();
        xYSeries31.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean40 = xYSeries21.equals((java.lang.Object) xYSeries31);
        java.lang.String str41 = xYSeries31.getDescription();
        java.util.List list42 = xYSeries31.getItems();
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries44.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str49 = xYSeries48.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries48.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean55 = xYSeries54.isEmpty();
        xYSeries54.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries54.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener63);
        boolean boolean65 = xYSeries54.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries54.remove((int) (short) 0);
        xYSeries48.add(xYDataItem67);
        xYSeries44.setKey((java.lang.Comparable) xYDataItem67);
        xYSeries31.add(xYDataItem67);
        xYSeries1.add(xYDataItem67, true);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (byte) 100 + "'", comparable34, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(xYDataItem52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        boolean boolean14 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        java.lang.Comparable comparable42 = xYSeries40.getKey();
        xYSeries40.add(0.0d, (double) '4');
        xYSeries40.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries40.setMaximumItemCount((int) '#');
        int int51 = xYSeries40.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries40.addChangeListener(seriesChangeListener52);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean56 = xYSeries55.isEmpty();
        xYSeries55.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries55.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int64 = xYSeries55.getMaximumItemCount();
        xYSeries55.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj69 = xYSeries55.clone();
        xYSeries55.clear();
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
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem92);
        xYSeries55.add(xYDataItem92);
        xYSeries40.add(xYDataItem92, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem92);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (byte) 100 + "'", comparable42, (byte) 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(xYSeries76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(xYDataItem92);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setNotify(true);
        boolean boolean6 = xYSeries1.getNotify();
        int int8 = xYSeries1.indexOf((java.lang.Number) 2);
        int int9 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.setKey((java.lang.Comparable) '#');
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 100.0f, 10.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries3.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        xYSeries10.add((double) (short) 0, (java.lang.Number) 10L, false);
        int int16 = xYSeries10.indexOf((java.lang.Number) 1);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        xYSeries1.updateByIndex(0, (java.lang.Number) 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        xYSeries6.add((java.lang.Number) 10.0f, (java.lang.Number) 4, false);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries6.createCopy((int) (short) 1, (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries6.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = null; // flaky: xYSeries1.remove((java.lang.Number) 3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.add(0.0d, (double) 0L, true);
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        java.lang.Object obj17 = xYSeries15.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries15.removeChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries15.addChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.addChangeListener(seriesChangeListener32);
        xYSeries23.fireSeriesChanged();
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
        xYSeries23.add(xYDataItem80, false);
        xYSeries15.add(xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true);
        xYSeries1.add(xYDataItem80);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        int int21 = xYSeries19.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries19.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries19.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        java.lang.Comparable comparable28 = xYSeries19.getKey();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        java.lang.Object obj34 = xYSeries32.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries32.addChangeListener(seriesChangeListener35);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        xYSeries42.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries42.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries42.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries42.remove((int) (short) 0);
        xYSeries40.add(xYDataItem55);
        xYSeries32.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str60 = xYSeries59.getDescription();
        org.jfree.data.xy.XYSeries xYSeries63 = xYSeries59.createCopy((int) (byte) 1, 10);
        int int64 = xYSeries59.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        boolean boolean77 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries66.remove((int) (short) 0);
        xYSeries59.add(xYDataItem79);
        xYSeries32.add(xYDataItem79, false);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem79);
        xYSeries1.add(xYDataItem79);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (byte) 100 + "'", comparable28, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.addOrUpdate((double) (byte) 10, (double) (byte) 10);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        int int44 = xYSeries42.indexOf((java.lang.Number) 10.0d);
        java.util.List list45 = xYSeries42.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) (-1.0d), true);
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
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        xYSeries1.add((double) (short) 10, (java.lang.Number) 100, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, false, true);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) (-1.0d));
        java.lang.String str20 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        double[][] doubleArray23 = xYSeries22.toArray();
        boolean boolean24 = xYSeries1.equals((java.lang.Object) xYSeries22);
        boolean boolean25 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        double[][] doubleArray38 = xYSeries27.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries27.removeChangeListener(seriesChangeListener39);
        double[][] doubleArray41 = xYSeries27.toArray();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries27.createCopy((int) (short) 100, 1);
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
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, true);
        xYSeries44.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false, true);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67);
        xYSeries1.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        java.lang.Object obj23 = xYSeries1.clone();
        java.lang.Comparable comparable24 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries28.clear();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener30);
        java.util.List list32 = xYSeries28.getItems();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries34.createCopy((int) (byte) 1, 10);
        xYSeries38.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.remove((int) (short) 0);
        xYSeries48.add(xYDataItem63, false);
        xYSeries42.add(xYDataItem63, true);
        xYSeries38.add(xYDataItem63);
        xYSeries28.add(xYDataItem63, false);
        xYSeries1.add(xYDataItem63, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        boolean boolean12 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 0.0f, true);
        java.lang.Object obj17 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        java.lang.Comparable comparable20 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) 100 + "'", comparable20, (byte) 100);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries5.getKey();
        boolean boolean13 = xYSeries5.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number29 = xYSeries15.getY(2);
        java.util.List list30 = xYSeries15.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries15.getDataItem((int) (byte) 1);
        xYSeries5.setKey((java.lang.Comparable) xYDataItem32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (-1.0d) + "'", number29, (-1.0d));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str6 = xYSeries5.getDescription();
        xYSeries5.clear();
        xYSeries5.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries5.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int15 = xYSeries5.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries29.setDescription("");
        xYSeries29.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        xYSeries39.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str44 = xYSeries43.getDescription();
        org.jfree.data.xy.XYSeries xYSeries47 = xYSeries43.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        boolean boolean62 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries51.remove((int) (short) 0);
        xYSeries49.add(xYDataItem64, false);
        xYSeries43.add(xYDataItem64, true);
        xYSeries39.add(xYDataItem64);
        xYSeries29.add(xYDataItem64);
        boolean boolean71 = xYSeries17.equals((java.lang.Object) xYDataItem64);
        xYSeries5.add(xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        xYSeries1.add(xYDataItem64);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(xYSeries47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries45.createCopy(5, 35);
        boolean boolean53 = xYSeries52.getNotify();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        xYSeries3.add(10.0d, (double) (byte) 10);
        xYSeries3.add((java.lang.Number) (byte) 100, (java.lang.Number) 100.0d, false);
        boolean boolean13 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) (byte) 100, (double) (short) 1);
        xYSeries1.setMaximumItemCount((int) ' ');
        boolean boolean16 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.clear();
        xYSeries18.add(0.0d, (double) (short) 10, false);
        java.util.List list25 = xYSeries18.getItems();
        int int26 = xYSeries18.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.setMaximumItemCount((int) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries18.getDataItem(0);
        xYSeries1.add(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Object obj8 = xYSeries1.clone();
        int int9 = xYSeries1.getItemCount();
        java.lang.Object obj10 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(0, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.setDescription("hi!");
        int int11 = xYSeries1.indexOf((java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 100.0f);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.String str14 = xYSeries1.getDescription();
        xYSeries1.setMaximumItemCount(3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.Comparable comparable96 = xYSeries95.getKey();
        java.beans.PropertyChangeListener propertyChangeListener97 = null;
        xYSeries95.addPropertyChangeListener(propertyChangeListener97);
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
        org.junit.Assert.assertNotNull(comparable96);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        xYSeries1.add((double) 1.0f, (double) 100.0f, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries24.createCopy((int) (short) -1, 10);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener28);
        xYSeries24.delete(2, (int) (byte) 1);
        boolean boolean33 = xYSeries1.equals((java.lang.Object) 2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries1.removeChangeListener(seriesChangeListener34);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, true);
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
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 100, false);
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 4, number15);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        boolean boolean95 = xYSeries17.getAllowDuplicateXValues();
        xYSeries17.add((double) '4', (double) (byte) 0);
        java.lang.String str99 = xYSeries17.getDescription();
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries12.setDescription("");
        xYSeries12.setDescription("hi!");
        xYSeries12.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) 0);
        xYSeries12.delete((int) 'a', 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) ' ', 10);
        xYSeries14.add((double) (-2), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries14.createCopy(3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries14.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.Number number11 = xYSeries1.getY(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10.0d + "'", number11, 10.0d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
            xYSeries3.update((java.lang.Number) 1.0f, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean18 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.removeChangeListener(seriesChangeListener19);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 32);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        xYSeries3.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries10.createCopy((int) (byte) 1, 10);
        int int15 = xYSeries10.getMaximumItemCount();
        double[][] doubleArray16 = xYSeries10.toArray();
        double[][] doubleArray17 = xYSeries10.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries10.removeChangeListener(seriesChangeListener18);
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
        xYSeries10.setKey((java.lang.Comparable) xYDataItem65);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem65);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
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
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries14.clear();
        xYSeries14.setKey((java.lang.Comparable) '#');
        boolean boolean18 = xYSeries14.getAllowDuplicateXValues();
        xYSeries14.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        xYSeries24.clear();
        java.lang.Comparable comparable27 = xYSeries24.getKey();
        double[][] doubleArray28 = xYSeries24.toArray();
        int int29 = xYSeries24.getMaximumItemCount();
        xYSeries24.add((double) 2147483647, (java.lang.Number) (byte) 10);
        boolean boolean33 = xYSeries14.equals((java.lang.Object) xYSeries24);
        java.lang.String str34 = xYSeries24.getDescription();
        java.util.List list35 = xYSeries24.getItems();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries37.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries41.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries41.add(xYDataItem60);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries24.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, false, false);
        xYSeries1.add(xYDataItem60, true);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, true, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) 100 + "'", comparable27, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries1.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        xYSeries1.clear();
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
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        xYSeries5.add((double) 3, (java.lang.Number) 5, false);
        xYSeries5.setNotify(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        double[][] doubleArray51 = xYSeries17.toArray();
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
        org.junit.Assert.assertNotNull(doubleArray51);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        xYSeries1.add(10.0d, (double) (-1));
        xYSeries1.clear();
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries27.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 100 + "'", comparable15, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xYSeries27);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        xYSeries18.setMaximumItemCount((int) (short) 1);
        boolean boolean37 = xYSeries18.getAutoSort();
        xYSeries18.setDescription("hi!");
        xYSeries18.add((java.lang.Number) (byte) 100, (java.lang.Number) (byte) 0, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries1.setNotify(true);
        java.lang.Number number16 = xYSeries1.getX((int) (short) 0);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (byte) 10, 1);
        xYSeries6.add((double) (short) 10, (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int37 = xYSeries28.getMaximumItemCount();
        xYSeries28.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries28.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries28.add((double) 100L, (java.lang.Number) 10.0d);
        int int48 = xYSeries28.indexOf((java.lang.Number) (short) 100);
        boolean boolean49 = xYSeries26.equals((java.lang.Object) int48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        xYSeries11.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries11.add((double) (short) 1, (java.lang.Number) (byte) 1);
        boolean boolean19 = xYSeries1.equals((java.lang.Object) (byte) 1);
        xYSeries1.delete((int) (short) 1, (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        java.lang.Object obj11 = xYSeries3.clone();
        java.util.List list12 = xYSeries3.getItems();
        boolean boolean13 = xYSeries3.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        boolean boolean19 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries24.setDescription("");
        xYSeries24.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str31 = xYSeries30.getDescription();
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries30.createCopy((int) (byte) 1, 10);
        xYSeries34.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str39 = xYSeries38.getDescription();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries38.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean47 = xYSeries46.isEmpty();
        xYSeries46.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries46.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener55);
        boolean boolean57 = xYSeries46.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries46.remove((int) (short) 0);
        xYSeries44.add(xYDataItem59, false);
        xYSeries38.add(xYDataItem59, true);
        xYSeries34.add(xYDataItem59);
        xYSeries24.add(xYDataItem59);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem59);
        xYSeries1.add(xYDataItem59, false);
        xYSeries1.setNotify(false);
        xYSeries1.setDescription("");
        xYSeries1.delete(2147483647, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(xYDataItem59);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        java.lang.String str4 = xYSeries2.getDescription();
        java.lang.Comparable comparable5 = xYSeries2.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries7.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        xYSeries13.add(xYDataItem28, false);
        xYSeries7.add(xYDataItem28, true);
        java.util.List list33 = xYSeries7.getItems();
        boolean boolean34 = xYSeries7.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries7.remove(0);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries37.fireSeriesChanged();
        java.lang.String str39 = xYSeries37.getDescription();
        boolean boolean40 = xYSeries37.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.remove((int) (short) 0);
        xYSeries48.add(xYDataItem63, false);
        xYSeries42.add(xYDataItem63, true);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem63);
        xYSeries2.add(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-1.0d) + "'", comparable5, (-1.0d));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.lang.Object obj23 = xYSeries1.clone();
        java.lang.Comparable comparable24 = xYSeries1.getKey();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries1.addOrUpdate((-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem28);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
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
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, true);
        xYSeries3.add((-1.0d), (java.lang.Number) (byte) 0, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, false);
        java.lang.Object obj13 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries3.createCopy((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.update((java.lang.Number) 10.0d, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.update((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 0);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries1.toArray();
        java.util.List list17 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.updateByIndex((int) (short) 1, (java.lang.Number) 10L);
        java.util.List list16 = xYSeries5.getItems();
        int int17 = xYSeries5.getMaximumItemCount();
        xYSeries5.add((double) (short) 0, 0.0d, true);
        java.lang.String str22 = xYSeries5.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) 10L, false);
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 2147483647);
        xYSeries1.setNotify(true);
        double[][] doubleArray18 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.setMaximumItemCount((int) '#');
        int int12 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries24.createCopy(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries27);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 10.0f);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener28);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 100 + "'", comparable15, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(xYDataItem27);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(0.0d, 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 100, (-1.0d), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (byte) 1, (-1));
        xYSeries3.clear();
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        java.lang.Object obj23 = xYSeries1.clone();
        java.lang.Comparable comparable24 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        int int6 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray7 = xYSeries1.toArray();
        double[][] doubleArray8 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        xYSeries43.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries43.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener52);
        boolean boolean54 = xYSeries43.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries43.remove((int) (short) 0);
        xYSeries41.add(xYDataItem56, false);
        xYSeries35.add(xYDataItem56, true);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, true);
        xYSeries12.setKey((java.lang.Comparable) xYDataItem56);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem56);
        double[][] doubleArray65 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(4, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNotNull(doubleArray65);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        java.lang.Object obj7 = xYSeries5.clone();
        boolean boolean8 = xYSeries3.equals(obj7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        boolean boolean11 = xYSeries3.getNotify();
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) 52.0d, (java.lang.Number) 100L, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        boolean boolean15 = xYSeries1.getNotify();
        xYSeries1.add((double) 10L, (double) (-1.0f), true);
        xYSeries1.add((double) 1L, (java.lang.Number) (byte) 0, false);
        xYSeries1.clear();
        int int25 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries27.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries39.setDescription("");
        xYSeries39.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries39.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str52 = xYSeries51.getDescription();
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries51.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean60 = xYSeries59.isEmpty();
        xYSeries59.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries59.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries59.remove((int) (short) 0);
        xYSeries57.add(xYDataItem72, false);
        xYSeries51.add(xYDataItem72, true);
        java.util.List list77 = xYSeries51.getItems();
        boolean boolean78 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries51.remove(0);
        xYSeries39.add(xYDataItem80, false);
        xYSeries27.add(xYDataItem80, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, true);
        xYSeries26.add((double) 10.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries54.createCopy((int) (short) 0, 100);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries54.addOrUpdate((double) (byte) 0, (double) 0);
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
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertNull(xYDataItem60);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj11 = xYSeries1.clone();
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        xYSeries19.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries19.add((java.lang.Number) 35, (java.lang.Number) (-1), true);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Comparable comparable18 = xYSeries14.getKey();
        int int19 = xYSeries14.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (short) 0);
        boolean boolean5 = xYSeries1.getAutoSort();
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setKey(comparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        boolean boolean91 = xYSeries90.isEmpty();
        xYSeries90.clear();
        xYSeries90.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        double[][] doubleArray22 = xYSeries11.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries11.removeChangeListener(seriesChangeListener23);
        double[][] doubleArray25 = xYSeries11.toArray();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries11.createCopy((int) (short) 100, 1);
        boolean boolean29 = xYSeries28.getAllowDuplicateXValues();
        boolean boolean30 = xYSeries1.equals((java.lang.Object) xYSeries28);
        boolean boolean31 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean32 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.add((double) 35, (java.lang.Number) 5, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        java.lang.Number number13 = xYSeries1.getY((int) (byte) 1);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-2) + "'", number13, (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) (byte) 1, (double) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.getAutoSort();
        java.lang.Object obj15 = xYSeries13.clone();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries13.addOrUpdate((double) (short) 1, (double) 100L);
        int int19 = xYSeries13.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries13.remove((java.lang.Number) (short) 100);
        xYSeries1.add(xYDataItem21);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        java.util.List list5 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-2));
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 2147483647);
        xYSeries1.setNotify(true);
        java.util.List list18 = xYSeries1.getItems();
        java.lang.Object obj19 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries1.addChangeListener(seriesChangeListener55);
        xYSeries1.add((double) 100, (java.lang.Number) (-3));
        java.lang.Comparable comparable60 = xYSeries1.getKey();
        boolean boolean61 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + (byte) 100 + "'", comparable60, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove(2);
        int int18 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, true);
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
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
            java.lang.Number number41 = xYSeries5.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        xYSeries50.setKey((java.lang.Comparable) (byte) 100);
        xYSeries50.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries50.addOrUpdate((double) (byte) 0, (double) ' ');
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
        org.junit.Assert.assertNull(xYDataItem58);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.add(100.0d, (java.lang.Number) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.removeChangeListener(seriesChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int19 = xYSeries10.getMaximumItemCount();
        xYSeries10.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number24 = xYSeries10.getY(2);
        java.util.List list25 = xYSeries10.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries10.getDataItem((int) (byte) 1);
        xYSeries2.add(xYDataItem27, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (-1.0d) + "'", number24, (-1.0d));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.delete((int) (byte) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray32 = xYSeries1.toArray();
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
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, true);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        double[][] doubleArray96 = xYSeries95.toArray();
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
        org.junit.Assert.assertNotNull(doubleArray96);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        int int36 = xYSeries1.getItemCount();
        java.util.List list37 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number91 = xYSeries89.getX((int) (short) 10);
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
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        int int35 = xYSeries1.getItemCount();
        java.lang.Object obj36 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries35.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str6 = xYSeries5.getDescription();
        xYSeries5.clear();
        xYSeries5.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries5.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int15 = xYSeries5.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries17.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries29.setDescription("");
        xYSeries29.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        xYSeries39.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str44 = xYSeries43.getDescription();
        org.jfree.data.xy.XYSeries xYSeries47 = xYSeries43.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        boolean boolean62 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries51.remove((int) (short) 0);
        xYSeries49.add(xYDataItem64, false);
        xYSeries43.add(xYDataItem64, true);
        xYSeries39.add(xYDataItem64);
        xYSeries29.add(xYDataItem64);
        boolean boolean71 = xYSeries17.equals((java.lang.Object) xYDataItem64);
        xYSeries5.add(xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        xYSeries1.add(xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64, true, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(xYSeries47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.add((double) 100, (double) (-1L));
        java.lang.String str14 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) ' ', (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
            xYSeries3.updateByIndex(0, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        java.lang.Number number51 = null;
        xYSeries49.add(10.0d, number51, true);
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
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true);
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
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1), true, true);
        xYSeries3.add((double) 32, (double) 0, false);
        xYSeries3.setDescription("hi!");
        int int10 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        double[][] doubleArray60 = xYSeries57.toArray();
        java.lang.Class<?> wildcardClass61 = doubleArray60.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) 10);
        boolean boolean16 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int27 = xYSeries18.getMaximumItemCount();
        xYSeries18.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj32 = xYSeries18.clone();
        xYSeries18.clear();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        int int40 = xYSeries35.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        xYSeries42.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries42.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries42.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries42.remove((int) (short) 0);
        xYSeries35.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55);
        xYSeries18.add(xYDataItem55);
        xYSeries1.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true);
        java.lang.Number number63 = null;
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries61.addOrUpdate((java.lang.Number) 100.0f, number63);
        int int65 = xYSeries61.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(xYDataItem64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        java.lang.Object obj4 = xYSeries1.clone();
        java.lang.Object obj5 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries82.addOrUpdate((java.lang.Number) 10, (java.lang.Number) (byte) 10);
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
        org.junit.Assert.assertNotNull(xYDataItem79);
        org.junit.Assert.assertNull(xYDataItem85);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        boolean boolean8 = xYSeries1.getAutoSort();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        double[][] doubleArray14 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) 10.0d, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        double[][] doubleArray10 = xYSeries5.toArray();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener11);
        java.lang.Comparable comparable13 = xYSeries5.getKey();
        xYSeries5.add((double) 2147483647, (-1.0d));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 100 + "'", comparable13, (byte) 100);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        java.lang.Object obj16 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.addChangeListener(seriesChangeListener27);
        xYSeries18.add(100.0d, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (short) 1);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.removeChangeListener(seriesChangeListener3);
        java.util.List list5 = xYSeries2.getItems();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries2.createCopy((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (-2), (double) 100.0f);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.isEmpty();
        xYSeries17.add(100.0d, (java.lang.Number) 1L, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries26.setDescription("");
        xYSeries26.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str33 = xYSeries32.getDescription();
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries32.createCopy((int) (byte) 1, 10);
        xYSeries36.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str41 = xYSeries40.getDescription();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries40.createCopy((int) (byte) 1, 10);
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
        xYSeries40.add(xYDataItem61, true);
        xYSeries36.add(xYDataItem61);
        xYSeries26.add(xYDataItem61);
        xYSeries17.add(xYDataItem61);
        xYSeries1.add(xYDataItem61, true);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable72 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertEquals("'" + comparable72 + "' != '" + (byte) 100 + "'", comparable72, (byte) 100);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        boolean boolean84 = xYSeries3.equals((java.lang.Object) 10.0f);
        boolean boolean85 = xYSeries3.getNotify();
        java.lang.Number number86 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number86, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        xYSeries17.add((double) 1, (java.lang.Number) (byte) 1);
        double[][] doubleArray25 = xYSeries17.toArray();
        java.lang.Class<?> wildcardClass26 = xYSeries17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries5.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries5.getKey();
        boolean boolean13 = xYSeries5.getAutoSort();
        boolean boolean14 = xYSeries5.getAutoSort();
        int int16 = xYSeries5.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        java.lang.Object obj20 = xYSeries18.clone();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener21);
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0f);
        boolean boolean25 = xYSeries18.getAutoSort();
        boolean boolean26 = xYSeries5.equals((java.lang.Object) xYSeries18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        boolean boolean8 = xYSeries1.getNotify();
        int int9 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.setMaximumItemCount((int) '#');
        xYSeries1.setDescription("");
        int int10 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (double) 4, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.add((double) 1.0f, (double) 100L);
        java.lang.Number number8 = null;
        xYSeries3.add((java.lang.Number) 0.0d, number8);
        int int10 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(100);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean8 = xYSeries7.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries7.removeChangeListener(seriesChangeListener9);
        xYSeries7.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int24 = xYSeries15.getMaximumItemCount();
        xYSeries15.add((double) (byte) 100, (double) (-1.0f));
        java.lang.Number number29 = xYSeries15.getY(2);
        java.util.List list30 = xYSeries15.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries15.getDataItem((int) (byte) 1);
        xYSeries7.add(xYDataItem32, true);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32, true);
        xYSeries1.add(xYDataItem32);
        java.lang.Class<?> wildcardClass38 = xYDataItem32.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (-1.0d) + "'", number29, (-1.0d));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        int int15 = xYSeries1.getItemCount();
        boolean boolean16 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        boolean boolean20 = xYSeries18.isEmpty();
        boolean boolean21 = xYSeries18.getAllowDuplicateXValues();
        xYSeries18.setMaximumItemCount((int) (short) 100);
        int int25 = xYSeries18.indexOf((java.lang.Number) (-1L));
        int int27 = xYSeries18.indexOf((java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries18.createCopy(3, 10);
        xYSeries30.setDescription("");
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 100.0d);
        java.util.List list6 = xYSeries2.getItems();
        boolean boolean7 = xYSeries2.getNotify();
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        int int8 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 0.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries29.getY(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.delete((int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 32, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 32");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        int int8 = xYSeries3.indexOf((java.lang.Number) (byte) 10);
        xYSeries3.setNotify(false);
        int int12 = xYSeries3.indexOf((java.lang.Number) 52.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 1.0f, (java.lang.Number) 4, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10L, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        java.lang.Object obj20 = xYSeries3.clone();
        xYSeries3.delete(2, (-2));
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Object obj5 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        int int8 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        int int12 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate(number13, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        int int6 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean7 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.setDescription("");
        java.lang.Number number11 = xYSeries1.getY(0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.update((java.lang.Number) 0, (java.lang.Number) 0);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener23);
        xYSeries1.setNotify(false);
        xYSeries1.setMaximumItemCount(2147483647);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 1 + "'", number11, (byte) 1);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        java.lang.Object obj16 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 4, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#', true, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries3.getAutoSort();
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        xYSeries1.setNotify(true);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        xYSeries1.delete((int) (byte) 100, (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '4' + "'", comparable13, '4');
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        boolean boolean24 = xYSeries1.isEmpty();
        xYSeries1.delete((int) (short) 100, (-2));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        int int58 = xYSeries56.indexOf((java.lang.Number) 1.0f);
        xYSeries56.add((double) (short) 10, (double) 100, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        boolean boolean22 = xYSeries1.getNotify();
        java.lang.Number number24 = xYSeries1.getY(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((-1), (-3));
        boolean boolean16 = xYSeries15.isEmpty();
        boolean boolean17 = xYSeries15.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.String str5 = xYSeries1.getDescription();
        xYSeries1.add((double) 1, (double) (-1.0f));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries12.remove((int) (short) 0);
        xYSeries10.add(xYDataItem25, false);
        xYSeries1.add(xYDataItem25, true);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25);
        java.lang.Comparable comparable31 = xYSeries30.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(comparable31);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries89.addOrUpdate((double) 2147483647, (double) 100);
        boolean boolean93 = xYSeries89.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem96 = xYSeries89.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) (short) 0);
        java.lang.Comparable comparable97 = xYSeries89.getKey();
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
        org.junit.Assert.assertNull(xYDataItem92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(xYDataItem96);
        org.junit.Assert.assertNotNull(comparable97);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        java.util.List list50 = xYSeries24.getItems();
        boolean boolean51 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries24.remove(0);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries1.removeChangeListener(seriesChangeListener55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.String str5 = xYSeries1.getDescription();
        xYSeries1.setDescription("");
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.updateByIndex((int) (short) -1, number9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        boolean boolean42 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.util.List list14 = xYSeries1.getItems();
        xYSeries1.add(10.0d, (double) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy(35, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        int int7 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) (byte) -1, false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate(0.0d, (double) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries1.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate(0.0d, (double) (short) 0);
        boolean boolean18 = xYSeries1.getNotify();
        xYSeries1.add((double) 100, (java.lang.Number) (-1.0d), false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.add((double) 100L, (java.lang.Number) 10.0d);
        double[][] doubleArray20 = xYSeries1.toArray();
        double[][] doubleArray21 = xYSeries1.toArray();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        boolean boolean14 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        boolean boolean14 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 100, (double) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener18);
        java.lang.Comparable comparable20 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) 100 + "'", comparable20, (byte) 100);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries31.updateByIndex((int) (byte) -1, (java.lang.Number) 0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        java.util.List list28 = xYSeries23.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries23.addOrUpdate((double) 32, (double) 2147483647);
        boolean boolean32 = xYSeries23.getNotify();
        xYSeries23.add((java.lang.Number) (-3), (java.lang.Number) (short) 10, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries17.updateByIndex(0, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getNotify();
        java.lang.String str5 = xYSeries1.getDescription();
        int int7 = xYSeries1.indexOf((java.lang.Number) (-1.0d));
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (short) 1, (int) (byte) 100);
        double[][] doubleArray7 = xYSeries6.toArray();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        int int14 = xYSeries9.getMaximumItemCount();
        double[][] doubleArray15 = xYSeries9.toArray();
        double[][] doubleArray16 = xYSeries9.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries9.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries22.createCopy((int) (byte) 1, 10);
        int int27 = xYSeries22.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.remove((int) (short) 0);
        xYSeries22.add(xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42);
        xYSeries9.setKey((java.lang.Comparable) xYDataItem42);
        xYSeries6.add(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false, true);
        xYSeries3.add((double) (-1.0f), (java.lang.Number) (short) 1, false);
        int int9 = xYSeries3.indexOf((java.lang.Number) 100);
        int int10 = xYSeries3.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.addChangeListener(seriesChangeListener11);
        java.lang.Object obj13 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) 10);
        boolean boolean16 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int27 = xYSeries18.getMaximumItemCount();
        xYSeries18.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        java.lang.Object obj32 = xYSeries18.clone();
        xYSeries18.clear();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries35.createCopy((int) (byte) 1, 10);
        int int40 = xYSeries35.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean43 = xYSeries42.isEmpty();
        xYSeries42.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries42.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener51);
        boolean boolean53 = xYSeries42.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries42.remove((int) (short) 0);
        xYSeries35.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55);
        xYSeries18.add(xYDataItem55);
        xYSeries1.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true);
        int int65 = xYSeries63.indexOf((java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.delete((int) '4', (int) (byte) 10);
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1L, number11);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries11.addOrUpdate((double) (-1L), (double) (short) 10);
        xYSeries11.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, true);
        boolean boolean20 = xYSeries1.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        java.lang.Object obj4 = xYSeries1.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        java.util.List list17 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        xYSeries1.clear();
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
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        xYSeries51.fireSeriesChanged();
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
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Object obj6 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.lang.Object obj21 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = null; // flaky: xYSeries3.remove((java.lang.Number) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        boolean boolean13 = xYSeries5.isEmpty();
        xYSeries5.add((java.lang.Number) 0.0f, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries5.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem18, true);
        java.lang.Class<?> wildcardClass21 = xYDataItem18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries8.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries20.setDescription("");
        xYSeries20.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries20.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str33 = xYSeries32.getDescription();
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries32.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries38.add(xYDataItem53, false);
        xYSeries32.add(xYDataItem53, true);
        java.util.List list58 = xYSeries32.getItems();
        boolean boolean59 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries32.remove(0);
        xYSeries20.add(xYDataItem61, false);
        xYSeries8.add(xYDataItem61, false);
        xYSeries1.add(xYDataItem61, true);
        java.lang.Comparable comparable68 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertEquals("'" + comparable68 + "' != '" + (byte) 100 + "'", comparable68, (byte) 100);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 2147483647, (double) (byte) 0);
        xYSeries1.updateByIndex((int) (short) 1, (java.lang.Number) (-2));
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.addOrUpdate((double) 1L, (double) 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.delete(32, (int) (short) 1);
        java.lang.Object obj15 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.setDescription("");
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
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true, true);
        boolean boolean55 = xYSeries1.equals((java.lang.Object) xYDataItem45);
        java.lang.String str56 = xYSeries1.getDescription();
        java.lang.Object obj57 = xYSeries1.clone();
        boolean boolean58 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        xYSeries50.setKey((java.lang.Comparable) (byte) 100);
        java.lang.String str54 = xYSeries50.getDescription();
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
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) 'a', 0);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (-1));
        xYSeries14.add((java.lang.Number) 100.0f, (java.lang.Number) 4, true);
        boolean boolean19 = xYSeries14.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries3.createCopy((int) '4', 32);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
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
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        boolean boolean11 = xYSeries1.getNotify();
        int int12 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = xYSeries3.getDescription();
        int int8 = xYSeries3.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), true);
        xYSeries2.add((double) 100.0f, (double) 1, true);
        xYSeries2.add((double) '#', (double) (byte) 10);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        int int14 = xYSeries12.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries12.addOrUpdate((double) (byte) -1, (double) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries12);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        int int7 = xYSeries1.getItemCount();
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 1L, true);
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((double) (-1L), (double) (short) 10);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = xYSeries11.getAutoSort();
        int int23 = xYSeries11.getItemCount();
        java.lang.String str24 = xYSeries11.getDescription();
        java.lang.Number number26 = xYSeries11.getY((int) (short) 0);
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
        xYSeries11.setKey((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false, false);
        xYSeries1.add(xYDataItem47, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries1.removeChangeListener(seriesChangeListener57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (byte) -1 + "'", number26, (byte) -1);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        xYSeries1.updateByIndex(1, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries77 = null; // flaky: xYSeries1.createCopy((-2), 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.Number number10 = null;
        xYSeries1.updateByIndex(0, number10);
        java.lang.Object obj12 = xYSeries1.clone();
        boolean boolean13 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = xYSeries1.getNotify();
        xYSeries1.setMaximumItemCount((int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries11.addChangeListener(seriesChangeListener20);
        xYSeries11.add((double) (short) 1, (java.lang.Number) 1, true);
        xYSeries11.setDescription("hi!");
        xYSeries11.fireSeriesChanged();
        xYSeries11.add((double) 1L, (java.lang.Number) (-3), true);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries11.remove((java.lang.Number) 100L);
        xYSeries1.add(xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) 0);
        xYSeries1.clear();
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(0, (int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries14.addOrUpdate((double) 10L, (double) (-1L));
        java.lang.Number number19 = xYSeries14.getY((int) (byte) 0);
        xYSeries14.add((double) 4, (java.lang.Number) 35);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (-1.0d) + "'", number19, (-1.0d));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        double[][] doubleArray19 = xYSeries1.toArray();
        java.lang.Object obj20 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, false, false);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66);
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
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        int int14 = xYSeries12.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries12.addOrUpdate((double) (byte) -1, (double) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries12);
        int int22 = xYSeries1.indexOf((java.lang.Number) 52.0d);
        boolean boolean23 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        xYSeries3.add((double) 100, (double) (-1L));
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int8 = xYSeries1.indexOf((java.lang.Number) (-1L));
        int int10 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy(3, 10);
        xYSeries13.setDescription("");
        xYSeries13.add((double) (-1), (java.lang.Number) 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        boolean boolean7 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = null; // flaky: xYSeries3.remove((java.lang.Number) 100L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        int int17 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        int int21 = xYSeries1.indexOf((java.lang.Number) 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        int int11 = xYSeries3.indexOf((java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        int int15 = xYSeries13.getMaximumItemCount();
        boolean boolean16 = xYSeries13.getAutoSort();
        xYSeries13.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries13.removeChangeListener(seriesChangeListener19);
        int int21 = xYSeries13.getMaximumItemCount();
        java.lang.String str22 = xYSeries13.getDescription();
        int int23 = xYSeries13.getItemCount();
        int int24 = xYSeries13.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str27 = xYSeries26.getDescription();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries26.createCopy((int) (byte) 1, 10);
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
        xYSeries26.add(xYDataItem47, true);
        java.util.List list52 = xYSeries26.getItems();
        boolean boolean53 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries26.remove(0);
        xYSeries13.add(xYDataItem55);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.removeChangeListener(seriesChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries1.removeChangeListener(seriesChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.getDataItem(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.setKey((java.lang.Comparable) (-1.0d));
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries1.delete((-2), 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setNotify(true);
        boolean boolean12 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        boolean boolean5 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = xYSeries7.getAutoSort();
        int int19 = xYSeries7.getItemCount();
        java.lang.String str20 = xYSeries7.getDescription();
        java.lang.Number number22 = xYSeries7.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries24.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries24.add(xYDataItem43);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem43);
        xYSeries1.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (byte) -1 + "'", number22, (byte) -1);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        java.lang.String str53 = xYSeries1.getDescription();
        xYSeries1.setNotify(false);
        boolean boolean56 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries29.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
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
        org.junit.Assert.assertNull(xYDataItem40);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy(5, (int) (byte) -1);
        xYSeries1.add(1.0d, (java.lang.Number) (short) -1, false);
        boolean boolean9 = xYSeries1.isEmpty();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.addOrUpdate((double) (short) 0, (double) 0L);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        double[][] doubleArray16 = xYSeries1.toArray();
        java.lang.Object obj17 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2147483647, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries3.clear();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, true);
        org.jfree.data.xy.XYSeries xYSeries96 = xYSeries93.createCopy((-3), 5);
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
        org.junit.Assert.assertNotNull(xYSeries96);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (short) -1, 10);
        int int8 = xYSeries3.indexOf((java.lang.Number) (byte) 10);
        xYSeries3.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) 32, (java.lang.Number) (byte) -1);
        int int14 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries3.delete((int) (byte) -1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true);
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
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 100 + "'", comparable6, (byte) 100);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        xYSeries17.setMaximumItemCount(1);
        boolean boolean57 = xYSeries17.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        boolean boolean52 = xYSeries50.getAutoSort();
        xYSeries50.add(1.0d, (java.lang.Number) 32);
        xYSeries50.setDescription("");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) '4');
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 35, true);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 100 + "'", comparable7, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, false, false);
        boolean boolean96 = xYSeries95.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries17.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true);
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
        org.junit.Assert.assertNotNull(xYDataItem93);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        int int53 = xYSeries52.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        xYSeries54.add((double) (short) -1, (double) '4');
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries21.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        xYSeries35.add((double) (byte) 1, (double) 2147483647, false);
        xYSeries35.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries35.remove(0);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false);
        xYSeries6.add(xYDataItem42);
        xYSeries6.delete(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        xYSeries3.add((double) ' ', (java.lang.Number) (-1.0f), false);
        java.lang.Number number20 = xYSeries3.getX(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100.0d + "'", comparable14, 100.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 2 + "'", number20, 2);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) 0.0f, (double) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries1.removeChangeListener(seriesChangeListener26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = xYSeries1.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        int int29 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries1.addChangeListener(seriesChangeListener30);
        int int33 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        int int35 = xYSeries1.indexOf((java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }
}
