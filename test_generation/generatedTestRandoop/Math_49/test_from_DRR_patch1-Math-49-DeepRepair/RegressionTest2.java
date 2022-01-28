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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        double double7 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (-1));
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        double double11 = iterator5.value();
        boolean boolean12 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 0L);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(97);
        double double9 = openIntToDoubleHashMap2.remove((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator2.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double12 = openIntToDoubleHashMap1.put(0, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        int int2 = openIntToDoubleHashMap1.size();
        int int3 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.remove(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 0, (double) (short) 10);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = iterator3.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, Double.NaN);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double4 = openIntToDoubleHashMap1.put(10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = iterator10.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator6.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = iterator8.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator3.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = iterator8.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        double double13 = iterator10.value();
        double double14 = iterator10.value();
        java.lang.Class<?> wildcardClass15 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        int int13 = iterator11.key();
        double double14 = iterator11.value();
        double double15 = iterator11.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator11.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int15 = openIntToDoubleHashMap14.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = iterator16.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap8);
        int int10 = openIntToDoubleHashMap8.size();
        double double12 = openIntToDoubleHashMap8.get(32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = iterator2.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(0);
        double double11 = openIntToDoubleHashMap1.remove((int) 'a');
        double double13 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap11.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap8.put((int) (byte) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        iterator7.advance();
        double double9 = iterator7.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator7.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        double double6 = openIntToDoubleHashMap1.get(0);
        int int7 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        boolean boolean6 = openIntToDoubleHashMap0.containsKey(32);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.put(1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 10.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.put((int) '#', (double) (-1));
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(32);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap1.remove((int) '#');
        boolean boolean19 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator3.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        double double9 = openIntToDoubleHashMap1.get(0);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        boolean boolean13 = iterator12.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = iterator12.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap10);
        double double14 = openIntToDoubleHashMap11.put((int) (byte) 100, (double) 1.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap12.iterator();
        boolean boolean15 = iterator14.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator14.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap6.get(100);
        int int9 = openIntToDoubleHashMap6.size();
        int int10 = openIntToDoubleHashMap6.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        boolean boolean6 = iterator3.hasNext();
        boolean boolean7 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = iterator3.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap9.put((int) (byte) 100, (double) (short) 10);
        double double14 = openIntToDoubleHashMap9.get(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 52.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        double double14 = openIntToDoubleHashMap11.remove(32);
        boolean boolean16 = openIntToDoubleHashMap11.containsKey((int) (short) 1);
        double double18 = openIntToDoubleHashMap11.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator19 = openIntToDoubleHashMap11.iterator();
        double double21 = openIntToDoubleHashMap11.remove(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        double double9 = iterator5.value();
        boolean boolean10 = iterator5.hasNext();
        int int11 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) '#');
        double double15 = openIntToDoubleHashMap1.get(100);
        int int16 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator2.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put(10, (double) (-1));
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) '4', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        iterator12.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap2.get((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        int int13 = iterator5.key();
        int int14 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap14.iterator();
        iterator15.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap8.size();
        boolean boolean11 = openIntToDoubleHashMap8.containsKey((int) '#');
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(100);
        int int6 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        double double5 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        boolean boolean13 = iterator5.hasNext();
        int int14 = iterator5.key();
        java.lang.Class<?> wildcardClass15 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = iterator3.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double10 = openIntToDoubleHashMap1.get((int) (short) 100);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) 'a');
        double double16 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        double double10 = openIntToDoubleHashMap1.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get((int) '#');
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        int int8 = iterator5.key();
        double double9 = iterator5.value();
        int int10 = iterator5.key();
        boolean boolean11 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator6.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) (short) 1);
        double double4 = openIntToDoubleHashMap2.remove(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) (short) -1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        int int12 = openIntToDoubleHashMap1.size();
        int int13 = openIntToDoubleHashMap1.size();
        int int14 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        double double14 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) (byte) 10);
        int int15 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) (short) 100);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap1.get((int) 'a');
        double double13 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(2);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = iterator3.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put((int) (short) 1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator6.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 0.0f);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = iterator3.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        double double3 = openIntToDoubleHashMap1.get(0);
        double double6 = openIntToDoubleHashMap1.put(32, 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap13.iterator();
        java.lang.Class<?> wildcardClass18 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = iterator6.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap7.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) 100);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(32);
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        int int2 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int6 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        double double11 = iterator5.value();
        boolean boolean12 = iterator5.hasNext();
        int int13 = iterator5.key();
        boolean boolean14 = iterator5.hasNext();
        java.lang.Class<?> wildcardClass15 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 100.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) (short) 0);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap16);
        double double20 = openIntToDoubleHashMap16.put((int) (byte) 10, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 1);
        double double5 = openIntToDoubleHashMap2.put(0, (double) 0);
        double double7 = openIntToDoubleHashMap2.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double12 = openIntToDoubleHashMap9.put((int) '4', (double) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        double double11 = iterator5.value();
        boolean boolean12 = iterator5.hasNext();
        int int13 = iterator5.key();
        int int14 = iterator5.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        double double17 = iterator14.value();
        int int18 = iterator14.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        int int12 = iterator10.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 1L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = iterator8.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 2);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        int int14 = openIntToDoubleHashMap12.size();
        double double17 = openIntToDoubleHashMap12.put((int) '#', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10L);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        int int12 = iterator10.key();
        double double13 = iterator10.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass4 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openIntToDoubleHashMap2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) '#');
        int int5 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) '#');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        int int11 = iterator8.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap7.remove((int) (byte) 1);
        double double11 = openIntToDoubleHashMap7.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        int int2 = openIntToDoubleHashMap0.size();
        boolean boolean4 = openIntToDoubleHashMap0.containsKey(10);
        double double6 = openIntToDoubleHashMap0.get((-1));
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = iterator16.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, 0.0d);
        double double5 = openIntToDoubleHashMap2.put(1, (double) ' ');
        double double7 = openIntToDoubleHashMap2.get((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) 32);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        double double6 = openIntToDoubleHashMap3.get((int) 'a');
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 0);
        double double11 = openIntToDoubleHashMap1.put((int) (short) 10, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        int int4 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.put(1, (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        double double10 = iterator5.value();
        boolean boolean11 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        double double13 = iterator10.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator9.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double9 = openIntToDoubleHashMap1.put((int) (short) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        boolean boolean12 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = iterator9.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) ' ');
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '#');
        double double4 = openIntToDoubleHashMap1.put(0, 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) '#');
        int int5 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        double double5 = openIntToDoubleHashMap2.put(10, (double) (-1L));
        double double7 = openIntToDoubleHashMap2.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32);
        double double4 = openIntToDoubleHashMap1.put((int) (short) -1, (double) 1L);
        int int5 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = iterator10.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) (short) 10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        boolean boolean13 = iterator5.hasNext();
        double double14 = iterator5.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.get((-1));
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 'a');
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        double double9 = openIntToDoubleHashMap1.get(1);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.get((int) (short) 100);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator15.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) '#', (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        boolean boolean17 = iterator14.hasNext();
        boolean boolean18 = iterator14.hasNext();
        boolean boolean19 = iterator14.hasNext();
        boolean boolean20 = iterator14.hasNext();
        double double21 = iterator14.value();
        boolean boolean22 = iterator14.hasNext();
        boolean boolean23 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        boolean boolean13 = iterator11.hasNext();
        int int14 = iterator11.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator11.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator6.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        boolean boolean17 = iterator14.hasNext();
        boolean boolean18 = iterator14.hasNext();
        boolean boolean19 = iterator14.hasNext();
        double double20 = iterator14.value();
        int int21 = iterator14.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator14.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1.0d));
        double double4 = openIntToDoubleHashMap1.put(1, (double) (-1.0f));
        double double7 = openIntToDoubleHashMap1.put((int) (short) 0, (double) 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double12 = openIntToDoubleHashMap1.put(1, (double) 1L);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double6 = openIntToDoubleHashMap2.put(0, 0.0d);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) (-1.0f));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = iterator2.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 1.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) (byte) 1);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 0);
        double double8 = openIntToDoubleHashMap2.put(10, (double) 10L);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        iterator11.advance();
        double double13 = iterator11.value();
        java.lang.Class<?> wildcardClass14 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = iterator13.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        boolean boolean7 = iterator6.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap13.put(1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        double double7 = openIntToDoubleHashMap2.put((int) '4', 10.0d);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = iterator17.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap5.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) ' ');
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double4 = openIntToDoubleHashMap1.put(10, 32.0d);
        int int5 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap8.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100.0d);
        int int2 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = iterator9.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        int int6 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator3.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap8.get(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        boolean boolean6 = iterator3.hasNext();
        boolean boolean7 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = iterator3.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = iterator8.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (-1.0d));
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = iterator7.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap14.iterator();
        double double17 = openIntToDoubleHashMap14.get((int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (-1.0f));
        double double5 = openIntToDoubleHashMap2.put((-1), (double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        int int6 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator7.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int9 = openIntToDoubleHashMap2.size();
        double double11 = openIntToDoubleHashMap2.get(32);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator3.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        int int13 = iterator10.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap8.remove((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) '#');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap4.put((int) ' ', 0.0d);
        int int8 = openIntToDoubleHashMap4.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        double double14 = openIntToDoubleHashMap1.get((-1));
        double double16 = openIntToDoubleHashMap1.remove((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator4.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator5.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 0.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 100);
        double double6 = openIntToDoubleHashMap2.get(1);
        double double8 = openIntToDoubleHashMap2.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 0);
        double double13 = openIntToDoubleHashMap1.put((int) 'a', (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = iterator17.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double6 = openIntToDoubleHashMap4.get(100);
        double double8 = openIntToDoubleHashMap4.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        boolean boolean6 = iterator2.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        int int14 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get((int) (short) 100);
        double double9 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = iterator11.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        boolean boolean5 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double12 = openIntToDoubleHashMap1.put((int) ' ', 32.0d);
        int int13 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        boolean boolean13 = iterator5.hasNext();
        int int14 = iterator5.key();
        int int15 = iterator5.key();
        java.lang.Class<?> wildcardClass16 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap8.size();
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = iterator7.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        iterator9.advance();
        // The following exception was thrown during execution in test generation
        try {
            iterator9.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap1.remove((int) '#');
        boolean boolean19 = openIntToDoubleHashMap1.containsKey(2);
        double double21 = openIntToDoubleHashMap1.get((int) '4');
        boolean boolean23 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, 0.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        boolean boolean7 = iterator4.hasNext();
        java.lang.Class<?> wildcardClass8 = iterator4.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        double double9 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) (short) -1);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap1.get((int) 'a');
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get((int) (short) 100);
        double double9 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator11.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean7 = openIntToDoubleHashMap5.containsKey(32);
        boolean boolean9 = openIntToDoubleHashMap5.containsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 2);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) -1);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = iterator17.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        double double15 = openIntToDoubleHashMap12.remove((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator3.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 100);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        double double5 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        java.lang.Class<?> wildcardClass6 = iterator4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = iterator15.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        double double8 = openIntToDoubleHashMap1.get(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        double double7 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (-1));
        double double10 = openIntToDoubleHashMap2.put(32, (double) (byte) 100);
        boolean boolean12 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        int int13 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        int int7 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap8.put((int) (short) -1, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '#');
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.get((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) (-1L));
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 0.0f);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        double double14 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) (byte) 10);
        double double17 = openIntToDoubleHashMap2.put((int) (byte) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        int int10 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        double double10 = openIntToDoubleHashMap7.get((-1));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        double double11 = iterator8.value();
        int int12 = iterator8.key();
        boolean boolean13 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 97);
        int int7 = openIntToDoubleHashMap2.size();
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        double double8 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        boolean boolean7 = openIntToDoubleHashMap4.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = iterator7.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.get((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) '#');
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap8);
        double double11 = openIntToDoubleHashMap9.get((int) (byte) 100);
        int int12 = openIntToDoubleHashMap9.size();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double6 = openIntToDoubleHashMap1.put(35, (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        iterator15.advance();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
        double double15 = iterator13.value();
        double double16 = iterator13.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator13.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double11 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 10.0f);
        double double13 = openIntToDoubleHashMap1.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        double double8 = openIntToDoubleHashMap6.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap6.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (-1));
        double double4 = openIntToDoubleHashMap2.remove((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap6.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        double double11 = openIntToDoubleHashMap6.get((int) (short) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        int int2 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, 10.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        boolean boolean12 = iterator9.hasNext();
        iterator9.advance();
        int int14 = iterator9.key();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double8 = openIntToDoubleHashMap2.put(0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap2.iterator();
        boolean boolean10 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(35, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        int int5 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator2.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        int int17 = iterator14.key();
        double double18 = iterator14.value();
        int int19 = iterator14.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator14.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(100);
        int int6 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) 97);
        double double4 = openIntToDoubleHashMap2.remove(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap1.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) '#');
        int int5 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 'a');
        double double4 = openIntToDoubleHashMap2.get((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        double double12 = iterator5.value();
        boolean boolean13 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        double double12 = openIntToDoubleHashMap1.get(1);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) ' ');
        boolean boolean16 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 0);
        double double4 = openIntToDoubleHashMap1.put(0, (double) (-1));
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double6 = openIntToDoubleHashMap2.put((int) 'a', (double) 1);
        int int7 = openIntToDoubleHashMap2.size();
        boolean boolean9 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        int int10 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap16.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        double double3 = openIntToDoubleHashMap1.get(10);
        double double5 = openIntToDoubleHashMap1.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        double double13 = openIntToDoubleHashMap1.put(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        double double16 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap7.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = iterator10.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = iterator10.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        int int12 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        double double7 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (-1));
        double double10 = openIntToDoubleHashMap2.put(32, (double) (byte) 100);
        double double13 = openIntToDoubleHashMap2.put(97, (double) 0L);
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        int int4 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 100);
        double double9 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean17 = openIntToDoubleHashMap1.containsKey((int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator6.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = iterator6.hasNext();
        boolean boolean8 = iterator6.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = iterator3.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = iterator5.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double4 = openIntToDoubleHashMap2.remove((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        double double11 = openIntToDoubleHashMap4.put((int) ' ', (double) (short) -1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = iterator3.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        int int17 = iterator14.key();
        boolean boolean18 = iterator14.hasNext();
        int int19 = iterator14.key();
        java.lang.Class<?> wildcardClass20 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) (byte) -1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        double double6 = openIntToDoubleHashMap2.get((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) (short) -1);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        boolean boolean6 = iterator2.hasNext();
        boolean boolean7 = iterator2.hasNext();
        boolean boolean8 = iterator2.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        double double11 = iterator5.value();
        double double12 = iterator5.value();
        int int13 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass4 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(10);
        double double7 = openIntToDoubleHashMap1.put(97, 0.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = iterator8.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 35);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.remove(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        boolean boolean16 = iterator15.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        java.lang.Class<?> wildcardClass6 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        double double11 = openIntToDoubleHashMap1.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = iterator12.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double8 = openIntToDoubleHashMap5.put((int) (short) 0, Double.NaN);
        double double10 = openIntToDoubleHashMap5.get(100);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(100);
        double double5 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        double double14 = openIntToDoubleHashMap11.remove(32);
        boolean boolean16 = openIntToDoubleHashMap11.containsKey((int) (short) 1);
        double double18 = openIntToDoubleHashMap11.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator19 = openIntToDoubleHashMap11.iterator();
        java.lang.Class<?> wildcardClass20 = openIntToDoubleHashMap11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int11 = openIntToDoubleHashMap10.size();
        boolean boolean13 = openIntToDoubleHashMap10.containsKey((int) (byte) 100);
        double double15 = openIntToDoubleHashMap10.remove(1);
        double double17 = openIntToDoubleHashMap10.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int11 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32.0d);
        double double3 = openIntToDoubleHashMap1.get((int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        int int13 = iterator10.key();
        java.lang.Class<?> wildcardClass14 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double5 = openIntToDoubleHashMap1.remove(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 0);
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.put((int) ' ', 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean15 = openIntToDoubleHashMap13.containsKey((int) (short) -1);
        double double17 = openIntToDoubleHashMap13.get((int) '4');
        java.lang.Class<?> wildcardClass18 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = iterator4.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = iterator16.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1.0f));
        double double3 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator4.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1.0f));
        double double3 = openIntToDoubleHashMap1.get(0);
        int int4 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        int int11 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        double double9 = openIntToDoubleHashMap1.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = iterator7.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 100L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) 100.0f);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get(1);
        double double12 = openIntToDoubleHashMap1.remove((int) '4');
        double double14 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        double double6 = openIntToDoubleHashMap3.get(100);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        int int12 = iterator10.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap1.remove((int) '#');
        double double19 = openIntToDoubleHashMap1.remove(10);
        double double21 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        int int8 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = iterator3.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap9.get(0);
        double double13 = openIntToDoubleHashMap9.get((int) 'a');
        double double15 = openIntToDoubleHashMap9.remove((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double8 = openIntToDoubleHashMap2.put(0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap2.iterator();
        double double12 = openIntToDoubleHashMap2.put(100, 32.0d);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put((int) (byte) -1, (double) 2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        boolean boolean9 = openIntToDoubleHashMap3.containsKey((int) '#');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 1);
        int int3 = openIntToDoubleHashMap2.size();
        double double5 = openIntToDoubleHashMap2.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.remove(35);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        int int14 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        double double15 = openIntToDoubleHashMap1.put(10, 10.0d);
        double double17 = openIntToDoubleHashMap1.remove((int) (short) 100);
        double double19 = openIntToDoubleHashMap1.get((int) (short) 10);
        boolean boolean21 = openIntToDoubleHashMap1.containsKey(35);
        int int22 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double10 = openIntToDoubleHashMap1.get((int) (short) 100);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) 'a');
        double double16 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 100L);
        double double18 = openIntToDoubleHashMap1.get((int) (byte) 100);
        boolean boolean20 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double22 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        double double18 = openIntToDoubleHashMap15.put((int) (short) 0, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put(10, (double) (-1));
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) '4', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 97);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.get(97);
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) (short) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean10 = openIntToDoubleHashMap8.containsKey(2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openIntToDoubleHashMap2.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 'a');
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove(97);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        boolean boolean17 = iterator14.hasNext();
        int int18 = iterator14.key();
        boolean boolean19 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = iterator2.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 10);
        int int2 = openIntToDoubleHashMap1.size();
        int int3 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator10.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double9 = openIntToDoubleHashMap1.put((-1), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean15 = openIntToDoubleHashMap13.containsKey((int) (short) -1);
        double double18 = openIntToDoubleHashMap13.put((int) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        boolean boolean13 = iterator5.hasNext();
        int int14 = iterator5.key();
        int int15 = iterator5.key();
        boolean boolean16 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1);
        double double3 = openIntToDoubleHashMap1.remove(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator5.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        double double6 = openIntToDoubleHashMap2.remove((int) '4');
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        double double14 = openIntToDoubleHashMap1.put(32, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, 52.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        double double6 = openIntToDoubleHashMap0.put((int) (short) -1, (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap0.iterator();
        boolean boolean8 = iterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = iterator7.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap3.put(32, 32.0d);
        double double9 = openIntToDoubleHashMap3.put(0, 100.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = iterator15.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        double double11 = iterator5.value();
        boolean boolean12 = iterator5.hasNext();
        int int13 = iterator5.key();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        double double4 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        double double4 = openIntToDoubleHashMap0.remove((int) (short) 0);
        double double7 = openIntToDoubleHashMap0.put((int) (byte) -1, (double) (byte) 0);
        boolean boolean9 = openIntToDoubleHashMap0.containsKey(97);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 10.0f);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100.0f);
        double double4 = openIntToDoubleHashMap1.put((int) ' ', (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator5.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator2.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = iterator9.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        boolean boolean6 = openIntToDoubleHashMap3.containsKey((int) (short) 100);
        double double8 = openIntToDoubleHashMap3.get(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        double double9 = openIntToDoubleHashMap1.get(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator5.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int14 = openIntToDoubleHashMap13.size();
        double double17 = openIntToDoubleHashMap13.put(1, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        double double7 = openIntToDoubleHashMap2.put((-1), (double) (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator4.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(32);
        double double8 = openIntToDoubleHashMap1.remove(2);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (-1L));
        double double4 = openIntToDoubleHashMap2.get((int) (short) -1);
        double double6 = openIntToDoubleHashMap2.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        int int5 = openIntToDoubleHashMap4.size();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = openIntToDoubleHashMap4.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get(32);
        int int8 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = iterator11.hasNext();
        boolean boolean13 = iterator11.hasNext();
        boolean boolean14 = iterator11.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = iterator11.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap14.get(0);
        boolean boolean18 = openIntToDoubleHashMap14.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        double double5 = openIntToDoubleHashMap0.get((int) (short) 0);
        int int6 = openIntToDoubleHashMap0.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.remove(32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        double double15 = openIntToDoubleHashMap1.get(32);
        double double17 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int12 = openIntToDoubleHashMap1.size();
        double double14 = openIntToDoubleHashMap1.remove(100);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) '#');
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 100, Double.NaN);
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) '#');
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = iterator3.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        double double15 = openIntToDoubleHashMap1.put(10, 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap1.iterator();
        double double19 = openIntToDoubleHashMap1.put((int) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 100.0f);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 10, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap12.put(1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey((-1));
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.remove(2);
        double double13 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap13.iterator();
        int int17 = openIntToDoubleHashMap13.size();
        boolean boolean19 = openIntToDoubleHashMap13.containsKey(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double6 = openIntToDoubleHashMap4.remove((-1));
        int int7 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap8.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator2.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openIntToDoubleHashMap2.put((int) (byte) 10, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator8.advance();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double9 = openIntToDoubleHashMap5.put((-1), Double.NaN);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 1L);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        double double12 = openIntToDoubleHashMap10.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) 32);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        double double3 = openIntToDoubleHashMap1.get(100);
        double double5 = openIntToDoubleHashMap1.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int14 = openIntToDoubleHashMap13.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double10 = openIntToDoubleHashMap1.get((int) (short) 100);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) 'a');
        double double14 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        double double17 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator2.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        boolean boolean12 = iterator11.hasNext();
        iterator11.advance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int8 = openIntToDoubleHashMap2.size();
        boolean boolean10 = openIntToDoubleHashMap2.containsKey(32);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = iterator10.hasNext();
        boolean boolean12 = iterator10.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        int int6 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.remove((int) 'a');
        double double12 = openIntToDoubleHashMap1.put((int) 'a', Double.NaN);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap6.put((int) ' ', (double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap6.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, Double.NaN);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double18 = openIntToDoubleHashMap15.put((int) '4', (double) '4');
        int int19 = openIntToDoubleHashMap15.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator20 = openIntToDoubleHashMap15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = iterator20.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.remove((int) (short) 0);
        boolean boolean15 = openIntToDoubleHashMap1.containsKey(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        boolean boolean10 = openIntToDoubleHashMap7.containsKey((int) '4');
        double double13 = openIntToDoubleHashMap7.put((int) (short) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        int int4 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        double double12 = openIntToDoubleHashMap9.get(0);
        double double14 = openIntToDoubleHashMap9.remove(0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = iterator4.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap12.iterator();
        boolean boolean14 = iterator13.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1));
        double double4 = openIntToDoubleHashMap1.put(32, (double) (short) 10);
        double double6 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double9 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = openIntToDoubleHashMap2.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double18 = openIntToDoubleHashMap15.put((int) '4', (double) '4');
        int int19 = openIntToDoubleHashMap15.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator20 = openIntToDoubleHashMap15.iterator();
        boolean boolean21 = iterator20.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        boolean boolean9 = iterator8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = iterator8.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) 0);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

