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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable2 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        int int30 = defaultKeyedValues25.getItemCount();
        java.lang.Number number32 = defaultKeyedValues25.getValue((int) (byte) 0);
        boolean boolean34 = defaultKeyedValues25.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean37 = defaultKeyedValues25.equals((java.lang.Object) defaultKeyedValues2D36);
        defaultKeyedValues2D36.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        java.lang.Object obj42 = defaultKeyedValues2D36.clone();
        java.util.List list43 = defaultKeyedValues2D36.getRowKeys();
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) list43);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (byte) 10 + "'", number32, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1L, (java.lang.Comparable) (-1), (java.lang.Comparable) 3);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        defaultKeyedValues13.addValue((java.lang.Comparable) (short) 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number69 = defaultKeyedValues13.getValue((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = null; // flaky: defaultKeyedValues0.getKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 0);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) '#', (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 1.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.util.List list5 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        int int10 = defaultKeyedValues9.getItemCount();
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int22 = defaultKeyedValues2D15.getColumnCount();
        boolean boolean24 = defaultKeyedValues2D15.equals((java.lang.Object) false);
        int int26 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list27 = defaultKeyedValues2D15.getColumnKeys();
        boolean boolean28 = defaultKeyedValues9.equals((java.lang.Object) list27);
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) list27);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) '4', (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) 4, (java.lang.Number) 0.0d);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) 100L);
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
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D1.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int12 = defaultKeyedValues2D11.getColumnCount();
        java.lang.Object obj13 = defaultKeyedValues2D11.clone();
        boolean boolean14 = defaultKeyedValues0.equals(obj13);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 10);
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
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = null; // flaky: defaultKeyedValues0.getKey((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
// flaky:             defaultKeyedValues2D1.removeRow((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
            java.lang.Comparable comparable30 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues13.addValue((java.lang.Comparable) '#', (double) (-1));
        boolean boolean20 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues13);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D1.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
            java.lang.Number number38 = defaultKeyedValues12.getValue((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (-1), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        int int13 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable14, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) 0.0f);
        int int31 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 100L);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        int int9 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) -1);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D17.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0d);
        int int20 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) 10.0f, (double) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        java.lang.Number number18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) 10.0d, number18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable20 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 0.0f);
        int int25 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 100);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues21.sortByKeys(sortOrder33);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getColumnKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 100, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass8 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 10L);
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list20 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int25 = defaultKeyedValues2D19.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.clear();
        boolean boolean28 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues26);
        defaultKeyedValues2D19.removeRow((java.lang.Comparable) 10L);
        java.util.List list31 = defaultKeyedValues2D19.getColumnKeys();
        boolean boolean32 = defaultKeyedValues2D11.equals((java.lang.Object) list31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable34 = null; // flaky: defaultKeyedValues2D11.getColumnKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 0L, (double) 10L);
        int int18 = defaultKeyedValues0.getItemCount();
        java.lang.Class<?> wildcardClass19 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) true, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues13.removeValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        defaultKeyedValues8.setValue((java.lang.Comparable) (-1.0d), (-1.0d));
        org.jfree.chart.util.SortOrder sortOrder62 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.sortByValues(sortOrder62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int12 = defaultKeyedValues11.getItemCount();
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int17 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        int int19 = defaultKeyedValues11.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D21.clear();
        boolean boolean29 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D21);
        int int31 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D33.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable45 = defaultKeyedValues2D33.getColumnKey((int) (short) 0);
        int int46 = defaultKeyedValues2D33.getColumnCount();
        java.util.List list47 = defaultKeyedValues2D33.getRowKeys();
        boolean boolean48 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D33);
        boolean boolean49 = defaultKeyedValues0.equals((java.lang.Object) boolean48);
        java.lang.Comparable comparable50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = defaultKeyedValues0.getValue(comparable50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 10 + "'", comparable45, 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (double) (-1));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10L + "'", comparable18, 10L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj23 = defaultKeyedValues22.clone();
        defaultKeyedValues22.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int27 = defaultKeyedValues22.getItemCount();
        java.lang.Number number29 = defaultKeyedValues22.getValue((int) (byte) 0);
        boolean boolean31 = defaultKeyedValues22.equals((java.lang.Object) (-1.0f));
        int int33 = defaultKeyedValues22.getIndex((java.lang.Comparable) (short) 0);
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) int33);
        defaultKeyedValues0.removeValue(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (byte) 10 + "'", number29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
            defaultKeyedValues0.addValue(comparable18, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.Class<?> wildcardClass33 = defaultKeyedValues5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
            java.lang.Number number36 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
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
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
            java.lang.Comparable comparable24 = defaultKeyedValues0.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int17 = defaultKeyedValues2D10.getColumnCount();
        boolean boolean19 = defaultKeyedValues2D10.equals((java.lang.Object) false);
        int int21 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list22 = defaultKeyedValues2D10.getColumnKeys();
        java.util.List list23 = defaultKeyedValues2D10.getRowKeys();
        int int24 = defaultKeyedValues2D10.getRowCount();
        int int25 = defaultKeyedValues2D10.getColumnCount();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D10.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultKeyedValues2D1.getRowKey((int) (byte) -1);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) (short) 1);
        java.util.List list27 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
            defaultKeyedValues2D1.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowCount();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, 0.0d);
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 100, (double) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) (byte) 100);
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) ' ', (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        int int28 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) (-1L), number7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.Object obj31 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (-1L) + "'", comparable26, (-1L));
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) (short) -1, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number66 = defaultKeyedValues13.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int19 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list20 = defaultKeyedValues2D17.getColumnKeys();
        int int22 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list23 = defaultKeyedValues2D17.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D17.getColumnKeys();
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 1.0f);
        java.lang.Number number21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) (short) 0, number21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
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
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        defaultKeyedValues2D23.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 1, (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D23.removeRow((java.lang.Comparable) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10 + "'", comparable35, 10);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 3);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 100);
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0f);
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) "", (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.Number number16 = defaultKeyedValues6.getValue((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) 10 + "'", number16, (byte) 10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.removeValue((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.jfree.chart.util.SortOrder sortOrder34 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable12, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 3");
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
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
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        java.util.List list5 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.Object obj29 = defaultKeyedValues28.clone();
        defaultKeyedValues28.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int33 = defaultKeyedValues28.getItemCount();
        java.lang.Number number35 = defaultKeyedValues28.getValue((int) (byte) 0);
        java.lang.Class<?> wildcardClass36 = number35.getClass();
        boolean boolean37 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + (byte) 10 + "'", number35, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
            defaultKeyedValues0.sortByKeys(sortOrder12);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int5 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        int int23 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D1.getValue(comparable24, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) -1);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        int int31 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable33 = defaultKeyedValues2D1.getRowKey(0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 1.0d + "'", comparable33, 1.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = null; // flaky: defaultKeyedValues2D1.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = null; // flaky: defaultKeyedValues2D1.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) ' ', (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list24 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D19.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        boolean boolean32 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0f);
        int int34 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D1.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.clear();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable38 = null; // flaky: defaultKeyedValues2D1.getRowKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
            java.lang.Number number32 = defaultKeyedValues2D17.getValue(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D1.getValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, comparable12, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        java.lang.Number number9 = defaultKeyedValues0.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: #");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (byte) 10 + "'", number9, (byte) 10);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
// flaky:             defaultKeyedValues2D8.removeRow((java.lang.Comparable) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
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
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 3);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultKeyedValues2D1.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable39 = defaultKeyedValues0.getKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D16.removeRow((java.lang.Comparable) ' ');
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
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultKeyedValues0.getValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (double) 100.0f);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 0.0f, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100.0f + "'", comparable10, 100.0f);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 0);
        java.lang.Number number12 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', number12);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100.0f + "'", comparable10, 100.0f);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) ' ');
        java.lang.Number number14 = defaultKeyedValues0.getValue((int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
            java.lang.Number number39 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.addValue(comparable20, 10.0d);
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        defaultKeyedValues2D11.clear();
        java.lang.Object obj20 = defaultKeyedValues2D11.clone();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D11.removeColumn((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
            defaultKeyedValues2D11.removeColumn((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        int int11 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (short) 1);
        java.util.List list20 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
            java.lang.Number number25 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
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
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.Comparable comparable66 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues31.insertValue(4, comparable66, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues2D8.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        defaultKeyedValues6.setValue((java.lang.Comparable) '#', (java.lang.Number) 6);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D8.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable20 = defaultKeyedValues2D8.getColumnKey((int) (short) 0);
        defaultKeyedValues2D8.clear();
        defaultKeyedValues2D8.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list28 = defaultKeyedValues27.getKeys();
        java.lang.Object obj29 = defaultKeyedValues27.clone();
        boolean boolean30 = defaultKeyedValues23.equals(obj29);
        boolean boolean31 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues23);
        java.util.List list32 = defaultKeyedValues2D8.getRowKeys();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) list32);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10 + "'", comparable20, 10);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D18.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int19 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0f);
        int int21 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        int int22 = defaultKeyedValues2D11.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues2D11.getValue(3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue((int) (byte) 0, comparable21, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
        java.lang.Object obj15 = defaultKeyedValues2D1.clone();
        java.util.List list16 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 0L);
        java.util.List list16 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.addValue((java.lang.Number) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D1.removeColumn((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Short");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) (-1.0d), number12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int12 = defaultKeyedValues11.getItemCount();
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int17 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        int int19 = defaultKeyedValues11.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D21.clear();
        boolean boolean29 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D21);
        int int31 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D33.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable45 = defaultKeyedValues2D33.getColumnKey((int) (short) 0);
        int int46 = defaultKeyedValues2D33.getColumnCount();
        java.util.List list47 = defaultKeyedValues2D33.getRowKeys();
        boolean boolean48 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D33);
        boolean boolean49 = defaultKeyedValues0.equals((java.lang.Object) boolean48);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) "", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 10 + "'", comparable45, 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
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
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        defaultKeyedValues14.clear();
        defaultKeyedValues14.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 100L);
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) "", (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) 0.0f, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Number number8 = null;
        defaultKeyedValues2D1.setValue(number8, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 1 + "'", comparable13, (short) 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) '#');
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int2 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        int int13 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = null; // flaky: defaultKeyedValues2D1.getRowKey((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        java.lang.Comparable comparable35 = defaultKeyedValues0.getKey((int) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10L + "'", comparable35, 10L);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 1L, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues0.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues0.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.lang.Class<?> wildcardClass30 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        int int24 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D26.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D26.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D26.clear();
        java.util.List list42 = defaultKeyedValues2D26.getColumnKeys();
        defaultKeyedValues2D26.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 0, (java.lang.Comparable) 'a');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D48 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D48.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D48.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable60 = defaultKeyedValues2D48.getColumnKey((int) (short) 0);
        defaultKeyedValues2D48.clear();
        java.util.List list62 = defaultKeyedValues2D48.getRowKeys();
        int int63 = defaultKeyedValues2D48.getRowCount();
        boolean boolean64 = defaultKeyedValues2D26.equals((java.lang.Object) defaultKeyedValues2D48);
        boolean boolean65 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D48);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) false);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + 10 + "'", comparable60, 10);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue(4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeColumn((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues0.removeValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.Class<?> wildcardClass19 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) 100.0d);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getRowCount();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        int int11 = defaultKeyedValues0.getItemCount();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        int int4 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
            java.lang.Number number13 = defaultKeyedValues9.getValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues6.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int17 = defaultKeyedValues2D10.getColumnCount();
        boolean boolean19 = defaultKeyedValues2D10.equals((java.lang.Object) false);
        int int21 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list22 = defaultKeyedValues2D10.getColumnKeys();
        java.util.List list23 = defaultKeyedValues2D10.getRowKeys();
        int int24 = defaultKeyedValues2D10.getRowCount();
        int int25 = defaultKeyedValues2D10.getColumnCount();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D10);
        java.lang.Object obj27 = defaultKeyedValues2D10.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        int int17 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list18 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        int int13 = defaultKeyedValues0.getItemCount();
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        java.lang.Comparable comparable27 = defaultKeyedValues0.getKey((int) (byte) 1);
        int int28 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 10 + "'", comparable27, 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
            defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100.0");
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) "", (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
            java.lang.Number number32 = defaultKeyedValues2D8.getValue((int) (byte) 10, 0);
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
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (-1L));
        java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 10 + "'", number12, (byte) 10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100.0f + "'", comparable10, 100.0f);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        int int17 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        int int13 = defaultKeyedValues0.getItemCount();
        java.util.List list14 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 5, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.removeValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
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
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.util.List list24 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D11.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.insertValue((int) (byte) 0, comparable29, (java.lang.Number) 100.0f);
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        int int11 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (byte) 100, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        defaultKeyedValues14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues14.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
            defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (byte) 0, (double) 'a');
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        int int26 = defaultKeyedValues6.getItemCount();
        defaultKeyedValues6.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int19 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        int int27 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (-1L) + "'", comparable26, (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.util.List list10 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.lang.Number number12 = null;
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1.0f), number12);
        defaultKeyedValues8.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.insertValue(5, (java.lang.Comparable) 1L, (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = defaultKeyedValues12.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 5");
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
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues2D17.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.clear();
        int int8 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (double) (short) 10);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10L);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultKeyedValues0.equals(obj10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        int int20 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        int int16 = defaultKeyedValues2D15.getColumnCount();
        java.util.List list17 = defaultKeyedValues2D15.getRowKeys();
        defaultKeyedValues2D15.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        boolean boolean22 = defaultKeyedValues2D1.equals((java.lang.Object) (byte) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 6, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (short) 10);
        java.util.List list26 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.clear();
        int int8 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D0.getValue((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 0L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj28 = defaultKeyedValues27.clone();
        java.util.List list29 = defaultKeyedValues27.getKeys();
        defaultKeyedValues27.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues27.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        defaultKeyedValues27.insertValue(0, (java.lang.Comparable) (-1L), (java.lang.Number) 0);
        boolean boolean40 = defaultKeyedValues2D1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (byte) 1);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', comparable16, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100 + "'", comparable14, 100);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D11.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 10.0f);
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 0L);
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, number13);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (java.lang.Number) 1);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
            java.lang.Comparable comparable13 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.jfree.chart.util.SortOrder sortOrder59 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues28.sortByValues(sortOrder59);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues0.getItemCount();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) (short) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) (short) 0, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        int int22 = defaultKeyedValues2D16.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D16.getRowKeys();
        int int25 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj26 = defaultKeyedValues2D16.clone();
        boolean boolean27 = defaultKeyedValues2D1.equals(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D1.getValue((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number68 = defaultKeyedValues31.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        int int2 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.jfree.chart.util.SortOrder sortOrder59 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.sortByKeys(sortOrder59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) (byte) 0, (java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
            int int17 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        java.lang.Object obj2 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        int int16 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 100, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 2, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.Comparable comparable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = defaultKeyedValues0.getIndex(comparable37);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, number5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable11, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D1.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list19 = defaultKeyedValues2D18.getColumnKeys();
        defaultKeyedValues2D18.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int24 = defaultKeyedValues2D18.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.clear();
        boolean boolean27 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues25);
        int int29 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj30 = defaultKeyedValues2D18.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D32.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list36 = defaultKeyedValues2D32.getRowKeys();
        int int37 = defaultKeyedValues2D32.getColumnCount();
        int int39 = defaultKeyedValues2D32.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean40 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues2D32);
        defaultKeyedValues2D32.setValue((java.lang.Number) (-1L), (java.lang.Comparable) true, (java.lang.Comparable) '4');
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D32);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list10 = defaultKeyedValues9.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues9);
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues9.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        java.lang.Object obj26 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
            java.lang.Comparable comparable13 = defaultKeyedValues9.getKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        int int24 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 100.0d);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues2D1.equals(obj11);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) 0.0f);
        java.lang.Number number13 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, number13);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 1);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        int int28 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D1.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        int int22 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) (short) 0);
        int int24 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D8.getValue((java.lang.Comparable) "", (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (double) (short) 10);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(comparable24);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: null");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues6.removeValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1L), 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.insertValue((int) 'a', (java.lang.Comparable) 1.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        int int14 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj16 = defaultKeyedValues15.clone();
        defaultKeyedValues15.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number21 = null;
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0d), number21);
        java.lang.Object obj23 = defaultKeyedValues15.clone();
        boolean boolean24 = defaultKeyedValues2D1.equals(obj23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue(4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 5, (double) 10);
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
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D1.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
            java.lang.Number number17 = null; // flaky: defaultKeyedValues6.getValue((int) (short) -1);
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = null; // flaky: defaultKeyedValues2D1.getValue((int) (short) -1, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (-1L) + "'", comparable26, (-1L));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.removeColumn(0);
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 0L);
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, number13);
        int int15 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        int int33 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 100, comparable29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.util.List list27 = defaultKeyedValues2D16.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D16.getValue(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 1);
        int int18 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) false, (java.lang.Comparable) (-1.0f));
        int int22 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.insertValue((int) (byte) -1, (java.lang.Comparable) 100.0f, (double) '#');
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
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.Class<?> wildcardClass33 = defaultKeyedValues2D8.getClass();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = null; // flaky: defaultKeyedValues2D1.getValue((int) (byte) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.lang.Object obj2 = defaultKeyedValues2D1.clone();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        int int5 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 10);
        java.lang.Class<?> wildcardClass10 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        defaultKeyedValues9.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int14 = defaultKeyedValues9.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj16 = defaultKeyedValues15.clone();
        java.util.List list17 = defaultKeyedValues15.getKeys();
        defaultKeyedValues15.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int23 = defaultKeyedValues2D22.getColumnCount();
        java.lang.Object obj24 = defaultKeyedValues2D22.clone();
        boolean boolean25 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D22.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        boolean boolean30 = defaultKeyedValues9.equals((java.lang.Object) 100.0f);
        defaultKeyedValues9.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10L);
        boolean boolean34 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj21 = defaultKeyedValues20.clone();
        defaultKeyedValues20.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int25 = defaultKeyedValues20.getItemCount();
        defaultKeyedValues20.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int30 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj31 = defaultKeyedValues20.clone();
        boolean boolean32 = defaultKeyedValues2D1.equals(obj31);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D1.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        defaultKeyedValues0.removeValue(0);
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) ' ', (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int12 = defaultKeyedValues11.getItemCount();
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int17 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        int int19 = defaultKeyedValues11.getIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D21.clear();
        boolean boolean29 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D21);
        int int31 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D33.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable45 = defaultKeyedValues2D33.getColumnKey((int) (short) 0);
        int int46 = defaultKeyedValues2D33.getColumnCount();
        java.util.List list47 = defaultKeyedValues2D33.getRowKeys();
        boolean boolean48 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D33);
        boolean boolean49 = defaultKeyedValues0.equals((java.lang.Object) boolean48);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) 3, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 10 + "'", comparable45, 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.util.List list18 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 0L, (java.lang.Comparable) '4');
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) 0L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        defaultKeyedValues2D1.clear();
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
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) 10L, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.lang.Object obj30 = defaultKeyedValues12.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues12.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 2");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        int int13 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 2, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 0.0d);
        int int19 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable11 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) "", (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0d);
        int int16 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 0L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        boolean boolean18 = defaultKeyedValues2D1.equals((java.lang.Object) (-1L));
        defaultKeyedValues2D1.clear();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 0, comparable21, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int11 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
            defaultKeyedValues2D1.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 3");
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue(2, 10);
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.util.List list19 = defaultKeyedValues6.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue(4, (java.lang.Comparable) 0.0d, (-1.0d));
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
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.removeRow((int) (short) 0);
        defaultKeyedValues2D1.addValue((java.lang.Number) 10, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) "hi!");
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0);
        int int16 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) "", (java.lang.Comparable) true);
        java.util.List list20 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, number16);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100.0f);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable21, (java.lang.Number) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj7 = defaultKeyedValues6.clone();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int11 = defaultKeyedValues6.getItemCount();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        java.util.List list13 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list1 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 1);
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.Class<?> wildcardClass21 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int30 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByValues(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.lang.Comparable comparable24 = defaultKeyedValues0.getKey(1);
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.jfree.chart.util.SortOrder sortOrder37 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByValues(sortOrder37);
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
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (byte) 0 + "'", comparable36, (byte) 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
            java.lang.Comparable comparable33 = defaultKeyedValues2D1.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
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
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues6.getValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        java.lang.Number number6 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number6);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 10);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (double) (short) 10);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) 1.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.util.List list26 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        int int37 = defaultKeyedValues12.getItemCount();
        java.lang.Comparable comparable39 = defaultKeyedValues12.getKey((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (byte) 0 + "'", comparable39, (byte) 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = defaultKeyedValues2D0.getColumnIndex(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
// flaky:             defaultKeyedValues2D8.removeColumn((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        int int8 = defaultKeyedValues0.getItemCount();
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 1, (java.lang.Comparable) 10, (java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 0L);
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) "hi!", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        int int22 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) (short) 0);
        int int24 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues2D8.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D1.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj11 = defaultKeyedValues10.clone();
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues10.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj18 = defaultKeyedValues10.clone();
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) false, (java.lang.Number) 0L);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues2D1.getValue((java.lang.Comparable) false, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
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
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list16 = defaultKeyedValues2D15.getColumnKeys();
        defaultKeyedValues2D15.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int21 = defaultKeyedValues2D15.getRowCount();
        defaultKeyedValues2D15.clear();
        int int23 = defaultKeyedValues2D15.getRowCount();
        int int24 = defaultKeyedValues2D15.getRowCount();
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D15);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj27 = defaultKeyedValues26.clone();
        defaultKeyedValues26.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues26.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list34 = defaultKeyedValues26.getKeys();
        defaultKeyedValues26.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues26.setValue((java.lang.Comparable) 4, (java.lang.Number) 1L);
        boolean boolean41 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues26);
        int int42 = defaultKeyedValues26.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 100L + "'", comparable19, 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list5 = defaultKeyedValues4.getKeys();
        java.lang.Object obj6 = defaultKeyedValues4.clone();
        boolean boolean7 = defaultKeyedValues0.equals(obj6);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list6 = defaultKeyedValues5.getKeys();
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) list6);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) 0L);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByKeys(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 10.0f);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (-1.0f));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        int int22 = defaultKeyedValues21.getItemCount();
        defaultKeyedValues21.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int27 = defaultKeyedValues21.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues21.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues21.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1.0f);
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues21);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
            java.lang.Number number23 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 3);
        java.util.List list17 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        int int20 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10.0d);
        int int21 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj15 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 1);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1L, (java.lang.Comparable) (-1), (java.lang.Comparable) 3);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues2D1.getValue((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        java.util.List list2 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.clear();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean3 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D1.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.util.List list27 = defaultKeyedValues2D1.getColumnKeys();
        int int28 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D1.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D1.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) "", (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 1.0f);
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.util.List list24 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable26, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (double) (short) 10);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: defaultKeyedValues0.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        int int15 = defaultKeyedValues2D1.getRowCount();
        java.util.List list16 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100.0d);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        defaultKeyedValues2D8.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) false, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D8.removeRow((java.lang.Comparable) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1), (java.lang.Comparable) (byte) 0, (java.lang.Comparable) false);
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = null; // flaky: defaultKeyedValues2D11.getValue((int) (byte) -1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (double) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = null; // flaky: defaultKeyedValues0.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (short) 10);
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.util.List list21 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj23 = defaultKeyedValues22.clone();
        defaultKeyedValues22.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues22.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj30 = defaultKeyedValues22.clone();
        defaultKeyedValues22.removeValue((int) (byte) 0);
        defaultKeyedValues22.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 10);
        defaultKeyedValues22.setValue((java.lang.Comparable) 100.0f, (double) '#');
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.util.List list16 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1.0d);
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
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) 100.0f);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.util.List list30 = defaultKeyedValues12.getKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
            defaultKeyedValues2D11.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        int int12 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (java.lang.Number) (short) 1);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = null; // flaky: defaultKeyedValues0.getKey((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.util.List list18 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        int int30 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        java.util.List list23 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 6, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        int int30 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = defaultKeyedValues2D1.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 2, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.sortByKeys(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int5 = defaultKeyedValues0.getItemCount();
        java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 10.0d);
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
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.util.List list27 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 5, (java.lang.Comparable) 5, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) (byte) 1);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) false);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list14 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        int int23 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        int int3 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues4.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues4.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues4.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        int int17 = defaultKeyedValues4.getItemCount();
        boolean boolean18 = defaultKeyedValues0.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.util.List list22 = defaultKeyedValues2D16.getRowKeys();
        boolean boolean24 = defaultKeyedValues2D16.equals((java.lang.Object) 100L);
        int int25 = defaultKeyedValues2D16.getColumnCount();
        java.lang.Object obj26 = defaultKeyedValues2D16.clone();
        boolean boolean27 = defaultKeyedValues2D1.equals(obj26);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10L);
        int int12 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number68 = defaultKeyedValues31.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 100 + "'", comparable14, (byte) 100);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        int int29 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D1.getValue(0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        defaultKeyedValues11.insertValue(0, (java.lang.Comparable) 3, (double) 0.0f);
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1.0f);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        int int44 = defaultKeyedValues21.getItemCount();
        defaultKeyedValues21.setValue((java.lang.Comparable) 1L, (-1.0d));
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D16.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.util.List list22 = defaultKeyedValues2D16.getRowKeys();
        boolean boolean24 = defaultKeyedValues2D16.equals((java.lang.Object) 100L);
        int int25 = defaultKeyedValues2D16.getColumnCount();
        java.lang.Object obj26 = defaultKeyedValues2D16.clone();
        boolean boolean27 = defaultKeyedValues2D1.equals(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D1.getColumnKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
            java.lang.Number number14 = defaultKeyedValues2D8.getValue(2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues0.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
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
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        int int45 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = defaultKeyedValues2D1.getValue((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeColumn((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue(0);
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) -1);
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
            defaultKeyedValues6.removeValue((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
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
}
