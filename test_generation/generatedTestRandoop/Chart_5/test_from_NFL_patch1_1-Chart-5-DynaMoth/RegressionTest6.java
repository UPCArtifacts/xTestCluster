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
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        xYSeries10.clear();
        xYSeries10.add(0.0d, (double) (short) 10, false);
        java.util.List list17 = xYSeries10.getItems();
        int int18 = xYSeries10.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries10.removeChangeListener(seriesChangeListener19);
        int int22 = xYSeries10.indexOf((java.lang.Number) (short) 100);
        boolean boolean23 = xYSeries10.getAllowDuplicateXValues();
        java.lang.String str24 = xYSeries10.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries10.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str29 = xYSeries28.getDescription();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries28.createCopy((int) (byte) 1, 10);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean37 = xYSeries36.isEmpty();
        xYSeries36.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries36.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries36.remove((int) (short) 0);
        xYSeries34.add(xYDataItem49, false);
        xYSeries28.add(xYDataItem49, true);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries28.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean57 = xYSeries28.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener58);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean62 = xYSeries61.isEmpty();
        xYSeries61.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list67 = xYSeries61.getItems();
        boolean boolean68 = xYSeries28.equals((java.lang.Object) xYSeries61);
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries28.addOrUpdate((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries28.remove((java.lang.Number) 0.0d);
        xYSeries10.add(xYDataItem73, true);
        xYSeries3.add(xYDataItem73, false);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(xYDataItem71);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str2 = xYSeries1.getDescription();
        boolean boolean3 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) 1, (double) (byte) 1, true);
        xYSeries1.setMaximumItemCount(1);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) -1, false);
        java.lang.Number number16 = xYSeries1.getX(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 1.0d + "'", number16, 1.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 2147483647, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) (-2), true);
        java.lang.Comparable comparable76 = xYSeries1.getKey();
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
        org.junit.Assert.assertNotNull(comparable76);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        boolean boolean9 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (byte) 1, (double) 4, true);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        int int3 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.clear();
        xYSeries1.setDescription("hi!");
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (byte) 1, (double) 1L, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.lang.Number number11 = xYSeries1.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate(100.0d, (double) 0L);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) 100L, false);
        java.lang.Object obj20 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean35 = xYSeries34.isEmpty();
        xYSeries34.add(100.0d, (java.lang.Number) 1L, true);
        java.util.List list40 = xYSeries34.getItems();
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
        xYSeries34.add(xYDataItem71);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false);
        xYSeries1.add(xYDataItem71);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(xYSeries54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        boolean boolean93 = xYSeries1.getAllowDuplicateXValues();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0f), false);
        int int15 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) 100.0f, (java.lang.Number) (-1.0f), false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d, false, false);
        xYSeries23.clear();
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
        xYSeries23.add(xYDataItem71, true);
        xYSeries1.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        java.lang.Object obj57 = xYSeries51.clone();
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
        org.junit.Assert.assertNotNull(obj57);
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
        java.util.List list27 = xYSeries1.getItems();
        boolean boolean28 = xYSeries1.getNotify();
        java.lang.Object obj29 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        xYSeries1.add((double) (byte) 10, (double) (-1));
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
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
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        xYSeries1.setNotify(false);
        xYSeries1.clear();
        xYSeries1.add((double) (-1L), (double) (-1L), true);
        boolean boolean27 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.setKey((java.lang.Comparable) 0.0f);
        xYSeries1.add((double) (-1), (double) (byte) -1);
        boolean boolean8 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        int int11 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((java.lang.Number) (short) 0, (java.lang.Number) (short) 100, false);
        boolean boolean16 = xYSeries1.getAutoSort();
        boolean boolean17 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean20 = xYSeries19.getAutoSort();
        java.lang.Object obj21 = xYSeries19.clone();
        boolean boolean22 = xYSeries19.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean25 = xYSeries24.isEmpty();
        xYSeries24.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        boolean boolean33 = xYSeries24.isEmpty();
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
        xYSeries24.add(xYDataItem80, false);
        xYSeries19.add(xYDataItem80);
        boolean boolean89 = xYSeries19.getNotify();
        boolean boolean90 = xYSeries1.equals((java.lang.Object) boolean89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        xYSeries1.setNotify(true);
        xYSeries1.add((double) (short) 1, (java.lang.Number) 1, true);
        boolean boolean13 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        boolean boolean4 = xYSeries3.getAutoSort();
        int int5 = xYSeries3.getMaximumItemCount();
        int int6 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 10L);
        xYSeries1.setNotify(false);
        java.lang.Object obj11 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(1, (int) (byte) -1);
        xYSeries14.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(xYSeries14);
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
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-3), true);
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries1.add(0.0d, (double) ' ');
        double[][] doubleArray5 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) 100 + "'", comparable18, (byte) 100);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.lang.Object obj4 = xYSeries1.clone();
        int int5 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 100 + "'", comparable3, (byte) 100);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 100.0f);
        int int9 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        boolean boolean11 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) 100 + "'", comparable10, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.getAutoSort();
        java.lang.Object obj3 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        boolean boolean8 = xYSeries1.isEmpty();
        boolean boolean9 = xYSeries1.getNotify();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        int int3 = xYSeries1.getMaximumItemCount();
        boolean boolean4 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        boolean boolean8 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str11 = xYSeries10.getDescription();
        xYSeries10.clear();
        xYSeries10.fireSeriesChanged();
        xYSeries10.add((double) (byte) 1, (java.lang.Number) 0L, true);
        int int18 = xYSeries10.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        xYSeries22.setDescription("");
        xYSeries22.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, true);
        xYSeries22.setMaximumItemCount(2);
        int int31 = xYSeries22.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean34 = xYSeries33.isEmpty();
        java.lang.Object obj35 = xYSeries33.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries33.addChangeListener(seriesChangeListener36);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str40 = xYSeries39.getDescription();
        xYSeries39.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean45 = xYSeries44.isEmpty();
        xYSeries44.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries44.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener53);
        boolean boolean55 = xYSeries44.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries44.remove((int) (short) 0);
        xYSeries39.add(xYDataItem57);
        xYSeries33.add(xYDataItem57);
        xYSeries22.add(xYDataItem57, false);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57, true);
        xYSeries10.add(xYDataItem57, false);
        xYSeries1.add(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        xYSeries1.setKey((java.lang.Comparable) 100);
        xYSeries1.delete((int) (short) 100, 0);
        java.lang.Object obj17 = xYSeries1.clone();
        java.util.List list18 = xYSeries1.getItems();
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0d), false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false, true);
        java.util.List list4 = xYSeries3.getItems();
        java.lang.Comparable comparable5 = xYSeries3.getKey();
        boolean boolean6 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean9 = xYSeries8.isEmpty();
        int int10 = xYSeries8.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries8.addOrUpdate((double) (byte) -1, (double) (short) 1);
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
        xYSeries8.add(xYDataItem60, true);
        xYSeries8.add((java.lang.Number) (short) -1, (java.lang.Number) (byte) 100);
        boolean boolean68 = xYSeries3.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem13);
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries43.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNull(xYDataItem46);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem79, true);
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
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
}

