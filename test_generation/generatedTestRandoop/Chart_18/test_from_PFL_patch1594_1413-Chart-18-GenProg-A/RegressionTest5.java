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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        int int12 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 3);
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list14 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int19 = defaultKeyedValues6.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list20 = defaultKeyedValues6.getKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) '4', 100.0d);
        defaultKeyedValues6.setValue((java.lang.Comparable) true, (double) 1L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', 0.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int23 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list24 = defaultKeyedValues2D21.getColumnKeys();
        java.util.List list25 = defaultKeyedValues2D21.getColumnKeys();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D21);
        int int28 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        int int30 = defaultKeyedValues2D29.getColumnCount();
        java.util.List list31 = defaultKeyedValues2D29.getRowKeys();
        defaultKeyedValues2D29.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        int int37 = defaultKeyedValues2D29.getRowIndex((java.lang.Comparable) (byte) 10);
        boolean boolean38 = defaultKeyedValues2D21.equals((java.lang.Object) int37);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D21.removeRow((java.lang.Comparable) 4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj6 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        defaultKeyedValues2D11.removeColumn(0);
        int int21 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D23.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable35 = defaultKeyedValues2D23.getColumnKey((int) (short) 0);
        int int36 = defaultKeyedValues2D23.getColumnCount();
        int int37 = defaultKeyedValues2D23.getColumnCount();
        java.lang.Object obj38 = defaultKeyedValues2D23.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D40 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D40.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list44 = defaultKeyedValues2D40.getRowKeys();
        java.util.List list45 = defaultKeyedValues2D40.getColumnKeys();
        int int46 = defaultKeyedValues2D40.getColumnCount();
        defaultKeyedValues2D40.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int51 = defaultKeyedValues2D40.getColumnCount();
        java.util.List list52 = defaultKeyedValues2D40.getRowKeys();
        boolean boolean53 = defaultKeyedValues2D23.equals((java.lang.Object) defaultKeyedValues2D40);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D55 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D55.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list59 = defaultKeyedValues2D55.getRowKeys();
        java.util.List list60 = defaultKeyedValues2D55.getColumnKeys();
        defaultKeyedValues2D55.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int65 = defaultKeyedValues2D55.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int67 = defaultKeyedValues2D55.getColumnIndex((java.lang.Comparable) "hi!");
        defaultKeyedValues2D55.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 10);
        boolean boolean71 = defaultKeyedValues2D23.equals((java.lang.Object) 10);
        boolean boolean72 = defaultKeyedValues2D11.equals((java.lang.Object) boolean71);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.addValue((java.lang.Number) 6, (java.lang.Comparable) 10L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10 + "'", comparable35, 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int8 = defaultKeyedValues2D7.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D7.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        int int12 = defaultKeyedValues2D7.getRowIndex((java.lang.Comparable) 2);
        int int13 = defaultKeyedValues2D7.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 4);
        int int10 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        defaultKeyedValues14.addValue((java.lang.Comparable) 4, (double) (short) 10);
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
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.lang.Number number12 = null;
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1.0f), number12);
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.insertValue(6, (java.lang.Comparable) "", (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 4);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(3, (java.lang.Comparable) 0.0d, (double) (short) 1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj15 = defaultKeyedValues14.clone();
        defaultKeyedValues14.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues14.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int22 = defaultKeyedValues14.getItemCount();
        java.lang.Object obj23 = defaultKeyedValues14.clone();
        defaultKeyedValues14.clear();
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int26 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.clear();
        defaultKeyedValues14.addValue((java.lang.Comparable) ' ', (double) 'a');
        defaultKeyedValues14.setValue((java.lang.Comparable) ' ', (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        defaultKeyedValues0.removeValue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        defaultKeyedValues0.clear();
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) '#');
        java.util.List list22 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues5.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        java.lang.Class<?> wildcardClass16 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (-1.0f), (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj30 = defaultKeyedValues29.clone();
        defaultKeyedValues29.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues29.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list37 = defaultKeyedValues29.getKeys();
        defaultKeyedValues29.clear();
        defaultKeyedValues29.clear();
        java.util.List list40 = defaultKeyedValues29.getKeys();
        defaultKeyedValues29.clear();
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        int int44 = defaultKeyedValues29.getIndex((java.lang.Comparable) 100.0f);
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues29);
        int int46 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D1.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 1.0d, (java.lang.Number) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        defaultKeyedValues2D1.removeColumn((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 100);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj18 = defaultKeyedValues17.clone();
        defaultKeyedValues17.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int22 = defaultKeyedValues17.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj24 = defaultKeyedValues23.clone();
        java.util.List list25 = defaultKeyedValues23.getKeys();
        defaultKeyedValues23.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int31 = defaultKeyedValues2D30.getColumnCount();
        java.lang.Object obj32 = defaultKeyedValues2D30.clone();
        boolean boolean33 = defaultKeyedValues23.equals((java.lang.Object) defaultKeyedValues2D30);
        defaultKeyedValues2D30.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        boolean boolean38 = defaultKeyedValues17.equals((java.lang.Object) 100.0f);
        int int39 = defaultKeyedValues17.getItemCount();
        java.lang.Object obj40 = defaultKeyedValues17.clone();
        boolean boolean41 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D1.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.Object obj16 = defaultKeyedValues6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues6.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        int int25 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0d);
        int int11 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list16 = defaultKeyedValues2D12.getRowKeys();
        java.util.List list17 = defaultKeyedValues2D12.getColumnKeys();
        int int18 = defaultKeyedValues2D12.getColumnCount();
        int int19 = defaultKeyedValues2D12.getRowCount();
        defaultKeyedValues2D12.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D12.removeRow((int) (short) 0);
        defaultKeyedValues2D12.clear();
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D1.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 100);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        int int14 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D22.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable34 = defaultKeyedValues2D22.getColumnKey((int) (short) 0);
        int int35 = defaultKeyedValues2D22.getColumnCount();
        defaultKeyedValues2D22.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D22.removeColumn(0);
        int int42 = defaultKeyedValues2D22.getRowCount();
        defaultKeyedValues2D22.clear();
        boolean boolean44 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D22);
        java.util.List list45 = defaultKeyedValues2D22.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 10 + "'", comparable34, 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        java.lang.Number number36 = defaultKeyedValues12.getValue(3);
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + (byte) -1 + "'", number36, (byte) -1);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 100.0f);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int24 = defaultKeyedValues2D8.getColumnCount();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 6);
        java.util.List list20 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D1.getValue((java.lang.Comparable) true, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list24 = defaultKeyedValues2D20.getRowKeys();
        java.util.List list25 = defaultKeyedValues2D20.getColumnKeys();
        int int26 = defaultKeyedValues2D20.getColumnCount();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int31 = defaultKeyedValues2D20.getColumnCount();
        java.util.List list32 = defaultKeyedValues2D20.getRowKeys();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) list32);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) 10L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        int int13 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D19.equals((java.lang.Object) false);
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        defaultKeyedValues0.clear();
        int int6 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable32 = defaultKeyedValues2D1.getColumnKey(0);
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
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1L) + "'", comparable32, (-1L));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj26 = defaultKeyedValues25.clone();
        defaultKeyedValues25.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number31 = null;
        defaultKeyedValues25.setValue((java.lang.Comparable) (-1.0d), number31);
        defaultKeyedValues25.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues25.removeValue((int) (short) 0);
        defaultKeyedValues25.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        java.lang.Object obj41 = defaultKeyedValues25.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean45 = defaultKeyedValues2D43.equals((java.lang.Object) false);
        defaultKeyedValues2D43.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D43.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        java.util.List list54 = defaultKeyedValues2D43.getColumnKeys();
        java.util.List list55 = defaultKeyedValues2D43.getColumnKeys();
        boolean boolean56 = defaultKeyedValues25.equals((java.lang.Object) defaultKeyedValues2D43);
        java.lang.Object obj57 = defaultKeyedValues25.clone();
        boolean boolean58 = defaultKeyedValues0.equals(obj57);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1), (java.lang.Comparable) (byte) 0, (java.lang.Comparable) false);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1L, (java.lang.Comparable) true, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) '4', (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int13 = defaultKeyedValues2D6.getColumnCount();
        boolean boolean15 = defaultKeyedValues2D6.equals((java.lang.Object) false);
        int int17 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list18 = defaultKeyedValues2D6.getColumnKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) list18);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 2);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) 1);
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        java.lang.Object obj35 = defaultKeyedValues12.clone();
        int int36 = defaultKeyedValues12.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D38.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D38.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D38.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable50 = defaultKeyedValues2D38.getColumnKey((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D52 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list53 = defaultKeyedValues2D52.getColumnKeys();
        defaultKeyedValues2D52.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int58 = defaultKeyedValues2D52.getRowCount();
        defaultKeyedValues2D52.clear();
        int int60 = defaultKeyedValues2D52.getRowCount();
        int int61 = defaultKeyedValues2D52.getRowCount();
        boolean boolean62 = defaultKeyedValues2D38.equals((java.lang.Object) defaultKeyedValues2D52);
        boolean boolean63 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D52);
        java.util.List list64 = defaultKeyedValues12.getKeys();
        java.util.List list65 = defaultKeyedValues12.getKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + 10 + "'", comparable50, 10);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        defaultKeyedValues2D8.clear();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1L, (java.lang.Comparable) (-1), (java.lang.Comparable) 3);
        int int7 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        int int29 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0d);
        int int31 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D33.clear();
        java.lang.Object obj41 = defaultKeyedValues2D33.clone();
        int int43 = defaultKeyedValues2D33.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues44 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj45 = defaultKeyedValues44.clone();
        defaultKeyedValues44.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number50 = null;
        defaultKeyedValues44.setValue((java.lang.Comparable) (-1.0d), number50);
        defaultKeyedValues44.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues44.removeValue((int) (short) 0);
        defaultKeyedValues44.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues44.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues44.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 0);
        java.util.List list66 = defaultKeyedValues44.getKeys();
        boolean boolean67 = defaultKeyedValues2D33.equals((java.lang.Object) defaultKeyedValues44);
        boolean boolean68 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D33);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        boolean boolean18 = defaultKeyedValues2D1.equals((java.lang.Object) (-1L));
        int int20 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 100.0d, 10.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        int int29 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0d);
        int int31 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 100);
        int int32 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        java.util.List list16 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int14 = defaultKeyedValues2D7.getColumnCount();
        boolean boolean16 = defaultKeyedValues2D7.equals((java.lang.Object) false);
        int int18 = defaultKeyedValues2D7.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list19 = defaultKeyedValues2D7.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        defaultKeyedValues20.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int26 = defaultKeyedValues20.getIndex((java.lang.Comparable) 10.0f);
        int int28 = defaultKeyedValues20.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list30 = defaultKeyedValues29.getKeys();
        boolean boolean31 = defaultKeyedValues20.equals((java.lang.Object) defaultKeyedValues29);
        boolean boolean32 = defaultKeyedValues2D7.equals((java.lang.Object) defaultKeyedValues20);
        int int33 = defaultKeyedValues2D7.getRowCount();
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues2D7.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 5, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D7.removeColumn((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj34 = defaultKeyedValues33.clone();
        defaultKeyedValues33.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues33.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        defaultKeyedValues33.clear();
        java.lang.Class<?> wildcardClass42 = defaultKeyedValues33.getClass();
        boolean boolean43 = defaultKeyedValues21.equals((java.lang.Object) wildcardClass42);
        defaultKeyedValues21.addValue((java.lang.Comparable) 1.0d, (double) 3);
        java.lang.Number number48 = defaultKeyedValues21.getValue((int) (short) 1);
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + 10.0d + "'", number48, 10.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        java.util.List list22 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        int int22 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj12 = defaultKeyedValues11.clone();
        defaultKeyedValues11.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number17 = null;
        defaultKeyedValues11.setValue((java.lang.Comparable) (-1.0d), number17);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        java.lang.Number number27 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0d + "'", number27, 100.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj12 = defaultKeyedValues11.clone();
        defaultKeyedValues11.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number17 = null;
        defaultKeyedValues11.setValue((java.lang.Comparable) (-1.0d), number17);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        java.lang.Comparable comparable27 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100 + "'", comparable27, 100);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) 0L, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj15 = defaultKeyedValues14.clone();
        defaultKeyedValues14.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues14.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int22 = defaultKeyedValues14.getItemCount();
        java.lang.Object obj23 = defaultKeyedValues14.clone();
        defaultKeyedValues14.clear();
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int26 = defaultKeyedValues14.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.insertValue((int) (short) 10, (java.lang.Comparable) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int18 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.clear();
        int int21 = defaultKeyedValues2D11.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: defaultKeyedValues2D1.getValue((-1), (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (-1.0d));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Comparable comparable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 2, comparable3, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        defaultKeyedValues6.addValue((java.lang.Comparable) 0L, 1.0d);
        defaultKeyedValues6.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) "", (java.lang.Comparable) 10);
        defaultKeyedValues2D1.clear();
        java.util.List list21 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10, (java.lang.Comparable) 0L);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list14 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int19 = defaultKeyedValues6.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list20 = defaultKeyedValues6.getKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list22 = defaultKeyedValues6.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.removeValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        java.util.List list14 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.lang.Number number12 = null;
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1.0f), number12);
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.removeValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) (-1.0f));
        java.lang.Number number8 = defaultKeyedValues0.getValue((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0d) + "'", number8, (-1.0d));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.lang.Object obj33 = defaultKeyedValues12.clone();
        defaultKeyedValues12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultKeyedValues12.getValue((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
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
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        boolean boolean4 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultKeyedValues2D6.getRowKeys();
        java.util.List list11 = defaultKeyedValues2D6.getColumnKeys();
        int int12 = defaultKeyedValues2D6.getColumnCount();
        defaultKeyedValues2D6.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int17 = defaultKeyedValues2D6.getColumnCount();
        java.util.List list18 = defaultKeyedValues2D6.getRowKeys();
        java.lang.Number number19 = null;
        defaultKeyedValues2D6.addValue(number19, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) number19);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (double) (short) 10);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 10);
        int int15 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        java.util.List list16 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
        int int23 = defaultKeyedValues2D1.getRowCount();
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10, comparable26);
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
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        java.util.List list17 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable20 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0f + "'", comparable20, 10.0f);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues12.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj20 = defaultKeyedValues12.clone();
        defaultKeyedValues12.removeValue((int) (byte) 0);
        defaultKeyedValues12.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        java.util.List list29 = defaultKeyedValues12.getKeys();
        java.lang.Number number31 = null;
        defaultKeyedValues12.addValue((java.lang.Comparable) 10.0d, number31);
        boolean boolean33 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list36 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        boolean boolean41 = defaultKeyedValues12.equals((java.lang.Object) 10L);
        int int43 = defaultKeyedValues12.getIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable45 = defaultKeyedValues12.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        int int9 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 2, (java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D7.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int14 = defaultKeyedValues2D7.getColumnCount();
        boolean boolean16 = defaultKeyedValues2D7.equals((java.lang.Object) false);
        int int18 = defaultKeyedValues2D7.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list19 = defaultKeyedValues2D7.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        defaultKeyedValues20.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int26 = defaultKeyedValues20.getIndex((java.lang.Comparable) 10.0f);
        int int28 = defaultKeyedValues20.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list30 = defaultKeyedValues29.getKeys();
        boolean boolean31 = defaultKeyedValues20.equals((java.lang.Object) defaultKeyedValues29);
        boolean boolean32 = defaultKeyedValues2D7.equals((java.lang.Object) defaultKeyedValues20);
        int int33 = defaultKeyedValues2D7.getRowCount();
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder36 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (double) (short) 0);
        java.util.List list38 = defaultKeyedValues0.getKeys();
        java.lang.Number number40 = defaultKeyedValues0.getValue((int) (short) 0);
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
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + 1.0d + "'", number40, 1.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 0L);
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, number13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) "", 10.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1), (java.lang.Comparable) (byte) 0, (java.lang.Comparable) false);
        defaultKeyedValues2D1.removeColumn(0);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
            defaultKeyedValues2D1.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.Object obj23 = defaultKeyedValues6.clone();
        int int24 = defaultKeyedValues6.getItemCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (short) -1, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 6, (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable13 = defaultKeyedValues0.getKey(0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list19 = defaultKeyedValues18.getKeys();
        java.lang.Object obj20 = defaultKeyedValues18.clone();
        boolean boolean21 = defaultKeyedValues14.equals(obj20);
        java.util.List list22 = defaultKeyedValues14.getKeys();
        java.util.List list23 = defaultKeyedValues14.getKeys();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100.0f + "'", comparable13, 100.0f);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 0L, (java.lang.Comparable) false);
        int int24 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj11 = defaultKeyedValues10.clone();
        defaultKeyedValues10.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues10.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list18 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int23 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0f);
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues10.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D31 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list32 = defaultKeyedValues2D31.getColumnKeys();
        defaultKeyedValues2D31.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int37 = defaultKeyedValues2D31.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues38 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues38.clear();
        boolean boolean40 = defaultKeyedValues2D31.equals((java.lang.Object) defaultKeyedValues38);
        int int42 = defaultKeyedValues2D31.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj43 = defaultKeyedValues2D31.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D45 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D45.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list49 = defaultKeyedValues2D45.getRowKeys();
        int int50 = defaultKeyedValues2D45.getColumnCount();
        int int52 = defaultKeyedValues2D45.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean53 = defaultKeyedValues2D31.equals((java.lang.Object) defaultKeyedValues2D45);
        boolean boolean54 = defaultKeyedValues2D17.equals((java.lang.Object) boolean53);
        java.lang.Object obj55 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 10);
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
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues6.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number17 = defaultKeyedValues6.getValue((int) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D19.equals((java.lang.Object) false);
        int int30 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list31 = defaultKeyedValues2D19.getColumnKeys();
        java.util.List list32 = defaultKeyedValues2D19.getRowKeys();
        defaultKeyedValues2D19.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 4, (java.lang.Comparable) (short) -1);
        java.lang.Object obj37 = defaultKeyedValues2D19.clone();
        boolean boolean38 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues6.addValue((java.lang.Comparable) 0.0f, (double) 100);
        java.lang.Object obj42 = defaultKeyedValues6.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        java.lang.Comparable comparable21 = defaultKeyedValues6.getKey(1);
        java.lang.Object obj22 = defaultKeyedValues6.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 100 + "'", comparable21, 100);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        defaultKeyedValues6.setValue((java.lang.Comparable) false, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 5);
        java.lang.Object obj35 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (double) '4');
        int int27 = defaultKeyedValues6.getIndex((java.lang.Comparable) true);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj29 = defaultKeyedValues28.clone();
        defaultKeyedValues28.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int33 = defaultKeyedValues28.getItemCount();
        java.lang.Number number35 = defaultKeyedValues28.getValue((int) (byte) 0);
        boolean boolean37 = defaultKeyedValues28.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D39 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean40 = defaultKeyedValues28.equals((java.lang.Object) defaultKeyedValues2D39);
        java.lang.Object obj41 = defaultKeyedValues2D39.clone();
        defaultKeyedValues2D39.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj47 = defaultKeyedValues46.clone();
        java.util.List list48 = defaultKeyedValues46.getKeys();
        int int49 = defaultKeyedValues46.getItemCount();
        java.lang.Object obj50 = defaultKeyedValues46.clone();
        int int51 = defaultKeyedValues46.getItemCount();
        java.util.List list52 = defaultKeyedValues46.getKeys();
        boolean boolean53 = defaultKeyedValues2D39.equals((java.lang.Object) defaultKeyedValues46);
        boolean boolean54 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues46);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue(10, (java.lang.Comparable) (-1.0f), (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + (byte) 10 + "'", number35, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.clear();
        java.util.List list17 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 0, (java.lang.Comparable) 'a');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D23.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable35 = defaultKeyedValues2D23.getColumnKey((int) (short) 0);
        defaultKeyedValues2D23.clear();
        java.util.List list37 = defaultKeyedValues2D23.getRowKeys();
        int int38 = defaultKeyedValues2D23.getRowCount();
        boolean boolean39 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D23);
        java.util.List list40 = defaultKeyedValues2D23.getRowKeys();
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10 + "'", comparable35, 10);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D22.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable34 = defaultKeyedValues2D22.getColumnKey((int) (short) 0);
        int int35 = defaultKeyedValues2D22.getColumnCount();
        defaultKeyedValues2D22.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D22.removeColumn(0);
        int int42 = defaultKeyedValues2D22.getRowCount();
        defaultKeyedValues2D22.clear();
        boolean boolean44 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        int int49 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 10 + "'", comparable34, 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0.0f, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Comparable comparable15 = defaultKeyedValues2D1.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = null; // flaky: defaultKeyedValues2D1.getValue((-1), (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (-1.0f) + "'", comparable15, (-1.0f));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        int int19 = defaultKeyedValues2D1.getRowCount();
        java.util.List list20 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        int int24 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj21 = defaultKeyedValues13.clone();
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues13.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues13.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues13.addValue((java.lang.Comparable) (short) 1, 10.0d);
        defaultKeyedValues13.insertValue((int) (short) 0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        java.lang.Number number39 = null;
        defaultKeyedValues13.setValue((java.lang.Comparable) (byte) 100, number39);
        boolean boolean41 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues13.removeValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Number number14 = null;
        defaultKeyedValues2D1.addValue(number14, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        int int22 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        int int34 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D16.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) (short) -1);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues12.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 0);
        java.util.List list34 = defaultKeyedValues12.getKeys();
        boolean boolean35 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        int int37 = defaultKeyedValues36.getItemCount();
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int42 = defaultKeyedValues36.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list43 = defaultKeyedValues36.getKeys();
        defaultKeyedValues36.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues45 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues45.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number50 = null;
        defaultKeyedValues45.addValue((java.lang.Comparable) 100L, number50);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D53 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D53.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list57 = defaultKeyedValues2D53.getRowKeys();
        java.util.List list58 = defaultKeyedValues2D53.getColumnKeys();
        defaultKeyedValues2D53.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean62 = defaultKeyedValues45.equals((java.lang.Object) defaultKeyedValues2D53);
        java.lang.Object obj63 = defaultKeyedValues2D53.clone();
        boolean boolean64 = defaultKeyedValues36.equals((java.lang.Object) defaultKeyedValues2D53);
        java.lang.Object obj65 = defaultKeyedValues36.clone();
        boolean boolean66 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues36);
        org.jfree.chart.util.SortOrder sortOrder67 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByValues(sortOrder67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D11.getRowKeys();
        java.util.List list18 = defaultKeyedValues2D11.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int24 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (short) 10);
        boolean boolean25 = defaultKeyedValues2D17.equals((java.lang.Object) (short) 10);
        java.util.List list26 = defaultKeyedValues2D17.getColumnKeys();
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D17);
        int int29 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 5);
        int int30 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj31 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 100.0f);
        java.lang.Class<?> wildcardClass27 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0.0d);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        int int15 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) (-1L));
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 10, number8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        java.lang.Number number34 = defaultKeyedValues2D1.getValue(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = defaultKeyedValues2D1.getValue(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 10.0d + "'", number34, 10.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        defaultKeyedValues12.setValue((java.lang.Comparable) 3, (double) ' ');
        org.jfree.chart.util.SortOrder sortOrder41 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByKeys(sortOrder41);
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
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.Number number21 = null;
        defaultKeyedValues2D1.setValue(number21, (java.lang.Comparable) 100L, (java.lang.Comparable) ' ');
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 1L, (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0f, (java.lang.Number) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 0.0d);
        java.util.List list32 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues0.getItemCount();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0L, (java.lang.Comparable) '4');
        defaultKeyedValues2D1.removeRow(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D1.getRowCount();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (double) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        defaultKeyedValues2D11.removeRow((int) (short) 0);
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) (-1));
        java.lang.Comparable comparable21 = defaultKeyedValues2D1.getColumnKey((int) (byte) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 6);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (byte) 1 + "'", comparable21, (byte) 1);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 0);
        java.util.List list22 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass23 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 10);
        int int18 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 6, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) (byte) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D1.getValue((java.lang.Comparable) '4', (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (-1.0f));
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        int int28 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = null; // flaky: defaultKeyedValues2D1.getValue((-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D19.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable31 = defaultKeyedValues2D19.getColumnKey((int) (short) 0);
        defaultKeyedValues2D19.clear();
        defaultKeyedValues2D19.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues34 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues34.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues38 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list39 = defaultKeyedValues38.getKeys();
        java.lang.Object obj40 = defaultKeyedValues38.clone();
        boolean boolean41 = defaultKeyedValues34.equals(obj40);
        boolean boolean42 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues34);
        java.util.List list43 = defaultKeyedValues2D19.getRowKeys();
        boolean boolean44 = defaultKeyedValues2D0.equals((java.lang.Object) list43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number47 = defaultKeyedValues2D0.getValue((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10 + "'", comparable31, 10);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 3);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int19 = defaultKeyedValues2D18.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D21.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable33 = defaultKeyedValues2D21.getColumnKey((int) (short) 0);
        defaultKeyedValues2D21.clear();
        defaultKeyedValues2D21.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues36.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list41 = defaultKeyedValues40.getKeys();
        java.lang.Object obj42 = defaultKeyedValues40.clone();
        boolean boolean43 = defaultKeyedValues36.equals(obj42);
        boolean boolean44 = defaultKeyedValues2D21.equals((java.lang.Object) defaultKeyedValues36);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D46.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list50 = defaultKeyedValues2D46.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues51 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj52 = defaultKeyedValues51.clone();
        defaultKeyedValues51.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int56 = defaultKeyedValues51.getItemCount();
        boolean boolean57 = defaultKeyedValues2D46.equals((java.lang.Object) defaultKeyedValues51);
        defaultKeyedValues51.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number62 = null;
        defaultKeyedValues51.setValue((java.lang.Comparable) '#', number62);
        java.util.List list64 = defaultKeyedValues51.getKeys();
        defaultKeyedValues51.clear();
        defaultKeyedValues51.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) 10);
        boolean boolean69 = defaultKeyedValues36.equals((java.lang.Object) (short) 10);
        boolean boolean70 = defaultKeyedValues2D18.equals((java.lang.Object) (short) 10);
        int int72 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) "hi!");
        boolean boolean73 = defaultKeyedValues0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10 + "'", comparable33, 10);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        int int15 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        java.util.List list34 = defaultKeyedValues12.getKeys();
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
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 1, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        defaultKeyedValues6.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D1.clear();
        int int14 = defaultKeyedValues2D1.getRowCount();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = defaultKeyedValues2D1.getColumnIndex(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D1.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj13 = defaultKeyedValues12.clone();
        defaultKeyedValues12.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number18 = null;
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1.0d), number18);
        defaultKeyedValues12.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues12.removeValue((int) (short) 0);
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues12.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 0);
        java.util.List list34 = defaultKeyedValues12.getKeys();
        boolean boolean35 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues12);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        int int37 = defaultKeyedValues36.getItemCount();
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int42 = defaultKeyedValues36.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list43 = defaultKeyedValues36.getKeys();
        defaultKeyedValues36.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues45 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues45.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number50 = null;
        defaultKeyedValues45.addValue((java.lang.Comparable) 100L, number50);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D53 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D53.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list57 = defaultKeyedValues2D53.getRowKeys();
        java.util.List list58 = defaultKeyedValues2D53.getColumnKeys();
        defaultKeyedValues2D53.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean62 = defaultKeyedValues45.equals((java.lang.Object) defaultKeyedValues2D53);
        java.lang.Object obj63 = defaultKeyedValues2D53.clone();
        boolean boolean64 = defaultKeyedValues36.equals((java.lang.Object) defaultKeyedValues2D53);
        java.lang.Object obj65 = defaultKeyedValues36.clone();
        boolean boolean66 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues36);
        int int67 = defaultKeyedValues12.getItemCount();
        defaultKeyedValues12.setValue((java.lang.Comparable) (-1), (double) (short) 10);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "hi!");
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 10);
        java.util.List list17 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj19 = defaultKeyedValues18.clone();
        defaultKeyedValues18.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int23 = defaultKeyedValues18.getItemCount();
        java.lang.Number number25 = defaultKeyedValues18.getValue((int) (byte) 0);
        boolean boolean27 = defaultKeyedValues18.equals((java.lang.Object) (-1.0f));
        boolean boolean28 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues18);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (byte) 10 + "'", number25, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        defaultKeyedValues2D1.addValue((java.lang.Number) 0.0f, (java.lang.Comparable) 2, (java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowCount();
        int int16 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        java.lang.Number number28 = defaultKeyedValues0.getValue(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list14 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int19 = defaultKeyedValues6.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list20 = defaultKeyedValues6.getKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 1L, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 3);
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        java.lang.Object obj19 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        int int66 = defaultKeyedValues31.getIndex((java.lang.Comparable) '#');
        org.jfree.chart.util.SortOrder sortOrder67 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues31.sortByValues(sortOrder67);
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) 5);
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        int int6 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.removeRow((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) 0, (java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        java.lang.Object obj34 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj12 = defaultKeyedValues8.clone();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        int int3 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        int int18 = defaultKeyedValues2D11.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D11.getRowKeys();
        defaultKeyedValues2D11.removeColumn(0);
        defaultKeyedValues2D11.removeRow(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D11.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
        java.lang.Comparable comparable16 = defaultKeyedValues2D1.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + false + "'", comparable16, false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues8.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj16 = defaultKeyedValues8.clone();
        defaultKeyedValues8.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list24 = defaultKeyedValues2D20.getRowKeys();
        java.util.List list25 = defaultKeyedValues2D20.getColumnKeys();
        int int26 = defaultKeyedValues2D20.getColumnCount();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int31 = defaultKeyedValues2D20.getColumnCount();
        boolean boolean32 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D20);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj34 = defaultKeyedValues33.clone();
        defaultKeyedValues33.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues33.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean41 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues33);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list47 = defaultKeyedValues2D43.getRowKeys();
        java.util.List list48 = defaultKeyedValues2D43.getColumnKeys();
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int52 = defaultKeyedValues2D43.getColumnCount();
        java.lang.Object obj53 = defaultKeyedValues2D43.clone();
        boolean boolean54 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D43);
        boolean boolean55 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues8.setValue((java.lang.Comparable) 1L, (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number60 = defaultKeyedValues8.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 100);
        int int7 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) '4');
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (double) (short) 100);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        java.util.List list12 = defaultKeyedValues0.getKeys();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.clear();
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) (short) 1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 1L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 100L);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 100L);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        int int9 = defaultKeyedValues8.getItemCount();
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int14 = defaultKeyedValues8.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list15 = defaultKeyedValues8.getKeys();
        defaultKeyedValues8.clear();
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
        boolean boolean36 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D25);
        defaultKeyedValues8.setValue((java.lang.Comparable) 1, (double) 1L);
        int int41 = defaultKeyedValues8.getIndex((java.lang.Comparable) 10);
        defaultKeyedValues8.addValue((java.lang.Comparable) (short) -1, (java.lang.Number) (short) 0);
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        java.lang.Object obj46 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list34 = defaultKeyedValues2D30.getRowKeys();
        java.util.List list35 = defaultKeyedValues2D30.getColumnKeys();
        int int36 = defaultKeyedValues2D30.getColumnCount();
        java.util.List list37 = defaultKeyedValues2D30.getRowKeys();
        int int39 = defaultKeyedValues2D30.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj40 = defaultKeyedValues2D30.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj42 = defaultKeyedValues41.clone();
        defaultKeyedValues41.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number47 = null;
        defaultKeyedValues41.setValue((java.lang.Comparable) (-1.0d), number47);
        defaultKeyedValues41.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues41.removeValue((int) (short) 0);
        boolean boolean54 = defaultKeyedValues2D30.equals((java.lang.Object) defaultKeyedValues41);
        int int56 = defaultKeyedValues41.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues41.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues41.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) -1);
        java.lang.Number number65 = defaultKeyedValues41.getValue(3);
        boolean boolean66 = defaultKeyedValues11.equals((java.lang.Object) 3);
        int int68 = defaultKeyedValues11.getIndex((java.lang.Comparable) 0);
        defaultKeyedValues11.insertValue(1, (java.lang.Comparable) (short) 0, 0.0d);
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
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + number65 + "' != '" + (byte) -1 + "'", number65, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 10L, (java.lang.Number) 100L);
        java.util.List list29 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        int int12 = defaultKeyedValues0.getItemCount();
        int int13 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (-1));
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, 0.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) (short) -1);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (-1), (double) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 4);
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0);
        int int16 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) true, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) ' ', (double) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        java.util.List list6 = defaultKeyedValues0.getKeys();
        int int7 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        int int17 = defaultKeyedValues2D1.getRowCount();
        int int18 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list37 = defaultKeyedValues2D33.getColumnKeys();
        java.util.List list38 = defaultKeyedValues2D33.getRowKeys();
        java.lang.Class<?> wildcardClass39 = list38.getClass();
        boolean boolean40 = defaultKeyedValues12.equals((java.lang.Object) list38);
        java.lang.Number number42 = defaultKeyedValues12.getValue((int) (byte) 0);
        java.lang.Object obj43 = defaultKeyedValues12.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + number42 + "' != '" + 0L + "'", number42, 0L);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        int int16 = defaultKeyedValues2D1.getRowCount();
        int int17 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj11 = defaultKeyedValues10.clone();
        defaultKeyedValues10.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues10.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int18 = defaultKeyedValues10.getItemCount();
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 5);
        boolean boolean22 = defaultKeyedValues2D1.equals((java.lang.Object) 5);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) 100L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.lang.Object obj33 = defaultKeyedValues12.clone();
        defaultKeyedValues12.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.insertValue((int) ' ', (java.lang.Comparable) 4, (java.lang.Number) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
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
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 10L);
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (-1L));
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0);
        int int16 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1.0f);
        java.lang.Number number18 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, number18);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 100);
        int int18 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.util.List list37 = defaultKeyedValues12.getKeys();
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
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        int int19 = defaultKeyedValues2D11.getRowCount();
        defaultKeyedValues2D11.clear();
        int int22 = defaultKeyedValues2D11.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int18 = defaultKeyedValues12.getIndex((java.lang.Comparable) 10.0f);
        int int20 = defaultKeyedValues12.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D22.clear();
        boolean boolean30 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D22.setValue((java.lang.Number) 3, (java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        boolean boolean35 = defaultKeyedValues2D1.equals((java.lang.Object) (-1));
        java.util.List list36 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list37 = defaultKeyedValues2D1.getColumnKeys();
        int int38 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D19.getColumnKeys();
        int int25 = defaultKeyedValues2D19.getColumnCount();
        java.util.List list26 = defaultKeyedValues2D19.getRowKeys();
        int int28 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj29 = defaultKeyedValues2D19.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj31 = defaultKeyedValues30.clone();
        defaultKeyedValues30.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number36 = null;
        defaultKeyedValues30.setValue((java.lang.Comparable) (-1.0d), number36);
        defaultKeyedValues30.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues30.removeValue((int) (short) 0);
        boolean boolean43 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues30);
        int int45 = defaultKeyedValues30.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues30.insertValue(0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0L);
        defaultKeyedValues30.clear();
        java.lang.Object obj51 = defaultKeyedValues30.clone();
        defaultKeyedValues30.clear();
        boolean boolean53 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues30);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
            defaultKeyedValues6.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        int int19 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        int int16 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        java.lang.Number number14 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean18 = defaultKeyedValues2D16.equals((java.lang.Object) false);
        defaultKeyedValues2D16.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D16.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D16.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        java.util.List list32 = defaultKeyedValues2D16.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D16.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable11 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 100.0f + "'", comparable11, 100.0f);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10.0d);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        defaultKeyedValues6.removeValue((int) (byte) 0);
        java.lang.Number number22 = defaultKeyedValues6.getValue(1);
        defaultKeyedValues6.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 100.0f);
        java.lang.Number number27 = defaultKeyedValues6.getValue((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (-1.0d) + "'", number22, (-1.0d));
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0f + "'", number27, 100.0f);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        int int25 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (double) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues0.getValue((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        defaultKeyedValues2D1.clear();
        java.lang.Object obj28 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 10.0d);
        java.lang.Number number12 = defaultKeyedValues0.getValue((int) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (short) 10 + "'", number12, (short) 10);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = defaultKeyedValues0.getValue(1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
        int int24 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj3 = defaultKeyedValues2.clone();
        defaultKeyedValues2.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnCount();
        boolean boolean17 = defaultKeyedValues2D8.equals((java.lang.Object) false);
        int int19 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list20 = defaultKeyedValues2D8.getColumnKeys();
        boolean boolean21 = defaultKeyedValues2.equals((java.lang.Object) list20);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) list20);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) 4, (double) ' ');
        defaultKeyedValues0.removeValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.lang.Comparable comparable21 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int25 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list26 = defaultKeyedValues2D23.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj28 = defaultKeyedValues27.clone();
        defaultKeyedValues27.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number33 = null;
        defaultKeyedValues27.setValue((java.lang.Comparable) (-1.0d), number33);
        defaultKeyedValues27.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues27.removeValue((int) (short) 0);
        defaultKeyedValues27.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D44 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D44.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list48 = defaultKeyedValues2D44.getColumnKeys();
        boolean boolean49 = defaultKeyedValues27.equals((java.lang.Object) defaultKeyedValues2D44);
        java.util.List list50 = defaultKeyedValues27.getKeys();
        boolean boolean51 = defaultKeyedValues2D23.equals((java.lang.Object) list50);
        boolean boolean52 = defaultKeyedValues2D1.equals((java.lang.Object) boolean51);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues53 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj54 = defaultKeyedValues53.clone();
        defaultKeyedValues53.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues53.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj61 = defaultKeyedValues53.clone();
        int int63 = defaultKeyedValues53.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues53.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        java.lang.Object obj68 = null;
        boolean boolean69 = defaultKeyedValues53.equals(obj68);
        boolean boolean70 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues53);
        int int71 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list72 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj73 = null;
        boolean boolean74 = defaultKeyedValues2D1.equals(obj73);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 2 + "'", comparable21, 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        int int28 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int37 = defaultKeyedValues2D30.getColumnCount();
        boolean boolean39 = defaultKeyedValues2D30.equals((java.lang.Object) false);
        int int41 = defaultKeyedValues2D30.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list42 = defaultKeyedValues2D30.getColumnKeys();
        boolean boolean43 = defaultKeyedValues2D1.equals((java.lang.Object) list42);
        java.lang.Class<?> wildcardClass44 = list42.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        int int15 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 100L);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) ' ', (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int13 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list14 = defaultKeyedValues2D11.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj16 = defaultKeyedValues15.clone();
        defaultKeyedValues15.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number21 = null;
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0d), number21);
        defaultKeyedValues15.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues15.removeValue((int) (short) 0);
        defaultKeyedValues15.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D32.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list36 = defaultKeyedValues2D32.getColumnKeys();
        boolean boolean37 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues2D32);
        java.util.List list38 = defaultKeyedValues15.getKeys();
        boolean boolean39 = defaultKeyedValues2D11.equals((java.lang.Object) list38);
        defaultKeyedValues2D11.addValue((java.lang.Number) 100, (java.lang.Comparable) 0, (java.lang.Comparable) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D45 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D45.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D45.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D45.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable57 = defaultKeyedValues2D45.getColumnKey((int) (short) 0);
        int int58 = defaultKeyedValues2D45.getColumnCount();
        defaultKeyedValues2D45.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D45.removeColumn(0);
        defaultKeyedValues2D45.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) true);
        java.util.List list68 = defaultKeyedValues2D45.getRowKeys();
        java.lang.Object obj69 = defaultKeyedValues2D45.clone();
        boolean boolean70 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues2D45);
        boolean boolean71 = defaultKeyedValues0.equals((java.lang.Object) boolean70);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 10 + "'", comparable57, 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 6, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 1.0d);
        int int9 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj19 = defaultKeyedValues2D1.clone();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int18 = defaultKeyedValues12.getIndex((java.lang.Comparable) 10.0f);
        int int20 = defaultKeyedValues12.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D22.clear();
        boolean boolean30 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D22.setValue((java.lang.Number) 3, (java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        boolean boolean35 = defaultKeyedValues2D1.equals((java.lang.Object) (-1));
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 4);
        defaultKeyedValues2D1.removeRow((int) (short) 1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0, (java.lang.Comparable) (byte) 100);
        int int33 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        int int22 = defaultKeyedValues2D16.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D16.getRowKeys();
        int int25 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj26 = defaultKeyedValues2D16.clone();
        int int27 = defaultKeyedValues2D16.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) int27);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) false);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) 100, (java.lang.Comparable) "hi!");
        int int21 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int30 = defaultKeyedValues2D23.getColumnCount();
        boolean boolean32 = defaultKeyedValues2D23.equals((java.lang.Object) false);
        int int34 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list35 = defaultKeyedValues2D23.getColumnKeys();
        boolean boolean36 = defaultKeyedValues2D1.equals((java.lang.Object) list35);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        defaultKeyedValues2D17.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) ' ', (java.lang.Comparable) 10);
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) (short) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (byte) 1, (java.lang.Number) 100.0f);
        int int25 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj3 = defaultKeyedValues2.clone();
        defaultKeyedValues2.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnCount();
        boolean boolean17 = defaultKeyedValues2D8.equals((java.lang.Object) false);
        int int19 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list20 = defaultKeyedValues2D8.getColumnKeys();
        boolean boolean21 = defaultKeyedValues2.equals((java.lang.Object) list20);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) list20);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) 4, (double) ' ');
        defaultKeyedValues0.removeValue((int) (byte) 0);
        java.lang.Object obj29 = defaultKeyedValues0.clone();
        int int31 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, 10.0d);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        int int15 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues2D1.equals(obj11);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10);
        int int19 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        java.util.List list23 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        int int25 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1), (java.lang.Comparable) (-1L));
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 0.0f);
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
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Number number14 = null;
        defaultKeyedValues2D1.addValue(number14, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) '#');
        java.util.List list22 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj34 = defaultKeyedValues33.clone();
        defaultKeyedValues33.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues33.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        defaultKeyedValues33.clear();
        java.lang.Class<?> wildcardClass42 = defaultKeyedValues33.getClass();
        boolean boolean43 = defaultKeyedValues21.equals((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = defaultKeyedValues21.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues21.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeRow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
            defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        java.lang.Object obj22 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D8.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        defaultKeyedValues2D8.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        boolean boolean18 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0f);
        java.util.List list19 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues2D1.getValue((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int19 = defaultKeyedValues13.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues13.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.util.List list23 = defaultKeyedValues13.getKeys();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) list23);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        int int19 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int20 = defaultKeyedValues14.getIndex((java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues14.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list24 = defaultKeyedValues23.getKeys();
        boolean boolean25 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues23);
        java.lang.Object obj26 = defaultKeyedValues14.clone();
        boolean boolean27 = defaultKeyedValues2D1.equals(obj26);
        java.lang.Object obj28 = defaultKeyedValues2D1.clone();
        int int30 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        java.util.List list25 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 6);
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 0.0f);
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
            defaultKeyedValues2D11.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1L, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Byte");
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        java.lang.Number number36 = defaultKeyedValues12.getValue(3);
        defaultKeyedValues12.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + (byte) -1 + "'", number36, (byte) -1);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        java.util.List list25 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj6 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number11 = null;
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1.0d), number11);
        defaultKeyedValues5.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues5.removeValue((int) (short) 0);
        defaultKeyedValues5.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list26 = defaultKeyedValues2D22.getColumnKeys();
        boolean boolean27 = defaultKeyedValues5.equals((java.lang.Object) defaultKeyedValues2D22);
        java.util.List list28 = defaultKeyedValues5.getKeys();
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) list28);
        java.util.List list30 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = defaultKeyedValues2D1.equals(obj18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D1.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        java.lang.Object obj23 = defaultKeyedValues6.clone();
        int int25 = defaultKeyedValues6.getIndex((java.lang.Comparable) "");
        int int26 = defaultKeyedValues6.getItemCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) '#');
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) "", (java.lang.Number) (short) 10);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
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
        defaultKeyedValues5.clear();
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues5);
        defaultKeyedValues5.addValue((java.lang.Comparable) 100L, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int13 = defaultKeyedValues8.getItemCount();
        java.lang.Number number15 = defaultKeyedValues8.getValue((int) (byte) 0);
        boolean boolean17 = defaultKeyedValues8.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues2D19.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int26 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) true);
        defaultKeyedValues2D1.removeRow((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (byte) 10 + "'", number15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D1.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        defaultKeyedValues2D17.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 'a', (java.lang.Comparable) 4);
        java.util.List list27 = defaultKeyedValues2D17.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) '4', (java.lang.Comparable) 5);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        int int25 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj27 = defaultKeyedValues26.clone();
        defaultKeyedValues26.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int31 = defaultKeyedValues26.getItemCount();
        java.lang.Number number33 = defaultKeyedValues26.getValue((int) (byte) 0);
        boolean boolean35 = defaultKeyedValues26.equals((java.lang.Object) (-1.0f));
        int int37 = defaultKeyedValues26.getIndex((java.lang.Comparable) (short) 0);
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + (byte) 10 + "'", number33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int int26 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj12 = defaultKeyedValues8.clone();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list27 = defaultKeyedValues2D23.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj29 = defaultKeyedValues28.clone();
        defaultKeyedValues28.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int33 = defaultKeyedValues28.getItemCount();
        boolean boolean34 = defaultKeyedValues2D23.equals((java.lang.Object) defaultKeyedValues28);
        java.lang.Object obj35 = defaultKeyedValues28.clone();
        int int37 = defaultKeyedValues28.getIndex((java.lang.Comparable) (byte) -1);
        boolean boolean38 = defaultKeyedValues2D8.equals((java.lang.Object) int37);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D40 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list41 = defaultKeyedValues2D40.getColumnKeys();
        defaultKeyedValues2D40.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int46 = defaultKeyedValues2D40.getRowCount();
        defaultKeyedValues2D40.clear();
        int int48 = defaultKeyedValues2D40.getRowCount();
        int int50 = defaultKeyedValues2D40.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list51 = defaultKeyedValues2D40.getColumnKeys();
        boolean boolean52 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues2D40);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        java.lang.Number number15 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, number15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Number number14 = null;
        defaultKeyedValues2D1.addValue(number14, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) '#');
        int int22 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj23 = defaultKeyedValues2D1.clone();
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, 10.0d);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        java.lang.Number number26 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, number26);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        int int29 = defaultKeyedValues28.getItemCount();
        defaultKeyedValues28.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int34 = defaultKeyedValues28.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues28.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues28.clear();
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues28);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues28.insertValue((int) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 100L);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues0.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.lang.Comparable comparable21 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
        java.lang.Number number22 = null;
        defaultKeyedValues2D1.addValue(number22, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 2 + "'", comparable21, 2);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) 0);
        defaultKeyedValues2D1.removeRow((int) (byte) 0);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        int int23 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable24, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        int int28 = defaultKeyedValues2D1.getColumnCount();
        int int29 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) "", (java.lang.Comparable) 'a');
        int int35 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj21 = defaultKeyedValues13.clone();
        defaultKeyedValues13.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D25.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list29 = defaultKeyedValues2D25.getRowKeys();
        java.util.List list30 = defaultKeyedValues2D25.getColumnKeys();
        int int31 = defaultKeyedValues2D25.getColumnCount();
        defaultKeyedValues2D25.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int36 = defaultKeyedValues2D25.getColumnCount();
        boolean boolean37 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues2D25);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues38 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj39 = defaultKeyedValues38.clone();
        defaultKeyedValues38.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues38.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean46 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues38);
        java.util.List list47 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) (-1), (java.lang.Number) 100.0d);
        boolean boolean51 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues13);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list15 = defaultKeyedValues2D11.getRowKeys();
        java.util.List list16 = defaultKeyedValues2D11.getColumnKeys();
        int int17 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int22 = defaultKeyedValues2D11.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D11.getRowKeys();
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        int int25 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) 1L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj17 = null;
        boolean boolean18 = defaultKeyedValues2D1.equals(obj17);
        java.lang.Object obj19 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0, comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        int int28 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "");
        int int29 = defaultKeyedValues2D1.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (byte) -1, (-1.0d));
        java.lang.Number number14 = defaultKeyedValues0.getValue(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) (byte) -1);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 100);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list13 = defaultKeyedValues6.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list20 = defaultKeyedValues19.getKeys();
        boolean boolean21 = defaultKeyedValues14.equals((java.lang.Object) list20);
        java.lang.Object obj22 = defaultKeyedValues14.clone();
        boolean boolean23 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues14.getKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int2 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int20 = defaultKeyedValues14.getIndex((java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues14.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list24 = defaultKeyedValues23.getKeys();
        boolean boolean25 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues23);
        java.lang.Object obj26 = defaultKeyedValues14.clone();
        boolean boolean27 = defaultKeyedValues2D1.equals(obj26);
        java.lang.Object obj28 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) 2, comparable30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues2D11.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D11.getRowKeys();
        int int19 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        defaultKeyedValues6.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues6.addValue((java.lang.Comparable) "", (double) (short) 100);
        java.lang.Class<?> wildcardClass25 = defaultKeyedValues6.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
        int int15 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 100, (java.lang.Comparable) "");
        int int21 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        int int22 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (java.lang.Number) (short) -1);
        java.lang.Number number27 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (byte) 10 + "'", number27, (byte) 10);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number17 = null;
        defaultKeyedValues12.addValue((java.lang.Comparable) 100L, number17);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list24 = defaultKeyedValues2D20.getRowKeys();
        java.util.List list25 = defaultKeyedValues2D20.getColumnKeys();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean29 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D20);
        java.lang.Comparable comparable31 = defaultKeyedValues12.getKey(1);
        int int32 = defaultKeyedValues12.getItemCount();
        defaultKeyedValues12.clear();
        defaultKeyedValues12.addValue((java.lang.Comparable) 5, (double) 4);
        boolean boolean37 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues12);
        defaultKeyedValues12.addValue((java.lang.Comparable) 2, (double) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 100L + "'", comparable31, 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj9 = defaultKeyedValues8.clone();
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues8.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj16 = defaultKeyedValues8.clone();
        defaultKeyedValues8.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list24 = defaultKeyedValues2D20.getRowKeys();
        java.util.List list25 = defaultKeyedValues2D20.getColumnKeys();
        int int26 = defaultKeyedValues2D20.getColumnCount();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int31 = defaultKeyedValues2D20.getColumnCount();
        boolean boolean32 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D20);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj34 = defaultKeyedValues33.clone();
        defaultKeyedValues33.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues33.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean41 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues33);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list47 = defaultKeyedValues2D43.getRowKeys();
        java.util.List list48 = defaultKeyedValues2D43.getColumnKeys();
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int52 = defaultKeyedValues2D43.getColumnCount();
        java.lang.Object obj53 = defaultKeyedValues2D43.clone();
        boolean boolean54 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D43);
        boolean boolean55 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number57 = defaultKeyedValues8.getValue((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        int int23 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (double) (short) 10);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        java.lang.Object obj15 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        int int9 = defaultKeyedValues8.getItemCount();
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int14 = defaultKeyedValues8.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list15 = defaultKeyedValues8.getKeys();
        defaultKeyedValues8.clear();
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
        boolean boolean36 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D25);
        defaultKeyedValues8.setValue((java.lang.Comparable) 1, (double) 1L);
        int int41 = defaultKeyedValues8.getIndex((java.lang.Comparable) 10);
        defaultKeyedValues8.addValue((java.lang.Comparable) (short) -1, (java.lang.Number) (short) 0);
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder46 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        java.util.List list28 = defaultKeyedValues2D1.getColumnKeys();
        int int30 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
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
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        int int16 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
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
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (double) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        defaultKeyedValues2D17.addValue((java.lang.Number) 100L, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        int int28 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D19.equals((java.lang.Object) false);
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list39 = defaultKeyedValues2D35.getRowKeys();
        java.util.List list40 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int44 = defaultKeyedValues2D35.getColumnCount();
        int int45 = defaultKeyedValues2D35.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj47 = defaultKeyedValues46.clone();
        defaultKeyedValues46.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number52 = null;
        defaultKeyedValues46.setValue((java.lang.Comparable) (-1.0d), number52);
        java.lang.Object obj54 = defaultKeyedValues46.clone();
        boolean boolean55 = defaultKeyedValues2D35.equals(obj54);
        int int57 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D35.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (-1), (java.lang.Comparable) 10L);
        int int63 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) (short) 10);
        int int65 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) "hi!");
        boolean boolean66 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D35);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D35.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowCount();
        int int18 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        defaultKeyedValues2D1.clear();
        int int29 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list30 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.clear();
        int int16 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int17 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        java.lang.Object obj33 = defaultKeyedValues2D1.clone();
        int int34 = defaultKeyedValues2D1.getRowCount();
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
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        java.util.List list6 = defaultKeyedValues0.getKeys();
        java.util.List list7 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) "hi!");
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        java.lang.Object obj24 = defaultKeyedValues6.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (byte) -1, (-1.0d));
        java.lang.Number number14 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, number14);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) 4);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 10 + "'", number12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 0L);
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        int int5 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 10);
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1), (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.removeColumn(0);
        java.lang.Object obj21 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        java.lang.Number number23 = null;
        defaultKeyedValues2D1.addValue(number23, (java.lang.Comparable) 100, (java.lang.Comparable) 100L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list9 = defaultKeyedValues2D5.getRowKeys();
        java.util.List list10 = defaultKeyedValues2D5.getColumnKeys();
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int14 = defaultKeyedValues2D5.getColumnCount();
        java.lang.Object obj15 = defaultKeyedValues2D5.clone();
        defaultKeyedValues2D5.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D5.clear();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 3, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list13 = defaultKeyedValues6.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list20 = defaultKeyedValues19.getKeys();
        boolean boolean21 = defaultKeyedValues14.equals((java.lang.Object) list20);
        java.lang.Object obj22 = defaultKeyedValues14.clone();
        boolean boolean23 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues14);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.removeValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) 5);
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.sortByKeys(sortOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        int int16 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        defaultKeyedValues12.clear();
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByKeys(sortOrder28);
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
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) ' ');
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj14 = defaultKeyedValues13.clone();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D19.equals((java.lang.Object) false);
        int int30 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list31 = defaultKeyedValues2D19.getColumnKeys();
        boolean boolean32 = defaultKeyedValues13.equals((java.lang.Object) list31);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D34 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int35 = defaultKeyedValues2D34.getColumnCount();
        boolean boolean36 = defaultKeyedValues13.equals((java.lang.Object) int35);
        int int38 = defaultKeyedValues13.getIndex((java.lang.Comparable) 100.0f);
        boolean boolean39 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0f);
        int int41 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int42 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeColumn((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
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
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj11 = defaultKeyedValues10.clone();
        defaultKeyedValues10.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues10.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list18 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int23 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0f);
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
            java.lang.Number number27 = defaultKeyedValues18.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (double) '4');
        defaultKeyedValues6.clear();
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
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D1.removeRow((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        java.lang.Number number21 = null;
        defaultKeyedValues6.addValue((java.lang.Comparable) '#', number21);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int2 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D4.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable16 = defaultKeyedValues2D4.getColumnKey((int) (short) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list24 = defaultKeyedValues23.getKeys();
        java.lang.Object obj25 = defaultKeyedValues23.clone();
        boolean boolean26 = defaultKeyedValues19.equals(obj25);
        boolean boolean27 = defaultKeyedValues2D4.equals((java.lang.Object) defaultKeyedValues19);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list33 = defaultKeyedValues2D29.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues34 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj35 = defaultKeyedValues34.clone();
        defaultKeyedValues34.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int39 = defaultKeyedValues34.getItemCount();
        boolean boolean40 = defaultKeyedValues2D29.equals((java.lang.Object) defaultKeyedValues34);
        defaultKeyedValues34.addValue((java.lang.Comparable) 100, (java.lang.Number) 0.0d);
        java.lang.Number number45 = null;
        defaultKeyedValues34.setValue((java.lang.Comparable) '#', number45);
        java.util.List list47 = defaultKeyedValues34.getKeys();
        defaultKeyedValues34.clear();
        defaultKeyedValues34.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) 10);
        boolean boolean52 = defaultKeyedValues19.equals((java.lang.Object) (short) 10);
        boolean boolean53 = defaultKeyedValues2D1.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10 + "'", comparable16, 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.Object obj30 = defaultKeyedValues2D8.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = defaultKeyedValues2D8.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        java.util.List list33 = defaultKeyedValues2D8.getColumnKeys();
        int int35 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 0L, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        int int23 = defaultKeyedValues6.getItemCount();
        defaultKeyedValues6.insertValue((int) (short) 0, (java.lang.Comparable) (byte) 0, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        java.lang.Number number14 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean18 = defaultKeyedValues2D16.equals((java.lang.Object) false);
        defaultKeyedValues2D16.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D16.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D16.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        java.util.List list32 = defaultKeyedValues2D16.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues2D16.getValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        int int5 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D1.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues13.addValue((java.lang.Comparable) '4', (double) 0L);
        boolean boolean20 = defaultKeyedValues2D1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (short) 1);
        int int18 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100 + "'", comparable14, 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 4, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(comparable22);
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
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        defaultKeyedValues16.clear();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Number number14 = null;
        defaultKeyedValues2D1.addValue(number14, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0d));
        int int13 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj6 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number11 = null;
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1.0d), number11);
        defaultKeyedValues5.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues5.removeValue((int) (short) 0);
        defaultKeyedValues5.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list26 = defaultKeyedValues2D22.getColumnKeys();
        boolean boolean27 = defaultKeyedValues5.equals((java.lang.Object) defaultKeyedValues2D22);
        java.util.List list28 = defaultKeyedValues5.getKeys();
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) list28);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        int int30 = defaultKeyedValues2D1.getRowCount();
        java.util.List list31 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        defaultKeyedValues6.clear();
        defaultKeyedValues6.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 6);
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue((int) (byte) 0, comparable25, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 4);
        int int29 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 5);
        int int31 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable21 = defaultKeyedValues2D1.getColumnKey(0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (byte) 0 + "'", comparable21, (byte) 0);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        defaultKeyedValues6.clear();
        defaultKeyedValues6.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) 10);
        int int24 = defaultKeyedValues6.getItemCount();
        java.lang.Object obj25 = defaultKeyedValues6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues6.getKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        defaultKeyedValues6.removeValue(2);
        defaultKeyedValues6.addValue((java.lang.Comparable) 0.0f, 10.0d);
        defaultKeyedValues6.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue(10, (java.lang.Comparable) "", (double) (-1));
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list37 = defaultKeyedValues2D33.getColumnKeys();
        java.util.List list38 = defaultKeyedValues2D33.getRowKeys();
        java.lang.Class<?> wildcardClass39 = list38.getClass();
        boolean boolean40 = defaultKeyedValues12.equals((java.lang.Object) list38);
        java.lang.Number number42 = defaultKeyedValues12.getValue((int) (byte) 0);
        int int43 = defaultKeyedValues12.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable45 = defaultKeyedValues12.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 3");
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
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + number42 + "' != '" + 0L + "'", number42, 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
            java.lang.Number number16 = defaultKeyedValues2D11.getValue(1, (int) (byte) 100);
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
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (double) 2);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 6, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        java.util.List list21 = defaultKeyedValues6.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues6.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.util.List list21 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues6.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list14 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int19 = defaultKeyedValues6.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list20 = defaultKeyedValues6.getKeys();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list22 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 3);
        int int27 = defaultKeyedValues6.getIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj17 = defaultKeyedValues16.clone();
        defaultKeyedValues16.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues16.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int24 = defaultKeyedValues16.getItemCount();
        defaultKeyedValues16.clear();
        defaultKeyedValues16.clear();
        defaultKeyedValues16.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        int int31 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D24.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list28 = defaultKeyedValues2D24.getRowKeys();
        java.util.List list29 = defaultKeyedValues2D24.getColumnKeys();
        defaultKeyedValues2D24.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        boolean boolean34 = defaultKeyedValues2D17.equals((java.lang.Object) 100.0f);
        boolean boolean35 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 1);
        defaultKeyedValues0.insertValue(3, (java.lang.Comparable) 100L, (java.lang.Number) (byte) 100);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        int int19 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (-1), (java.lang.Comparable) 2);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (java.lang.Number) (short) 0);
        java.lang.Object obj37 = defaultKeyedValues0.clone();
        java.lang.Object obj38 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1));
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        org.jfree.chart.util.SortOrder sortOrder35 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) "", (java.lang.Comparable) 1.0d);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        int int15 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list18 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D1.getValue(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        java.lang.Number number14 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean18 = defaultKeyedValues2D16.equals((java.lang.Object) false);
        defaultKeyedValues2D16.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D16.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D16.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        java.util.List list32 = defaultKeyedValues2D16.getColumnKeys();
        java.util.List list33 = defaultKeyedValues2D16.getRowKeys();
        java.lang.Object obj34 = defaultKeyedValues2D16.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        int int36 = defaultKeyedValues35.getItemCount();
        defaultKeyedValues35.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues35.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D42.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D42.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int49 = defaultKeyedValues2D42.getColumnCount();
        boolean boolean51 = defaultKeyedValues2D42.equals((java.lang.Object) false);
        int int53 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list54 = defaultKeyedValues2D42.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues55 = new org.jfree.data.DefaultKeyedValues();
        int int56 = defaultKeyedValues55.getItemCount();
        defaultKeyedValues55.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int61 = defaultKeyedValues55.getIndex((java.lang.Comparable) 10.0f);
        int int63 = defaultKeyedValues55.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues64 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list65 = defaultKeyedValues64.getKeys();
        boolean boolean66 = defaultKeyedValues55.equals((java.lang.Object) defaultKeyedValues64);
        boolean boolean67 = defaultKeyedValues2D42.equals((java.lang.Object) defaultKeyedValues55);
        int int68 = defaultKeyedValues2D42.getRowCount();
        boolean boolean69 = defaultKeyedValues35.equals((java.lang.Object) defaultKeyedValues2D42);
        boolean boolean70 = defaultKeyedValues2D16.equals((java.lang.Object) boolean69);
        java.lang.Comparable comparable72 = defaultKeyedValues2D16.getRowKey((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable74 = null; // flaky: defaultKeyedValues2D16.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + comparable72 + "' != '" + (byte) 0 + "'", comparable72, (byte) 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        java.lang.Comparable comparable27 = defaultKeyedValues0.getKey(0);
        int int28 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) 100 + "'", comparable27, (byte) 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) true, (java.lang.Number) 10);
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (byte) 0);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 100.0f + "'", comparable18, 100.0f);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) 4);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        int int20 = defaultKeyedValues19.getItemCount();
        defaultKeyedValues19.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int25 = defaultKeyedValues19.getIndex((java.lang.Comparable) 10.0f);
        int int27 = defaultKeyedValues19.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D29.clear();
        boolean boolean37 = defaultKeyedValues19.equals((java.lang.Object) defaultKeyedValues2D29);
        int int39 = defaultKeyedValues19.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable41 = defaultKeyedValues19.getKey(0);
        defaultKeyedValues19.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (-1));
        java.lang.Object obj45 = defaultKeyedValues19.clone();
        boolean boolean46 = defaultKeyedValues0.equals(obj45);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 10 + "'", number12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + (byte) 100 + "'", comparable41, (byte) 100);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D19.clear();
        java.lang.Object obj27 = defaultKeyedValues2D19.clone();
        int int29 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D19.clear();
        java.lang.Object obj31 = defaultKeyedValues2D19.clone();
        boolean boolean32 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number16 = null;
        defaultKeyedValues11.addValue((java.lang.Comparable) 100L, number16);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        boolean boolean28 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D19);
        java.lang.Object obj29 = defaultKeyedValues2D19.clone();
        int int31 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 0L);
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) true, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list14 = defaultKeyedValues2D10.getRowKeys();
        java.util.List list15 = defaultKeyedValues2D10.getColumnKeys();
        int int16 = defaultKeyedValues2D10.getColumnCount();
        int int17 = defaultKeyedValues2D10.getRowCount();
        defaultKeyedValues2D10.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D10.removeRow((int) (short) 0);
        int int24 = defaultKeyedValues2D10.getColumnCount();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D10);
        java.util.List list26 = defaultKeyedValues2D10.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D10.removeColumn(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        int int25 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj27 = defaultKeyedValues26.clone();
        defaultKeyedValues26.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int31 = defaultKeyedValues26.getItemCount();
        java.lang.Number number33 = defaultKeyedValues26.getValue((int) (byte) 0);
        boolean boolean35 = defaultKeyedValues26.equals((java.lang.Object) (-1.0f));
        int int37 = defaultKeyedValues26.getIndex((java.lang.Comparable) (short) 0);
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (double) (short) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + (byte) 10 + "'", number33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0L, (java.lang.Comparable) '4');
        int int15 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (-1L));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (-1L));
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        defaultKeyedValues2D1.clear();
        int int28 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int14 = defaultKeyedValues6.getIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj12 = defaultKeyedValues11.clone();
        defaultKeyedValues11.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number17 = null;
        defaultKeyedValues11.setValue((java.lang.Comparable) (-1.0d), number17);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 10, (double) 0L);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        java.lang.Comparable comparable27 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100 + "'", comparable27, 100);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0f);
        int int8 = defaultKeyedValues2D1.getRowCount();
        int int9 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int23 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list24 = defaultKeyedValues2D21.getColumnKeys();
        java.util.List list25 = defaultKeyedValues2D21.getColumnKeys();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D21);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (double) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 5);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj29 = defaultKeyedValues28.clone();
        defaultKeyedValues28.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number34 = null;
        defaultKeyedValues28.setValue((java.lang.Comparable) (-1.0d), number34);
        defaultKeyedValues28.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues28.removeValue((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D42.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list46 = defaultKeyedValues2D42.getRowKeys();
        java.util.List list47 = defaultKeyedValues2D42.getColumnKeys();
        defaultKeyedValues2D42.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int51 = defaultKeyedValues2D42.getColumnCount();
        boolean boolean52 = defaultKeyedValues28.equals((java.lang.Object) int51);
        int int54 = defaultKeyedValues28.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues28.addValue((java.lang.Comparable) 10.0f, (-1.0d));
        boolean boolean58 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues28);
        int int60 = defaultKeyedValues28.getIndex((java.lang.Comparable) '4');
        defaultKeyedValues28.setValue((java.lang.Comparable) 0, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number65 = defaultKeyedValues28.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        defaultKeyedValues0.clear();
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) '#');
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1.0f, (double) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 5);
        java.lang.Object obj35 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        java.lang.Number number7 = null;
        defaultKeyedValues2D1.setValue(number7, (java.lang.Comparable) 'a', (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        int int9 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) (byte) 100);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        java.util.List list30 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 2, (java.lang.Comparable) 5);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        defaultKeyedValues14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues14.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) 10.0d);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 'a');
        java.lang.Object obj22 = defaultKeyedValues2D1.clone();
        int int24 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        defaultKeyedValues6.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 3);
        defaultKeyedValues6.setValue((java.lang.Comparable) (-1.0d), (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        int int29 = defaultKeyedValues2D17.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D17.removeRow((java.lang.Comparable) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        int int13 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (byte) 0, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 0L);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (-1L));
        int int11 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.removeColumn(0);
        int int21 = defaultKeyedValues2D1.getRowCount();
        java.util.List list22 = defaultKeyedValues2D1.getColumnKeys();
        int int23 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 5, (java.lang.Comparable) 1L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        java.lang.Comparable comparable31 = defaultKeyedValues2D8.getRowKey((int) (byte) 1);
        int int33 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable35 = defaultKeyedValues2D8.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 10 + "'", comparable31, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (double) 0.0f);
        defaultKeyedValues0.clear();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Number number14 = null;
        defaultKeyedValues2D1.addValue(number14, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) '#');
        int int22 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj23 = defaultKeyedValues2D1.clone();
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D1.getValue((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D19.getColumnKeys();
        int int25 = defaultKeyedValues2D19.getColumnCount();
        defaultKeyedValues2D19.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int30 = defaultKeyedValues2D19.getColumnCount();
        java.util.List list31 = defaultKeyedValues2D19.getRowKeys();
        java.lang.Number number32 = null;
        defaultKeyedValues2D19.addValue(number32, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        int int37 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 0L);
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) int37);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1));
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D1.getValue((int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) ' ', (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getRowCount();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        int int22 = defaultKeyedValues2D16.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D16.getRowKeys();
        int int25 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj26 = defaultKeyedValues2D16.clone();
        int int27 = defaultKeyedValues2D16.getColumnCount();
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) int27);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 10);
        int int34 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) (-1));
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) ' ');
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 1L, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
            defaultKeyedValues2D11.addValue((java.lang.Number) 6, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
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
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((int) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 10L, comparable8, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        java.lang.Object obj2 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj17 = defaultKeyedValues16.clone();
        defaultKeyedValues16.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues16.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int24 = defaultKeyedValues16.getItemCount();
        defaultKeyedValues16.clear();
        defaultKeyedValues16.clear();
        defaultKeyedValues16.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 1.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) '#');
        int int17 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        defaultKeyedValues6.removeValue(2);
        defaultKeyedValues6.addValue((java.lang.Comparable) 0.0f, 10.0d);
        defaultKeyedValues6.clear();
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByKeys(sortOrder25);
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultKeyedValues2D15.getRowKeys();
        java.util.List list20 = defaultKeyedValues2D15.getColumnKeys();
        int int21 = defaultKeyedValues2D15.getColumnCount();
        java.util.List list22 = defaultKeyedValues2D15.getRowKeys();
        int int24 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj25 = defaultKeyedValues2D15.clone();
        int int26 = defaultKeyedValues2D15.getColumnCount();
        int int28 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) ' ');
        int int29 = defaultKeyedValues2D15.getRowCount();
        java.util.List list30 = defaultKeyedValues2D15.getRowKeys();
        java.util.List list31 = defaultKeyedValues2D15.getRowKeys();
        defaultKeyedValues2D15.clear();
        boolean boolean33 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D15);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
        java.lang.Object obj16 = defaultKeyedValues6.clone();
        defaultKeyedValues6.clear();
        defaultKeyedValues6.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int23 = defaultKeyedValues2D16.getColumnCount();
        boolean boolean25 = defaultKeyedValues2D16.equals((java.lang.Object) false);
        int int27 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        boolean boolean31 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }
}
