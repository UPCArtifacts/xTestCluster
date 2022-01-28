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
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) 5, (java.lang.Comparable) 10.0d);
        java.lang.Object obj29 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        java.lang.Object obj29 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.addValue((java.lang.Number) 100, (java.lang.Comparable) 10L, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 10 + "'", number7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', 1.0d);
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 4);
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj12 = defaultKeyedValues11.clone();
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues11.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj19 = defaultKeyedValues11.clone();
        defaultKeyedValues11.removeValue((int) (byte) 0);
        defaultKeyedValues11.setValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, (java.lang.Number) 1L);
        int int28 = defaultKeyedValues11.getItemCount();
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list15 = defaultKeyedValues2D1.getColumnKeys();
        int int17 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (-1), (java.lang.Comparable) 2);
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D1.removeColumn(0);
        java.util.List list21 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Comparable comparable23 = defaultKeyedValues2D1.getRowKey(0);
        java.util.List list24 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 1.0d + "'", comparable23, 1.0d);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        int int17 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 6, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Long");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.clear();
        int int17 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list18 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) -1, comparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0d, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        java.lang.Number number17 = null;
        defaultKeyedValues2D1.addValue(number17, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
        defaultKeyedValues2D1.clear();
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        int int16 = defaultKeyedValues2D1.getRowCount();
        int int17 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 5, (java.lang.Comparable) 6, (java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        int int30 = defaultKeyedValues2D23.getColumnCount();
        boolean boolean32 = defaultKeyedValues2D23.equals((java.lang.Object) false);
        int int34 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list35 = defaultKeyedValues2D23.getColumnKeys();
        java.util.List list36 = defaultKeyedValues2D23.getRowKeys();
        int int37 = defaultKeyedValues2D23.getRowCount();
        java.util.List list38 = defaultKeyedValues2D23.getColumnKeys();
        boolean boolean39 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable41 = defaultKeyedValues2D1.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.util.List list28 = defaultKeyedValues14.getKeys();
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
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 5, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        java.lang.Number number6 = defaultKeyedValues0.getValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        java.lang.Object obj10 = defaultKeyedValues2D8.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.clear();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D8.setValue((java.lang.Number) (-1), (java.lang.Comparable) 10L, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             defaultKeyedValues2D8.removeRow((java.lang.Comparable) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0d + "'", number6, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj1 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        boolean boolean9 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 100);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj18 = null;
        boolean boolean19 = defaultKeyedValues0.equals(obj18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100 + "'", comparable14, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        int int25 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        int int8 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj10 = defaultKeyedValues9.clone();
        defaultKeyedValues9.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        int int14 = defaultKeyedValues9.getItemCount();
        java.lang.Number number16 = defaultKeyedValues9.getValue((int) (byte) 0);
        int int18 = defaultKeyedValues9.getIndex((java.lang.Comparable) (short) 100);
        int int20 = defaultKeyedValues9.getIndex((java.lang.Comparable) "");
        java.util.List list21 = defaultKeyedValues9.getKeys();
        java.util.List list22 = defaultKeyedValues9.getKeys();
        boolean boolean23 = defaultKeyedValues2D1.equals((java.lang.Object) list22);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.lang.Object obj26 = defaultKeyedValues2D25.clone();
        java.lang.Object obj27 = defaultKeyedValues2D25.clone();
        boolean boolean28 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) 10 + "'", number16, (byte) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        java.lang.Object obj29 = defaultKeyedValues2D1.clone();
        int int30 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj31 = defaultKeyedValues2D1.clone();
        java.util.List list32 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10 + "'", comparable13, 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj17 = defaultKeyedValues16.clone();
        defaultKeyedValues16.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues16.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj24 = defaultKeyedValues16.clone();
        defaultKeyedValues16.setValue((java.lang.Comparable) 10.0f, (double) 10);
        boolean boolean28 = defaultKeyedValues2D1.equals((java.lang.Object) 10.0f);
        java.util.List list29 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        java.util.List list18 = defaultKeyedValues2D8.getColumnKeys();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.lang.Class<?> wildcardClass65 = list64.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }
}
