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
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 3, true);
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true);
        double[][] doubleArray3 = xYSeries2.toArray();
        java.lang.Comparable comparable4 = xYSeries2.getKey();
        xYSeries2.setDescription("");
        java.lang.Object obj7 = xYSeries2.clone();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             xYSeries2.updateByIndex((-4), (java.lang.Number) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + ' ' + "'", comparable4, ' ');
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        boolean boolean31 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.String str34 = xYSeries33.getDescription();
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries33.createCopy((int) (byte) 1, 10);
        int int38 = xYSeries33.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean41 = xYSeries40.isEmpty();
        xYSeries40.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries40.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener49);
        boolean boolean51 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries33.add(xYDataItem53);
        xYSeries33.clear();
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean58 = xYSeries57.isEmpty();
        xYSeries57.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries57.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener66);
        boolean boolean68 = xYSeries57.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries57.remove((int) (short) 0);
        xYSeries33.add(xYDataItem70);
        xYSeries1.add(xYDataItem70);
        int int73 = xYSeries1.getMaximumItemCount();
        java.util.List list74 = xYSeries1.getItems();
        java.lang.String str75 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries40.add((double) 4, (double) (-3), false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        xYSeries49.setDescription("hi!");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean17 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add(100.0d, (java.lang.Number) 1L, true);
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        int int13 = xYSeries1.getItemCount();
        java.lang.String str14 = xYSeries1.getDescription();
        int int16 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = null; // flaky: xYSeries1.remove((java.lang.Number) 10.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
    }
}
