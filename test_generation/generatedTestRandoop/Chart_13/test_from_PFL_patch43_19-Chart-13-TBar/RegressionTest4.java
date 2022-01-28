import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) 0L);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) 0L);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean28 = borderArrangement26.equals((java.lang.Object) (short) 1);
        borderArrangement26.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement26.equals(obj30);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) true);
        boolean boolean42 = borderArrangement32.equals((java.lang.Object) 10);
        boolean boolean44 = borderArrangement32.equals((java.lang.Object) (-1));
        borderArrangement32.clear();
        borderArrangement32.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass48 = borderArrangement47.getClass();
        boolean boolean49 = borderArrangement32.equals((java.lang.Object) wildcardClass48);
        boolean boolean50 = borderArrangement26.equals((java.lang.Object) borderArrangement32);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) boolean50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) (byte) 100);
        borderArrangement24.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement24.equals(obj34);
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement24.equals(obj36);
        org.jfree.chart.block.BorderArrangement borderArrangement38 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement38.clear();
        boolean boolean41 = borderArrangement38.equals((java.lang.Object) '#');
        boolean boolean43 = borderArrangement38.equals((java.lang.Object) 1L);
        borderArrangement38.clear();
        boolean boolean45 = borderArrangement24.equals((java.lang.Object) borderArrangement38);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement0.equals(obj30);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean35 = borderArrangement33.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean38 = borderArrangement36.equals((java.lang.Object) 10);
        borderArrangement36.clear();
        borderArrangement36.clear();
        org.jfree.chart.block.Block block41 = null;
        java.lang.Object obj42 = null;
        borderArrangement36.add(block41, obj42);
        borderArrangement36.clear();
        boolean boolean45 = borderArrangement33.equals((java.lang.Object) borderArrangement36);
        borderArrangement36.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block32, (java.lang.Object) wildcardClass47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement0.equals(obj24);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass28 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean24 = borderArrangement22.equals((java.lang.Object) 10);
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement22.add(block27, obj28);
        borderArrangement16.add(block21, obj28);
        borderArrangement16.clear();
        boolean boolean33 = borderArrangement16.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass34 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement8.equals(obj15);
        java.lang.Class<?> wildcardClass17 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement0.equals(obj23);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement0.arrange(blockContainer26, graphics2D27, rectangleConstraint28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) 0.0f);
        borderArrangement19.clear();
        boolean boolean23 = borderArrangement12.equals((java.lang.Object) borderArrangement19);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) 100.0f);
        java.lang.Object obj43 = null;
        boolean boolean44 = borderArrangement29.equals(obj43);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement9.add(block28, (java.lang.Object) boolean44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass30 = borderArrangement26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement0.arrange(blockContainer26, graphics2D27, rectangleConstraint28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D34 = borderArrangement0.arrange(blockContainer31, graphics2D32, rectangleConstraint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (byte) -1);
        boolean boolean24 = borderArrangement17.equals((java.lang.Object) (-1));
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) 0L);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean40 = borderArrangement17.equals((java.lang.Object) borderArrangement28);
        boolean boolean42 = borderArrangement17.equals((java.lang.Object) 10L);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D31 = borderArrangement0.arrange(blockContainer28, graphics2D29, rectangleConstraint30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (byte) -1);
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) (-1));
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean28 = borderArrangement23.equals((java.lang.Object) 1L);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D38 = borderArrangement0.arrange(blockContainer35, graphics2D36, rectangleConstraint37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) 0L);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) 100.0f);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 10);
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement31.equals(obj42);
        org.jfree.chart.block.Block block44 = null;
        java.lang.Object obj45 = null;
        borderArrangement31.add(block44, obj45);
        borderArrangement31.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.Block block38 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        borderArrangement39.clear();
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement39.equals(obj49);
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) "");
        boolean boolean59 = borderArrangement51.equals((java.lang.Object) true);
        borderArrangement51.clear();
        borderArrangement51.clear();
        borderArrangement51.clear();
        boolean boolean63 = borderArrangement39.equals((java.lang.Object) borderArrangement51);
        java.lang.Object obj64 = null;
        boolean boolean65 = borderArrangement51.equals(obj64);
        org.jfree.chart.block.BorderArrangement borderArrangement66 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement66.clear();
        boolean boolean69 = borderArrangement66.equals((java.lang.Object) '#');
        borderArrangement66.clear();
        boolean boolean72 = borderArrangement66.equals((java.lang.Object) "");
        boolean boolean74 = borderArrangement66.equals((java.lang.Object) true);
        boolean boolean75 = borderArrangement51.equals((java.lang.Object) borderArrangement66);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement23.add(block38, (java.lang.Object) borderArrangement51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) wildcardClass21);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D31 = borderArrangement9.arrange(blockContainer28, graphics2D29, rectangleConstraint30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean10 = borderArrangement8.equals((java.lang.Object) (short) 1);
        borderArrangement8.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement8.equals(obj12);
        borderArrangement8.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        borderArrangement18.clear();
        boolean boolean26 = borderArrangement11.equals((java.lang.Object) borderArrangement18);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.Block block31 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (byte) 100);
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement11.add(block31, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        borderArrangement3.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement3.add(block11, obj12);
        java.lang.Class<?> wildcardClass14 = borderArrangement3.getClass();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement17.equals(obj30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = borderArrangement17.equals(obj32);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass36 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement12.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement8.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block4 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) true);
        boolean boolean15 = borderArrangement5.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement5.equals((java.lang.Object) boolean22);
        borderArrangement5.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block4, (java.lang.Object) borderArrangement5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block26 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) (byte) -1);
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) true);
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        borderArrangement44.clear();
        java.lang.Class<?> wildcardClass50 = borderArrangement44.getClass();
        boolean boolean51 = borderArrangement34.equals((java.lang.Object) wildcardClass50);
        boolean boolean52 = borderArrangement27.equals((java.lang.Object) borderArrangement34);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement9.add(block26, (java.lang.Object) borderArrangement27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement5.add(block16, obj17);
        borderArrangement5.clear();
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        boolean boolean36 = borderArrangement23.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block37 = null;
        java.lang.Object obj38 = null;
        borderArrangement23.add(block37, obj38);
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass41 = borderArrangement23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement5.add(block22, (java.lang.Object) borderArrangement23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        borderArrangement12.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement12.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.Block block40 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean43 = borderArrangement41.equals((java.lang.Object) 10);
        borderArrangement41.clear();
        borderArrangement41.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement46 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement46.clear();
        boolean boolean49 = borderArrangement46.equals((java.lang.Object) '#');
        borderArrangement46.clear();
        boolean boolean52 = borderArrangement46.equals((java.lang.Object) "");
        boolean boolean54 = borderArrangement46.equals((java.lang.Object) 0L);
        boolean boolean55 = borderArrangement41.equals((java.lang.Object) borderArrangement46);
        borderArrangement41.clear();
        java.lang.Class<?> wildcardClass57 = borderArrangement41.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block40, (java.lang.Object) wildcardClass57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (byte) -1);
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) (-1));
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement14.getClass();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        java.lang.Class<?> wildcardClass25 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 10);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement12.equals(obj23);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) 10);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.chart.block.Block block35 = null;
        java.lang.Object obj36 = null;
        borderArrangement30.add(block35, obj36);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement30);
        org.jfree.chart.block.BlockContainer blockContainer42 = null;
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D45 = borderArrangement0.arrange(blockContainer42, graphics2D43, rectangleConstraint44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        boolean boolean25 = borderArrangement14.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) 0L);
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean37 = borderArrangement14.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.Block block38 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) (byte) 100);
        borderArrangement39.clear();
        java.lang.Object obj49 = null;
        boolean boolean50 = borderArrangement39.equals(obj49);
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        borderArrangement39.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement55 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement55.clear();
        boolean boolean58 = borderArrangement55.equals((java.lang.Object) '#');
        borderArrangement55.clear();
        boolean boolean61 = borderArrangement55.equals((java.lang.Object) "");
        boolean boolean63 = borderArrangement55.equals((java.lang.Object) (byte) 100);
        borderArrangement55.clear();
        java.lang.Object obj65 = null;
        boolean boolean66 = borderArrangement55.equals(obj65);
        borderArrangement55.clear();
        borderArrangement55.clear();
        borderArrangement55.clear();
        borderArrangement55.clear();
        borderArrangement55.clear();
        borderArrangement55.clear();
        boolean boolean73 = borderArrangement39.equals((java.lang.Object) borderArrangement55);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement26.add(block38, (java.lang.Object) boolean73);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) 10);
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) (byte) -1);
        boolean boolean34 = borderArrangement27.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass35 = borderArrangement27.getClass();
        boolean boolean36 = borderArrangement19.equals((java.lang.Object) borderArrangement27);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        boolean boolean42 = borderArrangement37.equals((java.lang.Object) (byte) -1);
        boolean boolean44 = borderArrangement37.equals((java.lang.Object) (-1));
        borderArrangement37.clear();
        boolean boolean46 = borderArrangement19.equals((java.lang.Object) borderArrangement37);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement7.equals((java.lang.Object) true);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement17.getClass();
        boolean boolean24 = borderArrangement7.equals((java.lang.Object) wildcardClass23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement0.arrange(blockContainer26, graphics2D27, rectangleConstraint28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass24 = borderArrangement14.getClass();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        java.lang.Class<?> wildcardClass26 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean7 = borderArrangement5.equals((java.lang.Object) 10);
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 0.0f);
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) "hi!");
        boolean boolean15 = borderArrangement5.equals((java.lang.Object) boolean14);
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement5.equals(obj16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean34 = borderArrangement32.equals((java.lang.Object) 10);
        borderArrangement32.clear();
        borderArrangement32.clear();
        org.jfree.chart.block.Block block37 = null;
        java.lang.Object obj38 = null;
        borderArrangement32.add(block37, obj38);
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        java.lang.Object obj45 = null;
        boolean boolean46 = borderArrangement32.equals(obj45);
        borderArrangement32.clear();
        boolean boolean48 = borderArrangement20.equals((java.lang.Object) borderArrangement32);
        borderArrangement20.clear();
        borderArrangement20.clear();
        java.lang.Class<?> wildcardClass51 = borderArrangement20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement5.add(block19, (java.lang.Object) wildcardClass51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement15.equals(obj25);
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement15.equals(obj27);
        boolean boolean29 = borderArrangement0.equals(obj27);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D33 = borderArrangement0.arrange(blockContainer30, graphics2D31, rectangleConstraint32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement12.equals(obj22);
        borderArrangement12.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        boolean boolean21 = borderArrangement8.equals((java.lang.Object) 0L);
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        boolean boolean33 = borderArrangement23.equals((java.lang.Object) 10);
        boolean boolean35 = borderArrangement23.equals((java.lang.Object) (byte) 0);
        borderArrangement23.clear();
        borderArrangement23.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block22, (java.lang.Object) borderArrangement23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) ' ');
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement19.getClass();
        boolean boolean34 = borderArrangement7.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) (byte) -1);
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        borderArrangement41.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement41.getClass();
        boolean boolean48 = borderArrangement31.equals((java.lang.Object) wildcardClass47);
        boolean boolean49 = borderArrangement24.equals((java.lang.Object) borderArrangement31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) true);
        boolean boolean19 = borderArrangement9.equals((java.lang.Object) 10);
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) (-1));
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        boolean boolean21 = borderArrangement16.equals((java.lang.Object) 1L);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) true);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean40 = borderArrangement16.equals((java.lang.Object) borderArrangement26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) true);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block27 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        org.jfree.chart.block.Block block35 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) "");
        boolean boolean44 = borderArrangement36.equals((java.lang.Object) (byte) 100);
        borderArrangement36.clear();
        java.lang.Object obj46 = null;
        boolean boolean47 = borderArrangement36.equals(obj46);
        org.jfree.chart.block.Block block48 = null;
        java.lang.Object obj49 = null;
        borderArrangement36.add(block48, obj49);
        borderArrangement28.add(block35, obj49);
        borderArrangement28.clear();
        java.lang.Class<?> wildcardClass53 = borderArrangement28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement10.add(block27, (java.lang.Object) borderArrangement28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) (byte) -1);
        boolean boolean31 = borderArrangement24.equals((java.lang.Object) (-1));
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) 0L);
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean47 = borderArrangement24.equals((java.lang.Object) borderArrangement35);
        java.lang.Class<?> wildcardClass48 = borderArrangement35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement6.equals(obj17);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement6.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement6.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.Block block24 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) "");
        boolean boolean33 = borderArrangement25.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) 'a');
        borderArrangement34.clear();
        boolean boolean42 = borderArrangement25.equals((java.lang.Object) borderArrangement34);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement16.add(block24, (java.lang.Object) borderArrangement34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean8 = borderArrangement6.equals((java.lang.Object) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        java.lang.Class<?> wildcardClass11 = borderArrangement6.getClass();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass14 = borderArrangement11.getClass();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (short) 1);
        borderArrangement16.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass10 = borderArrangement8.getClass();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) wildcardClass10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (byte) -1);
        boolean boolean27 = borderArrangement20.equals((java.lang.Object) (-1));
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean30 = borderArrangement12.equals((java.lang.Object) borderArrangement20);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement20.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass24 = borderArrangement14.getClass();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement0.arrange(blockContainer26, graphics2D27, rectangleConstraint28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean8 = borderArrangement6.equals((java.lang.Object) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement12.add(block17, obj18);
        borderArrangement6.add(block11, obj18);
        borderArrangement6.clear();
        boolean boolean23 = borderArrangement6.equals((java.lang.Object) 1.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrange(blockContainer23, graphics2D24, rectangleConstraint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.Block block29 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        borderArrangement30.clear();
        org.jfree.chart.block.Block block40 = null;
        java.lang.Object obj41 = null;
        borderArrangement30.add(block40, obj41);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block29, (java.lang.Object) borderArrangement30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass6 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 'a');
        borderArrangement10.clear();
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement10.add(block18, obj19);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.Block block31 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) 'a');
        borderArrangement41.clear();
        org.jfree.chart.block.Block block49 = null;
        java.lang.Object obj50 = null;
        borderArrangement41.add(block49, obj50);
        borderArrangement41.clear();
        boolean boolean53 = borderArrangement32.equals((java.lang.Object) borderArrangement41);
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block31, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) 'a');
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) (byte) 100);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass30 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement10.add(block21, obj22);
        borderArrangement0.add(block9, (java.lang.Object) block21);
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement30.getClass();
        boolean boolean36 = borderArrangement26.equals((java.lang.Object) borderArrangement30);
        borderArrangement26.clear();
        borderArrangement26.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement26.equals(obj39);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) borderArrangement26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement19.getClass();
        boolean boolean26 = borderArrangement9.equals((java.lang.Object) wildcardClass25);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) 'a');
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) (byte) 100);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (-1L));
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        borderArrangement27.clear();
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement27);
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        boolean boolean40 = borderArrangement37.equals((java.lang.Object) '#');
        borderArrangement37.clear();
        boolean boolean43 = borderArrangement37.equals((java.lang.Object) 'a');
        boolean boolean45 = borderArrangement37.equals((java.lang.Object) (byte) 100);
        borderArrangement37.clear();
        borderArrangement37.clear();
        boolean boolean48 = borderArrangement27.equals((java.lang.Object) borderArrangement37);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) boolean48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        boolean boolean15 = borderArrangement7.equals((java.lang.Object) (byte) 100);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean28 = borderArrangement7.equals((java.lang.Object) borderArrangement18);
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        boolean boolean35 = borderArrangement30.equals((java.lang.Object) 1L);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean41 = borderArrangement7.equals((java.lang.Object) borderArrangement30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) borderArrangement7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement17.equals(obj30);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D30 = borderArrangement0.arrange(blockContainer27, graphics2D28, rectangleConstraint29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        borderArrangement11.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (byte) -1);
        boolean boolean26 = borderArrangement19.equals((java.lang.Object) (-1));
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean29 = borderArrangement11.equals((java.lang.Object) borderArrangement19);
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D34 = borderArrangement11.arrange(blockContainer31, graphics2D32, rectangleConstraint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement7.equals(obj23);
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement7.add(block25, obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        boolean boolean27 = borderArrangement15.equals((java.lang.Object) 1.0d);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) 'a');
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement18.equals((java.lang.Object) borderArrangement21);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        boolean boolean24 = borderArrangement19.equals((java.lang.Object) (byte) -1);
        boolean boolean26 = borderArrangement19.equals((java.lang.Object) (-1));
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) "");
        boolean boolean36 = borderArrangement28.equals((java.lang.Object) (byte) 100);
        borderArrangement28.clear();
        java.lang.Object obj38 = null;
        boolean boolean39 = borderArrangement28.equals(obj38);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean43 = borderArrangement19.equals((java.lang.Object) borderArrangement28);
        borderArrangement28.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        boolean boolean21 = borderArrangement8.equals((java.lang.Object) 0L);
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean28 = borderArrangement23.equals((java.lang.Object) (byte) -1);
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass30 = borderArrangement23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block22, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement18.getClass();
        boolean boolean24 = borderArrangement14.equals((java.lang.Object) borderArrangement18);
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement14.equals(obj27);
        borderArrangement14.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        boolean boolean40 = borderArrangement30.equals((java.lang.Object) 10);
        boolean boolean42 = borderArrangement30.equals((java.lang.Object) (-1));
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        boolean boolean46 = borderArrangement14.equals((java.lang.Object) borderArrangement30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) boolean46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        borderArrangement14.clear();
        boolean boolean22 = borderArrangement8.equals((java.lang.Object) borderArrangement14);
        boolean boolean24 = borderArrangement8.equals((java.lang.Object) (-1L));
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) (byte) 100);
        borderArrangement26.clear();
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement26.equals(obj36);
        org.jfree.chart.block.Block block38 = null;
        java.lang.Object obj39 = null;
        borderArrangement26.add(block38, obj39);
        borderArrangement26.clear();
        borderArrangement26.clear();
        boolean boolean43 = borderArrangement8.equals((java.lang.Object) borderArrangement26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) boolean43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 10);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass26 = borderArrangement13.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.jfree.chart.block.BlockContainer blockContainer39 = null;
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D42 = borderArrangement0.arrange(blockContainer39, graphics2D40, rectangleConstraint41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (byte) 100);
        borderArrangement21.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement21.equals(obj31);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean39 = borderArrangement8.equals((java.lang.Object) borderArrangement21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement20.getClass();
        boolean boolean33 = borderArrangement7.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.Block block34 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) true);
        boolean boolean45 = borderArrangement35.equals((java.lang.Object) 10);
        java.lang.Object obj46 = null;
        boolean boolean47 = borderArrangement35.equals(obj46);
        java.lang.Object obj48 = null;
        boolean boolean49 = borderArrangement35.equals(obj48);
        java.lang.Class<?> wildcardClass50 = borderArrangement35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block34, (java.lang.Object) borderArrangement35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement0.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        boolean boolean18 = borderArrangement13.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = borderArrangement13.getClass();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement12.equals(obj22);
        borderArrangement12.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        java.lang.Class<?> wildcardClass27 = borderArrangement12.getClass();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) wildcardClass27);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) (byte) -1);
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) (-1));
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean26 = borderArrangement3.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D30 = borderArrangement14.arrange(blockContainer27, graphics2D28, rectangleConstraint29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement6.equals(obj17);
        borderArrangement6.clear();
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) true);
        boolean boolean31 = borderArrangement21.equals((java.lang.Object) 10);
        boolean boolean33 = borderArrangement21.equals((java.lang.Object) (byte) 0);
        borderArrangement21.clear();
        org.jfree.chart.block.Block block35 = null;
        java.lang.Object obj36 = null;
        borderArrangement21.add(block35, obj36);
        borderArrangement21.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement21.equals(obj39);
        borderArrangement21.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement6.add(block20, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement0.add(block18, obj19);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrange(blockContainer23, graphics2D24, rectangleConstraint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        borderArrangement3.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) true);
        boolean boolean31 = borderArrangement21.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        boolean boolean39 = borderArrangement21.equals((java.lang.Object) boolean38);
        org.jfree.chart.block.Block block40 = null;
        java.lang.Object obj41 = null;
        borderArrangement21.add(block40, obj41);
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass44 = borderArrangement21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) 0L);
        boolean boolean27 = borderArrangement13.equals((java.lang.Object) borderArrangement18);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) 'a');
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        boolean boolean46 = borderArrangement41.equals((java.lang.Object) (byte) -1);
        boolean boolean48 = borderArrangement41.equals((java.lang.Object) (-1));
        borderArrangement41.clear();
        borderArrangement41.clear();
        boolean boolean51 = borderArrangement33.equals((java.lang.Object) borderArrangement41);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement18.add(block32, (java.lang.Object) boolean51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        boolean boolean27 = borderArrangement17.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement5.add(block16, (java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement7.add(block19, obj20);
        borderArrangement7.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrange(blockContainer24, graphics2D25, rectangleConstraint26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 10);
        boolean boolean30 = borderArrangement18.equals((java.lang.Object) (-1));
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        java.lang.Class<?> wildcardClass35 = borderArrangement18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement11.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        borderArrangement7.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement18.equals((java.lang.Object) borderArrangement32);
        borderArrangement32.clear();
        borderArrangement32.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement7.add(block17, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        java.lang.Class<?> wildcardClass26 = borderArrangement15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) "");
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement3.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement3.add(block15, obj16);
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) block15);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 0.0f);
        borderArrangement18.clear();
        borderArrangement18.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement23.equals(obj33);
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement23.equals(obj35);
        borderArrangement23.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.Block block39 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        boolean boolean48 = borderArrangement40.equals((java.lang.Object) true);
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement53.clear();
        boolean boolean56 = borderArrangement53.equals((java.lang.Object) '#');
        borderArrangement53.clear();
        java.lang.Class<?> wildcardClass58 = borderArrangement53.getClass();
        boolean boolean59 = borderArrangement40.equals((java.lang.Object) borderArrangement53);
        borderArrangement40.clear();
        boolean boolean62 = borderArrangement40.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass63 = borderArrangement40.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement23.add(block39, (java.lang.Object) wildcardClass63);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement0.equals(obj18);
        java.lang.Class<?> wildcardClass20 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass20 = borderArrangement19.getClass();
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) borderArrangement19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement0.equals(obj26);
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement0.add(block28, obj29);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D34 = borderArrangement0.arrange(blockContainer31, graphics2D32, rectangleConstraint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement6.equals(obj17);
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement6.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 'a');
        borderArrangement16.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement16.add(block24, obj25);
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement16.getClass();
        boolean boolean29 = borderArrangement13.equals((java.lang.Object) borderArrangement16);
        java.lang.Class<?> wildcardClass30 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) 0L);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean26 = borderArrangement13.equals((java.lang.Object) 100.0f);
        borderArrangement13.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 10);
        java.lang.Object obj42 = null;
        boolean boolean43 = borderArrangement31.equals(obj42);
        java.lang.Object obj44 = null;
        boolean boolean45 = borderArrangement31.equals(obj44);
        borderArrangement31.clear();
        borderArrangement31.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        org.jfree.chart.block.Block block14 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block14, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        borderArrangement3.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement3.add(block11, obj12);
        java.lang.Class<?> wildcardClass14 = borderArrangement3.getClass();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) 10);
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) 0L);
        boolean boolean27 = borderArrangement13.equals((java.lang.Object) borderArrangement18);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        boolean boolean39 = borderArrangement33.equals((java.lang.Object) "");
        boolean boolean41 = borderArrangement33.equals((java.lang.Object) (byte) 100);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        java.lang.Class<?> wildcardClass56 = borderArrangement51.getClass();
        boolean boolean57 = borderArrangement47.equals((java.lang.Object) borderArrangement51);
        borderArrangement47.clear();
        borderArrangement47.clear();
        java.lang.Object obj60 = null;
        boolean boolean61 = borderArrangement47.equals(obj60);
        borderArrangement47.clear();
        borderArrangement47.clear();
        boolean boolean64 = borderArrangement33.equals((java.lang.Object) borderArrangement47);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block32, (java.lang.Object) borderArrangement33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) 0L);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) 100.0f);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement14.add(block29, obj30);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement14.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass4 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement6.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 'a');
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (byte) 100);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean27 = borderArrangement6.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) (byte) 100);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement6.add(block28, (java.lang.Object) borderArrangement29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) 'a');
        borderArrangement14.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement14.add(block22, obj23);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.Block block26 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) true);
        borderArrangement27.clear();
        borderArrangement27.clear();
        borderArrangement27.clear();
        borderArrangement27.clear();
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement41 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement41.clear();
        boolean boolean44 = borderArrangement41.equals((java.lang.Object) '#');
        borderArrangement41.clear();
        boolean boolean47 = borderArrangement41.equals((java.lang.Object) "");
        boolean boolean49 = borderArrangement41.equals((java.lang.Object) true);
        boolean boolean50 = borderArrangement27.equals((java.lang.Object) borderArrangement41);
        borderArrangement41.clear();
        java.lang.Class<?> wildcardClass52 = borderArrangement41.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block26, (java.lang.Object) wildcardClass52);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement5.add(block16, obj17);
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean31 = borderArrangement5.equals((java.lang.Object) borderArrangement20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (byte) -1);
        boolean boolean27 = borderArrangement20.equals((java.lang.Object) (-1));
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean30 = borderArrangement12.equals((java.lang.Object) borderArrangement20);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement0.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        boolean boolean19 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement4.getClass();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) borderArrangement4);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement0.equals(obj18);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 10);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass26 = borderArrangement13.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement29);
        org.jfree.chart.block.Block block39 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean42 = borderArrangement40.equals((java.lang.Object) 10);
        borderArrangement40.clear();
        borderArrangement40.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement45 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement45.clear();
        boolean boolean48 = borderArrangement45.equals((java.lang.Object) '#');
        borderArrangement45.clear();
        boolean boolean51 = borderArrangement45.equals((java.lang.Object) "");
        boolean boolean53 = borderArrangement45.equals((java.lang.Object) 0L);
        boolean boolean54 = borderArrangement40.equals((java.lang.Object) borderArrangement45);
        borderArrangement45.clear();
        org.jfree.chart.block.Block block56 = null;
        java.lang.Object obj57 = null;
        borderArrangement45.add(block56, obj57);
        borderArrangement45.clear();
        borderArrangement45.clear();
        borderArrangement45.clear();
        java.lang.Class<?> wildcardClass62 = borderArrangement45.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement29.add(block39, (java.lang.Object) borderArrangement45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement0.equals(obj23);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) true);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) 10);
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) (-1));
        borderArrangement11.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) 'a');
        borderArrangement25.clear();
        org.jfree.chart.block.Block block33 = null;
        java.lang.Object obj34 = null;
        borderArrangement25.add(block33, obj34);
        boolean boolean36 = borderArrangement11.equals((java.lang.Object) borderArrangement25);
        borderArrangement11.clear();
        java.lang.Class<?> wildcardClass38 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        boolean boolean32 = borderArrangement20.equals((java.lang.Object) (byte) 0);
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) true);
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean49 = borderArrangement20.equals((java.lang.Object) borderArrangement35);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 10);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D37 = borderArrangement20.arrange(blockContainer34, graphics2D35, rectangleConstraint36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        boolean boolean19 = borderArrangement13.equals((java.lang.Object) "");
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 10);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass26 = borderArrangement13.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = borderArrangement9.equals(obj25);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block29 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) (byte) 100);
        borderArrangement30.clear();
        java.lang.Object obj40 = null;
        boolean boolean41 = borderArrangement30.equals(obj40);
        borderArrangement30.clear();
        borderArrangement30.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement9.add(block29, (java.lang.Object) borderArrangement30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) true);
        borderArrangement5.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        boolean boolean22 = borderArrangement5.equals((java.lang.Object) wildcardClass21);
        borderArrangement5.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D31 = borderArrangement0.arrange(blockContainer28, graphics2D29, rectangleConstraint30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) ' ');
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement10.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) wildcardClass16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) 10);
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) 0L);
        boolean boolean33 = borderArrangement19.equals((java.lang.Object) borderArrangement24);
        borderArrangement19.clear();
        boolean boolean36 = borderArrangement19.equals((java.lang.Object) 10);
        borderArrangement19.clear();
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement9.add(block26, obj27);
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement9.equals(obj31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        borderArrangement5.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) 'a');
        borderArrangement21.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement21.add(block29, obj30);
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass33 = borderArrangement21.getClass();
        boolean boolean34 = borderArrangement18.equals((java.lang.Object) borderArrangement21);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) 'a');
        borderArrangement35.clear();
        borderArrangement35.clear();
        boolean boolean44 = borderArrangement21.equals((java.lang.Object) borderArrangement35);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement5.add(block17, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement11.equals((java.lang.Object) (byte) -1);
        boolean boolean18 = borderArrangement11.equals((java.lang.Object) (-1));
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean28 = borderArrangement23.equals((java.lang.Object) 1L);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D38 = borderArrangement23.arrange(blockContainer35, graphics2D36, rectangleConstraint37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        java.lang.Class<?> wildcardClass30 = borderArrangement25.getClass();
        boolean boolean31 = borderArrangement12.equals((java.lang.Object) borderArrangement25);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass36 = borderArrangement12.getClass();
        boolean boolean37 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.Block block38 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        boolean boolean47 = borderArrangement39.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement48 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement48.clear();
        boolean boolean51 = borderArrangement48.equals((java.lang.Object) '#');
        boolean boolean52 = borderArrangement39.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block38, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement0.add(block26, obj27);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        java.lang.Class<?> wildcardClass49 = borderArrangement44.getClass();
        boolean boolean50 = borderArrangement31.equals((java.lang.Object) borderArrangement44);
        org.jfree.chart.block.BorderArrangement borderArrangement51 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement51.clear();
        boolean boolean54 = borderArrangement51.equals((java.lang.Object) '#');
        borderArrangement51.clear();
        boolean boolean57 = borderArrangement51.equals((java.lang.Object) "");
        boolean boolean59 = borderArrangement51.equals((java.lang.Object) true);
        boolean boolean61 = borderArrangement51.equals((java.lang.Object) 10);
        borderArrangement51.clear();
        borderArrangement51.clear();
        boolean boolean64 = borderArrangement31.equals((java.lang.Object) borderArrangement51);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement23.equals(obj33);
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement23.equals(obj35);
        borderArrangement23.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.Block block39 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        boolean boolean48 = borderArrangement40.equals((java.lang.Object) 0L);
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement23.add(block39, (java.lang.Object) borderArrangement40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        boolean boolean10 = borderArrangement7.equals((java.lang.Object) '#');
        borderArrangement7.clear();
        boolean boolean13 = borderArrangement7.equals((java.lang.Object) "");
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        boolean boolean17 = borderArrangement7.equals((java.lang.Object) 100.0d);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean24 = borderArrangement7.equals((java.lang.Object) 10L);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement7.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 0.0d);
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) 0.0f);
        borderArrangement7.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) borderArrangement7);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement12.equals(obj25);
        boolean boolean28 = borderArrangement12.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) (short) 1);
        borderArrangement29.clear();
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement29.equals(obj33);
        java.lang.Class<?> wildcardClass35 = borderArrangement29.getClass();
        boolean boolean36 = borderArrangement12.equals((java.lang.Object) borderArrangement29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) 10);
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) 'a');
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean30 = borderArrangement8.equals((java.lang.Object) borderArrangement21);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement21);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement0.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement14.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) true);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) 1.0f);
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean35 = borderArrangement12.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) 0L);
        boolean boolean31 = borderArrangement17.equals((java.lang.Object) borderArrangement22);
        borderArrangement22.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) borderArrangement23);
        boolean boolean34 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D38 = borderArrangement23.arrange(blockContainer35, graphics2D36, rectangleConstraint37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        borderArrangement17.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) "");
        boolean boolean33 = borderArrangement25.equals((java.lang.Object) true);
        boolean boolean35 = borderArrangement25.equals((java.lang.Object) 10);
        boolean boolean37 = borderArrangement25.equals((java.lang.Object) (byte) 0);
        boolean boolean38 = borderArrangement17.equals((java.lang.Object) borderArrangement25);
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement25.equals(obj39);
        java.lang.Class<?> wildcardClass41 = borderArrangement25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        java.lang.Class<?> wildcardClass37 = borderArrangement32.getClass();
        boolean boolean38 = borderArrangement28.equals((java.lang.Object) borderArrangement32);
        borderArrangement28.clear();
        borderArrangement28.clear();
        borderArrangement28.clear();
        boolean boolean42 = borderArrangement19.equals((java.lang.Object) borderArrangement28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        borderArrangement3.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement3.add(block11, obj12);
        borderArrangement3.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement3.getClass();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement9.getClass();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement19.equals(obj29);
        borderArrangement19.clear();
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement19.equals(obj32);
        java.lang.Class<?> wildcardClass34 = borderArrangement19.getClass();
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement19);
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D39 = borderArrangement19.arrange(blockContainer36, graphics2D37, rectangleConstraint38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement0.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement5.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement5.add(block16, obj17);
        borderArrangement5.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block26 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        boolean boolean35 = borderArrangement27.equals((java.lang.Object) 0L);
        borderArrangement27.clear();
        borderArrangement27.clear();
        borderArrangement27.clear();
        boolean boolean40 = borderArrangement27.equals((java.lang.Object) 100.0f);
        java.lang.Object obj41 = null;
        boolean boolean42 = borderArrangement27.equals(obj41);
        borderArrangement27.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        boolean boolean49 = borderArrangement44.equals((java.lang.Object) 1L);
        boolean boolean50 = borderArrangement27.equals((java.lang.Object) borderArrangement44);
        java.lang.Class<?> wildcardClass51 = borderArrangement27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block26, (java.lang.Object) wildcardClass51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement8.equals(obj18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean32 = borderArrangement8.equals((java.lang.Object) borderArrangement20);
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement20.equals(obj33);
        borderArrangement20.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BlockContainer blockContainer37 = null;
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D40 = borderArrangement0.arrange(blockContainer37, graphics2D38, rectangleConstraint39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        borderArrangement23.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement23.getClass();
        boolean boolean30 = borderArrangement9.equals((java.lang.Object) wildcardClass29);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean33 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D37 = borderArrangement9.arrange(blockContainer34, graphics2D35, rectangleConstraint36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 0L);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) true);
        boolean boolean33 = borderArrangement23.equals((java.lang.Object) 10);
        boolean boolean35 = borderArrangement23.equals((java.lang.Object) (byte) 0);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean38 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.Block block39 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        boolean boolean48 = borderArrangement40.equals((java.lang.Object) 0L);
        borderArrangement40.clear();
        borderArrangement40.clear();
        borderArrangement40.clear();
        boolean boolean53 = borderArrangement40.equals((java.lang.Object) 100.0f);
        java.lang.Object obj54 = null;
        boolean boolean55 = borderArrangement40.equals(obj54);
        borderArrangement40.clear();
        borderArrangement40.clear();
        boolean boolean59 = borderArrangement40.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement23.add(block39, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement8.arrange(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block4 = null;
        java.lang.Object obj5 = null;
        borderArrangement0.add(block4, obj5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        boolean boolean27 = borderArrangement17.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement28.clear();
        boolean boolean31 = borderArrangement28.equals((java.lang.Object) '#');
        borderArrangement28.clear();
        boolean boolean34 = borderArrangement28.equals((java.lang.Object) 'a');
        boolean boolean35 = borderArrangement17.equals((java.lang.Object) boolean34);
        boolean boolean37 = borderArrangement17.equals((java.lang.Object) 0L);
        borderArrangement17.clear();
        boolean boolean39 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) "");
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) 'a');
        borderArrangement26.clear();
        boolean boolean34 = borderArrangement17.equals((java.lang.Object) borderArrangement26);
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D39 = borderArrangement0.arrange(blockContainer36, graphics2D37, rectangleConstraint38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean26 = borderArrangement8.equals((java.lang.Object) boolean25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (byte) 100);
        borderArrangement32.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) borderArrangement32);
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block28, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement4.clear();
        boolean boolean7 = borderArrangement4.equals((java.lang.Object) '#');
        borderArrangement4.clear();
        boolean boolean10 = borderArrangement4.equals((java.lang.Object) 'a');
        boolean boolean12 = borderArrangement4.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass13 = borderArrangement4.getClass();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) wildcardClass13);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement0.equals(obj19);
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement8.equals(obj19);
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) 0.0f);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        boolean boolean27 = borderArrangement21.equals((java.lang.Object) "");
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) true);
        boolean boolean31 = borderArrangement21.equals((java.lang.Object) 10);
        boolean boolean33 = borderArrangement21.equals((java.lang.Object) (-1));
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass35 = borderArrangement21.getClass();
        boolean boolean36 = borderArrangement15.equals((java.lang.Object) wildcardClass35);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean10 = borderArrangement8.equals((java.lang.Object) (short) 1);
        borderArrangement8.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement8.equals(obj12);
        borderArrangement8.clear();
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) 10);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement16.add(block21, obj22);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean30 = borderArrangement8.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D34 = borderArrangement8.arrange(blockContainer31, graphics2D32, rectangleConstraint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement0.equals(obj18);
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) 1.0f);
        boolean boolean32 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean35 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D39 = borderArrangement20.arrange(blockContainer36, graphics2D37, rectangleConstraint38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 'a');
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        borderArrangement15.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass36 = borderArrangement29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block28, (java.lang.Object) borderArrangement29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement18.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D35 = borderArrangement0.arrange(blockContainer32, graphics2D33, rectangleConstraint34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) "");
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) true);
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement10.equals(obj21);
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement10.add(block23, obj24);
        boolean boolean26 = borderArrangement0.equals((java.lang.Object) block23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement13.getClass();
        boolean boolean16 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement15.equals(obj25);
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement15.equals(obj27);
        boolean boolean29 = borderArrangement0.equals(obj27);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 1.0f);
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement6.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = borderArrangement9.equals(obj25);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block29 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement30.clear();
        boolean boolean33 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        boolean boolean36 = borderArrangement30.equals((java.lang.Object) "");
        boolean boolean38 = borderArrangement30.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        boolean boolean43 = borderArrangement30.equals((java.lang.Object) '#');
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        java.lang.Class<?> wildcardClass47 = borderArrangement30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement9.add(block29, (java.lang.Object) wildcardClass47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 'a');
        borderArrangement12.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        boolean boolean25 = borderArrangement20.equals((java.lang.Object) (byte) -1);
        boolean boolean27 = borderArrangement20.equals((java.lang.Object) (-1));
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean30 = borderArrangement12.equals((java.lang.Object) borderArrangement20);
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement20);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        boolean boolean38 = borderArrangement33.equals((java.lang.Object) (byte) -1);
        boolean boolean40 = borderArrangement33.equals((java.lang.Object) (-1));
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        boolean boolean50 = borderArrangement44.equals((java.lang.Object) "");
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) 0L);
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        boolean boolean56 = borderArrangement33.equals((java.lang.Object) borderArrangement44);
        boolean boolean58 = borderArrangement33.equals((java.lang.Object) 10L);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement20.add(block32, (java.lang.Object) borderArrangement33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        borderArrangement26.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) "");
        borderArrangement32.clear();
        boolean boolean40 = borderArrangement26.equals((java.lang.Object) borderArrangement32);
        org.jfree.chart.block.Block block41 = null;
        java.lang.Object obj42 = null;
        borderArrangement26.add(block41, obj42);
        java.lang.Object obj44 = null;
        boolean boolean45 = borderArrangement26.equals(obj44);
        borderArrangement26.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block25, (java.lang.Object) borderArrangement26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) 10);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        boolean boolean27 = borderArrangement17.equals((java.lang.Object) '#');
        borderArrangement17.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean45 = borderArrangement43.equals((java.lang.Object) 10);
        borderArrangement43.clear();
        borderArrangement43.clear();
        org.jfree.chart.block.Block block48 = null;
        java.lang.Object obj49 = null;
        borderArrangement43.add(block48, obj49);
        borderArrangement43.clear();
        borderArrangement43.clear();
        borderArrangement43.clear();
        borderArrangement43.clear();
        borderArrangement43.clear();
        java.lang.Object obj56 = null;
        boolean boolean57 = borderArrangement43.equals(obj56);
        borderArrangement43.clear();
        boolean boolean59 = borderArrangement31.equals((java.lang.Object) borderArrangement43);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block30, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 'a');
        borderArrangement10.clear();
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass20 = borderArrangement10.getClass();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) wildcardClass20);
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean25 = borderArrangement23.equals((java.lang.Object) 10);
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement28 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean30 = borderArrangement28.equals((java.lang.Object) 0.0f);
        boolean boolean32 = borderArrangement28.equals((java.lang.Object) "hi!");
        boolean boolean33 = borderArrangement23.equals((java.lang.Object) boolean32);
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement23.equals(obj34);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block22, (java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean7 = borderArrangement5.equals((java.lang.Object) 0.0f);
        boolean boolean9 = borderArrangement5.equals((java.lang.Object) "hi!");
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) boolean9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) 10);
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) 0L);
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement26);
        borderArrangement26.clear();
        org.jfree.chart.block.Block block37 = null;
        java.lang.Object obj38 = null;
        borderArrangement26.add(block37, obj38);
        borderArrangement26.clear();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.Block block42 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement43 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement43.clear();
        boolean boolean46 = borderArrangement43.equals((java.lang.Object) '#');
        borderArrangement43.clear();
        boolean boolean49 = borderArrangement43.equals((java.lang.Object) 'a');
        borderArrangement43.clear();
        boolean boolean52 = borderArrangement43.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean55 = borderArrangement53.equals((java.lang.Object) (short) 1);
        borderArrangement53.clear();
        boolean boolean57 = borderArrangement43.equals((java.lang.Object) borderArrangement53);
        org.jfree.chart.block.Block block58 = null;
        java.lang.Object obj59 = null;
        borderArrangement43.add(block58, obj59);
        borderArrangement43.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement62 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement62.clear();
        boolean boolean65 = borderArrangement62.equals((java.lang.Object) '#');
        borderArrangement62.clear();
        boolean boolean68 = borderArrangement62.equals((java.lang.Object) 'a');
        boolean boolean70 = borderArrangement62.equals((java.lang.Object) (byte) 100);
        borderArrangement62.clear();
        borderArrangement62.clear();
        boolean boolean73 = borderArrangement43.equals((java.lang.Object) borderArrangement62);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block42, (java.lang.Object) borderArrangement62);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        org.jfree.chart.block.Block block31 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean34 = borderArrangement32.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) 'a');
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) (byte) 100);
        borderArrangement35.clear();
        boolean boolean45 = borderArrangement32.equals((java.lang.Object) borderArrangement35);
        borderArrangement32.clear();
        org.jfree.chart.block.Block block47 = null;
        java.lang.Object obj48 = null;
        borderArrangement32.add(block47, obj48);
        java.lang.Class<?> wildcardClass50 = borderArrangement32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement14.add(block31, (java.lang.Object) wildcardClass50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) "hi!");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) 0L);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        boolean boolean44 = borderArrangement31.equals((java.lang.Object) 100.0f);
        borderArrangement31.clear();
        borderArrangement31.clear();
        boolean boolean47 = borderArrangement15.equals((java.lang.Object) borderArrangement31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        boolean boolean21 = borderArrangement8.equals((java.lang.Object) 0L);
        borderArrangement8.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        borderArrangement24.clear();
        boolean boolean30 = borderArrangement24.equals((java.lang.Object) "");
        boolean boolean32 = borderArrangement24.equals((java.lang.Object) (byte) 100);
        borderArrangement24.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement24.equals(obj34);
        org.jfree.chart.block.BorderArrangement borderArrangement36 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement36.clear();
        boolean boolean39 = borderArrangement36.equals((java.lang.Object) '#');
        borderArrangement36.clear();
        boolean boolean42 = borderArrangement36.equals((java.lang.Object) 'a');
        borderArrangement36.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        boolean boolean50 = borderArrangement44.equals((java.lang.Object) "");
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) true);
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        borderArrangement44.clear();
        java.lang.Class<?> wildcardClass57 = borderArrangement44.getClass();
        boolean boolean58 = borderArrangement36.equals((java.lang.Object) borderArrangement44);
        borderArrangement36.clear();
        boolean boolean60 = borderArrangement24.equals((java.lang.Object) borderArrangement36);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block23, (java.lang.Object) borderArrangement24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) '#');
        borderArrangement14.clear();
        boolean boolean20 = borderArrangement14.equals((java.lang.Object) "");
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) 0L);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean27 = borderArrangement14.equals((java.lang.Object) 100.0f);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) borderArrangement14);
        borderArrangement14.clear();
        org.jfree.chart.block.Block block30 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean33 = borderArrangement31.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean36 = borderArrangement34.equals((java.lang.Object) 10);
        borderArrangement34.clear();
        borderArrangement34.clear();
        org.jfree.chart.block.Block block39 = null;
        java.lang.Object obj40 = null;
        borderArrangement34.add(block39, obj40);
        borderArrangement34.clear();
        boolean boolean43 = borderArrangement31.equals((java.lang.Object) borderArrangement34);
        borderArrangement34.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement14.add(block30, (java.lang.Object) borderArrangement34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement0.equals(obj23);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 'a');
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) "");
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) true);
        boolean boolean43 = borderArrangement20.equals((java.lang.Object) borderArrangement34);
        org.jfree.chart.block.BorderArrangement borderArrangement44 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement44.clear();
        boolean boolean47 = borderArrangement44.equals((java.lang.Object) '#');
        borderArrangement44.clear();
        boolean boolean50 = borderArrangement44.equals((java.lang.Object) "");
        boolean boolean52 = borderArrangement44.equals((java.lang.Object) true);
        boolean boolean54 = borderArrangement44.equals((java.lang.Object) 10);
        boolean boolean55 = borderArrangement34.equals((java.lang.Object) borderArrangement44);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block19, (java.lang.Object) borderArrangement34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement12);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        borderArrangement27.clear();
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement27);
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean39 = borderArrangement21.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement12.add(block20, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean22 = borderArrangement0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) 0L);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        boolean boolean31 = borderArrangement26.equals((java.lang.Object) (byte) -1);
        boolean boolean33 = borderArrangement26.equals((java.lang.Object) (-1));
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement26.equals(obj34);
        java.lang.Class<?> wildcardClass36 = borderArrangement26.getClass();
        boolean boolean37 = borderArrangement15.equals((java.lang.Object) wildcardClass36);
        java.lang.Class<?> wildcardClass38 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (byte) 100);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        borderArrangement11.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement0.add(block26, obj27);
        java.lang.Class<?> wildcardClass29 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement0.equals(obj15);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) 10);
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) 0L);
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement26);
        borderArrangement26.clear();
        org.jfree.chart.block.Block block37 = null;
        java.lang.Object obj38 = null;
        borderArrangement26.add(block37, obj38);
        borderArrangement26.clear();
        boolean boolean41 = borderArrangement0.equals((java.lang.Object) borderArrangement26);
        org.jfree.chart.block.BlockContainer blockContainer42 = null;
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D45 = borderArrangement26.arrange(blockContainer42, graphics2D43, rectangleConstraint44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement18.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10);
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        boolean boolean32 = borderArrangement29.equals((java.lang.Object) '#');
        borderArrangement29.clear();
        boolean boolean35 = borderArrangement29.equals((java.lang.Object) "");
        boolean boolean37 = borderArrangement29.equals((java.lang.Object) 0L);
        borderArrangement29.clear();
        borderArrangement29.clear();
        borderArrangement29.clear();
        boolean boolean42 = borderArrangement29.equals((java.lang.Object) 100.0f);
        borderArrangement29.clear();
        boolean boolean44 = borderArrangement16.equals((java.lang.Object) borderArrangement29);
        boolean boolean45 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.Block block46 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement47 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement47.clear();
        boolean boolean50 = borderArrangement47.equals((java.lang.Object) '#');
        borderArrangement47.clear();
        borderArrangement47.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement53 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement53.clear();
        boolean boolean56 = borderArrangement53.equals((java.lang.Object) '#');
        borderArrangement53.clear();
        boolean boolean59 = borderArrangement53.equals((java.lang.Object) "");
        borderArrangement53.clear();
        boolean boolean61 = borderArrangement47.equals((java.lang.Object) borderArrangement53);
        borderArrangement53.clear();
        borderArrangement53.clear();
        java.lang.Class<?> wildcardClass64 = borderArrangement53.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block46, (java.lang.Object) wildcardClass64);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) true);
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) 10);
        boolean boolean27 = borderArrangement15.equals((java.lang.Object) (byte) 0);
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement3.clear();
        boolean boolean6 = borderArrangement3.equals((java.lang.Object) '#');
        borderArrangement3.clear();
        boolean boolean9 = borderArrangement3.equals((java.lang.Object) 'a');
        boolean boolean11 = borderArrangement3.equals((java.lang.Object) (byte) 100);
        borderArrangement3.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) 10);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        borderArrangement3.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) borderArrangement3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean24 = borderArrangement22.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) 'a');
        boolean boolean33 = borderArrangement25.equals((java.lang.Object) (byte) 100);
        borderArrangement25.clear();
        boolean boolean35 = borderArrangement22.equals((java.lang.Object) borderArrangement25);
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        boolean boolean26 = borderArrangement8.equals((java.lang.Object) boolean25);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement29.clear();
        borderArrangement29.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement8.add(block28, (java.lang.Object) borderArrangement29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) 1L);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) 100);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        borderArrangement9.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) '#');
        boolean boolean22 = borderArrangement17.equals((java.lang.Object) (byte) -1);
        boolean boolean23 = borderArrangement9.equals((java.lang.Object) borderArrangement17);
        java.lang.Class<?> wildcardClass24 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) 0L);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean29 = borderArrangement16.equals((java.lang.Object) 100.0f);
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement16.equals(obj30);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean35 = borderArrangement16.equals((java.lang.Object) (-1L));
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        java.lang.Class<?> wildcardClass37 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        java.lang.Class<?> wildcardClass19 = borderArrangement8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean8 = borderArrangement6.equals((java.lang.Object) 10);
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) 10);
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement12.add(block17, obj18);
        borderArrangement6.add(block11, obj18);
        borderArrangement6.clear();
        boolean boolean23 = borderArrangement6.equals((java.lang.Object) 1.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) '#');
        borderArrangement26.clear();
        boolean boolean32 = borderArrangement26.equals((java.lang.Object) "");
        boolean boolean34 = borderArrangement26.equals((java.lang.Object) (byte) 100);
        borderArrangement26.clear();
        java.lang.Object obj36 = null;
        boolean boolean37 = borderArrangement26.equals(obj36);
        java.lang.Object obj38 = null;
        boolean boolean39 = borderArrangement26.equals(obj38);
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        boolean boolean45 = borderArrangement40.equals((java.lang.Object) 1L);
        borderArrangement40.clear();
        boolean boolean47 = borderArrangement26.equals((java.lang.Object) borderArrangement40);
        boolean boolean49 = borderArrangement26.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass50 = borderArrangement26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) wildcardClass50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) 0L);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean29 = borderArrangement16.equals((java.lang.Object) 100.0f);
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement16.equals(obj30);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean35 = borderArrangement16.equals((java.lang.Object) (-1L));
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) '#');
        borderArrangement20.clear();
        boolean boolean26 = borderArrangement20.equals((java.lang.Object) 'a');
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass29 = borderArrangement20.getClass();
        boolean boolean30 = borderArrangement16.equals((java.lang.Object) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement6.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 'a');
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement19.add(block29, obj30);
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        borderArrangement15.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) '#');
        borderArrangement23.clear();
        boolean boolean29 = borderArrangement23.equals((java.lang.Object) "");
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (byte) 100);
        borderArrangement23.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) borderArrangement23);
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) borderArrangement23);
        org.jfree.chart.block.BlockContainer blockContainer37 = null;
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D40 = borderArrangement0.arrange(blockContainer37, graphics2D38, rectangleConstraint39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = borderArrangement0.equals(obj15);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement18.equals(obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        boolean boolean29 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D34 = borderArrangement0.arrange(blockContainer31, graphics2D32, rectangleConstraint33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 0L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) "");
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) borderArrangement15);
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) 10);
        borderArrangement29.clear();
        borderArrangement29.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block28, (java.lang.Object) borderArrangement29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement8.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement8.add(block16, obj17);
        borderArrangement8.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (short) 1);
        borderArrangement10.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrange(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        boolean boolean41 = borderArrangement31.equals((java.lang.Object) 1.0f);
        borderArrangement31.clear();
        boolean boolean43 = borderArrangement0.equals((java.lang.Object) borderArrangement31);
        org.jfree.chart.block.BlockContainer blockContainer44 = null;
        java.awt.Graphics2D graphics2D45 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D47 = borderArrangement31.arrange(blockContainer44, graphics2D45, rectangleConstraint46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) "");
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10);
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement0.equals(obj26);
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement0.add(block28, obj29);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) "");
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) 0L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement0.equals((java.lang.Object) borderArrangement11);
        boolean boolean25 = borderArrangement0.equals((java.lang.Object) 10L);
        borderArrangement0.clear();
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) 0);
        org.jfree.chart.block.Block block29 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement30 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean32 = borderArrangement30.equals((java.lang.Object) 10);
        borderArrangement30.clear();
        borderArrangement30.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement35 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement35.clear();
        boolean boolean38 = borderArrangement35.equals((java.lang.Object) '#');
        borderArrangement35.clear();
        boolean boolean41 = borderArrangement35.equals((java.lang.Object) "");
        boolean boolean43 = borderArrangement35.equals((java.lang.Object) 0L);
        boolean boolean44 = borderArrangement30.equals((java.lang.Object) borderArrangement35);
        borderArrangement30.clear();
        boolean boolean47 = borderArrangement30.equals((java.lang.Object) 10);
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        borderArrangement30.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block29, (java.lang.Object) borderArrangement30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) "");
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 1.0f);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.Block block31 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        boolean boolean35 = borderArrangement32.equals((java.lang.Object) '#');
        borderArrangement32.clear();
        boolean boolean38 = borderArrangement32.equals((java.lang.Object) 'a');
        borderArrangement32.clear();
        boolean boolean41 = borderArrangement32.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BorderArrangement borderArrangement42 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean44 = borderArrangement42.equals((java.lang.Object) (short) 1);
        borderArrangement42.clear();
        boolean boolean46 = borderArrangement32.equals((java.lang.Object) borderArrangement42);
        org.jfree.chart.block.Block block47 = null;
        java.lang.Object obj48 = null;
        borderArrangement32.add(block47, obj48);
        java.lang.Class<?> wildcardClass50 = borderArrangement32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block31, (java.lang.Object) borderArrangement32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        boolean boolean17 = borderArrangement11.equals((java.lang.Object) 'a');
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) boolean17);
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement24.clear();
        boolean boolean27 = borderArrangement24.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement24.equals((java.lang.Object) (byte) -1);
        boolean boolean31 = borderArrangement24.equals((java.lang.Object) (-1));
        borderArrangement24.clear();
        borderArrangement24.clear();
        borderArrangement24.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Class<?> wildcardClass18 = borderArrangement17.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement17);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) '#');
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        boolean boolean30 = borderArrangement27.equals((java.lang.Object) '#');
        borderArrangement27.clear();
        boolean boolean33 = borderArrangement27.equals((java.lang.Object) "");
        borderArrangement27.clear();
        boolean boolean35 = borderArrangement21.equals((java.lang.Object) borderArrangement27);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.Block block39 = null;
        java.lang.Object obj40 = null;
        borderArrangement21.add(block39, obj40);
        borderArrangement21.clear();
        borderArrangement21.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement17.add(block20, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) 10);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        borderArrangement10.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) '#');
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) "");
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement19.equals(obj29);
        org.jfree.chart.block.BorderArrangement borderArrangement31 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement31.clear();
        boolean boolean34 = borderArrangement31.equals((java.lang.Object) '#');
        borderArrangement31.clear();
        boolean boolean37 = borderArrangement31.equals((java.lang.Object) "");
        boolean boolean39 = borderArrangement31.equals((java.lang.Object) true);
        borderArrangement31.clear();
        borderArrangement31.clear();
        borderArrangement31.clear();
        boolean boolean43 = borderArrangement19.equals((java.lang.Object) borderArrangement31);
        java.lang.Object obj44 = null;
        boolean boolean45 = borderArrangement31.equals(obj44);
        borderArrangement31.clear();
        boolean boolean47 = borderArrangement10.equals((java.lang.Object) borderArrangement31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) "");
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (byte) 100);
        borderArrangement9.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement9.equals(obj19);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement9.add(block26, obj27);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.Block block33 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        borderArrangement34.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement40 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement40.clear();
        boolean boolean43 = borderArrangement40.equals((java.lang.Object) '#');
        borderArrangement40.clear();
        boolean boolean46 = borderArrangement40.equals((java.lang.Object) "");
        borderArrangement40.clear();
        boolean boolean48 = borderArrangement34.equals((java.lang.Object) borderArrangement40);
        borderArrangement34.clear();
        borderArrangement34.clear();
        boolean boolean52 = borderArrangement34.equals((java.lang.Object) (-1L));
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        borderArrangement34.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement9.add(block33, (java.lang.Object) borderArrangement34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        boolean boolean8 = borderArrangement5.equals((java.lang.Object) '#');
        borderArrangement5.clear();
        boolean boolean11 = borderArrangement5.equals((java.lang.Object) "");
        boolean boolean13 = borderArrangement5.equals((java.lang.Object) 0L);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) 0.0f);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) '#');
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) "");
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) true);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass30 = borderArrangement16.getClass();
        boolean boolean31 = borderArrangement0.equals((java.lang.Object) borderArrangement16);
        org.jfree.chart.block.Block block32 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement33 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement33.clear();
        boolean boolean36 = borderArrangement33.equals((java.lang.Object) '#');
        borderArrangement33.clear();
        borderArrangement33.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement39 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement39.clear();
        boolean boolean42 = borderArrangement39.equals((java.lang.Object) '#');
        borderArrangement39.clear();
        boolean boolean45 = borderArrangement39.equals((java.lang.Object) "");
        borderArrangement39.clear();
        boolean boolean47 = borderArrangement33.equals((java.lang.Object) borderArrangement39);
        borderArrangement33.clear();
        borderArrangement33.clear();
        borderArrangement33.clear();
        org.jfree.chart.block.Block block51 = null;
        java.lang.Object obj52 = null;
        borderArrangement33.add(block51, obj52);
        borderArrangement33.clear();
        borderArrangement33.clear();
        java.lang.Class<?> wildcardClass56 = borderArrangement33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement16.add(block32, (java.lang.Object) wildcardClass56);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) "");
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement13.getClass();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) borderArrangement13);
        borderArrangement0.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement0.equals(obj21);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block24 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement25.clear();
        boolean boolean28 = borderArrangement25.equals((java.lang.Object) '#');
        borderArrangement25.clear();
        boolean boolean31 = borderArrangement25.equals((java.lang.Object) 'a');
        boolean boolean33 = borderArrangement25.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) 'a');
        borderArrangement34.clear();
        org.jfree.chart.block.Block block42 = null;
        java.lang.Object obj43 = null;
        borderArrangement34.add(block42, obj43);
        borderArrangement34.clear();
        boolean boolean46 = borderArrangement25.equals((java.lang.Object) borderArrangement34);
        borderArrangement25.clear();
        borderArrangement25.clear();
        borderArrangement25.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block24, (java.lang.Object) borderArrangement25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) '#');
        borderArrangement9.clear();
        boolean boolean15 = borderArrangement9.equals((java.lang.Object) 'a');
        borderArrangement9.clear();
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement9.add(block17, obj18);
        borderArrangement9.clear();
        boolean boolean21 = borderArrangement0.equals((java.lang.Object) borderArrangement9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrange(blockContainer23, graphics2D24, rectangleConstraint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean13 = borderArrangement8.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = borderArrangement8.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass16 = borderArrangement8.getClass();
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) borderArrangement8);
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean23 = borderArrangement18.equals((java.lang.Object) (byte) -1);
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (-1));
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement0.equals((java.lang.Object) borderArrangement18);
        org.jfree.chart.block.Block block28 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement29 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean31 = borderArrangement29.equals((java.lang.Object) 10);
        borderArrangement29.clear();
        borderArrangement29.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement34 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement34.clear();
        boolean boolean37 = borderArrangement34.equals((java.lang.Object) '#');
        borderArrangement34.clear();
        boolean boolean40 = borderArrangement34.equals((java.lang.Object) "");
        boolean boolean42 = borderArrangement34.equals((java.lang.Object) 0L);
        boolean boolean43 = borderArrangement29.equals((java.lang.Object) borderArrangement34);
        borderArrangement29.clear();
        boolean boolean46 = borderArrangement29.equals((java.lang.Object) 10);
        borderArrangement29.clear();
        java.lang.Class<?> wildcardClass48 = borderArrangement29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement18.add(block28, (java.lang.Object) borderArrangement29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.block.BorderArrangement cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement6.clear();
        boolean boolean9 = borderArrangement6.equals((java.lang.Object) '#');
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) "");
        borderArrangement6.clear();
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) borderArrangement6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement0.add(block18, obj19);
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean28 = borderArrangement22.equals((java.lang.Object) "");
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) (byte) 100);
        borderArrangement22.clear();
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement22.equals(obj32);
        borderArrangement22.clear();
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement22.equals(obj35);
        java.lang.Object obj37 = null;
        boolean boolean38 = borderArrangement22.equals(obj37);
        borderArrangement22.clear();
        java.lang.Class<?> wildcardClass40 = borderArrangement22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }
}

