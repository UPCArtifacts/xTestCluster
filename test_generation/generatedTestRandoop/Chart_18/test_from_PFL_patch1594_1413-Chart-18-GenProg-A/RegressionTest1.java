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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D1.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D10.clear();
        boolean boolean18 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D10);
        defaultKeyedValues2D10.setValue((java.lang.Number) 3, (java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues2D10.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D1.getValue((java.lang.Comparable) false, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list21 = defaultKeyedValues20.getKeys();
        java.lang.Object obj22 = defaultKeyedValues20.clone();
        boolean boolean23 = defaultKeyedValues16.equals(obj22);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues16.addValue((java.lang.Comparable) 0, (java.lang.Number) 0L);
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues16.sortByValues(sortOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: #");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.lang.Number number12 = null;
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1.0f), number12);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.addValue(comparable14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        java.lang.Object obj10 = defaultKeyedValues2D8.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D8.getValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        defaultKeyedValues12.clear();
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.removeValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D1.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        int int4 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D7.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int13 = defaultKeyedValues2D6.getColumnCount();
        boolean boolean15 = defaultKeyedValues2D6.equals((java.lang.Object) false);
        int int17 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list18 = defaultKeyedValues2D6.getColumnKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) list18);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int22 = defaultKeyedValues2D21.getColumnCount();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) int22);
        java.lang.Class<?> wildcardClass24 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) 10, comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        int int13 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        int int33 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, comparable11, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue((-1), (java.lang.Comparable) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = defaultKeyedValues2D1.getRowIndex(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D14.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D14.getColumnKeys();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int23 = defaultKeyedValues2D14.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) int23);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, comparable14, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeRow(0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(comparable14);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: null");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        java.lang.Class<?> wildcardClass7 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        java.lang.Object obj10 = defaultKeyedValues2D8.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        int int14 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj19 = defaultKeyedValues18.clone();
        java.util.List list20 = defaultKeyedValues18.getKeys();
        int int21 = defaultKeyedValues18.getItemCount();
        java.lang.Object obj22 = defaultKeyedValues18.clone();
        int int23 = defaultKeyedValues18.getItemCount();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues2D11.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = null; // flaky: defaultKeyedValues2D1.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultKeyedValues2D6.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj12 = defaultKeyedValues11.clone();
        defaultKeyedValues11.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int16 = defaultKeyedValues11.getItemCount();
        boolean boolean17 = defaultKeyedValues2D6.equals((java.lang.Object) defaultKeyedValues11);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        int int24 = defaultKeyedValues2D19.getColumnCount();
        int int26 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean27 = defaultKeyedValues11.equals((java.lang.Object) int26);
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) (byte) 0, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10L);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D0.removeColumn((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj17 = defaultKeyedValues16.clone();
        defaultKeyedValues16.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj22 = defaultKeyedValues21.clone();
        defaultKeyedValues21.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int26 = defaultKeyedValues21.getItemCount();
        java.lang.Number number28 = defaultKeyedValues21.getValue((int) (byte) 0);
        int int30 = defaultKeyedValues21.getIndex((java.lang.Comparable) (short) 100);
        boolean boolean31 = defaultKeyedValues16.equals((java.lang.Object) defaultKeyedValues21);
        boolean boolean32 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = defaultKeyedValues16.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + (byte) 10 + "'", number28, (byte) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0d));
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + '4' + "'", comparable14, '4');
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D1.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Class<?> wildcardClass5 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeRow((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D1.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues6.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int13 = defaultKeyedValues8.getItemCount();
        java.lang.Number number15 = defaultKeyedValues8.getValue((int) (byte) 0);
        boolean boolean17 = defaultKeyedValues8.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D19);
        int int21 = defaultKeyedValues8.getItemCount();
        boolean boolean22 = defaultKeyedValues2D0.equals((java.lang.Object) int21);
        int int24 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (byte) 10 + "'", number15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int23 = defaultKeyedValues2D16.getColumnCount();
        boolean boolean25 = defaultKeyedValues2D16.equals((java.lang.Object) 100.0d);
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D16);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D16.removeColumn((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue(comparable4, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        int int15 = defaultKeyedValues6.getIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue(10, (java.lang.Comparable) ' ', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D1.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) ' ', (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D1.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues0.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues2D7.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D7.getValue((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues12.clear();
        java.util.List list33 = defaultKeyedValues12.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 10L);
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = defaultKeyedValues0.getIndex(comparable35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 0L, (double) 10L);
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        int int17 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeColumn((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        java.lang.Class<?> wildcardClass32 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int20 = defaultKeyedValues14.getIndex((java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues14.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list24 = defaultKeyedValues23.getKeys();
        boolean boolean25 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues23);
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int27 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) 1, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) 2, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.removeValue(1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) 100L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int13 = defaultKeyedValues2D6.getColumnCount();
        boolean boolean15 = defaultKeyedValues2D6.equals((java.lang.Object) false);
        int int17 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list18 = defaultKeyedValues2D6.getColumnKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) list18);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int22 = defaultKeyedValues2D21.getColumnCount();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) int22);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) (byte) 100, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultKeyedValues2D1.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (double) 0.0f);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultKeyedValues2D15.getRowKeys();
        java.util.List list20 = defaultKeyedValues2D15.getColumnKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) list20);
        defaultKeyedValues2D1.removeColumn((int) (short) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues2D7.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D7.removeRow((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (double) 0.0f);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D1.getValue(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) (short) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) ' ');
        int int15 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        int int17 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        java.util.List list11 = defaultKeyedValues9.getKeys();
        int int12 = defaultKeyedValues9.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) int12);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 3);
        boolean boolean18 = defaultKeyedValues0.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 0L, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) (-1.0f), (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) 3, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        int int29 = defaultKeyedValues12.getIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.removeValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (double) 0.0f);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) (short) 100, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        defaultKeyedValues12.clear();
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D7.removeRow((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 1.0d);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        java.lang.Object obj2 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((int) (short) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = null; // flaky: defaultKeyedValues0.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey(1);
        int int20 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultKeyedValues0.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D1.getValue((int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 100);
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (-1), (java.lang.Comparable) 10L);
        java.lang.Object obj28 = null;
        boolean boolean29 = defaultKeyedValues2D1.equals(obj28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D1.getValue((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        java.util.List list11 = defaultKeyedValues9.getKeys();
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues9.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 10, (double) (byte) 0);
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues8.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list16 = defaultKeyedValues8.getKeys();
        defaultKeyedValues8.clear();
        defaultKeyedValues8.clear();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        int int15 = defaultKeyedValues6.getIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = null; // flaky: defaultKeyedValues6.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ');
        defaultKeyedValues6.removeValue((int) (short) 1);
        defaultKeyedValues6.addValue((java.lang.Comparable) 10.0d, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.removeValue((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list9 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int14 = defaultKeyedValues2D8.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.clear();
        boolean boolean17 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues15);
        defaultKeyedValues2D8.removeRow((java.lang.Comparable) 10L);
        java.util.List list20 = defaultKeyedValues2D8.getColumnKeys();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues0.getKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.util.List list16 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        int int17 = defaultKeyedValues16.getItemCount();
        defaultKeyedValues16.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int22 = defaultKeyedValues16.getIndex((java.lang.Comparable) 10.0f);
        int int24 = defaultKeyedValues16.getIndex((java.lang.Comparable) 100.0f);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) int24);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues6.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        defaultKeyedValues6.setValue((java.lang.Comparable) (byte) 10, (double) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByValues(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getColumnKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 1 + "'", comparable20, (short) 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1L, (java.lang.Comparable) (-1), (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int13 = defaultKeyedValues2D6.getColumnCount();
        boolean boolean15 = defaultKeyedValues2D6.equals((java.lang.Object) false);
        int int17 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list18 = defaultKeyedValues2D6.getColumnKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) list18);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int22 = defaultKeyedValues2D21.getColumnCount();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) int22);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D11.getColumnKeys();
        java.util.List list18 = defaultKeyedValues2D11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D11.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: defaultKeyedValues2D1.getValue((-1), (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.lang.Number number18 = null;
        defaultKeyedValues2D1.setValue(number18, (java.lang.Comparable) 1L, (java.lang.Comparable) 0L);
        java.lang.Object obj22 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultKeyedValues2D1.getRowIndex(comparable23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultKeyedValues2D1.getColumnIndex(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj18 = defaultKeyedValues2D8.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeColumn((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj6 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int18 = defaultKeyedValues2D11.getColumnCount();
        boolean boolean20 = defaultKeyedValues2D11.equals((java.lang.Object) false);
        int int22 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list23 = defaultKeyedValues2D11.getColumnKeys();
        boolean boolean24 = defaultKeyedValues5.equals((java.lang.Object) list23);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D26.getColumnCount();
        boolean boolean28 = defaultKeyedValues5.equals((java.lang.Object) int27);
        defaultKeyedValues5.setValue((java.lang.Comparable) 100.0f, (double) 2);
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues5);
        java.lang.Comparable comparable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list16 = defaultKeyedValues2D12.getRowKeys();
        java.util.List list17 = defaultKeyedValues2D12.getColumnKeys();
        int int18 = defaultKeyedValues2D12.getColumnCount();
        defaultKeyedValues2D12.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int23 = defaultKeyedValues2D12.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D12);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj26 = defaultKeyedValues25.clone();
        defaultKeyedValues25.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues25.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        java.lang.Object obj34 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = null; // flaky: defaultKeyedValues2D1.getValue((-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj19 = defaultKeyedValues18.clone();
        java.util.List list20 = defaultKeyedValues18.getKeys();
        int int21 = defaultKeyedValues18.getItemCount();
        java.lang.Object obj22 = defaultKeyedValues18.clone();
        int int23 = defaultKeyedValues18.getItemCount();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues18);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues18.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = null; // flaky: defaultKeyedValues0.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int19 = defaultKeyedValues13.getIndex((java.lang.Comparable) 10.0f);
        int int21 = defaultKeyedValues13.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list23 = defaultKeyedValues22.getKeys();
        boolean boolean24 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues22);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) boolean24);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 2, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) 1, comparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, 0.0d);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable9, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        java.util.List list8 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D13.getColumnCount();
        java.lang.Object obj15 = defaultKeyedValues2D13.clone();
        boolean boolean16 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues2D13);
        defaultKeyedValues2D13.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1.0f), (java.lang.Number) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (double) (-1L));
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 100.0d + "'", comparable18, 100.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D10.clear();
        boolean boolean18 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D10);
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable22 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues0.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        java.lang.Class<?> wildcardClass8 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getColumnKeys();
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        java.util.List list23 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = defaultKeyedValues0.getIndex(comparable2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) -1);
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        defaultKeyedValues6.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int16 = defaultKeyedValues6.getItemCount();
        defaultKeyedValues6.setValue((java.lang.Comparable) 10.0d, (double) (byte) 10);
        boolean boolean20 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj21 = defaultKeyedValues6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues6.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = null; // flaky: defaultKeyedValues0.getKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D1.getValue((int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 0);
        java.lang.Number number22 = null;
        defaultKeyedValues2D8.addValue(number22, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "");
        int int27 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list28 = defaultKeyedValues2D8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D11.getColumnKeys();
        int int19 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D11.removeColumn((int) (short) 0);
        java.util.List list22 = defaultKeyedValues2D11.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        int int19 = defaultKeyedValues18.getItemCount();
        defaultKeyedValues18.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int24 = defaultKeyedValues18.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues18.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues18.getKeys();
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) list28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
        java.lang.Object obj15 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 4);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (double) (byte) 0);
        java.lang.Number number18 = defaultKeyedValues0.getValue(2);
        defaultKeyedValues0.removeValue(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ');
        java.util.List list19 = defaultKeyedValues6.getKeys();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) -1);
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D1.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues2D7.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D7.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) 1, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = defaultKeyedValues2D7.getRowIndex((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D7.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable19 = defaultKeyedValues2D7.getColumnKey((int) (short) 0);
        int int20 = defaultKeyedValues2D7.getColumnCount();
        int int21 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj22 = defaultKeyedValues2D7.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D24.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list28 = defaultKeyedValues2D24.getRowKeys();
        java.util.List list29 = defaultKeyedValues2D24.getColumnKeys();
        int int30 = defaultKeyedValues2D24.getColumnCount();
        defaultKeyedValues2D24.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int35 = defaultKeyedValues2D24.getColumnCount();
        java.util.List list36 = defaultKeyedValues2D24.getRowKeys();
        boolean boolean37 = defaultKeyedValues2D7.equals((java.lang.Object) defaultKeyedValues2D24);
        java.lang.Class<?> wildcardClass38 = defaultKeyedValues2D24.getClass();
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10 + "'", comparable19, 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ');
        java.util.List list19 = defaultKeyedValues6.getKeys();
        java.lang.Object obj20 = defaultKeyedValues6.clone();
        java.lang.Class<?> wildcardClass21 = defaultKeyedValues6.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 0.0d, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        int int8 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        boolean boolean4 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultKeyedValues2D15.getRowKeys();
        int int20 = defaultKeyedValues2D15.getColumnCount();
        int int22 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean23 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D15);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D15.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number22 = null;
        defaultKeyedValues17.addValue((java.lang.Comparable) 100L, number22);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D25.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list29 = defaultKeyedValues2D25.getRowKeys();
        java.util.List list30 = defaultKeyedValues2D25.getColumnKeys();
        defaultKeyedValues2D25.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean34 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues2D25);
        java.lang.Object obj35 = defaultKeyedValues2D25.clone();
        boolean boolean36 = defaultKeyedValues2D1.equals(obj35);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: #");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 'a');
        java.lang.Class<?> wildcardClass24 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (-1), (java.lang.Comparable) 10L);
        java.lang.Object obj28 = null;
        boolean boolean29 = defaultKeyedValues2D1.equals(obj28);
        java.util.List list30 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues2D1.getValue((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        java.util.List list15 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues13.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int27 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues13);
        int int30 = defaultKeyedValues13.getIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues13.getValue((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1L));
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues0.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultKeyedValues2D15.getRowKeys();
        java.util.List list20 = defaultKeyedValues2D15.getColumnKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) list20);
        int int22 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Comparable comparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultKeyedValues2D1.getValue(comparable2, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) (byte) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 10L);
        int int20 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100 + "'", comparable14, 100);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (double) 0L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        defaultKeyedValues2D1.setValue((java.lang.Number) 1L, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue(comparable12, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D0.removeColumn((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (-1), (java.lang.Comparable) 10L);
        int int29 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeColumn((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: #");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues12.clear();
        java.util.List list33 = defaultKeyedValues12.getKeys();
        org.jfree.chart.util.SortOrder sortOrder34 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByValues(sortOrder34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) '#');
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable17, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        java.util.List list11 = defaultKeyedValues9.getKeys();
        int int12 = defaultKeyedValues9.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) int12);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) ' ', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = null; // flaky: defaultKeyedValues2D1.getValue(0, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues12.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) -1);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10.0d, (double) 1.0f);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (short) -1, (double) (short) 100);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        defaultKeyedValues12.clear();
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1), (double) 0);
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByKeys(sortOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ');
        defaultKeyedValues6.removeValue((int) (short) 1);
        defaultKeyedValues6.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 10.0f);
        defaultKeyedValues6.removeValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 10L);
        int int20 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 10);
        int int21 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        int int19 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D0.getValue(comparable19, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 10L, comparable11, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Object obj17 = defaultKeyedValues2D11.clone();
        java.util.List list18 = defaultKeyedValues2D11.getRowKeys();
        java.lang.Object obj19 = defaultKeyedValues2D11.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D1.getValue((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) 3);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) false, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        java.util.List list15 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues13.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int27 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues13);
        int int30 = defaultKeyedValues13.getIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        int int32 = defaultKeyedValues31.getItemCount();
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int37 = defaultKeyedValues31.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list38 = defaultKeyedValues31.getKeys();
        defaultKeyedValues31.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number45 = null;
        defaultKeyedValues40.addValue((java.lang.Comparable) 100L, number45);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D48 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list52 = defaultKeyedValues2D48.getRowKeys();
        java.util.List list53 = defaultKeyedValues2D48.getColumnKeys();
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean57 = defaultKeyedValues40.equals((java.lang.Object) defaultKeyedValues2D48);
        java.lang.Object obj58 = defaultKeyedValues2D48.clone();
        boolean boolean59 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D48);
        defaultKeyedValues31.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues31.clear();
        boolean boolean64 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues31);
        org.jfree.chart.util.SortOrder sortOrder65 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues13.sortByKeys(sortOrder65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D14.getRowKeys();
        int int19 = defaultKeyedValues2D14.getColumnCount();
        int int21 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean22 = defaultKeyedValues6.equals((java.lang.Object) int21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues6.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj5 = defaultKeyedValues4.clone();
        defaultKeyedValues4.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number10 = defaultKeyedValues4.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj13 = defaultKeyedValues2D12.clone();
        java.lang.Object obj14 = defaultKeyedValues2D12.clone();
        boolean boolean15 = defaultKeyedValues4.equals((java.lang.Object) defaultKeyedValues2D12);
        defaultKeyedValues2D12.clear();
        boolean boolean17 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues2D12.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100.0d + "'", number10, 100.0d);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D1.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int10 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D0.getValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D1.getValue((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D1.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Object obj17 = defaultKeyedValues2D11.clone();
        java.util.List list18 = defaultKeyedValues2D11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D11.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable11, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        int int17 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable18, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int8 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D11.getColumnKeys();
        defaultKeyedValues2D11.removeColumn((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = defaultKeyedValues2D11.getRowIndex((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list22 = defaultKeyedValues2D18.getRowKeys();
        java.util.List list23 = defaultKeyedValues2D18.getColumnKeys();
        int int24 = defaultKeyedValues2D18.getColumnCount();
        defaultKeyedValues2D18.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int29 = defaultKeyedValues2D18.getColumnCount();
        java.util.List list30 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean31 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D18);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = null; // flaky: defaultKeyedValues2D0.getRowKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj5 = defaultKeyedValues4.clone();
        java.util.List list6 = defaultKeyedValues4.getKeys();
        defaultKeyedValues4.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int12 = defaultKeyedValues2D11.getColumnCount();
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        boolean boolean14 = defaultKeyedValues4.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D1.getValue((int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D14.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D14.getColumnKeys();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int23 = defaultKeyedValues2D14.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) int23);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        java.util.List list22 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, 10.0d);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable9, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        int int21 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultKeyedValues0.getKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.lang.Number number18 = null;
        defaultKeyedValues2D1.setValue(number18, (java.lang.Comparable) 1L, (java.lang.Comparable) 0L);
        java.lang.Object obj22 = defaultKeyedValues2D1.clone();
        java.lang.Number number25 = defaultKeyedValues2D1.getValue((int) (byte) 1, (int) (byte) 0);
        int int26 = defaultKeyedValues2D1.getColumnCount();
        int int27 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D14.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D14.getColumnKeys();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int23 = defaultKeyedValues2D14.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) int23);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (-1.0f), (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        int int16 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable17, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (double) (short) 10);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) (short) 0, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean20 = defaultKeyedValues2D18.equals((java.lang.Object) false);
        defaultKeyedValues2D18.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D18.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        java.util.List list29 = defaultKeyedValues2D18.getColumnKeys();
        java.util.List list30 = defaultKeyedValues2D18.getColumnKeys();
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list9 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int14 = defaultKeyedValues2D8.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.clear();
        boolean boolean17 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues15);
        defaultKeyedValues2D8.removeRow((java.lang.Comparable) 10L);
        java.util.List list20 = defaultKeyedValues2D8.getColumnKeys();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = null; // flaky: defaultKeyedValues2D1.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int20 = defaultKeyedValues14.getIndex((java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues14.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list24 = defaultKeyedValues23.getKeys();
        boolean boolean25 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues23);
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int27 = defaultKeyedValues2D1.getRowCount();
        int int28 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Number number14 = null;
        defaultKeyedValues6.addValue((java.lang.Comparable) 0, number14);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        int int15 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D1.getValue((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D14.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D14.getColumnKeys();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int23 = defaultKeyedValues2D14.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) int23);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable28 = null;
        java.lang.Number number29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', comparable28, number29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D2.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeValue(comparable9, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        int int14 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj22 = defaultKeyedValues21.clone();
        defaultKeyedValues21.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int26 = defaultKeyedValues21.getItemCount();
        boolean boolean27 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues21);
        java.lang.Object obj28 = defaultKeyedValues21.clone();
        boolean boolean29 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues21);
        defaultKeyedValues21.setValue((java.lang.Comparable) '4', (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues21.insertValue(3, (java.lang.Comparable) 1.0d, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 0);
        java.lang.Number number22 = null;
        defaultKeyedValues2D8.addValue(number22, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "");
        int int27 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list28 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 0.0f);
        int int34 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.removeColumn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        java.lang.Number number16 = defaultKeyedValues0.getValue(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 100.0d, (double) ' ');
        defaultKeyedValues6.clear();
        defaultKeyedValues6.setValue((java.lang.Comparable) (byte) 10, (double) 1.0f);
        defaultKeyedValues6.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        java.util.List list11 = defaultKeyedValues9.getKeys();
        int int12 = defaultKeyedValues9.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) int12);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 3);
        boolean boolean18 = defaultKeyedValues0.equals((java.lang.Object) false);
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        int int23 = defaultKeyedValues2D17.getColumnCount();
        java.util.List list24 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list25 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list17 = defaultKeyedValues2D13.getRowKeys();
        java.util.List list18 = defaultKeyedValues2D13.getColumnKeys();
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D13.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D13);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D13.removeRow((java.lang.Comparable) 1L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number17 = null;
        defaultKeyedValues6.setValue((java.lang.Comparable) '#', number17);
        java.util.List list19 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.addValue((java.lang.Comparable) "", (java.lang.Number) 10L);
        int int24 = defaultKeyedValues6.getIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues6.removeValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 2, (java.lang.Comparable) (short) 10);
        int int19 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D19.getColumnKeys();
        int int25 = defaultKeyedValues2D19.getColumnCount();
        java.util.List list26 = defaultKeyedValues2D19.getRowKeys();
        int int28 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj29 = defaultKeyedValues2D19.clone();
        int int30 = defaultKeyedValues2D19.getColumnCount();
        int int32 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) ' ');
        int int33 = defaultKeyedValues2D19.getRowCount();
        defaultKeyedValues2D19.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) -1);
        boolean boolean38 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D19);
        java.lang.Comparable comparable40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0, comparable40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) false);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 0);
        java.lang.Number number22 = null;
        defaultKeyedValues2D8.addValue(number22, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "");
        int int27 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list28 = defaultKeyedValues2D8.getColumnKeys();
        java.util.List list29 = defaultKeyedValues2D8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) (-1.0f));
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) 0.0d, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getColumnKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D1.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 1 + "'", comparable20, (short) 1);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number17 = null;
        defaultKeyedValues6.setValue((java.lang.Comparable) '#', number17);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue((int) '#', (java.lang.Comparable) 0.0d, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list14 = defaultKeyedValues13.getKeys();
        java.lang.Object obj15 = defaultKeyedValues13.clone();
        boolean boolean16 = defaultKeyedValues9.equals(obj15);
        java.util.List list17 = defaultKeyedValues9.getKeys();
        defaultKeyedValues9.addValue((java.lang.Comparable) 0.0d, 1.0d);
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals(obj20);
        int int23 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 100, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) (short) -1);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        int int18 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        int int15 = defaultKeyedValues6.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues6.setValue((java.lang.Comparable) 10L, (java.lang.Number) 1L);
        java.lang.Object obj19 = defaultKeyedValues6.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues12.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) -1);
        java.lang.Comparable comparable36 = defaultKeyedValues12.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues12.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (byte) 0 + "'", comparable36, (byte) 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable26 = defaultKeyedValues2D1.getRowKey((int) (short) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 10, (java.lang.Comparable) "", (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D1.clear();
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(comparable32);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: null");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (-1L) + "'", comparable26, (-1L));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number17 = null;
        defaultKeyedValues6.setValue((java.lang.Comparable) '#', number17);
        java.util.List list19 = defaultKeyedValues6.getKeys();
        java.lang.Class<?> wildcardClass20 = list19.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass12 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = null; // flaky: defaultKeyedValues2D11.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass8 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        int int17 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list16 = defaultKeyedValues2D12.getRowKeys();
        java.util.List list17 = defaultKeyedValues2D12.getColumnKeys();
        int int18 = defaultKeyedValues2D12.getColumnCount();
        defaultKeyedValues2D12.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int23 = defaultKeyedValues2D12.getColumnCount();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D12);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj26 = defaultKeyedValues25.clone();
        defaultKeyedValues25.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues25.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        java.util.List list34 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj6 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int10 = defaultKeyedValues5.getItemCount();
        java.lang.Number number12 = defaultKeyedValues5.getValue((int) (byte) 0);
        int int14 = defaultKeyedValues5.getIndex((java.lang.Comparable) (short) 100);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues5);
        int int16 = defaultKeyedValues5.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues5.insertValue((-1), (java.lang.Comparable) (byte) 100, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 10 + "'", number12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        int int19 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) false);
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100.0d, comparable25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj6 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int10 = defaultKeyedValues5.getItemCount();
        java.lang.Number number12 = defaultKeyedValues5.getValue((int) (byte) 0);
        int int14 = defaultKeyedValues5.getIndex((java.lang.Comparable) (short) 100);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues5);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues5.removeValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 10 + "'", number12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 4);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj29 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues8.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list16 = defaultKeyedValues8.getKeys();
        defaultKeyedValues8.clear();
        defaultKeyedValues8.clear();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj24 = defaultKeyedValues23.clone();
        defaultKeyedValues23.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues23.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj31 = defaultKeyedValues23.clone();
        defaultKeyedValues23.removeValue((int) (byte) 0);
        defaultKeyedValues23.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        int int40 = defaultKeyedValues23.getItemCount();
        boolean boolean41 = defaultKeyedValues8.equals((java.lang.Object) int40);
        java.lang.Class<?> wildcardClass42 = defaultKeyedValues8.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        int int9 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = defaultKeyedValues0.getValue(comparable33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number17 = null;
        defaultKeyedValues6.setValue((java.lang.Comparable) '#', number17);
        java.util.List list19 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.addValue((java.lang.Comparable) "", (java.lang.Number) 10L);
        int int24 = defaultKeyedValues6.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues6.getKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj18 = defaultKeyedValues2D8.clone();
        int int20 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 0L);
        int int21 = defaultKeyedValues2D8.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeColumn((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = defaultKeyedValues2D1.getRowIndex(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '4', (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 2);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (double) (byte) 0);
        java.lang.Number number18 = defaultKeyedValues0.getValue(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number14 = null;
        defaultKeyedValues9.addValue((java.lang.Comparable) 100L, number14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean26 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D17);
        java.lang.Object obj27 = defaultKeyedValues2D17.clone();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 1L);
        int int33 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        java.util.List list34 = defaultKeyedValues0.getKeys();
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        java.util.List list15 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues13.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int27 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues13);
        int int30 = defaultKeyedValues13.getIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        int int32 = defaultKeyedValues31.getItemCount();
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int37 = defaultKeyedValues31.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list38 = defaultKeyedValues31.getKeys();
        defaultKeyedValues31.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number45 = null;
        defaultKeyedValues40.addValue((java.lang.Comparable) 100L, number45);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D48 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list52 = defaultKeyedValues2D48.getRowKeys();
        java.util.List list53 = defaultKeyedValues2D48.getColumnKeys();
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean57 = defaultKeyedValues40.equals((java.lang.Object) defaultKeyedValues2D48);
        java.lang.Object obj58 = defaultKeyedValues2D48.clone();
        boolean boolean59 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D48);
        defaultKeyedValues31.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues31.clear();
        boolean boolean64 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues31);
        org.jfree.chart.util.SortOrder sortOrder65 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues13.sortByValues(sortOrder65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        int int15 = defaultKeyedValues6.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues6.setValue((java.lang.Comparable) 10L, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.removeValue((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.removeValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) 100L);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list21 = defaultKeyedValues20.getKeys();
        java.lang.Object obj22 = defaultKeyedValues20.clone();
        boolean boolean23 = defaultKeyedValues16.equals(obj22);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues16.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        int int2 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        int int17 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        int int21 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        int int8 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) (-1), (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) "", (java.lang.Comparable) 10);
        int int20 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj22 = defaultKeyedValues21.clone();
        java.util.List list23 = defaultKeyedValues21.getKeys();
        defaultKeyedValues21.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues21.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues21.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int35 = defaultKeyedValues21.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 10, (double) (byte) 0);
        defaultKeyedValues21.addValue((java.lang.Comparable) (-1L), (java.lang.Number) 4);
        boolean boolean42 = defaultKeyedValues2D1.equals((java.lang.Object) 4);
        int int43 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number2 = defaultKeyedValues0.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) (-1.0f), (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeColumn((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        int int5 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1L, (java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        int int10 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (double) (-1));
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        java.util.List list15 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues13.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int27 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues13);
        int int30 = defaultKeyedValues13.getIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        int int32 = defaultKeyedValues31.getItemCount();
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int37 = defaultKeyedValues31.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list38 = defaultKeyedValues31.getKeys();
        defaultKeyedValues31.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number45 = null;
        defaultKeyedValues40.addValue((java.lang.Comparable) 100L, number45);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D48 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list52 = defaultKeyedValues2D48.getRowKeys();
        java.util.List list53 = defaultKeyedValues2D48.getColumnKeys();
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean57 = defaultKeyedValues40.equals((java.lang.Object) defaultKeyedValues2D48);
        java.lang.Object obj58 = defaultKeyedValues2D48.clone();
        boolean boolean59 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D48);
        defaultKeyedValues31.setValue((java.lang.Comparable) 1, (double) 1L);
        defaultKeyedValues31.clear();
        boolean boolean64 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues31);
        int int66 = defaultKeyedValues13.getIndex((java.lang.Comparable) 10.0d);
        org.jfree.chart.util.SortOrder sortOrder67 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues13.sortByKeys(sortOrder67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        int int27 = defaultKeyedValues12.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues12.getValue(comparable32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        java.util.List list11 = defaultKeyedValues9.getKeys();
        int int12 = defaultKeyedValues9.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) int12);
        java.lang.Comparable comparable15 = defaultKeyedValues0.getKey(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 100.0f + "'", comparable15, 100.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 4, comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100L, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj22 = defaultKeyedValues21.clone();
        defaultKeyedValues21.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int26 = defaultKeyedValues21.getItemCount();
        boolean boolean27 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues21);
        java.lang.Object obj28 = defaultKeyedValues21.clone();
        boolean boolean29 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues21);
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues21.sortByKeys(sortOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.removeColumn(0);
        int int21 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list25 = defaultKeyedValues2D24.getColumnKeys();
        defaultKeyedValues2D24.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int30 = defaultKeyedValues2D24.getRowCount();
        defaultKeyedValues2D24.clear();
        int int32 = defaultKeyedValues2D24.getRowCount();
        java.lang.Class<?> wildcardClass33 = defaultKeyedValues2D24.getClass();
        boolean boolean34 = defaultKeyedValues2D1.equals((java.lang.Object) wildcardClass33);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean38 = defaultKeyedValues2D36.equals((java.lang.Object) false);
        defaultKeyedValues2D36.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D36.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        java.util.List list47 = defaultKeyedValues2D36.getColumnKeys();
        boolean boolean48 = defaultKeyedValues2D1.equals((java.lang.Object) list47);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }
}
