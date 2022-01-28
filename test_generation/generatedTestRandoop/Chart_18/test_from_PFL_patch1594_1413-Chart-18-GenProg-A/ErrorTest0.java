import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
        java.lang.Object obj25 = defaultKeyedValues2D12.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        defaultKeyedValues2D12.addValue((java.lang.Number) 2, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) 10.0d, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj25", obj1.equals(obj25) ? obj1.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list39 = defaultKeyedValues2D35.getRowKeys();
        java.util.List list40 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int44 = defaultKeyedValues2D35.getColumnCount();
        java.lang.Object obj45 = defaultKeyedValues2D35.clone();
        boolean boolean46 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D35);
        int int47 = defaultKeyedValues2D35.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj34", obj1.equals(obj34) ? obj1.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        java.lang.Object obj28 = defaultKeyedValues12.clone();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues12 and obj13", defaultKeyedValues12.equals(obj13) ? defaultKeyedValues12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        defaultKeyedValues25.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj20 = defaultKeyedValues19.clone();
        defaultKeyedValues19.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues19.addValue((java.lang.Comparable) 10L, (double) 100.0f);
        java.lang.Object obj27 = defaultKeyedValues19.clone();
        defaultKeyedValues19.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D31 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D31.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list35 = defaultKeyedValues2D31.getRowKeys();
        java.util.List list36 = defaultKeyedValues2D31.getColumnKeys();
        int int37 = defaultKeyedValues2D31.getColumnCount();
        defaultKeyedValues2D31.setValue((java.lang.Number) 10L, (java.lang.Comparable) "", (java.lang.Comparable) 100);
        int int42 = defaultKeyedValues2D31.getColumnCount();
        boolean boolean43 = defaultKeyedValues19.equals((java.lang.Object) defaultKeyedValues2D31);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues44 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj45 = defaultKeyedValues44.clone();
        defaultKeyedValues44.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) (byte) 10);
        defaultKeyedValues44.setValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        boolean boolean52 = defaultKeyedValues19.equals((java.lang.Object) defaultKeyedValues44);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D54 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D54.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list58 = defaultKeyedValues2D54.getRowKeys();
        java.util.List list59 = defaultKeyedValues2D54.getColumnKeys();
        defaultKeyedValues2D54.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int63 = defaultKeyedValues2D54.getColumnCount();
        java.lang.Object obj64 = defaultKeyedValues2D54.clone();
        boolean boolean65 = defaultKeyedValues19.equals((java.lang.Object) defaultKeyedValues2D54);
        boolean boolean66 = defaultKeyedValues2D1.equals((java.lang.Object) boolean65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues19 and obj20", defaultKeyedValues19.equals(obj20) ? defaultKeyedValues19.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues8 and obj9", defaultKeyedValues8.equals(obj9) ? defaultKeyedValues8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        java.util.List list35 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj34", obj1.equals(obj34) ? obj1.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        int int27 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues12 and obj13", defaultKeyedValues12.equals(obj13) ? defaultKeyedValues12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list39 = defaultKeyedValues2D35.getRowKeys();
        java.util.List list40 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int44 = defaultKeyedValues2D35.getColumnCount();
        java.lang.Object obj45 = defaultKeyedValues2D35.clone();
        boolean boolean46 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D35);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) false, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        java.lang.Object obj35 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj34", obj1.equals(obj34) ? obj1.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        java.lang.Object obj27 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj27", obj1.equals(obj27) ? obj1.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        java.lang.Object obj27 = defaultKeyedValues0.clone();
        int int28 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj27", obj1.equals(obj27) ? obj1.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues12 and obj13", defaultKeyedValues12.equals(obj13) ? defaultKeyedValues12.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        java.lang.Object obj28 = defaultKeyedValues12.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D30.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10);
        java.lang.Comparable comparable42 = defaultKeyedValues2D30.getColumnKey((int) (short) 0);
        int int43 = defaultKeyedValues2D30.getColumnCount();
        int int44 = defaultKeyedValues2D30.getColumnCount();
        java.util.List list45 = defaultKeyedValues2D30.getRowKeys();
        int int46 = defaultKeyedValues2D30.getColumnCount();
        java.util.List list47 = defaultKeyedValues2D30.getColumnKeys();
        boolean boolean48 = defaultKeyedValues12.equals((java.lang.Object) list47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj28", obj13.equals(obj28) ? obj13.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
        java.util.List list39 = defaultKeyedValues2D35.getRowKeys();
        java.util.List list40 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int44 = defaultKeyedValues2D35.getColumnCount();
        java.lang.Object obj45 = defaultKeyedValues2D35.clone();
        boolean boolean46 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D35);
        int int48 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultKeyedValues0 and obj1", defaultKeyedValues0.equals(obj1) ? defaultKeyedValues0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        java.lang.Object obj28 = defaultKeyedValues27.clone();
        defaultKeyedValues27.addValue((java.lang.Comparable) (byte) 100, (double) 100.0f);
        defaultKeyedValues27.setValue((java.lang.Comparable) 100, (java.lang.Number) (short) 10);
        defaultKeyedValues27.removeValue((java.lang.Comparable) (byte) 100);
        int int37 = defaultKeyedValues27.getItemCount();
        boolean boolean38 = defaultKeyedValues6.equals((java.lang.Object) int37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and defaultKeyedValues27", obj7.equals(defaultKeyedValues27) ? obj7.hashCode() == defaultKeyedValues27.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        defaultKeyedValues12.addValue((java.lang.Comparable) 2, (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and obj30", obj13.equals(obj30) ? obj13.hashCode() == obj30.hashCode() : true);
    }
}

