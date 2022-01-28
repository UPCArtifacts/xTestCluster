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
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.String str3 = xYSeries1.getDescription();
        java.lang.Object obj4 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (short) 0, (java.lang.Number) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        xYSeries11.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries11.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener20);
        xYSeries11.setKey((java.lang.Comparable) 100);
        xYSeries11.delete((int) (short) 100, 0);
        java.lang.String str27 = xYSeries11.getDescription();
        boolean boolean28 = xYSeries11.getAutoSort();
        xYSeries11.add((java.lang.Number) (-1L), (java.lang.Number) (-1.0d), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries11.addChangeListener(seriesChangeListener33);
        xYSeries11.add((double) (short) 100, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        java.lang.Object obj41 = xYSeries39.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries39.addChangeListener(seriesChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str46 = xYSeries45.getDescription();
        xYSeries45.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.remove((int) (short) 0);
        xYSeries45.add(xYDataItem63);
        xYSeries39.add(xYDataItem63);
        xYSeries11.add(xYDataItem63);
        xYSeries1.add(xYDataItem63, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        xYSeries1.setMaximumItemCount(3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries5.getDataItem(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries5.removeChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries5.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries15.clear();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) xYSeries15);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries1.createCopy((int) (byte) -1, (int) 'a');
        boolean boolean26 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) 10L);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.setMaximumItemCount(3);
        org.junit.Assert.assertNotNull(xYDataItem10);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.setMaximumItemCount(10);
        xYSeries1.delete(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean15 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries19.add(1.0d, 0.0d);
        boolean boolean23 = xYSeries19.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries25.clear();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries25.add(xYDataItem62);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.add(xYDataItem62, false);
        xYSeries1.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, true);
        java.lang.String str74 = xYSeries73.getDescription();
        xYSeries73.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries73.update((java.lang.Number) (byte) 100, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        xYSeries15.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        xYSeries15.add(xYDataItem40);
        xYSeries1.add(xYDataItem40);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number60 = xYSeries50.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.addOrUpdate(100.0d, (double) 0L);
        java.lang.Object obj64 = xYSeries50.clone();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries50.getDataItem(0);
        xYSeries1.add(xYDataItem66);
        java.lang.Class<?> wildcardClass68 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + number60 + "' != '" + (short) 1 + "'", number60, (short) 1);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries21.remove((int) (short) 0);
        xYSeries19.add(xYDataItem34, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, false, false);
        java.lang.Object obj41 = xYSeries40.clone();
        xYSeries40.add((double) 100, (double) (byte) 10, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 100 + "'", comparable17, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean14 = xYSeries1.isEmpty();
        boolean boolean15 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries15.clear();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) xYSeries15);
        xYSeries1.setMaximumItemCount(0);
        java.util.List list20 = xYSeries1.getItems();
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean4 = xYSeries3.isEmpty();
        int int5 = xYSeries3.getMaximumItemCount();
        boolean boolean6 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) (short) 10);
        xYSeries1.add((double) 1.0f, (java.lang.Number) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((double) 100.0f, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        xYSeries23.clear();
        xYSeries23.add(0.0d, (double) (short) 10, false);
        java.util.List list30 = xYSeries23.getItems();
        int int31 = xYSeries23.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.removeChangeListener(seriesChangeListener32);
        int int35 = xYSeries23.indexOf((java.lang.Number) (short) 100);
        boolean boolean36 = xYSeries23.getAllowDuplicateXValues();
        java.lang.String str37 = xYSeries23.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries23.removeChangeListener(seriesChangeListener38);
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
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries41.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean70 = xYSeries41.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener71);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean75 = xYSeries74.isEmpty();
        xYSeries74.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list80 = xYSeries74.getItems();
        boolean boolean81 = xYSeries41.equals((java.lang.Object) xYSeries74);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries41.addOrUpdate((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem86 = xYSeries41.remove((java.lang.Number) 0.0d);
        xYSeries23.add(xYDataItem86, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, true, false);
        boolean boolean92 = xYSeries1.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNull(xYDataItem69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertNotNull(xYDataItem86);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false);
        xYSeries2.setMaximumItemCount(0);
        xYSeries2.setMaximumItemCount(2);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) 2147483647, (double) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        int int17 = xYSeries15.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.delete(1, (-2));
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        int int29 = xYSeries24.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries24.add(xYDataItem44);
        xYSeries15.add(xYDataItem44, true);
        xYSeries1.add(xYDataItem44, false);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        xYSeries1.add((double) (-1L), (double) (-1L), true);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list36 = xYSeries30.getItems();
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
        xYSeries30.add(xYDataItem67);
        xYSeries1.add(xYDataItem67, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        xYSeries8.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries8.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener17);
        xYSeries8.setKey((java.lang.Comparable) 100);
        boolean boolean21 = xYSeries8.isEmpty();
        boolean boolean22 = xYSeries1.equals((java.lang.Object) boolean21);
        boolean boolean23 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        xYSeries25.clear();
        xYSeries25.add(0.0d, (double) (short) 10, false);
        java.lang.Number number33 = xYSeries25.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str36 = xYSeries35.getDescription();
        xYSeries35.clear();
        xYSeries35.add(0.0d, (double) (short) 10, false);
        java.util.List list42 = xYSeries35.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries35.getDataItem((int) (byte) 0);
        xYSeries25.setKey((java.lang.Comparable) xYDataItem44);
        xYSeries1.add(xYDataItem44);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) ' ', (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 10.0d + "'", number33, 10.0d);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        xYSeries1.add((double) (short) -1, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = null; // flaky: xYSeries1.remove((java.lang.Number) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) 10.0d);
        java.lang.Number number40 = xYSeries5.getX((int) (byte) 0);
        boolean boolean41 = xYSeries5.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + (-1) + "'", number40, (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        xYSeries1.add((-1.0d), (java.lang.Number) 100, false);
        boolean boolean12 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((-1.0d), (double) (-2));
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) 0.0d);
        xYSeries1.add(10.0d, (java.lang.Number) 1.0f, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        double[][] doubleArray22 = xYSeries21.toArray();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        xYSeries28.setNotify(true);
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
        xYSeries28.add(xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, false);
        xYSeries21.add(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean10 = xYSeries1.isEmpty();
        int int12 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.clear();
        int int17 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        xYSeries13.setKey((java.lang.Comparable) 100);
        java.lang.Number number27 = xYSeries13.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        int int34 = xYSeries29.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries29.add(xYDataItem49);
        xYSeries13.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        boolean boolean54 = xYSeries1.equals((java.lang.Object) xYDataItem49);
        boolean boolean55 = xYSeries1.getAutoSort();
        java.lang.Comparable comparable56 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0d + "'", number27, 100.0d);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + comparable56 + "' != '" + (byte) 100 + "'", comparable56, (byte) 100);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener22);
        xYSeries13.setKey((java.lang.Comparable) 100);
        java.lang.Number number27 = xYSeries13.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        int int34 = xYSeries29.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries29.add(xYDataItem49);
        xYSeries13.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        boolean boolean54 = xYSeries1.equals((java.lang.Object) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        xYSeries55.fireSeriesChanged();
        xYSeries55.setNotify(true);
        xYSeries55.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 1, false);
        java.lang.Object obj63 = xYSeries55.clone();
        xYSeries55.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0d + "'", number27, 100.0d);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) 1.0d);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 0, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.getAutoSort();
        java.lang.Object obj13 = xYSeries11.clone();
        xYSeries11.setMaximumItemCount((int) ' ');
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        boolean boolean18 = xYSeries11.isEmpty();
        java.lang.Comparable comparable19 = xYSeries11.getKey();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries23.add(1.0d, 0.0d);
        boolean boolean27 = xYSeries23.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        int int34 = xYSeries29.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries29.add(xYDataItem49);
        xYSeries29.clear();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries29.add(xYDataItem66);
        xYSeries23.setKey((java.lang.Comparable) xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true, false);
        xYSeries11.setKey((java.lang.Comparable) xYDataItem66);
        xYSeries1.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        xYSeries1.add(xYDataItem19);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem19);
        xYSeries21.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
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
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener19);
        xYSeries10.setKey((java.lang.Comparable) 100);
        java.lang.Number number24 = xYSeries10.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str27 = xYSeries26.getDescription();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries26.createCopy((int) (byte) 1, 10);
        int int31 = xYSeries26.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries26.add(xYDataItem46);
        xYSeries10.add(xYDataItem46);
        xYSeries1.add(xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        int int16 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries11.add(xYDataItem31);
        xYSeries1.add(xYDataItem31);
        double[][] doubleArray34 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass35 = doubleArray34.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true, true);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        java.lang.Object obj45 = xYSeries44.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries6.setDescription("");
        xYSeries6.setKey((java.lang.Comparable) (short) -1);
        java.util.List list11 = xYSeries6.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries6.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries15.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false, true);
        xYSeries6.add(xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false, true);
        xYSeries3.add(xYDataItem28, false);
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries3.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries43.removeChangeListener(seriesChangeListener45);
        boolean boolean47 = xYSeries43.getAllowDuplicateXValues();
        boolean boolean48 = xYSeries43.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries43.addOrUpdate((double) 10, (double) (-1));
        boolean boolean52 = xYSeries41.equals((java.lang.Object) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries41.removeChangeListener(seriesChangeListener53);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(xYDataItem51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        xYSeries1.setMaximumItemCount(2);
        java.util.List list9 = xYSeries1.getItems();
        xYSeries1.add(0.0d, (double) 10.0f);
        java.lang.Object obj13 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries1.clear();
        xYSeries1.add(1.0d, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str37 = xYSeries36.getDescription();
        xYSeries36.clear();
        xYSeries36.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        java.lang.Object obj47 = xYSeries36.clone();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        int int51 = xYSeries49.getMaximumItemCount();
        xYSeries49.clear();
        boolean boolean53 = xYSeries49.getAutoSort();
        xYSeries49.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries49.add(xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79);
        xYSeries36.add(xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false, true);
        xYSeries1.add(xYDataItem79, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (short) 1, 100);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 1.0f, (double) (-1.0f));
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        boolean boolean6 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        xYSeries1.add(xYDataItem19);
        xYSeries1.add((double) '4', (java.lang.Number) (short) 100);
        xYSeries1.add((double) 10L, (java.lang.Number) 100.0f);
        java.lang.Object obj27 = xYSeries1.clone();
        java.lang.Comparable comparable28 = xYSeries1.getKey();
        int int29 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 100.0d + "'", comparable28, 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true, true);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str45 = xYSeries44.getDescription();
        xYSeries44.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries44.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62);
        xYSeries42.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        java.util.List list8 = xYSeries1.getItems();
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list10 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: xYSeries1.getY((-4));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries12.remove((int) (short) 0);
        xYSeries3.add(xYDataItem25, false);
        xYSeries3.fireSeriesChanged();
        java.lang.Comparable comparable29 = xYSeries3.getKey();
        java.lang.String str30 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 100.0d + "'", comparable29, 100.0d);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        int int16 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries11.add(xYDataItem31);
        xYSeries11.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries11.removeChangeListener(seriesChangeListener35);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries11.remove(0);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem38);
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
        int int37 = xYSeries5.indexOf((java.lang.Number) 10.0f);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        int int51 = xYSeries39.getItemCount();
        int int52 = xYSeries39.getMaximumItemCount();
        int int54 = xYSeries39.indexOf((java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener55);
        xYSeries39.clear();
        double[][] doubleArray58 = xYSeries39.toArray();
        boolean boolean59 = xYSeries5.equals((java.lang.Object) xYSeries39);
        xYSeries5.add((java.lang.Number) 1.0f, (java.lang.Number) 10.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        xYSeries1.add((double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        java.lang.Number number15 = null;
        xYSeries1.updateByIndex(0, number15);
        boolean boolean17 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 0, (double) 1, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries17.add(1.0d, 0.0d);
        boolean boolean21 = xYSeries17.isEmpty();
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
        xYSeries23.clear();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries23.add(xYDataItem60);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem60);
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
        xYSeries17.add(xYDataItem79, false);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        int int16 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries11.add(xYDataItem31);
        xYSeries1.add(xYDataItem31);
        java.lang.Object obj34 = null;
        boolean boolean35 = xYSeries1.equals(obj34);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries40.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries40.addPropertyChangeListener(propertyChangeListener50);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries1.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true);
        xYSeries57.add((double) '4', (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Object obj5 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries3.createCopy(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (short) 0, true);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy(3, (int) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries21.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 1.0f);
        int int25 = xYSeries21.getMaximumItemCount();
        int int26 = xYSeries21.getMaximumItemCount();
        java.lang.Class<?> wildcardClass27 = xYSeries21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries14.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number24 = xYSeries14.getX(0);
        xYSeries14.setNotify(false);
        boolean boolean27 = xYSeries1.equals((java.lang.Object) xYSeries14);
        xYSeries14.add((double) 100L, (java.lang.Number) 100);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener31);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (short) 1 + "'", number24, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        java.lang.String str7 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) (short) 10, (int) (byte) 0);
        xYSeries10.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries10.addOrUpdate((double) 2147483647, (double) 'a');
        boolean boolean15 = xYSeries10.getAllowDuplicateXValues();
        xYSeries10.setDescription("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 100 + "'", comparable6, (byte) 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        int int14 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        xYSeries3.setDescription("hi!");
        java.lang.Object obj8 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int int19 = xYSeries1.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.remove((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries23.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries15.clear();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) xYSeries15);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setDescription("hi!");
        double[][] doubleArray21 = xYSeries1.toArray();
        boolean boolean22 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        double[][] doubleArray2 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        xYSeries15.add((double) 100.0f, 10.0d);
        xYSeries15.add(0.0d, (double) (-1L), false);
        java.lang.Number number24 = xYSeries15.getY((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (-1.0d) + "'", number24, (-1.0d));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        xYSeries40.delete((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (-2), false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false, true);
        java.util.List list4 = xYSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (short) 10, (double) '#', false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((java.lang.Number) 4, (java.lang.Number) 0L);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 100.0f, true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        xYSeries1.clear();
        boolean boolean12 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) '4', (double) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        xYSeries7.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries12.remove((int) (short) 0);
        xYSeries7.add(xYDataItem25);
        xYSeries1.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, true, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        xYSeries12.setKey((java.lang.Comparable) 100);
        boolean boolean25 = xYSeries12.isEmpty();
        xYSeries12.delete((int) (short) 10, (-1));
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries32.add(1.0d, 0.0d);
        boolean boolean36 = xYSeries32.isEmpty();
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
        xYSeries38.clear();
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean63 = xYSeries62.isEmpty();
        xYSeries62.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries62.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries62.removePropertyChangeListener(propertyChangeListener71);
        boolean boolean73 = xYSeries62.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries62.remove((int) (short) 0);
        xYSeries38.add(xYDataItem75);
        xYSeries32.setKey((java.lang.Comparable) xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, true, false);
        xYSeries12.add(xYDataItem75, false);
        xYSeries1.add(xYDataItem75);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray8 = xYSeries3.toArray();
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries8.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries8.removeChangeListener(seriesChangeListener11);
        xYSeries8.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries8.remove((java.lang.Number) 10L);
        xYSeries1.add(xYDataItem17, true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Object obj12 = xYSeries1.clone();
        double[][] doubleArray13 = xYSeries1.toArray();
        double[][] doubleArray14 = xYSeries1.toArray();
        boolean boolean15 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries1.getItemCount();
        java.util.List list9 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(0, (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries11.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(xYSeries11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete((int) (byte) 10, 1);
        xYSeries1.setMaximumItemCount(2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        int int14 = xYSeries12.getMaximumItemCount();
        xYSeries12.clear();
        boolean boolean16 = xYSeries12.getAutoSort();
        xYSeries12.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries12.add(xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = null; // flaky: xYSeries1.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries12.setDescription("");
        xYSeries12.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries12.setMaximumItemCount(2);
        int int21 = xYSeries12.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        java.lang.Object obj25 = xYSeries23.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries23.addChangeListener(seriesChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        xYSeries29.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries29.add(xYDataItem47);
        xYSeries23.add(xYDataItem47);
        xYSeries12.add(xYDataItem47, false);
        xYSeries3.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, true, false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        java.lang.Object obj13 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = null; // flaky: xYSeries1.remove((java.lang.Number) 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10);
        xYSeries1.add((double) 10L, (java.lang.Number) 2, false);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str14 = xYSeries13.getDescription();
        xYSeries13.clear();
        xYSeries13.add(0.0d, (double) (short) 10, false);
        java.util.List list20 = xYSeries13.getItems();
        int int21 = xYSeries13.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str24 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries23.createCopy((int) (byte) 1, 10);
        xYSeries27.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str32 = xYSeries31.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries31.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean40 = xYSeries39.isEmpty();
        xYSeries39.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries39.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries39.remove((int) (short) 0);
        xYSeries37.add(xYDataItem52, false);
        xYSeries31.add(xYDataItem52, true);
        xYSeries27.add(xYDataItem52);
        xYSeries13.add(xYDataItem52);
        xYSeries13.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean63 = xYSeries62.isEmpty();
        xYSeries62.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries62.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number72 = xYSeries62.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries62.addOrUpdate(100.0d, (double) 0L);
        java.lang.Object obj76 = xYSeries62.clone();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries62.getDataItem(0);
        xYSeries13.add(xYDataItem78);
        xYSeries1.add(xYDataItem78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + number72 + "' != '" + (short) 1 + "'", number72, (short) 1);
        org.junit.Assert.assertNull(xYDataItem75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        java.lang.Object obj4 = xYSeries1.clone();
        double[][] doubleArray5 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.getAutoSort();
        java.lang.Object obj9 = xYSeries7.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.addChangeListener(seriesChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries13.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int22 = xYSeries13.getMaximumItemCount();
        boolean boolean23 = xYSeries7.equals((java.lang.Object) int22);
        java.lang.Comparable comparable24 = xYSeries7.getKey();
        xYSeries7.add((java.lang.Number) 100, (java.lang.Number) 4);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        boolean boolean8 = xYSeries1.isEmpty();
        xYSeries1.setMaximumItemCount(3);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0d, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        xYSeries15.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        xYSeries15.add(xYDataItem40);
        xYSeries1.add(xYDataItem40);
        xYSeries1.setDescription("");
        xYSeries1.add((double) ' ', 0.0d);
        java.lang.Class<?> wildcardClass52 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 4);
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (short) 1, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) 1.0f, (double) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 100 + "'", comparable6, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        xYSeries1.add((double) 2, (double) (short) 10, true);
        boolean boolean31 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 1);
        xYSeries1.setNotify(true);
        xYSeries1.delete(2, (-2));
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (-2), true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.lang.Number number32 = xYSeries1.getY((int) (byte) 1);
        xYSeries1.clear();
        int int34 = xYSeries1.getItemCount();
        boolean boolean36 = xYSeries1.equals((java.lang.Object) 10.0f);
        int int38 = xYSeries1.indexOf((java.lang.Number) (-3));
        boolean boolean39 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0.0d + "'", number32, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.lang.Number number32 = xYSeries1.getY((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        int int36 = xYSeries34.getMaximumItemCount();
        xYSeries34.clear();
        boolean boolean38 = xYSeries34.getAutoSort();
        xYSeries34.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str45 = xYSeries44.getDescription();
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries44.createCopy((int) (byte) 1, 10);
        int int49 = xYSeries44.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener60);
        boolean boolean62 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries51.remove((int) (short) 0);
        xYSeries44.add(xYDataItem64);
        xYSeries34.add(xYDataItem64);
        xYSeries1.add(xYDataItem64, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0.0d + "'", number32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", false);
        boolean boolean3 = xYSeries2.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = null; // flaky: xYSeries2.getX((-4));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        int int16 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries11.add(xYDataItem31);
        xYSeries1.add(xYDataItem31);
        boolean boolean34 = xYSeries1.getNotify();
        java.lang.String str35 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        xYSeries1.setNotify(false);
        xYSeries1.add(1.0d, 10.0d);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        int int18 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) '4', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 100 + "'", comparable17, (byte) 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        xYSeries15.setKey((java.lang.Comparable) 100);
        java.lang.Number number29 = xYSeries15.getX((int) (byte) 1);
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
        xYSeries15.add(xYDataItem51);
        xYSeries1.add(xYDataItem51, true);
        boolean boolean56 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        int int59 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 100.0d + "'", number29, 100.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-4) + "'", int59 == (-4));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = xYSeries3.clone();
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 10.0d);
        int int12 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        xYSeries1.add(xYDataItem53, true);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean62 = xYSeries61.isEmpty();
        int int63 = xYSeries61.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries61.removePropertyChangeListener(propertyChangeListener64);
        xYSeries61.delete(1, (-2));
        xYSeries61.add((java.lang.Number) (byte) 100, (java.lang.Number) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean75 = xYSeries74.isEmpty();
        java.lang.Object obj76 = xYSeries74.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        xYSeries74.removeChangeListener(seriesChangeListener77);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        xYSeries74.addChangeListener(seriesChangeListener79);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str83 = xYSeries82.getDescription();
        xYSeries82.clear();
        xYSeries82.add(0.0d, (double) (short) 10, false);
        java.util.List list89 = xYSeries82.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem91 = xYSeries82.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem91);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem91, true, true);
        xYSeries74.add(xYDataItem91);
        xYSeries61.add(xYDataItem91);
        xYSeries59.add(xYDataItem91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertNotNull(xYDataItem91);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.lang.Number number9 = xYSeries1.getY((int) (short) 0);
        xYSeries1.add((double) 100.0f, 0.0d);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        double[][] doubleArray16 = xYSeries14.toArray();
        xYSeries14.add((double) (byte) -1, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.getAutoSort();
        java.lang.Object obj24 = xYSeries22.clone();
        xYSeries22.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries22.setDescription("hi!");
        xYSeries22.add((double) (-2), (double) 100);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries36.add(1.0d, 0.0d);
        boolean boolean40 = xYSeries36.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        int int47 = xYSeries42.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries42.add(xYDataItem62);
        xYSeries42.clear();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        boolean boolean77 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries66.remove((int) (short) 0);
        xYSeries42.add(xYDataItem79);
        xYSeries36.setKey((java.lang.Comparable) xYDataItem79);
        xYSeries22.add(xYDataItem79, false);
        xYSeries14.add(xYDataItem79);
        xYSeries1.add(xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, true, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10.0d + "'", number9, 10.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        int int15 = xYSeries13.getMaximumItemCount();
        boolean boolean16 = xYSeries13.getAutoSort();
        xYSeries13.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries13.removeChangeListener(seriesChangeListener19);
        xYSeries13.add((double) 100, (double) (-1L));
        java.lang.Comparable comparable24 = xYSeries13.getKey();
        xYSeries13.add(0.0d, (double) 2147483647, false);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.getAutoSort();
        java.lang.Object obj32 = xYSeries30.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries30.addChangeListener(seriesChangeListener33);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int45 = xYSeries36.getMaximumItemCount();
        boolean boolean46 = xYSeries30.equals((java.lang.Object) int45);
        xYSeries30.add((java.lang.Number) (byte) 1, (java.lang.Number) (-1L), false);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list58 = xYSeries52.getItems();
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str61 = xYSeries60.getDescription();
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries60.createCopy((int) (byte) 1, 10);
        xYSeries64.setNotify(true);
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
        xYSeries64.add(xYDataItem89);
        xYSeries52.add(xYDataItem89);
        xYSeries30.add(xYDataItem89);
        xYSeries13.add(xYDataItem89);
        boolean boolean98 = xYSeries1.equals((java.lang.Object) xYDataItem89);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 100 + "'", comparable24, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(xYSeries72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray4 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str7 = xYSeries6.getDescription();
        xYSeries6.clear();
        xYSeries6.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries6.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int16 = xYSeries6.getMaximumItemCount();
        xYSeries6.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        int int24 = xYSeries19.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries19.add(xYDataItem39);
        xYSeries19.clear();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        xYSeries43.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries43.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener52);
        boolean boolean54 = xYSeries43.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries43.remove((int) (short) 0);
        xYSeries19.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, false);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem56);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem56);
        xYSeries1.delete(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.setKey((java.lang.Comparable) '4');
        boolean boolean11 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(0.0d, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: xYSeries1.getX((-4));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) 0);
        xYSeries1.add((double) 1.0f, (java.lang.Number) 100);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(100, 1);
        xYSeries1.delete((int) '4', 0);
        boolean boolean20 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = null; // flaky: xYSeries1.remove((java.lang.Number) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        xYSeries13.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries23.add(xYDataItem38, false);
        xYSeries17.add(xYDataItem38, true);
        xYSeries13.add(xYDataItem38);
        xYSeries1.add(xYDataItem38);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 1L);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean5 = xYSeries4.isEmpty();
        xYSeries4.add(100.0d, (java.lang.Number) 1L, true);
        int int10 = xYSeries4.getItemCount();
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
        xYSeries4.add(xYDataItem32, false);
        xYSeries1.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32, true);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries38.createCopy((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        xYSeries1.add((double) (-1.0f), 0.0d);
        xYSeries1.setDescription("hi!");
        xYSeries1.setMaximumItemCount(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (-2), false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        boolean boolean17 = xYSeries16.getNotify();
        int int18 = xYSeries16.getItemCount();
        xYSeries16.add((java.lang.Number) 10.0f, (java.lang.Number) 10, true);
        boolean boolean23 = xYSeries16.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener62);
        xYSeries61.setDescription("");
        xYSeries61.add(1.0d, (double) 'a');
        xYSeries61.fireSeriesChanged();
        xYSeries61.clear();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) -1, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean15 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries19.add(1.0d, 0.0d);
        boolean boolean23 = xYSeries19.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries25.clear();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries25.add(xYDataItem62);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.add(xYDataItem62, false);
        xYSeries1.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, true);
        xYSeries73.fireSeriesChanged();
        xYSeries73.setDescription("hi!");
        java.lang.Object obj77 = xYSeries73.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNotNull(obj77);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, number9);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) 10L);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.add((double) 10.0f, (double) (short) 1);
        double[][] doubleArray16 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Object obj12 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        int int16 = xYSeries14.getMaximumItemCount();
        xYSeries14.clear();
        boolean boolean18 = xYSeries14.getAutoSort();
        xYSeries14.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        int int29 = xYSeries24.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries24.add(xYDataItem44);
        xYSeries14.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        xYSeries1.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries50.addChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        int int7 = xYSeries5.getMaximumItemCount();
        xYSeries5.clear();
        boolean boolean9 = xYSeries5.getAutoSort();
        xYSeries5.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        int int20 = xYSeries15.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries22.remove((int) (short) 0);
        xYSeries15.add(xYDataItem35);
        xYSeries5.add(xYDataItem35);
        xYSeries3.add(xYDataItem35, false);
        boolean boolean40 = xYSeries3.getNotify();
        java.lang.Number number42 = null;
        xYSeries3.add((java.lang.Number) (-1L), number42);
        int int44 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        java.util.List list2 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 1.0f, false);
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + true + "'", comparable9, true);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        xYSeries15.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        xYSeries15.add(xYDataItem40);
        xYSeries1.add(xYDataItem40);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries1.removeChangeListener(seriesChangeListener49);
        xYSeries1.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem15, false, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries19.setMaximumItemCount((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete((int) (byte) 10, 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list16 = xYSeries10.getItems();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries18.createCopy((int) (byte) 1, 10);
        xYSeries22.setNotify(true);
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
        xYSeries22.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (short) 1, 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries9.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (-1), false);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener37);
        xYSeries1.delete(2, (int) (short) 1);
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries1.remove(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) (short) -1, (int) (byte) 100);
        int int12 = xYSeries11.getItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        java.lang.Object obj16 = xYSeries1.clone();
        double[][] doubleArray17 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100L, true);
        int int13 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.lang.Comparable comparable22 = xYSeries1.getKey();
        int int24 = xYSeries1.indexOf((java.lang.Number) (short) 0);
        int int26 = xYSeries1.indexOf((java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
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
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        boolean boolean13 = xYSeries1.getAutoSort();
        java.util.List list14 = xYSeries1.getItems();
        int int15 = xYSeries1.getItemCount();
        xYSeries1.clear();
        xYSeries1.add((double) (byte) 10, (double) 2147483647);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener41);
        xYSeries40.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = xYSeries40.createCopy((int) (short) -1, 100);
        xYSeries47.delete(100, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries47.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNotNull(xYSeries47);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, false, false);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries65.add((double) 10, (java.lang.Number) 0L, false);
        xYSeries65.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries13.add(1.0d, 0.0d);
        boolean boolean17 = xYSeries13.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        int int24 = xYSeries19.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries26.remove((int) (short) 0);
        xYSeries19.add(xYDataItem39);
        xYSeries19.clear();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        xYSeries43.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries43.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener52);
        boolean boolean54 = xYSeries43.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries43.remove((int) (short) 0);
        xYSeries19.add(xYDataItem56);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, true, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries1.addOrUpdate((double) 2147483647, (-1.0d));
        xYSeries1.add((double) 10.0f, (java.lang.Number) (-1.0f));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        xYSeries1.removeChangeListener(seriesChangeListener69);
        java.lang.String str71 = xYSeries1.getDescription();
        java.lang.Comparable comparable72 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNull(xYDataItem65);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(comparable72);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) 10);
        xYSeries1.fireSeriesChanged();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.add((double) (-1), (java.lang.Number) (-1L));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        int int17 = xYSeries15.getMaximumItemCount();
        xYSeries15.clear();
        boolean boolean19 = xYSeries15.getAutoSort();
        xYSeries15.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries15.add(xYDataItem45);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem45);
        xYSeries1.add((double) 2147483647, (double) (byte) 0);
        boolean boolean52 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        int int11 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        java.lang.Object obj14 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener19);
        xYSeries10.setKey((java.lang.Comparable) 100);
        java.lang.Number number24 = xYSeries10.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str27 = xYSeries26.getDescription();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries26.createCopy((int) (byte) 1, 10);
        int int31 = xYSeries26.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries26.add(xYDataItem46);
        xYSeries10.add(xYDataItem46);
        xYSeries1.add(xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
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
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        int int17 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.lang.Object obj18 = xYSeries1.clone();
        xYSeries1.add((double) 4, (java.lang.Number) 0L, true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, false, false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem10);
        xYSeries11.setDescription("hi!");
        xYSeries11.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) -1, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(xYDataItem10);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries11.clear();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries16.add(1.0d, 0.0d);
        boolean boolean20 = xYSeries16.isEmpty();
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
        xYSeries22.clear();
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean47 = xYSeries46.isEmpty();
        xYSeries46.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries46.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener55);
        boolean boolean57 = xYSeries46.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries46.remove((int) (short) 0);
        xYSeries22.add(xYDataItem59);
        xYSeries16.setKey((java.lang.Comparable) xYDataItem59);
        xYSeries11.add(xYDataItem59, true);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem59, false);
        boolean boolean66 = xYSeries1.equals((java.lang.Object) false);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener67);
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(xYDataItem59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(0, (-1));
        java.lang.String str12 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) '4', (-3));
        xYSeries1.add((double) 10, 0.0d, true);
        boolean boolean22 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.getAutoSort();
        java.lang.Object obj26 = xYSeries24.clone();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries24.addOrUpdate((double) (short) 1, (double) 100L);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        xYSeries31.setKey((java.lang.Comparable) 100);
        boolean boolean44 = xYSeries31.isEmpty();
        boolean boolean45 = xYSeries24.equals((java.lang.Object) boolean44);
        xYSeries24.add((double) (-1L), 10.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries24.addChangeListener(seriesChangeListener50);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        xYSeries53.setKey((java.lang.Comparable) 100);
        java.lang.Number number67 = xYSeries53.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str70 = xYSeries69.getDescription();
        org.jfree.data.xy.XYSeries xYSeries73 = xYSeries69.createCopy((int) (byte) 1, 10);
        int int74 = xYSeries69.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean77 = xYSeries76.isEmpty();
        xYSeries76.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries76.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        xYSeries76.removePropertyChangeListener(propertyChangeListener85);
        boolean boolean87 = xYSeries76.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries76.remove((int) (short) 0);
        xYSeries69.add(xYDataItem89);
        xYSeries53.add(xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, true, true);
        xYSeries24.add(xYDataItem89, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + number67 + "' != '" + 100.0d + "'", number67, 100.0d);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(xYSeries73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add((double) (-4), (java.lang.Number) 1);
        xYSeries3.add((double) (short) 1, (java.lang.Number) 1, false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, false, true);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries1.clear();
        int int31 = xYSeries1.getMaximumItemCount();
        java.util.List list32 = xYSeries1.getItems();
        boolean boolean33 = xYSeries1.getAutoSort();
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
        xYSeries1.setKey((java.lang.Comparable) true);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries1.createCopy((-2), (int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        int int67 = xYSeries64.getMaximumItemCount();
        xYSeries64.add((double) (short) 100, (java.lang.Number) 1.0f, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        java.lang.Number number17 = null;
        xYSeries1.add((java.lang.Number) 1.0f, number17, false);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy(100, (int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) 10);
        xYSeries1.fireSeriesChanged();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.add((double) (-1), (java.lang.Number) (-1L));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        int int17 = xYSeries15.getMaximumItemCount();
        xYSeries15.clear();
        boolean boolean19 = xYSeries15.getAutoSort();
        xYSeries15.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries15.add(xYDataItem45);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem45);
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        int int55 = xYSeries53.getMaximumItemCount();
        boolean boolean56 = xYSeries53.getAutoSort();
        xYSeries53.setDescription("hi!");
        boolean boolean59 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries53.addOrUpdate(0.0d, (double) (-1L));
        boolean boolean63 = xYSeries1.equals((java.lang.Object) (-1L));
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete(1, (-2));
        boolean boolean9 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        int int15 = xYSeries13.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.delete(1, (-2));
        xYSeries13.add((java.lang.Number) (byte) 100, (java.lang.Number) 10.0d, false);
        boolean boolean25 = xYSeries1.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        boolean boolean13 = xYSeries1.getAutoSort();
        java.util.List list14 = xYSeries1.getItems();
        int int15 = xYSeries1.getItemCount();
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        java.lang.Comparable comparable22 = xYSeries1.getKey();
        int int24 = xYSeries1.indexOf((java.lang.Number) (short) 0);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (short) 0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 4);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        int int15 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 100 + "'", comparable6, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 100 + "'", comparable9, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries1.clear();
        int int31 = xYSeries1.getMaximumItemCount();
        java.util.List list32 = xYSeries1.getItems();
        boolean boolean33 = xYSeries1.getAutoSort();
        boolean boolean34 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean35 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean15 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries19.add(1.0d, 0.0d);
        boolean boolean23 = xYSeries19.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries25.clear();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries25.add(xYDataItem62);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.add(xYDataItem62, false);
        xYSeries1.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, true);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        xYSeries76.removeChangeListener(seriesChangeListener77);
        boolean boolean79 = xYSeries76.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str8 = xYSeries7.getDescription();
        xYSeries7.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries12.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries12.remove((int) (short) 0);
        xYSeries7.add(xYDataItem25);
        xYSeries1.add(xYDataItem25);
        xYSeries1.add((double) (short) -1, (double) (byte) 0);
        java.util.List list31 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list39 = xYSeries33.getItems();
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries41.createCopy((int) (byte) 1, 10);
        xYSeries45.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str50 = xYSeries49.getDescription();
        org.jfree.data.xy.XYSeries xYSeries53 = xYSeries49.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean58 = xYSeries57.isEmpty();
        xYSeries57.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries57.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener66);
        boolean boolean68 = xYSeries57.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries57.remove((int) (short) 0);
        xYSeries55.add(xYDataItem70, false);
        xYSeries49.add(xYDataItem70, true);
        xYSeries45.add(xYDataItem70);
        xYSeries33.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70, true, true);
        xYSeries79.add((java.lang.Number) (-1L), (java.lang.Number) 1.0d, false);
        boolean boolean84 = xYSeries1.equals((java.lang.Object) (-1L));
        java.lang.String str85 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(xYSeries53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f, false);
        boolean boolean22 = xYSeries17.getAutoSort();
        java.util.List list23 = xYSeries17.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        int int15 = xYSeries13.getMaximumItemCount();
        xYSeries13.clear();
        boolean boolean17 = xYSeries13.getAutoSort();
        xYSeries13.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries13.add(xYDataItem43);
        boolean boolean46 = xYSeries13.getNotify();
        java.lang.Number number48 = xYSeries13.getY((int) (byte) 0);
        boolean boolean49 = xYSeries1.equals((java.lang.Object) number48);
        java.lang.Comparable comparable50 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + (byte) -1 + "'", number48, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (byte) 100 + "'", comparable50, (byte) 100);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 10);
        java.lang.String str10 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        int int14 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries19.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries19.removeChangeListener(seriesChangeListener22);
        xYSeries19.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries19.remove((java.lang.Number) 10L);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries19.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries34.add(1.0d, 0.0d);
        boolean boolean38 = xYSeries34.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str41 = xYSeries40.getDescription();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries40.createCopy((int) (byte) 1, 10);
        int int45 = xYSeries40.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries40.add(xYDataItem60);
        xYSeries40.clear();
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean65 = xYSeries64.isEmpty();
        xYSeries64.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries64.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries64.remove((int) (short) 0);
        xYSeries40.add(xYDataItem77);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true, false);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem77);
        org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries19.addOrUpdate((double) (-4), (double) 3);
        boolean boolean89 = xYSeries1.equals((java.lang.Object) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNull(xYDataItem88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) ' ', (double) 0);
        java.util.List list12 = xYSeries1.getItems();
        boolean boolean13 = xYSeries1.getNotify();
        xYSeries1.fireSeriesChanged();
        boolean boolean15 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 0);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 10.0d + "'", number15, 10.0d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        xYSeries1.clear();
        int int18 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        xYSeries1.setNotify(false);
        xYSeries1.add(1.0d, 10.0d);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = null; // flaky: xYSeries1.remove((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 100 + "'", comparable17, (byte) 100);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener62);
        xYSeries61.setDescription("");
        boolean boolean66 = xYSeries61.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener67);
        java.lang.Object obj69 = xYSeries61.clone();
        xYSeries61.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add((double) 10L, (double) 0L, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100L, true);
        int int13 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.getAutoSort();
        java.lang.Object obj17 = xYSeries15.clone();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries15.addOrUpdate((double) (short) 1, (double) 100L);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        xYSeries22.setKey((java.lang.Comparable) 100);
        boolean boolean35 = xYSeries22.isEmpty();
        boolean boolean36 = xYSeries15.equals((java.lang.Object) boolean35);
        boolean boolean37 = xYSeries15.getNotify();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        xYSeries39.clear();
        xYSeries39.add(0.0d, (double) (short) 10, false);
        java.lang.Number number47 = xYSeries39.getY((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str50 = xYSeries49.getDescription();
        xYSeries49.clear();
        xYSeries49.add(0.0d, (double) (short) 10, false);
        java.util.List list56 = xYSeries49.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries49.getDataItem((int) (byte) 0);
        xYSeries39.setKey((java.lang.Comparable) xYDataItem58);
        xYSeries15.add(xYDataItem58);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem58);
        java.lang.Object obj62 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + number47 + "' != '" + 10.0d + "'", number47, 10.0d);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false);
        xYSeries2.add((java.lang.Number) (-4), (java.lang.Number) 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        xYSeries1.setNotify(false);
        xYSeries1.add(1.0d, 10.0d);
        xYSeries1.delete((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean15 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries19.add(1.0d, 0.0d);
        boolean boolean23 = xYSeries19.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries25.clear();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries25.add(xYDataItem62);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.add(xYDataItem62, false);
        xYSeries1.add(xYDataItem62);
        boolean boolean71 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
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
        xYSeries1.setDescription("hi!");
        int int17 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) (-1.0f), true);
        boolean boolean24 = xYSeries1.getNotify();
        double[][] doubleArray25 = xYSeries1.toArray();
        java.lang.Object obj26 = xYSeries1.clone();
        xYSeries1.add(10.0d, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (short) 0, true);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy(3, (int) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries21.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 1.0f);
        int int25 = xYSeries21.getMaximumItemCount();
        boolean boolean26 = xYSeries21.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries21.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 0.0d);
        xYSeries21.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) 1.0f, false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 0);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (-1.0d), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list40 = xYSeries34.getItems();
        boolean boolean41 = xYSeries1.equals((java.lang.Object) xYSeries34);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (byte) -1);
        xYSeries1.updateByIndex((int) (short) 0, (java.lang.Number) 1L);
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 1.0f, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries55.add(1.0d, 0.0d);
        xYSeries55.add((java.lang.Number) 10.0f, (java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries55.getDataItem(0);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem63);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 3, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(xYDataItem44);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries16.addChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        int int22 = xYSeries20.getMaximumItemCount();
        boolean boolean23 = xYSeries20.getAutoSort();
        xYSeries20.setDescription("hi!");
        xYSeries20.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj30 = xYSeries20.clone();
        boolean boolean31 = xYSeries16.equals((java.lang.Object) xYSeries20);
        xYSeries20.delete((int) ' ', (int) (short) -1);
        int int35 = xYSeries20.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.add((double) 10L, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.addOrUpdate((double) 10.0f, (double) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        java.lang.Object obj18 = xYSeries16.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries16.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        xYSeries22.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries22.add(xYDataItem40);
        xYSeries16.add(xYDataItem40);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, true, false);
        xYSeries1.add(xYDataItem40, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        xYSeries3.add(0.0d, (double) '4');
        xYSeries3.add((double) (-1L), (java.lang.Number) 1.0d);
        boolean boolean10 = xYSeries3.getAutoSort();
        xYSeries3.add((java.lang.Number) 4, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) 1);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate((double) (byte) 0, 0.0d);
        xYSeries1.setMaximumItemCount((int) '4');
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        xYSeries1.fireSeriesChanged();
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        xYSeries1.add(xYDataItem53, true);
        xYSeries1.add((double) 0L, (java.lang.Number) 4);
        boolean boolean61 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate(0.0d, (double) 2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 100 + "'", comparable6, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete((int) (byte) 10, 1);
        xYSeries1.setMaximumItemCount(2147483647);
        xYSeries1.add((double) (short) -1, (java.lang.Number) (short) 0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries10.removeChangeListener(seriesChangeListener27);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries14.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number24 = xYSeries14.getX(0);
        xYSeries14.setNotify(false);
        boolean boolean27 = xYSeries1.equals((java.lang.Object) xYSeries14);
        xYSeries1.add((double) 100.0f, (double) (short) 10);
        java.lang.Object obj31 = null;
        boolean boolean32 = xYSeries1.equals(obj31);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (short) 1 + "'", number24, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate(100.0d, (double) (-1.0f));
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        java.util.List list2 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 1.0f, false);
        xYSeries1.clear();
        xYSeries1.add((double) 0, (java.lang.Number) 10, true);
        boolean boolean12 = xYSeries1.isEmpty();
        xYSeries1.add((double) 0.0f, (java.lang.Number) 10.0f, true);
        int int18 = xYSeries1.indexOf((java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries20.setDescription("");
        xYSeries20.setKey((java.lang.Comparable) (short) -1);
        java.util.List list25 = xYSeries20.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries20.addChangeListener(seriesChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries29.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries29.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries29.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false, true);
        xYSeries20.add(xYDataItem42);
        xYSeries1.add(xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false, false);
        java.lang.Comparable comparable53 = xYSeries52.getKey();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(comparable53);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add(1.0d, 0.0d);
        boolean boolean7 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        int int14 = xYSeries9.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        xYSeries9.add(xYDataItem29);
        xYSeries9.clear();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries9.add(xYDataItem46);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, false);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (-1), false);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener37);
        int int40 = xYSeries1.indexOf((java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries1.remove(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) (-1L), (-1.0d));
        xYSeries3.add(0.0d, (java.lang.Number) (-3), false);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        int int17 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        xYSeries1.setMaximumItemCount(0);
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
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries21.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries21.setDescription("hi!");
        java.util.List list52 = xYSeries21.getItems();
        boolean boolean53 = xYSeries1.equals((java.lang.Object) xYSeries21);
        xYSeries21.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries21.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (-3));
        xYSeries21.add((double) (-1), (double) 100.0f, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNull(xYDataItem49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(xYDataItem58);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        java.lang.Number number22 = xYSeries10.getY(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 1.0d + "'", number22, 1.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add(1.0d, 0.0d);
        boolean boolean7 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        int int14 = xYSeries9.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        xYSeries9.add(xYDataItem29);
        xYSeries9.clear();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries9.add(xYDataItem46);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem46);
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
        xYSeries3.add(xYDataItem65, false);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries70.removePropertyChangeListener(propertyChangeListener71);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (short) 1, (double) 100L);
        int int7 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 'a', 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        boolean boolean14 = xYSeries13.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((java.lang.Number) 1.0d);
        xYSeries1.add(1.0d, (java.lang.Number) 4, false);
        int int22 = xYSeries1.getItemCount();
        boolean boolean23 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        int int4 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener5);
        xYSeries1.fireSeriesChanged();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) 3);
        boolean boolean10 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        xYSeries1.clear();
        int int15 = xYSeries1.getMaximumItemCount();
        boolean boolean16 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy(10, (int) 'a');
        int int9 = xYSeries1.getItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) 3, (double) '#');
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.clear();
        java.lang.Comparable comparable20 = xYSeries17.getKey();
        double[][] doubleArray21 = xYSeries17.toArray();
        int int22 = xYSeries17.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener35);
        xYSeries26.setKey((java.lang.Comparable) 100);
        java.lang.Number number40 = xYSeries26.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        int int47 = xYSeries42.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries42.add(xYDataItem62);
        xYSeries26.add(xYDataItem62);
        xYSeries17.add(xYDataItem62);
        xYSeries1.add(xYDataItem62, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) 100 + "'", comparable20, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + 100.0d + "'", number40, 100.0d);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.clear();
        xYSeries17.add(0.0d, (double) (short) 10, false);
        java.util.List list24 = xYSeries17.getItems();
        xYSeries17.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        xYSeries17.add((double) 4, (java.lang.Number) (byte) 10);
        boolean boolean32 = xYSeries1.equals((java.lang.Object) xYSeries17);
        java.lang.Number number34 = null;
        xYSeries17.updateByIndex(0, number34);
        boolean boolean36 = xYSeries17.getNotify();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setMaximumItemCount(10);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries14.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number24 = xYSeries14.getX(0);
        xYSeries14.setNotify(false);
        boolean boolean27 = xYSeries1.equals((java.lang.Object) xYSeries14);
        xYSeries14.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.getAutoSort();
        java.lang.Object obj32 = xYSeries30.clone();
        xYSeries30.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries30.addOrUpdate((double) 0, (-1.0d));
        boolean boolean39 = xYSeries30.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries30.addOrUpdate(100.0d, (double) 10);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean45 = xYSeries44.isEmpty();
        xYSeries44.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries44.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener53);
        xYSeries44.setKey((java.lang.Comparable) 100);
        java.lang.Number number58 = xYSeries44.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str61 = xYSeries60.getDescription();
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries60.createCopy((int) (byte) 1, 10);
        int int65 = xYSeries60.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean68 = xYSeries67.isEmpty();
        xYSeries67.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries67.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener76);
        boolean boolean78 = xYSeries67.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries67.remove((int) (short) 0);
        xYSeries60.add(xYDataItem80);
        xYSeries44.add(xYDataItem80);
        xYSeries30.add(xYDataItem80, true);
        xYSeries14.add(xYDataItem80, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener87 = null;
        xYSeries14.addChangeListener(seriesChangeListener87);
        xYSeries14.add(100.0d, (double) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (short) 1 + "'", number24, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + number58 + "' != '" + 100.0d + "'", number58, 100.0d);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.lang.Number number9 = xYSeries1.getY((int) (short) 0);
        xYSeries1.add((double) 100.0f, 0.0d);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        double[][] doubleArray16 = xYSeries14.toArray();
        xYSeries14.add((double) (byte) -1, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.getAutoSort();
        java.lang.Object obj24 = xYSeries22.clone();
        xYSeries22.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries22.setDescription("hi!");
        xYSeries22.add((double) (-2), (double) 100);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries36.add(1.0d, 0.0d);
        boolean boolean40 = xYSeries36.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        int int47 = xYSeries42.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries42.add(xYDataItem62);
        xYSeries42.clear();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        boolean boolean77 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries66.remove((int) (short) 0);
        xYSeries42.add(xYDataItem79);
        xYSeries36.setKey((java.lang.Comparable) xYDataItem79);
        xYSeries22.add(xYDataItem79, false);
        xYSeries14.add(xYDataItem79);
        xYSeries1.add(xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10.0d + "'", number9, 10.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        int int14 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        java.lang.Number number18 = xYSeries1.getY(1);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 100.0d, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 1L + "'", number18, 1L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries10.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23, false, true);
        xYSeries1.add(xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        xYSeries29.add(1.0d, 0.0d);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener62);
        xYSeries61.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str68 = xYSeries67.getDescription();
        boolean boolean69 = xYSeries67.isEmpty();
        xYSeries67.fireSeriesChanged();
        xYSeries67.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries77 = xYSeries67.createCopy(0, (-1));
        xYSeries67.add((double) (short) 10, (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries67.addOrUpdate((double) 0L, (-1.0d));
        double[][] doubleArray85 = xYSeries67.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener86 = null;
        xYSeries67.removeChangeListener(seriesChangeListener86);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries67.getDataItem((int) (byte) 1);
        xYSeries61.add(xYDataItem89, false);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        xYSeries94.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYSeries77);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        java.lang.Number number17 = null;
        xYSeries1.add((java.lang.Number) 1.0f, number17, false);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries1.createCopy(100, (int) (byte) 10);
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries22.setKey(comparable23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener62);
        xYSeries61.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str68 = xYSeries67.getDescription();
        boolean boolean69 = xYSeries67.isEmpty();
        xYSeries67.fireSeriesChanged();
        xYSeries67.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries77 = xYSeries67.createCopy(0, (-1));
        xYSeries67.add((double) (short) 10, (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries67.addOrUpdate((double) 0L, (-1.0d));
        double[][] doubleArray85 = xYSeries67.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener86 = null;
        xYSeries67.removeChangeListener(seriesChangeListener86);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries67.getDataItem((int) (byte) 1);
        xYSeries61.add(xYDataItem89, false);
        org.jfree.data.xy.XYDataItem xYDataItem94 = xYSeries61.addOrUpdate((-1.0d), (double) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener95 = null;
        xYSeries61.addChangeListener(seriesChangeListener95);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYSeries77);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(xYDataItem89);
        org.junit.Assert.assertNull(xYDataItem94);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        boolean boolean46 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener47);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 100, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean14 = xYSeries1.isEmpty();
        int int15 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.getDataItem(1);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem17, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 2147483647, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries10.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23, false, true);
        xYSeries1.add(xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 100.0f);
        xYSeries1.add((double) (byte) 1, (double) 0, false);
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.delete((int) (short) 100, 0);
        xYSeries1.setMaximumItemCount(1);
        java.lang.String str19 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 0L);
        boolean boolean22 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 0, (double) 1, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries17.add(1.0d, 0.0d);
        boolean boolean21 = xYSeries17.isEmpty();
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
        xYSeries23.clear();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener56);
        boolean boolean58 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries23.add(xYDataItem60);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem60);
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
        xYSeries17.add(xYDataItem79, false);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false, true);
        boolean boolean89 = xYSeries88.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        java.lang.String str15 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries19.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean48 = xYSeries19.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list58 = xYSeries52.getItems();
        boolean boolean59 = xYSeries19.equals((java.lang.Object) xYSeries52);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries19.addOrUpdate((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries19.remove((java.lang.Number) 0.0d);
        xYSeries1.add(xYDataItem64, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64, false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(xYDataItem62);
        org.junit.Assert.assertNotNull(xYDataItem64);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) 1L, (-1.0d));
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setNotify(true);
        xYSeries1.updateByIndex(0, (java.lang.Number) 4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        xYSeries21.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries21.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener30);
        xYSeries21.setKey((java.lang.Comparable) 100);
        java.lang.Number number35 = xYSeries21.getX((int) (byte) 1);
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
        xYSeries21.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem57);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries1.addChangeListener(seriesChangeListener63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 100.0d + "'", number35, 100.0d);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add(10.0d, (java.lang.Number) 1.0d);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        java.lang.Number number13 = xYSeries1.getX((int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 10.0d + "'", number13, 10.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) (byte) 0, false);
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 100 + "'", comparable13, (byte) 100);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (-2), (double) 100);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 'a', (double) 'a');
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int28 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) 100, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries19.createCopy((int) (byte) 0, 0);
        java.util.List list35 = xYSeries34.getItems();
        boolean boolean36 = xYSeries1.equals((java.lang.Object) list35);
        xYSeries1.clear();
        xYSeries1.add((double) (-3), (double) 100L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) (-2), true);
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (byte) -1, false);
        xYSeries1.add((double) '#', 100.0d);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        java.util.List list4 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str7 = xYSeries6.getDescription();
        xYSeries6.clear();
        xYSeries6.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = xYSeries6.clone();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.clear();
        boolean boolean23 = xYSeries19.getAutoSort();
        xYSeries19.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        int int34 = xYSeries29.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries29.add(xYDataItem49);
        xYSeries19.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        xYSeries6.add(xYDataItem49);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem49);
        boolean boolean55 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener56);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries10.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        xYSeries1.add(xYDataItem23, true);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries28.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries28.remove((int) (short) 0);
        xYSeries1.add(xYDataItem41, true);
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, true, false);
        boolean boolean50 = xYSeries1.equals((java.lang.Object) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
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
        boolean boolean10 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        java.lang.Object obj14 = xYSeries12.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries12.addChangeListener(seriesChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries18.add(xYDataItem36);
        xYSeries12.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true, false);
        xYSeries1.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.clear();
        xYSeries17.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries17.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries17.update((java.lang.Number) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries17.addOrUpdate(0.0d, 0.0d);
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries17);
        xYSeries17.add((double) (byte) 100, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false, true);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
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
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.setMaximumItemCount(3);
        xYSeries3.clear();
        boolean boolean10 = xYSeries3.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries1.add((double) 100.0f, (java.lang.Number) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener41);
        xYSeries40.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str47 = xYSeries46.getDescription();
        boolean boolean48 = xYSeries46.isEmpty();
        boolean boolean49 = xYSeries46.getAllowDuplicateXValues();
        int int50 = xYSeries46.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries46.addChangeListener(seriesChangeListener51);
        java.util.List list53 = xYSeries46.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries46.addChangeListener(seriesChangeListener54);
        boolean boolean56 = xYSeries40.equals((java.lang.Object) seriesChangeListener54);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries40.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries1.clear();
        int int31 = xYSeries1.getMaximumItemCount();
        java.util.List list32 = xYSeries1.getItems();
        boolean boolean33 = xYSeries1.getAutoSort();
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
        xYSeries1.setKey((java.lang.Comparable) true);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries1.createCopy((-2), (int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        int int67 = xYSeries64.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem69 = null; // flaky: xYSeries64.remove((java.lang.Number) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries10.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23, false, true);
        xYSeries1.add(xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23, false, true);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
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
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f, false);
        java.lang.Object obj22 = xYSeries17.clone();
        java.lang.Object obj23 = xYSeries17.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.delete((int) (short) 100, 0);
        xYSeries1.add((double) 10L, (java.lang.Number) 1L, false);
        boolean boolean21 = xYSeries1.isEmpty();
        int int22 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        xYSeries1.setMaximumItemCount((int) 'a');
        xYSeries1.add((double) ' ', (double) (short) 0);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        java.util.List list8 = xYSeries1.getItems();
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        java.lang.Object obj4 = xYSeries1.clone();
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (byte) 100 + "'", comparable5, (byte) 100);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        int int12 = xYSeries1.getItemCount();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        xYSeries1.setKey((java.lang.Comparable) "hi!");
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.addChangeListener(seriesChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries8.removeChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener12);
        int int14 = xYSeries8.getItemCount();
        java.lang.Object obj15 = xYSeries8.clone();
        boolean boolean16 = xYSeries1.equals((java.lang.Object) xYSeries8);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries8.update((java.lang.Number) (-4), (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean15 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries19.add(1.0d, 0.0d);
        boolean boolean23 = xYSeries19.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries25.clear();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries25.add(xYDataItem62);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.add(xYDataItem62, false);
        xYSeries1.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, true);
        java.lang.Object obj74 = xYSeries73.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.getAutoSort();
        java.lang.Object obj19 = xYSeries17.clone();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries17);
        int int22 = xYSeries1.indexOf((java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        int int9 = xYSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        int int12 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 10);
        java.lang.Object obj16 = xYSeries3.clone();
        boolean boolean17 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        xYSeries1.setKey((java.lang.Comparable) "hi!");
        xYSeries1.add((double) 4, (java.lang.Number) 100.0d);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        xYSeries13.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries23.add(xYDataItem38, false);
        xYSeries17.add(xYDataItem38, true);
        xYSeries13.add(xYDataItem38);
        xYSeries1.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, true, true);
        xYSeries47.add((java.lang.Number) (-1L), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add((java.lang.Number) 2147483647, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        java.lang.Object obj12 = xYSeries10.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries10.removeChangeListener(seriesChangeListener13);
        xYSeries10.add(10.0d, (java.lang.Number) 0L);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries10.addOrUpdate((double) 3, (double) 1L);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries22.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries22.remove((int) (short) 0);
        xYSeries10.add(xYDataItem35, false);
        xYSeries5.setKey((java.lang.Comparable) xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35, true);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35, false, true);
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
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries45.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean74 = xYSeries45.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener75);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean79 = xYSeries78.isEmpty();
        xYSeries78.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list84 = xYSeries78.getItems();
        boolean boolean85 = xYSeries45.equals((java.lang.Object) xYSeries78);
        int int86 = xYSeries45.getItemCount();
        xYSeries45.delete((int) 'a', 2);
        boolean boolean90 = xYSeries43.equals((java.lang.Object) xYSeries45);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.add((double) 10L, (java.lang.Number) 0.0d);
        java.lang.Class<?> wildcardClass18 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (byte) 1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 100);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 1, (java.lang.Number) 0L, true);
        int int9 = xYSeries1.getItemCount();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.add((double) (byte) 0, (double) (byte) 100, false);
        java.lang.Object obj15 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        java.lang.Object obj4 = xYSeries1.clone();
        double[][] doubleArray5 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        int int23 = xYSeries21.getMaximumItemCount();
        int int24 = xYSeries21.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries21.addOrUpdate(1.0d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries21.updateByIndex(10, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(xYDataItem27);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray4 = xYSeries1.toArray();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) 10);
        xYSeries1.fireSeriesChanged();
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.add((double) (-1), (java.lang.Number) (-1L));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        int int17 = xYSeries15.getMaximumItemCount();
        xYSeries15.clear();
        boolean boolean19 = xYSeries15.getAutoSort();
        xYSeries15.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str26 = xYSeries25.getDescription();
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries25.createCopy((int) (byte) 1, 10);
        int int30 = xYSeries25.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries25.add(xYDataItem45);
        xYSeries15.add(xYDataItem45);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem45);
        xYSeries1.setNotify(true);
        xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) (short) 100);
        java.lang.Object obj54 = xYSeries1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) -1);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.Number number8 = xYSeries1.getY((int) (short) 0);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (short) -1 + "'", number8, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) 100 + "'", comparable10, (byte) 100);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        boolean boolean8 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.add((double) 'a', (java.lang.Number) (-4), false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        java.lang.Object obj7 = xYSeries1.clone();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) 100L, (java.lang.Number) 100.0f);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 3);
        xYSeries1.add((double) (-3), (java.lang.Number) 0.0f, true);
        java.lang.Number number22 = xYSeries1.getX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (-3.0d) + "'", number22, (-3.0d));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        int int15 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.lang.Object obj5 = xYSeries3.clone();
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) ' ', (int) (byte) 10);
        int int10 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        java.util.List list2 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 1.0f, false);
        xYSeries1.clear();
        xYSeries1.add((double) 0, (java.lang.Number) 10, true);
        boolean boolean12 = xYSeries1.isEmpty();
        xYSeries1.add((double) 0.0f, (java.lang.Number) 10.0f, true);
        int int18 = xYSeries1.indexOf((java.lang.Number) 10.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.removeChangeListener(seriesChangeListener19);
        java.lang.Class<?> wildcardClass21 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add(10.0d, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        xYSeries15.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        xYSeries15.add(xYDataItem40);
        xYSeries1.add(xYDataItem40);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number60 = xYSeries50.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.addOrUpdate(100.0d, (double) 0L);
        java.lang.Object obj64 = xYSeries50.clone();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries50.getDataItem(0);
        xYSeries1.add(xYDataItem66);
        xYSeries1.clear();
        xYSeries1.setDescription("");
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + number60 + "' != '" + (short) 1 + "'", number60, (short) 1);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        xYSeries1.add((double) 2, (double) (short) 10, true);
        boolean boolean31 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 1);
        int int35 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.add((double) ' ', (double) (byte) 100, true);
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy(10, (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        java.lang.Object obj14 = xYSeries12.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries12.addChangeListener(seriesChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str19 = xYSeries18.getDescription();
        xYSeries18.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries18.add(xYDataItem36);
        xYSeries12.add(xYDataItem36);
        boolean boolean39 = xYSeries1.equals((java.lang.Object) xYSeries12);
        int int41 = xYSeries12.indexOf((java.lang.Number) (byte) 100);
        java.lang.Object obj42 = xYSeries12.clone();
        xYSeries12.add((double) (byte) 0, (double) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, (java.lang.Number) (byte) 100, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) (short) 1);
        boolean boolean10 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) 1);
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
        xYSeries1.setKey((java.lang.Comparable) xYDataItem46);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str7 = xYSeries6.getDescription();
        xYSeries6.clear();
        xYSeries6.add(0.0d, (double) (short) 10, false);
        java.util.List list13 = xYSeries6.getItems();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries15.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries15.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28);
        xYSeries6.add(xYDataItem28, true);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries33.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries6.add(xYDataItem46, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem46);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (byte) 1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((java.lang.Number) 0L);
        int int13 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add(1.0d, 0.0d);
        java.lang.Object obj7 = xYSeries3.clone();
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        java.lang.Number number11 = xYSeries3.getX((int) (short) 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.setNotify(false);
        int int12 = xYSeries1.indexOf((java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem10);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem10, true, true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(xYDataItem10);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        java.lang.Comparable comparable22 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 100.0f);
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (short) 10, true);
        xYSeries1.delete((int) (short) 10, 0);
        xYSeries1.updateByIndex(0, (java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries15.clear();
        xYSeries15.setKey((java.lang.Comparable) '#');
        boolean boolean19 = xYSeries1.equals((java.lang.Object) '#');
        boolean boolean20 = xYSeries1.isEmpty();
        double[][] doubleArray21 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries1.removeChangeListener(seriesChangeListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        xYSeries1.setNotify(true);
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.add((double) 100, (double) (-1L));
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        xYSeries1.add(0.0d, (double) 2147483647, false);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.getAutoSort();
        java.lang.Object obj20 = xYSeries18.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries18.addChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int33 = xYSeries24.getMaximumItemCount();
        boolean boolean34 = xYSeries18.equals((java.lang.Object) int33);
        xYSeries18.add((java.lang.Number) (byte) 1, (java.lang.Number) (-1L), false);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list46 = xYSeries40.getItems();
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
        xYSeries40.add(xYDataItem77);
        xYSeries18.add(xYDataItem77);
        xYSeries1.add(xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        xYSeries88.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(xYSeries60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list40 = xYSeries34.getItems();
        boolean boolean41 = xYSeries1.equals((java.lang.Object) xYSeries34);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries1.addOrUpdate((double) (-1), (double) 0.0f);
        java.lang.Comparable comparable45 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int56 = xYSeries47.getMaximumItemCount();
        xYSeries47.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener60);
        java.lang.Object obj62 = null;
        boolean boolean63 = xYSeries47.equals(obj62);
        int int65 = xYSeries47.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries47.remove((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, true);
        xYSeries1.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(xYDataItem44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (byte) 100 + "'", comparable45, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries14.add(1.0d, 0.0d);
        boolean boolean18 = xYSeries14.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str21 = xYSeries20.getDescription();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries20.createCopy((int) (byte) 1, 10);
        int int25 = xYSeries20.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries20.add(xYDataItem40);
        xYSeries20.clear();
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean45 = xYSeries44.isEmpty();
        xYSeries44.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries44.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener53);
        boolean boolean55 = xYSeries44.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries44.remove((int) (short) 0);
        xYSeries20.add(xYDataItem57);
        xYSeries14.setKey((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57, true, false);
        xYSeries1.add(xYDataItem57, false);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        int int68 = xYSeries66.indexOf((java.lang.Number) 0.0d);
        boolean boolean69 = xYSeries66.getNotify();
        xYSeries66.add((java.lang.Number) 10.0f, (java.lang.Number) 10.0f, false);
        boolean boolean74 = xYSeries66.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        int int19 = xYSeries1.getItemCount();
        boolean boolean20 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((double) 3, (double) 10.0f);
        xYSeries1.add((java.lang.Number) (byte) 100, (java.lang.Number) (-3));
        java.lang.Object obj30 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 100.0f);
        java.lang.String str9 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        int int12 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = null; // flaky: xYSeries1.getDataItem((-3));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        int int8 = xYSeries1.getItemCount();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) 0.0d, true);
        xYSeries1.updateByIndex(2, (java.lang.Number) 1.0f);
        int int24 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries28.add(1.0d, 0.0d);
        boolean boolean32 = xYSeries28.isEmpty();
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
        xYSeries34.clear();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean59 = xYSeries58.isEmpty();
        xYSeries58.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries58.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener67);
        boolean boolean69 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries58.remove((int) (short) 0);
        xYSeries34.add(xYDataItem71);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem71);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, true, false);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false, false);
        xYSeries1.add(xYDataItem71, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean30 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list40 = xYSeries34.getItems();
        boolean boolean41 = xYSeries1.equals((java.lang.Object) xYSeries34);
        int int42 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '4', (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
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
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (short) 0, true);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        int int26 = xYSeries20.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries20.addPropertyChangeListener(propertyChangeListener27);
        int int29 = xYSeries20.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        int int33 = xYSeries31.getMaximumItemCount();
        xYSeries31.clear();
        boolean boolean35 = xYSeries31.getAutoSort();
        xYSeries31.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries31.add(xYDataItem61);
        java.lang.Object obj64 = null;
        boolean boolean65 = xYSeries31.equals(obj64);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean71 = xYSeries70.isEmpty();
        xYSeries70.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries70.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries70.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries70.addPropertyChangeListener(propertyChangeListener80);
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries70.remove((int) (short) 0);
        xYSeries31.add(xYDataItem83, false);
        xYSeries20.add(xYDataItem83, false);
        xYSeries1.add(xYDataItem83, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener90 = null;
        xYSeries1.removeChangeListener(seriesChangeListener90);
        java.lang.String str92 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem83);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy(10, (int) 'a');
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries10.setDescription("");
        xYSeries10.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries10.setMaximumItemCount(2);
        int int19 = xYSeries10.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        java.lang.Object obj23 = xYSeries21.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.addChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str28 = xYSeries27.getDescription();
        xYSeries27.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        boolean boolean43 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries32.remove((int) (short) 0);
        xYSeries27.add(xYDataItem45);
        xYSeries21.add(xYDataItem45);
        xYSeries10.add(xYDataItem45, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true);
        xYSeries1.add(xYDataItem45);
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
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75);
        xYSeries1.add(xYDataItem75, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(xYSeries58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 1L);
        int int11 = xYSeries1.indexOf((java.lang.Number) (-1L));
        xYSeries1.add((double) '#', (double) (short) 100, false);
        xYSeries1.add((double) 0, (double) 0.0f, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries23.clear();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener25);
        int int27 = xYSeries23.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener28);
        xYSeries23.add((double) '#', (java.lang.Number) 10.0d);
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        xYSeries23.add(xYDataItem63);
        boolean boolean71 = xYSeries1.equals((java.lang.Object) xYSeries23);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener72);
        xYSeries23.add((double) 0.0f, (java.lang.Number) 100.0f, false);
        java.lang.Comparable comparable78 = xYSeries23.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + comparable78 + "' != '" + 100.0d + "'", comparable78, 100.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        xYSeries1.add(xYDataItem19);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem19);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem19, false, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        boolean boolean6 = xYSeries5.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        int int10 = xYSeries8.getMaximumItemCount();
        xYSeries8.clear();
        boolean boolean12 = xYSeries8.getAutoSort();
        xYSeries8.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries8.add(xYDataItem38);
        java.lang.Object obj41 = null;
        boolean boolean42 = xYSeries8.equals(obj41);
        xYSeries8.clear();
        xYSeries8.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        xYSeries47.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries47.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries47.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener57);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries47.remove((int) (short) 0);
        xYSeries8.add(xYDataItem60, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, true);
        xYSeries5.add(xYDataItem60, true);
        boolean boolean67 = xYSeries5.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.delete((int) (short) 100, 0);
        java.lang.String str17 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries21.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.removeChangeListener(seriesChangeListener24);
        xYSeries21.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries21.remove((java.lang.Number) 10L);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries36.add(1.0d, 0.0d);
        boolean boolean40 = xYSeries36.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str43 = xYSeries42.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries42.createCopy((int) (byte) 1, 10);
        int int47 = xYSeries42.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries49.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener58);
        boolean boolean60 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries49.remove((int) (short) 0);
        xYSeries42.add(xYDataItem62);
        xYSeries42.clear();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean67 = xYSeries66.isEmpty();
        xYSeries66.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries66.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener75);
        boolean boolean77 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries66.remove((int) (short) 0);
        xYSeries42.add(xYDataItem79);
        xYSeries36.setKey((java.lang.Comparable) xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, true, false);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, true);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem79);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 100, (double) (byte) -1);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (short) 0, true);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean21 = xYSeries20.isEmpty();
        xYSeries20.add(100.0d, (java.lang.Number) 1L, true);
        int int26 = xYSeries20.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries20.addPropertyChangeListener(propertyChangeListener27);
        int int29 = xYSeries20.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        int int33 = xYSeries31.getMaximumItemCount();
        xYSeries31.clear();
        boolean boolean35 = xYSeries31.getAutoSort();
        xYSeries31.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries31.add(xYDataItem61);
        java.lang.Object obj64 = null;
        boolean boolean65 = xYSeries31.equals(obj64);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean71 = xYSeries70.isEmpty();
        xYSeries70.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries70.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries70.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries70.addPropertyChangeListener(propertyChangeListener80);
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries70.remove((int) (short) 0);
        xYSeries31.add(xYDataItem83, false);
        xYSeries20.add(xYDataItem83, false);
        xYSeries1.add(xYDataItem83, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener90 = null;
        xYSeries1.removeChangeListener(seriesChangeListener90);
        boolean boolean92 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem83);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str7 = xYSeries6.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (byte) 1, 10);
        xYSeries10.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries10.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries10.getDataItem(0);
        boolean boolean23 = xYSeries3.equals((java.lang.Object) 0);
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) (-1.0f), true);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries3.addOrUpdate((double) 4, (double) 0L);
        java.lang.Object obj31 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = xYSeries3.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(xYDataItem30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        java.lang.Class<?> wildcardClass9 = comparable8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) 1);
        xYSeries1.updateByIndex(0, (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.add((double) 10, (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries10.add(1.0d, 0.0d);
        boolean boolean14 = xYSeries10.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str17 = xYSeries16.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, 10);
        int int21 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean24 = xYSeries23.isEmpty();
        xYSeries23.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries23.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries23.remove((int) (short) 0);
        xYSeries16.add(xYDataItem36);
        xYSeries16.clear();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries16.add(xYDataItem53);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53, true, false);
        xYSeries3.add(xYDataItem53, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.addPropertyChangeListener(propertyChangeListener62);
        xYSeries61.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str68 = xYSeries67.getDescription();
        boolean boolean69 = xYSeries67.isEmpty();
        xYSeries67.fireSeriesChanged();
        xYSeries67.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries77 = xYSeries67.createCopy(0, (-1));
        xYSeries67.add((double) (short) 10, (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries67.addOrUpdate((double) 0L, (-1.0d));
        double[][] doubleArray85 = xYSeries67.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener86 = null;
        xYSeries67.removeChangeListener(seriesChangeListener86);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries67.getDataItem((int) (byte) 1);
        xYSeries61.add(xYDataItem89, false);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        xYSeries94.add((java.lang.Number) 100.0f, (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYSeries77);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 10, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj11 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        xYSeries1.setMaximumItemCount((int) (short) 10);
        xYSeries1.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        xYSeries1.add((double) 2, (double) (short) 10, true);
        int int31 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries1.addOrUpdate((double) (short) 0, 1.0d);
        boolean boolean37 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = xYSeries1.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries14.createCopy((int) (byte) 1, 10);
        xYSeries18.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries18.add((double) (short) 1, (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass26 = xYSeries18.getClass();
        boolean boolean27 = xYSeries1.equals((java.lang.Object) wildcardClass26);
        int int28 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean14 = xYSeries13.isEmpty();
        xYSeries13.add(100.0d, (java.lang.Number) 1L, true);
        int int19 = xYSeries13.getItemCount();
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
        xYSeries13.add(xYDataItem41, false);
        boolean boolean45 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries47.setDescription("");
        java.lang.Object obj50 = xYSeries47.clone();
        double[][] doubleArray51 = xYSeries47.toArray();
        xYSeries47.add((double) 'a', (double) 0);
        boolean boolean55 = xYSeries1.equals((java.lang.Object) 'a');
        xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        xYSeries1.removeChangeListener(seriesChangeListener59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries16.clear();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries16.addPropertyChangeListener(propertyChangeListener18);
        int int20 = xYSeries16.getItemCount();
        java.lang.Number number22 = null;
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries16.addOrUpdate((java.lang.Number) 2, number22);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.isEmpty();
        xYSeries25.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries25.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener34);
        boolean boolean36 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries25.remove((int) (short) 0);
        xYSeries16.add(xYDataItem38, false);
        xYSeries1.add(xYDataItem38, false);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, false, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        java.lang.Number number43 = null;
        xYSeries1.update((java.lang.Number) (byte) 1, number43);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) 10L);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = null; // flaky: xYSeries1.getY((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem10);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(0.0d, (double) 0);
        java.lang.String str14 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean6 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.delete((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        int int19 = xYSeries1.getItemCount();
        boolean boolean20 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((double) 3, (double) 10.0f);
        xYSeries1.add((java.lang.Number) (byte) 100, (java.lang.Number) (-3));
        int int30 = xYSeries1.getItemCount();
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, false, false);
        xYSeries3.add(0.0d, (double) '4');
        xYSeries3.add((double) (-1L), (java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.getDataItem(0);
        org.junit.Assert.assertNotNull(xYDataItem11);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, false, false);
        xYSeries3.setMaximumItemCount(4);
        boolean boolean6 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.Object obj40 = xYSeries1.clone();
        xYSeries1.add((double) 1.0f, (java.lang.Number) 10L);
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) 10.0f, false);
        boolean boolean48 = xYSeries1.isEmpty();
        java.lang.Number number49 = null;
        java.lang.Number number50 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number49, number50, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries11.createCopy((int) (byte) 1, 10);
        int int16 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries18.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove((int) (short) 0);
        xYSeries11.add(xYDataItem31);
        xYSeries1.add(xYDataItem31);
        boolean boolean34 = xYSeries1.getNotify();
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        boolean boolean37 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        java.lang.Number number6 = null;
        xYSeries1.add((java.lang.Number) 1, number6, false);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries10.getAutoSort();
        java.lang.String str22 = xYSeries10.getDescription();
        int int24 = xYSeries10.indexOf((java.lang.Number) 0);
        xYSeries10.add((java.lang.Number) 2, (java.lang.Number) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries29.addChangeListener(seriesChangeListener30);
        java.util.List list32 = xYSeries29.getItems();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str35 = xYSeries34.getDescription();
        xYSeries34.clear();
        xYSeries34.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries34.addPropertyChangeListener(propertyChangeListener41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        java.lang.Object obj45 = xYSeries34.clone();
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean48 = xYSeries47.isEmpty();
        int int49 = xYSeries47.getMaximumItemCount();
        xYSeries47.clear();
        boolean boolean51 = xYSeries47.getAutoSort();
        xYSeries47.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str58 = xYSeries57.getDescription();
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries57.createCopy((int) (byte) 1, 10);
        int int62 = xYSeries57.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean65 = xYSeries64.isEmpty();
        xYSeries64.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries64.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries64.remove((int) (short) 0);
        xYSeries57.add(xYDataItem77);
        xYSeries47.add(xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77);
        xYSeries34.add(xYDataItem77);
        xYSeries29.setKey((java.lang.Comparable) xYDataItem77);
        xYSeries10.add(xYDataItem77, true);
        xYSeries1.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
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
        xYSeries1.setKey((java.lang.Comparable) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, false, true);
        java.lang.String str4 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        int int9 = xYSeries3.indexOf((java.lang.Number) (short) -1);
        boolean boolean10 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((double) '4', (double) (-1));
        xYSeries3.add((double) 0, (double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        xYSeries1.delete((int) (short) 10, 3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.getAutoSort();
        java.lang.Object obj10 = xYSeries8.clone();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries8.addOrUpdate((double) (short) 1, (double) 100L);
        int int14 = xYSeries8.getMaximumItemCount();
        xYSeries8.add((double) 'a', 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries8.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem19, true);
        xYSeries1.add(xYDataItem19, true);
        java.util.List list24 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(1, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Object obj12 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        int int16 = xYSeries14.getMaximumItemCount();
        xYSeries14.clear();
        boolean boolean18 = xYSeries14.getAutoSort();
        xYSeries14.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str25 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries24.createCopy((int) (byte) 1, 10);
        int int29 = xYSeries24.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean32 = xYSeries31.isEmpty();
        xYSeries31.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries31.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener40);
        boolean boolean42 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries31.remove((int) (short) 0);
        xYSeries24.add(xYDataItem44);
        xYSeries14.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        xYSeries1.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries50.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) (short) -1);
        boolean boolean8 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        boolean boolean12 = xYSeries1.getNotify();
        xYSeries1.updateByIndex(0, (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        int int7 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        int int14 = xYSeries12.getMaximumItemCount();
        xYSeries12.clear();
        boolean boolean16 = xYSeries12.getAutoSort();
        xYSeries12.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries12.add(xYDataItem42);
        java.lang.Object obj45 = null;
        boolean boolean46 = xYSeries12.equals(obj45);
        xYSeries12.clear();
        xYSeries12.setMaximumItemCount((int) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean52 = xYSeries51.isEmpty();
        xYSeries51.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries51.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries51.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries51.addPropertyChangeListener(propertyChangeListener61);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries51.remove((int) (short) 0);
        xYSeries12.add(xYDataItem64, false);
        xYSeries1.add(xYDataItem64, false);
        xYSeries1.delete(0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean18 = xYSeries17.getAutoSort();
        java.lang.Object obj19 = xYSeries17.clone();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries17);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (-2), (double) 100);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries15.add(1.0d, 0.0d);
        boolean boolean19 = xYSeries15.isEmpty();
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
        xYSeries21.clear();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries21.add(xYDataItem58);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true);
        int int65 = xYSeries64.getItemCount();
        java.lang.Comparable comparable66 = xYSeries64.getKey();
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries70.clear();
        xYSeries70.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries70.addPropertyChangeListener(propertyChangeListener76);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries70.addChangeListener(seriesChangeListener78);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries70.addPropertyChangeListener(propertyChangeListener80);
        java.lang.Object obj82 = xYSeries70.clone();
        boolean boolean83 = xYSeries64.equals(obj82);
        boolean boolean84 = xYSeries64.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(comparable66);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        java.lang.Number number14 = null;
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) 10.0d, number14);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 0L);
        double[][] doubleArray19 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean11 = xYSeries10.isEmpty();
        xYSeries10.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries10.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener19);
        xYSeries10.setKey((java.lang.Comparable) 100);
        java.lang.Number number24 = xYSeries10.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str27 = xYSeries26.getDescription();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries26.createCopy((int) (byte) 1, 10);
        int int31 = xYSeries26.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries26.add(xYDataItem46);
        xYSeries10.add(xYDataItem46);
        xYSeries1.add(xYDataItem46);
        int int50 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 32, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        java.util.List list4 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) (-1.0f), (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str7 = xYSeries6.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        xYSeries14.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries14.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener23);
        boolean boolean25 = xYSeries14.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries14.remove((int) (short) 0);
        xYSeries12.add(xYDataItem27, false);
        xYSeries6.add(xYDataItem27, true);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries6.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries6.clear();
        boolean boolean36 = xYSeries6.getAllowDuplicateXValues();
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
        xYSeries38.clear();
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean63 = xYSeries62.isEmpty();
        xYSeries62.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries62.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries62.removePropertyChangeListener(propertyChangeListener71);
        boolean boolean73 = xYSeries62.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries62.remove((int) (short) 0);
        xYSeries38.add(xYDataItem75);
        xYSeries6.add(xYDataItem75);
        xYSeries1.add(xYDataItem75);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener79);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) 4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1), (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(0, (-1));
        xYSeries1.add((double) (short) 10, (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((double) 0L, (-1.0d));
        boolean boolean19 = xYSeries1.getAllowDuplicateXValues();
        int int20 = xYSeries1.getItemCount();
        xYSeries1.delete(2147483647, 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean6 = xYSeries5.isEmpty();
        int int7 = xYSeries5.getMaximumItemCount();
        xYSeries5.clear();
        boolean boolean9 = xYSeries5.getAutoSort();
        xYSeries5.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries15.createCopy((int) (byte) 1, 10);
        int int20 = xYSeries15.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries22.remove((int) (short) 0);
        xYSeries15.add(xYDataItem35);
        xYSeries5.add(xYDataItem35);
        xYSeries3.add(xYDataItem35, false);
        xYSeries3.clear();
        int int41 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) 0, (java.lang.Number) (-1.0d));
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
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66);
        xYSeries3.add(xYDataItem66);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 1);
        xYSeries1.clear();
        boolean boolean18 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((double) 10.0f, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries15.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean26 = xYSeries25.getAutoSort();
        java.lang.Object obj27 = xYSeries25.clone();
        xYSeries25.setMaximumItemCount((int) ' ');
        xYSeries25.setMaximumItemCount((int) (byte) 10);
        boolean boolean32 = xYSeries25.isEmpty();
        java.lang.Comparable comparable33 = xYSeries25.getKey();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries37.add(1.0d, 0.0d);
        boolean boolean41 = xYSeries37.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str44 = xYSeries43.getDescription();
        org.jfree.data.xy.XYSeries xYSeries47 = xYSeries43.createCopy((int) (byte) 1, 10);
        int int48 = xYSeries43.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean51 = xYSeries50.isEmpty();
        xYSeries50.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries50.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries50.remove((int) (short) 0);
        xYSeries43.add(xYDataItem63);
        xYSeries43.clear();
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean68 = xYSeries67.isEmpty();
        xYSeries67.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries67.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener76);
        boolean boolean78 = xYSeries67.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries67.remove((int) (short) 0);
        xYSeries43.add(xYDataItem80);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true, false);
        xYSeries25.setKey((java.lang.Comparable) xYDataItem80);
        xYSeries15.add(xYDataItem80);
        xYSeries1.add(xYDataItem80, false);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (byte) 100 + "'", comparable33, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(xYSeries47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries5.getDataItem(0);
        xYSeries5.add(100.0d, (java.lang.Number) 100L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries24 = null; // flaky: xYSeries5.createCopy((-1), 3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.getAutoSort();
        java.lang.Object obj13 = xYSeries11.clone();
        xYSeries11.setMaximumItemCount((int) ' ');
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        boolean boolean18 = xYSeries11.isEmpty();
        java.lang.Comparable comparable19 = xYSeries11.getKey();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries23.add(1.0d, 0.0d);
        boolean boolean27 = xYSeries23.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        int int34 = xYSeries29.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries29.add(xYDataItem49);
        xYSeries29.clear();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean54 = xYSeries53.isEmpty();
        xYSeries53.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries53.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener62);
        boolean boolean64 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries53.remove((int) (short) 0);
        xYSeries29.add(xYDataItem66);
        xYSeries23.setKey((java.lang.Comparable) xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true, false);
        xYSeries11.setKey((java.lang.Comparable) xYDataItem66);
        xYSeries1.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 100 + "'", comparable19, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.setDescription("hi!");
        int int17 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        xYSeries1.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.removeChangeListener(seriesChangeListener20);
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) 0L, false);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries1.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 10L);
        java.util.List list29 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (short) 1, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.addChangeListener(seriesChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        java.util.List list45 = xYSeries19.getItems();
        int int47 = xYSeries19.indexOf((java.lang.Number) (short) -1);
        xYSeries19.setKey((java.lang.Comparable) 'a');
        boolean boolean50 = xYSeries3.equals((java.lang.Object) 'a');
        java.lang.String str51 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        double[][] doubleArray10 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) (byte) 10, 4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        xYSeries9.clear();
        xYSeries9.add(0.0d, (double) (short) 10, false);
        java.util.List list16 = xYSeries9.getItems();
        xYSeries9.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        boolean boolean21 = xYSeries9.getAutoSort();
        java.lang.Comparable comparable22 = xYSeries9.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries9.remove((java.lang.Number) (-1L));
        xYSeries7.add(xYDataItem24, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.getAutoSort();
        java.lang.Object obj30 = xYSeries28.clone();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries28.addOrUpdate((double) (short) 1, (double) 100L);
        int int34 = xYSeries28.getMaximumItemCount();
        xYSeries28.add((double) 'a', 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries28.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true);
        xYSeries7.add(xYDataItem39);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.setMaximumItemCount(3);
        xYSeries3.fireSeriesChanged();
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (byte) 1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean13 = xYSeries12.isEmpty();
        xYSeries12.add(100.0d, (java.lang.Number) 1L, true);
        int int18 = xYSeries12.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str21 = xYSeries20.getDescription();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries20.createCopy((int) (byte) 1, 10);
        int int25 = xYSeries20.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries20.add(xYDataItem40);
        xYSeries12.add(xYDataItem40, false);
        xYSeries3.add(xYDataItem40);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, true, true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str50 = xYSeries49.getDescription();
        double[][] doubleArray51 = xYSeries49.toArray();
        xYSeries49.add((double) (byte) -1, (double) (byte) 10, true);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries49.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        boolean boolean59 = xYSeries47.equals((java.lang.Object) xYDataItem58);
        xYSeries47.add(0.0d, (java.lang.Number) (byte) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries66 = null; // flaky: xYSeries47.createCopy((-3), (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        int int19 = xYSeries1.getItemCount();
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.delete((int) (short) 100, 0);
        xYSeries1.setNotify(false);
        xYSeries1.add((double) 32, (double) (-3), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str12 = xYSeries11.getDescription();
        xYSeries11.clear();
        xYSeries11.add(0.0d, (double) (short) 10, false);
        java.util.List list18 = xYSeries11.getItems();
        xYSeries11.add((java.lang.Number) (-1), (java.lang.Number) (byte) 0, false);
        boolean boolean23 = xYSeries11.getAutoSort();
        boolean boolean24 = xYSeries1.equals((java.lang.Object) boolean23);
        xYSeries1.clear();
        boolean boolean26 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
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
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, true);
        xYSeries17.add((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f, false);
        boolean boolean22 = xYSeries17.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add((java.lang.Number) 2147483647, (java.lang.Number) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.updateByIndex((int) '#', (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
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
        xYSeries31.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries31.removeChangeListener(seriesChangeListener55);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean59 = xYSeries58.isEmpty();
        xYSeries58.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries58.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries58.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries58.addPropertyChangeListener(propertyChangeListener68);
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries58.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71);
        boolean boolean73 = xYSeries31.equals((java.lang.Object) xYDataItem71);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem71);
        xYSeries1.add((java.lang.Number) (-4), (java.lang.Number) (-1), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        java.util.List list2 = xYSeries1.getItems();
        xYSeries1.add(0.0d, (double) 10L);
        xYSeries1.add((double) (short) 10, (double) 32, true);
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries14.createCopy((int) (byte) 1, 10);
        xYSeries18.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str23 = xYSeries22.getDescription();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries22.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean31 = xYSeries30.isEmpty();
        xYSeries30.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries30.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries30.remove((int) (short) 0);
        xYSeries28.add(xYDataItem43, false);
        xYSeries22.add(xYDataItem43, true);
        xYSeries18.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem43);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        xYSeries1.setMaximumItemCount(2);
        java.util.List list9 = xYSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = xYSeries1.getDescription();
        java.lang.Class<?> wildcardClass12 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        xYSeries1.delete((int) (short) 100, 10);
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries1.addOrUpdate((java.lang.Number) 4, (java.lang.Number) 2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNull(xYDataItem51);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(0, (-1));
        java.lang.String str12 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) '4', (-3));
        boolean boolean18 = xYSeries17.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((int) (short) 1, (int) (short) -1);
        java.util.List list11 = xYSeries10.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries10.addOrUpdate(0.0d, (double) (short) 10);
        xYSeries10.add((java.lang.Number) (-2), (java.lang.Number) (short) 10, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        xYSeries1.delete((int) (short) 10, 3);
        int int6 = xYSeries1.indexOf((java.lang.Number) (-3.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        xYSeries1.add((java.lang.Number) 4, (java.lang.Number) 1.0f, false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        int int14 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-3.0d), (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) 100.0f, (java.lang.Number) (-2), false);
        int int9 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) 2, (double) 0.0f, false);
        java.util.List list14 = xYSeries3.getItems();
        xYSeries3.add((double) (-2), (java.lang.Number) (byte) 100, true);
        java.lang.String str19 = xYSeries3.getDescription();
        xYSeries3.add((double) '#', (java.lang.Number) 0, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        xYSeries1.add(100.0d, (java.lang.Number) 10.0f, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean12 = xYSeries11.isEmpty();
        java.lang.Object obj13 = xYSeries11.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries11.addChangeListener(seriesChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries22.remove((int) (short) 0);
        xYSeries17.add(xYDataItem35);
        xYSeries11.add(xYDataItem35);
        xYSeries1.add(xYDataItem35);
        java.lang.Number number40 = xYSeries1.getX((int) (short) 0);
        int int41 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries1.createCopy(2147483647, (int) '4');
        boolean boolean45 = xYSeries44.getNotify();
        java.lang.Object obj46 = xYSeries44.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + (short) 1 + "'", number40, (short) 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(1, (int) (byte) -1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 100 + "'", comparable12, (byte) 100);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        boolean boolean28 = xYSeries1.getNotify();
        java.lang.Object obj29 = xYSeries1.clone();
        java.lang.Number number31 = xYSeries1.getY((int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries1.addOrUpdate(1.0d, (double) '#');
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + (byte) -1 + "'", number31, (byte) -1);
        org.junit.Assert.assertNull(xYDataItem34);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) 100L, (java.lang.Number) 100.0f);
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 3);
        java.util.List list17 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        java.lang.Object obj15 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.getDataItem(0);
        boolean boolean18 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Object obj21 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        double[][] doubleArray11 = xYSeries1.toArray();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 'a', (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (-1.0d), true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean23 = xYSeries22.isEmpty();
        xYSeries22.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries22.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = xYSeries22.getAutoSort();
        int int34 = xYSeries22.getItemCount();
        java.lang.String str35 = xYSeries22.getDescription();
        int int37 = xYSeries22.indexOf((java.lang.Number) (byte) 0);
        int int38 = xYSeries22.getItemCount();
        boolean boolean39 = xYSeries1.equals((java.lang.Object) xYSeries22);
        boolean boolean40 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        int int4 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener5);
        xYSeries1.setDescription("");
        int int10 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list5 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setMaximumItemCount((int) '4');
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10L + "'", comparable7, 10L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (-2), (double) 100);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries15.add(1.0d, 0.0d);
        boolean boolean19 = xYSeries15.isEmpty();
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
        xYSeries21.clear();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean46 = xYSeries45.isEmpty();
        xYSeries45.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries45.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener54);
        boolean boolean56 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove((int) (short) 0);
        xYSeries21.add(xYDataItem58);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem58);
        xYSeries1.add(xYDataItem58, false);
        java.lang.Object obj63 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        xYSeries1.removeChangeListener(seriesChangeListener64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries3.add(1.0d, 0.0d);
        boolean boolean7 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str10 = xYSeries9.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries9.createCopy((int) (byte) 1, 10);
        int int14 = xYSeries9.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean17 = xYSeries16.isEmpty();
        xYSeries16.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries16.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener25);
        boolean boolean27 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        xYSeries9.add(xYDataItem29);
        xYSeries9.clear();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        xYSeries33.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries33.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener42);
        boolean boolean44 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries33.remove((int) (short) 0);
        xYSeries9.add(xYDataItem46);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, false);
        xYSeries51.add((double) 'a', (double) 100L, false);
        java.lang.Comparable comparable56 = xYSeries51.getKey();
        xYSeries51.add((double) (-1.0f), (java.lang.Number) (-2));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertNotNull(comparable56);
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
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) (short) 100);
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        java.lang.String str15 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries19.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean28 = xYSeries27.isEmpty();
        xYSeries27.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries27.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries27.remove((int) (short) 0);
        xYSeries25.add(xYDataItem40, false);
        xYSeries19.add(xYDataItem40, true);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries19.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean48 = xYSeries19.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        xYSeries52.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list58 = xYSeries52.getItems();
        boolean boolean59 = xYSeries19.equals((java.lang.Object) xYSeries52);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries19.addOrUpdate((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries19.remove((java.lang.Number) 0.0d);
        xYSeries1.add(xYDataItem64, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        xYSeries67.add((java.lang.Number) (short) 1, (java.lang.Number) (short) 1, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(xYDataItem62);
        org.junit.Assert.assertNotNull(xYDataItem64);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(100.0d, (double) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        int int17 = xYSeries1.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries23.clear();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener25);
        int int27 = xYSeries23.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries23.createCopy((int) (short) 1, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean33 = xYSeries32.isEmpty();
        xYSeries32.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries32.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener41);
        xYSeries32.setKey((java.lang.Comparable) 100);
        xYSeries32.delete((int) (short) 100, 0);
        java.lang.String str48 = xYSeries32.getDescription();
        boolean boolean49 = xYSeries32.getAutoSort();
        xYSeries32.add((java.lang.Number) (-1L), (java.lang.Number) (-1.0d), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries32.addChangeListener(seriesChangeListener54);
        xYSeries32.add((double) (short) 100, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean61 = xYSeries60.isEmpty();
        java.lang.Object obj62 = xYSeries60.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries60.addChangeListener(seriesChangeListener63);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str67 = xYSeries66.getDescription();
        xYSeries66.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean72 = xYSeries71.isEmpty();
        xYSeries71.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries71.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener80);
        boolean boolean82 = xYSeries71.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries71.remove((int) (short) 0);
        xYSeries66.add(xYDataItem84);
        xYSeries60.add(xYDataItem84);
        xYSeries32.add(xYDataItem84);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem84);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem84);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem84);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem84, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener17);
        xYSeries1.clear();
        double[][] doubleArray20 = xYSeries1.toArray();
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        xYSeries24.setKey((java.lang.Comparable) 100);
        xYSeries24.delete((int) (short) 100, 0);
        java.lang.String str40 = xYSeries24.getDescription();
        boolean boolean41 = xYSeries24.getAutoSort();
        xYSeries24.add((java.lang.Number) (-1L), (java.lang.Number) (-1.0d), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries24.addChangeListener(seriesChangeListener46);
        xYSeries24.add((double) (short) 100, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean53 = xYSeries52.isEmpty();
        java.lang.Object obj54 = xYSeries52.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries52.addChangeListener(seriesChangeListener55);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str59 = xYSeries58.getDescription();
        xYSeries58.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean64 = xYSeries63.isEmpty();
        xYSeries63.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries63.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries63.removePropertyChangeListener(propertyChangeListener72);
        boolean boolean74 = xYSeries63.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem76 = xYSeries63.remove((int) (short) 0);
        xYSeries58.add(xYDataItem76);
        xYSeries52.add(xYDataItem76);
        xYSeries24.add(xYDataItem76);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem76);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(xYDataItem76);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        java.lang.Object obj15 = xYSeries1.clone();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries20.addChangeListener(seriesChangeListener21);
        double[][] doubleArray23 = xYSeries20.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1);
        java.lang.Number number17 = null;
        xYSeries1.add((java.lang.Number) 1.0f, number17, false);
        xYSeries1.add(1.0d, 0.0d, true);
        xYSeries1.add((double) 'a', (java.lang.Number) (-1L), false);
        java.util.List list28 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        xYSeries1.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((double) (short) 10, (double) 100);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false, true);
        boolean boolean4 = xYSeries3.getNotify();
        double[][] doubleArray5 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries3.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        xYSeries1.add((double) 100, (double) (-1L));
        java.lang.Object obj12 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        double[][] doubleArray11 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.setMaximumItemCount((int) (short) 100);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) (-2), 0.0d);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean16 = xYSeries15.isEmpty();
        xYSeries15.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener24);
        double[][] doubleArray26 = xYSeries15.toArray();
        xYSeries15.add((double) (byte) 1, (double) (byte) 1);
        java.lang.Number number31 = null;
        xYSeries15.add((java.lang.Number) 1.0f, number31, false);
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries15.createCopy(100, (int) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries40.clear();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries40.addPropertyChangeListener(propertyChangeListener42);
        xYSeries40.add((double) (byte) 0, (java.lang.Number) (byte) 1);
        xYSeries40.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean50 = xYSeries49.isEmpty();
        xYSeries49.add(100.0d, (java.lang.Number) 1L, true);
        int int55 = xYSeries49.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str58 = xYSeries57.getDescription();
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries57.createCopy((int) (byte) 1, 10);
        int int62 = xYSeries57.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean65 = xYSeries64.isEmpty();
        xYSeries64.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries64.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries64.remove((int) (short) 0);
        xYSeries57.add(xYDataItem77);
        xYSeries49.add(xYDataItem77, false);
        xYSeries40.add(xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem77);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem77);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true, false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        boolean boolean10 = xYSeries1.getAutoSort();
        boolean boolean11 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        xYSeries3.clear();
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add(1.0d, (java.lang.Number) (byte) 100, true);
        xYSeries3.add((double) ' ', (java.lang.Number) (byte) 0);
        xYSeries3.updateByIndex(0, (java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) 0.0d);
        java.lang.Number number11 = null;
        xYSeries1.add((double) (-4), number11, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem22);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        xYSeries29.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries34.remove((int) (short) 0);
        xYSeries29.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries27.add(xYDataItem47, false);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, true);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        boolean boolean6 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int16 = xYSeries7.getMaximumItemCount();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) int16);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        xYSeries1.add(10.0d, 10.0d, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        int int26 = xYSeries24.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.delete((int) (byte) 10, 1);
        java.util.List list32 = xYSeries24.getItems();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries34.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int43 = xYSeries34.getMaximumItemCount();
        xYSeries34.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries34.addPropertyChangeListener(propertyChangeListener47);
        java.lang.Object obj49 = null;
        boolean boolean50 = xYSeries34.equals(obj49);
        int int52 = xYSeries34.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries34.remove((java.lang.Number) 1L);
        xYSeries24.add(xYDataItem54);
        xYSeries1.add(xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false, true);
        xYSeries59.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        boolean boolean20 = xYSeries1.getNotify();
        boolean boolean21 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 10L, false);
        xYSeries1.clear();
        xYSeries1.add((double) (byte) 0, (java.lang.Number) (-1L), false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries1.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 2147483647, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2147483647");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        xYSeries1.setKey((java.lang.Comparable) "hi!");
        xYSeries1.add((double) ' ', (double) 2, true);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean30 = xYSeries29.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries29.removeChangeListener(seriesChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries29.createCopy(2, (int) (short) -1);
        boolean boolean38 = xYSeries1.equals((java.lang.Object) 2);
        double[][] doubleArray39 = xYSeries1.toArray();
        int int41 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean44 = xYSeries43.isEmpty();
        xYSeries43.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries43.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener52);
        boolean boolean54 = xYSeries43.getAutoSort();
        int int55 = xYSeries43.getItemCount();
        int int56 = xYSeries43.getMaximumItemCount();
        int int58 = xYSeries43.indexOf((java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener59);
        xYSeries43.add((double) 3, (java.lang.Number) 1.0f, true);
        boolean boolean65 = xYSeries1.equals((java.lang.Object) true);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener66);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries6.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener15);
        boolean boolean17 = xYSeries6.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries6.remove((int) (short) 0);
        xYSeries1.add(xYDataItem19);
        xYSeries1.add((double) '4', (java.lang.Number) (short) 100);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (byte) 10, 100.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1);
        int int7 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy(2147483647, 0);
        int int11 = xYSeries3.getMaximumItemCount();
        xYSeries3.setKey((java.lang.Comparable) false);
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        int int16 = xYSeries3.indexOf((java.lang.Number) (-1L));
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries3.createCopy(32, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(xYSeries19);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((double) 0, (-1.0d));
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        xYSeries17.clear();
        xYSeries17.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries17.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
        xYSeries17.update((java.lang.Number) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries17.addOrUpdate(0.0d, 0.0d);
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries17);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Comparable comparable36 = xYSeries17.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (byte) 100 + "'", comparable36, (byte) 100);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean29 = xYSeries28.isEmpty();
        xYSeries28.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries28.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries28.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries28.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41);
        boolean boolean43 = xYSeries1.equals((java.lang.Object) xYDataItem41);
        xYSeries1.fireSeriesChanged();
        java.lang.Number number45 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number45, (java.lang.Number) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        boolean boolean14 = xYSeries1.isEmpty();
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries21.clear();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener23);
        xYSeries21.setMaximumItemCount(3);
        xYSeries21.clear();
        boolean boolean28 = xYSeries21.getAutoSort();
        java.util.List list29 = xYSeries21.getItems();
        boolean boolean30 = xYSeries1.equals((java.lang.Object) xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        int int17 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
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
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) (short) 0);
        xYSeries1.clear();
        xYSeries1.setNotify(false);
        boolean boolean20 = xYSeries1.getNotify();
        xYSeries1.add(0.0d, (double) ' ', false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = xYSeries1.isEmpty();
        boolean boolean5 = xYSeries1.getAutoSort();
        int int6 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries8.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries8.removeChangeListener(seriesChangeListener11);
        xYSeries8.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries8.remove((java.lang.Number) 10L);
        xYSeries1.add(xYDataItem17, true);
        double[][] doubleArray20 = xYSeries1.toArray();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = xYSeries1.isEmpty();
        xYSeries1.add((double) 2, (double) (short) 10, false);
        java.util.List list21 = xYSeries1.getItems();
        int int23 = xYSeries1.indexOf((java.lang.Number) 10);
        int int25 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray11 = xYSeries1.toArray();
        xYSeries1.add((double) (short) 0, (-1.0d), true);
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        xYSeries1.add((double) (-1L), (double) 100.0f, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        xYSeries1.add((double) 10L, (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.addOrUpdate((double) (short) 100, (double) (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        xYSeries3.setMaximumItemCount(3);
        xYSeries3.clear();
        boolean boolean10 = xYSeries3.getNotify();
        xYSeries3.add((double) (-1L), (double) 1.0f, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add(10.0d, (java.lang.Number) 1.0d);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        java.lang.Number number13 = xYSeries1.getX((int) (byte) 0);
        xYSeries1.delete((int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1.0d), (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 10.0d + "'", number13, 10.0d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 100, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.String str17 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.isEmpty();
        xYSeries19.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries19.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int28 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) 100, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries19.addPropertyChangeListener(propertyChangeListener32);
        java.lang.Object obj34 = null;
        boolean boolean35 = xYSeries19.equals(obj34);
        int int37 = xYSeries19.indexOf((java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries19.remove((java.lang.Number) 1L);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 0.0f, (java.lang.Number) (-3.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 3, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate((double) (byte) -1, (double) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener8);
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 1.0f);
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate(number13, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.isEmpty();
        int int23 = xYSeries21.getMaximumItemCount();
        xYSeries21.clear();
        boolean boolean25 = xYSeries21.getAutoSort();
        xYSeries21.add(100.0d, (java.lang.Number) 10.0f, true);
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
        xYSeries21.add(xYDataItem51);
        xYSeries19.add(xYDataItem51, false);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem51);
        xYSeries1.add(xYDataItem51);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAutoSort();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        java.lang.Object obj40 = xYSeries1.clone();
        xYSeries1.add((double) 1.0f, (java.lang.Number) 10L);
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) 10.0f, false);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries1.addOrUpdate((double) (short) 1, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries53 = xYSeries1.createCopy((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(xYDataItem50);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        java.lang.Number number15 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str18 = xYSeries17.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries17.createCopy((int) (byte) 1, 10);
        int int22 = xYSeries17.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener33);
        boolean boolean35 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries24.remove((int) (short) 0);
        xYSeries17.add(xYDataItem37);
        xYSeries1.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true, true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries45.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }
}
