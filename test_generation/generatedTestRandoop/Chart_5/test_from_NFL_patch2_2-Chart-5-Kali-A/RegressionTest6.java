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
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate(100.0d, (double) (-1.0f));
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        double[][] doubleArray19 = xYSeries1.toArray();
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 100, true);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-1));
        xYSeries1.add((double) 2, (java.lang.Number) 3, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true);
        java.lang.Number number59 = null;
        xYSeries57.add((double) 100, number59);
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
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.lang.Object obj5 = xYSeries3.clone();
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) ' ', (int) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = xYSeries3.equals((java.lang.Object) (byte) -1);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        int int15 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean69 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list70 = xYSeries1.getItems();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        int int6 = xYSeries1.indexOf((java.lang.Number) 1.0d);
        xYSeries1.add(10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries47.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (-2), (double) 100);
        double[][] doubleArray12 = xYSeries1.toArray();
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) 2147483647, false);
        xYSeries1.clear();
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (short) 10);
        boolean boolean12 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean15 = xYSeries14.isEmpty();
        java.lang.Object obj16 = xYSeries14.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener19);
        xYSeries14.add((double) (-1L), (java.lang.Number) 1.0d);
        double[][] doubleArray24 = xYSeries14.toArray();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        double[][] doubleArray6 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
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
        xYSeries12.clear();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries12.add(xYDataItem49);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries12.addChangeListener(seriesChangeListener51);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean55 = xYSeries54.isEmpty();
        int int56 = xYSeries54.getMaximumItemCount();
        boolean boolean57 = xYSeries54.getAutoSort();
        xYSeries54.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        xYSeries54.removeChangeListener(seriesChangeListener60);
        xYSeries54.clear();
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str65 = xYSeries64.getDescription();
        org.jfree.data.xy.XYSeries xYSeries68 = xYSeries64.createCopy((int) (byte) 1, 10);
        xYSeries68.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries68.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries68.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries68.getDataItem(0);
        xYSeries54.add(xYDataItem80);
        xYSeries12.add(xYDataItem80);
        xYSeries1.add(xYDataItem80);
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(xYSeries68);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean36 = xYSeries35.isEmpty();
        xYSeries35.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries35.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener44);
        xYSeries35.setKey((java.lang.Comparable) 100);
        java.lang.Number number49 = xYSeries35.getX((int) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str52 = xYSeries51.getDescription();
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries51.createCopy((int) (byte) 1, 10);
        int int56 = xYSeries51.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean59 = xYSeries58.isEmpty();
        xYSeries58.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries58.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener67);
        boolean boolean69 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries58.remove((int) (short) 0);
        xYSeries51.add(xYDataItem71);
        xYSeries35.add(xYDataItem71);
        xYSeries1.add(xYDataItem71);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + number49 + "' != '" + 100.0d + "'", number49, 100.0d);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        xYSeries1.add((double) 2, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        int int4 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener5);
        xYSeries1.add(0.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = xYSeries1.getNotify();
        java.lang.Number number12 = null;
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 0.0f, number12);
        xYSeries1.updateByIndex(0, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        xYSeries1.add(0.0d, (double) (short) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-1));
        int int11 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        xYSeries1.delete((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        double[][] doubleArray19 = xYSeries1.toArray();
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (byte) 100, true);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-1));
        java.lang.Comparable comparable27 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100 + "'", comparable27, 100);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        int int15 = xYSeries1.indexOf((java.lang.Number) 0);
        java.lang.Object obj16 = xYSeries1.clone();
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        xYSeries1.add(100.0d, (java.lang.Number) 0.0d);
        java.lang.Class<?> wildcardClass31 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true, true);
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.addChangeListener(seriesChangeListener16);
        boolean boolean18 = xYSeries1.isEmpty();
        int int20 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        double[][] doubleArray21 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        int int11 = xYSeries3.getMaximumItemCount();
        xYSeries3.fireSeriesChanged();
        java.lang.Number number14 = xYSeries3.getX(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 2 + "'", number14, 2);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        double[][] doubleArray6 = xYSeries1.toArray();
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getAutoSort();
        int int6 = xYSeries1.indexOf((java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(32, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries1.createCopy((int) (byte) 1, 10);
        xYSeries5.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries5.add((double) (short) 1, (java.lang.Number) (byte) 1);
        xYSeries5.setMaximumItemCount((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = xYSeries1.isEmpty();
        boolean boolean5 = xYSeries1.getAutoSort();
        int int6 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-1L), (double) 32, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        int int5 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries1.createCopy(10, (int) 'a');
        int int9 = xYSeries1.getMaximumItemCount();
        java.util.List list10 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.setMaximumItemCount(10);
        double[][] doubleArray13 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        boolean boolean29 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23, true);
        xYSeries30.add((-3.0d), (double) (byte) 0, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean8 = xYSeries7.isEmpty();
        xYSeries7.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries7.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener16);
        xYSeries7.setKey((java.lang.Comparable) 100);
        java.lang.Number number21 = xYSeries7.getX((int) (byte) 1);
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
        xYSeries7.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43, true, true);
        xYSeries1.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43, false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 100.0d + "'", number21, 100.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        boolean boolean26 = xYSeries25.getNotify();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.List list6 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = xYSeries1.clone();
        java.lang.Object obj10 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        double[][] doubleArray5 = xYSeries1.toArray();
        int int6 = xYSeries1.getMaximumItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) 10);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 100 + "'", comparable4, (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true, true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        int int53 = xYSeries51.indexOf((java.lang.Number) 100L);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries6.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries6.removeChangeListener(seriesChangeListener9);
        xYSeries6.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries6.setNotify(false);
        boolean boolean16 = xYSeries3.equals((java.lang.Object) false);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries3.addChangeListener(seriesChangeListener19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries3.getItemCount();
        java.lang.Number number9 = null;
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 2, number9);
        int int11 = xYSeries3.getItemCount();
        int int12 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        xYSeries1.setMaximumItemCount(1);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) -1, false);
        xYSeries1.add((double) ' ', (double) (byte) 1, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        xYSeries42.add(1.0d, (java.lang.Number) 10);
        boolean boolean46 = xYSeries42.getAllowDuplicateXValues();
        java.lang.Number number48 = null;
        xYSeries42.add((java.lang.Number) 4, number48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray11 = xYSeries1.toArray();
        int int13 = xYSeries1.indexOf((java.lang.Number) 10.0d);
        xYSeries1.add((double) (byte) -1, (double) 4, true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries17.removeChangeListener(seriesChangeListener23);
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 10.0d);
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(number12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        boolean boolean69 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (-1.0f));
        boolean boolean73 = xYSeries1.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        boolean boolean20 = xYSeries19.isEmpty();
        int int21 = xYSeries19.getMaximumItemCount();
        boolean boolean22 = xYSeries19.getAutoSort();
        xYSeries19.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries19.removeChangeListener(seriesChangeListener25);
        xYSeries19.clear();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str30 = xYSeries29.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries29.createCopy((int) (byte) 1, 10);
        xYSeries33.add(10.0d, (java.lang.Number) 100.0d, true);
        xYSeries33.add((double) (byte) 100, (java.lang.Number) 100.0f);
        xYSeries33.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries33.getDataItem(0);
        xYSeries19.add(xYDataItem45);
        xYSeries1.add(xYDataItem45);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = xYSeries1.getX(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries64.addOrUpdate((double) 10L, (double) 1.0f);
        xYSeries64.add((double) 0, (java.lang.Number) (short) -1);
        xYSeries64.add((double) 0, (double) (-3));
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean78 = xYSeries77.isEmpty();
        xYSeries77.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries77.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener86 = null;
        xYSeries77.removePropertyChangeListener(propertyChangeListener86);
        boolean boolean88 = xYSeries77.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem90 = xYSeries77.remove((int) (short) 0);
        xYSeries75.add(xYDataItem90, false);
        org.jfree.data.xy.XYSeries xYSeries95 = xYSeries75.createCopy((int) (byte) 10, 0);
        boolean boolean96 = xYSeries95.getAllowDuplicateXValues();
        boolean boolean97 = xYSeries95.getAllowDuplicateXValues();
        boolean boolean98 = xYSeries95.getAllowDuplicateXValues();
        boolean boolean99 = xYSeries64.equals((java.lang.Object) boolean98);
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
        org.junit.Assert.assertNull(xYDataItem67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(xYDataItem90);
        org.junit.Assert.assertNotNull(xYSeries95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = null; // flaky: xYSeries1.remove((java.lang.Number) 2147483647);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount(10);
        int int7 = xYSeries1.indexOf((java.lang.Number) 100);
        xYSeries1.add((double) 2, (java.lang.Number) (short) 10, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        xYSeries1.add((java.lang.Number) (short) 100, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray11 = xYSeries1.toArray();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.addOrUpdate((double) 10L, (double) (-1.0f));
        xYSeries1.setDescription("hi!");
        boolean boolean27 = xYSeries1.isEmpty();
        boolean boolean28 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Object obj5 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries3.createCopy(3, (int) '4');
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) 10.0d, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        boolean boolean12 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        xYSeries61.add(10.0d, (double) (byte) 10);
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.delete((int) (byte) 10, 1);
        boolean boolean9 = xYSeries1.getAutoSort();
        double[][] doubleArray10 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 1.0f);
        java.lang.Number number15 = xYSeries1.getX(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (short) 1 + "'", number15, (short) 1);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        int int40 = xYSeries1.getItemCount();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        xYSeries7.add((java.lang.Number) (byte) -1, (java.lang.Number) (-1.0f));
        java.lang.Object obj30 = xYSeries7.clone();
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        boolean boolean5 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        xYSeries1.add((double) (-1L), (double) 100.0f, true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str15 = xYSeries14.getDescription();
        boolean boolean16 = xYSeries14.isEmpty();
        xYSeries14.fireSeriesChanged();
        xYSeries14.add((double) (short) -1, (java.lang.Number) (byte) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries14.createCopy(0, (-1));
        xYSeries14.add((double) (short) 10, (java.lang.Number) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries14.remove((java.lang.Number) 10.0f);
        xYSeries1.add(xYDataItem30, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean22 = xYSeries21.getAutoSort();
        java.lang.Object obj23 = xYSeries21.clone();
        boolean boolean24 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean27 = xYSeries26.isEmpty();
        xYSeries26.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries26.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean35 = xYSeries26.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, false);
        xYSeries39.add(1.0d, 0.0d);
        boolean boolean43 = xYSeries39.isEmpty();
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
        xYSeries45.clear();
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean70 = xYSeries69.isEmpty();
        xYSeries69.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries69.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener78);
        boolean boolean80 = xYSeries69.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries69.remove((int) (short) 0);
        xYSeries45.add(xYDataItem82);
        xYSeries39.setKey((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true, false);
        xYSeries26.add(xYDataItem82, false);
        xYSeries21.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        xYSeries1.add(xYDataItem82, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57, false);
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.Comparable comparable25 = xYSeries21.getKey();
        xYSeries21.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (byte) 100 + "'", comparable25, (byte) 100);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Object obj3 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        xYSeries1.add((double) (-1L), (java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }
}
