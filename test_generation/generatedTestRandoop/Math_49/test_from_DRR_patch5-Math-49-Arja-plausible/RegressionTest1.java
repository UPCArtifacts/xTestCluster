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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 0.0f);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double7 = openIntToDoubleHashMap3.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap3.iterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) '#');
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) 2);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        double double9 = iterator5.value();
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
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(0);
        double double11 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        double double12 = openIntToDoubleHashMap1.get(1);
        double double14 = openIntToDoubleHashMap1.remove((int) '4');
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double7 = openIntToDoubleHashMap2.get(1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap1.get((int) (byte) 10);
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap1.remove(100);
        double double14 = openIntToDoubleHashMap1.get(100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        boolean boolean7 = iterator4.hasNext();
        boolean boolean8 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = iterator4.value();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        int int4 = openIntToDoubleHashMap1.size();
        int int5 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap1.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
            iterator9.advance();
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double6 = openIntToDoubleHashMap2.put((int) 'a', (double) 1);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        double double8 = openIntToDoubleHashMap6.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        double double5 = openIntToDoubleHashMap1.remove(0);
        int int6 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        java.lang.Class<?> wildcardClass13 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get(1);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        int int8 = iterator5.key();
        java.lang.Class<?> wildcardClass9 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        java.lang.Class<?> wildcardClass5 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.put((int) '#', 52.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1.0d));
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        boolean boolean6 = iterator2.hasNext();
        java.lang.Class<?> wildcardClass7 = iterator2.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.put(0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) ' ', (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
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
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 2);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap10.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (-1));
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
        boolean boolean13 = iterator12.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = iterator12.value();
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap4.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = iterator6.hasNext();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        iterator8.advance();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(100);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean10 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        int int12 = openIntToDoubleHashMap1.size();
        int int13 = openIntToDoubleHashMap1.size();
        double double15 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (-1L));
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 100, 52.0d);
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double16 = openIntToDoubleHashMap13.put(2, Double.NaN);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = openIntToDoubleHashMap2.containsKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        iterator11.advance();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        double double19 = iterator14.value();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap4.put((int) (byte) 100, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        double double14 = openIntToDoubleHashMap2.put(100, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double5 = openIntToDoubleHashMap1.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.put(0, (double) 2);
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        double double10 = openIntToDoubleHashMap1.get((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
        boolean boolean9 = iterator7.hasNext();
        iterator7.advance();
        double double11 = iterator7.value();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator3.value();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator3.value();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap10.iterator();
        iterator11.advance();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap13.iterator();
        boolean boolean18 = openIntToDoubleHashMap13.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator4.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.get(0);
        double double7 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, 0.0d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double16 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
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
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator4.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        boolean boolean21 = iterator14.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap2.put((int) (byte) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 100);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 32);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (byte) -1);
        double double4 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        java.lang.Class<?> wildcardClass11 = iterator9.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, 2.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        int int2 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        double double14 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.get((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.remove(10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = iterator14.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        double double6 = openIntToDoubleHashMap1.get(0);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean19 = openIntToDoubleHashMap17.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap2.get((int) '4');
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator4.key();
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator10.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        int int12 = openIntToDoubleHashMap9.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        double double12 = iterator9.value();
        boolean boolean13 = iterator9.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        double double6 = openIntToDoubleHashMap0.put((int) (short) -1, (double) '4');
        boolean boolean8 = openIntToDoubleHashMap0.containsKey((int) (byte) 10);
        double double10 = openIntToDoubleHashMap0.get((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double13 = openIntToDoubleHashMap2.remove((int) '#');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        boolean boolean8 = iterator5.hasNext();
        boolean boolean9 = iterator5.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double7 = openIntToDoubleHashMap1.put(0, (double) (-1L));
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) ' ');
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) '#');
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 100, Double.NaN);
        double double12 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 52.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0);
        int int2 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap2.remove(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 2);
        double double5 = openIntToDoubleHashMap2.put((-1), 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        java.lang.Class<?> wildcardClass2 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        double double8 = openIntToDoubleHashMap5.put((-1), (double) (-1.0f));
        int int9 = openIntToDoubleHashMap5.size();
        boolean boolean11 = openIntToDoubleHashMap5.containsKey(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        double double18 = openIntToDoubleHashMap13.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.put((int) 'a', (double) (short) -1);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((-1));
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(10);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass4 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 'a');
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (short) 10);
        int int3 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = iterator2.value();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 1.0f);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (short) 10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openIntToDoubleHashMap3.put(10, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap14.iterator();
        boolean boolean16 = iterator15.hasNext();
        iterator15.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap4.get(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        boolean boolean6 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator5.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.put((int) ' ', (double) 'a');
        double double11 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (-1));
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) (byte) -1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 10);
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double9 = openIntToDoubleHashMap1.remove((int) ' ');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int14 = openIntToDoubleHashMap13.size();
        double double17 = openIntToDoubleHashMap13.put((int) (short) 100, (double) (short) 10);
        double double20 = openIntToDoubleHashMap13.put((int) ' ', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator5.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        boolean boolean17 = openIntToDoubleHashMap1.containsKey(0);
        double double20 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 100.0f);
        double double22 = openIntToDoubleHashMap1.get((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.remove(2);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = iterator10.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = iterator10.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        int int2 = openIntToDoubleHashMap1.size();
        double double4 = openIntToDoubleHashMap1.remove(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        int int7 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        double double11 = iterator5.value();
        double double12 = iterator5.value();
        java.lang.Class<?> wildcardClass13 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        int int4 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        boolean boolean6 = iterator2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator2.key();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap13.iterator();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 10.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap2.size();
        double double5 = openIntToDoubleHashMap2.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1));
        double double4 = openIntToDoubleHashMap1.put((int) (short) 100, 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double11 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = iterator6.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        int int10 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double7 = openIntToDoubleHashMap1.put((int) '#', 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int5 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap6.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        iterator14.advance();
        java.lang.Class<?> wildcardClass16 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 1L);
        double double4 = openIntToDoubleHashMap2.remove(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), 0.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(10);
        double double6 = openIntToDoubleHashMap1.get((int) '#');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = iterator11.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = iterator11.value();
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
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap3.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        double double3 = openIntToDoubleHashMap1.get(0);
        double double5 = openIntToDoubleHashMap1.get((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (short) -1);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator6.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 1.0f);
        int int3 = openIntToDoubleHashMap2.size();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = iterator4.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(1, (double) (byte) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        double double14 = openIntToDoubleHashMap1.put(0, (double) 32);
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        boolean boolean14 = iterator13.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator13.key();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        double double5 = openIntToDoubleHashMap1.remove(0);
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean12 = openIntToDoubleHashMap9.containsKey(1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 'a');
        int int2 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove(2);
        double double9 = openIntToDoubleHashMap2.get(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.remove(0);
        boolean boolean17 = openIntToDoubleHashMap13.containsKey(0);
        boolean boolean19 = openIntToDoubleHashMap13.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
        int int15 = iterator13.key();
        boolean boolean16 = iterator13.hasNext();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double10 = openIntToDoubleHashMap1.get(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (-1L));
        double double4 = openIntToDoubleHashMap2.get((int) (short) -1);
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openIntToDoubleHashMap2.put((int) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double5 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double7 = openIntToDoubleHashMap1.get((int) '#');
        double double9 = openIntToDoubleHashMap1.get((int) ' ');
        double double12 = openIntToDoubleHashMap1.put((int) (short) 100, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 100);
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openIntToDoubleHashMap2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap9.get((int) 'a');
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) -1);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int5 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.put(1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        int int2 = openIntToDoubleHashMap1.size();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator4.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        int int7 = openIntToDoubleHashMap2.size();
        double double9 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int10 = openIntToDoubleHashMap9.size();
        double double12 = openIntToDoubleHashMap9.remove(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) '#');
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        double double7 = openIntToDoubleHashMap2.put((int) '4', 10.0d);
        double double10 = openIntToDoubleHashMap2.put((int) (short) 100, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        java.lang.Class<?> wildcardClass8 = iterator5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey(0);
        double double8 = openIntToDoubleHashMap2.put(2, (double) 100.0f);
        boolean boolean10 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
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
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        int int8 = openIntToDoubleHashMap1.size();
        double double11 = openIntToDoubleHashMap1.put(2, 10.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double11 = openIntToDoubleHashMap8.put((int) (byte) 1, (double) 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
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
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        int int8 = openIntToDoubleHashMap1.size();
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        boolean boolean15 = iterator14.hasNext();
        java.lang.Class<?> wildcardClass16 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 32);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int12 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get(2);
        double double6 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put((int) (byte) -1, (double) 2);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        double double12 = iterator9.value();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean13 = openIntToDoubleHashMap9.containsKey((int) 'a');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap10);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap11.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.get(100);
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap10.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap10);
        double double14 = openIntToDoubleHashMap10.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) '#');
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 100, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        double double9 = openIntToDoubleHashMap1.get(0);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = iterator12.value();
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
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.get((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 2);
        double double4 = openIntToDoubleHashMap2.get(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.put((int) ' ', 1.0d);
        double double10 = openIntToDoubleHashMap1.put((int) (short) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap2.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = iterator6.hasNext();
        boolean boolean8 = iterator6.hasNext();
        boolean boolean9 = iterator6.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        int int15 = openIntToDoubleHashMap14.size();
        java.lang.Class<?> wildcardClass16 = openIntToDoubleHashMap14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap6.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (short) 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        int int13 = iterator11.key();
        java.lang.Class<?> wildcardClass14 = iterator11.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        double double8 = openIntToDoubleHashMap4.remove((int) '#');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        boolean boolean2 = openIntToDoubleHashMap0.containsKey(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((-1), (double) (byte) 0);
        double double9 = openIntToDoubleHashMap2.put((int) '4', (double) 1L);
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) -1);
        double double17 = openIntToDoubleHashMap1.put(0, (double) 1L);
        int int18 = openIntToDoubleHashMap1.size();
        double double20 = openIntToDoubleHashMap1.get((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        iterator8.advance();
        double double12 = iterator8.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean9 = openIntToDoubleHashMap7.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        boolean boolean17 = openIntToDoubleHashMap1.containsKey(0);
        double double20 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 100.0f);
        boolean boolean22 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        int int23 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double9 = openIntToDoubleHashMap5.put((-1), (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator10.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        double double14 = openIntToDoubleHashMap11.remove(32);
        boolean boolean16 = openIntToDoubleHashMap11.containsKey((int) (short) 1);
        int int17 = openIntToDoubleHashMap11.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        int int4 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        boolean boolean9 = iterator5.hasNext();
        double double10 = iterator5.value();
        java.lang.Class<?> wildcardClass11 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap7.put(100, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        boolean boolean15 = openIntToDoubleHashMap12.containsKey((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = openIntToDoubleHashMap12.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        iterator8.advance();
        iterator8.advance();
        double double13 = iterator8.value();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        int int7 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 2);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = iterator6.hasNext();
        java.lang.Class<?> wildcardClass8 = iterator6.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.remove(2);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        boolean boolean6 = iterator3.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        double double9 = openIntToDoubleHashMap1.put((int) (short) 0, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap10.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 0.0d);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap12.put((-1), (double) (byte) 10);
        double double18 = openIntToDoubleHashMap12.put((int) (short) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 'a');
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 97);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10L);
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) (-1L));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.get(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 100L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        double double9 = openIntToDoubleHashMap2.put(2, (double) 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        boolean boolean15 = iterator5.hasNext();
        boolean boolean16 = iterator5.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove((int) (byte) 1);
        double double8 = openIntToDoubleHashMap3.put(97, (double) 2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        double double12 = openIntToDoubleHashMap1.get(100);
        double double14 = openIntToDoubleHashMap1.remove(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator6.value();
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        int int12 = openIntToDoubleHashMap1.size();
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap15.get(32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 0);
        double double4 = openIntToDoubleHashMap1.put(0, (double) (-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean7 = openIntToDoubleHashMap5.containsKey((int) '#');
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        boolean boolean7 = iterator4.hasNext();
        boolean boolean8 = iterator4.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 0L);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (-1L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = iterator7.key();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap12.iterator();
        boolean boolean15 = iterator14.hasNext();
        boolean boolean16 = iterator14.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = iterator14.key();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap1.get(10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) (byte) 1);
        double double4 = openIntToDoubleHashMap2.remove(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) (byte) 1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        iterator12.advance();
        int int14 = iterator12.key();
        double double15 = iterator12.value();
        // The following exception was thrown during execution in test generation
        try {
            iterator12.advance();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
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
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double18 = openIntToDoubleHashMap15.put((int) (byte) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        iterator8.advance();
        iterator8.advance();
        int int13 = iterator8.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        int int9 = openIntToDoubleHashMap7.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.put((int) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 10L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = iterator3.key();
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        boolean boolean13 = iterator10.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        boolean boolean7 = iterator4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = iterator4.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        double double7 = openIntToDoubleHashMap4.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get(0);
        double double11 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double7 = openIntToDoubleHashMap3.get(0);
        int int8 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        double double3 = openIntToDoubleHashMap1.get(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = openIntToDoubleHashMap1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
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
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap4.put((int) (byte) 10, (double) '4');
        double double11 = openIntToDoubleHashMap4.get((int) 'a');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get((int) (short) 100);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        double double14 = openIntToDoubleHashMap9.put((int) (byte) 1, (double) 10);
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        boolean boolean7 = iterator4.hasNext();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        boolean boolean11 = iterator10.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = iterator10.value();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
        boolean boolean10 = openIntToDoubleHashMap7.containsKey((int) '4');
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) (byte) -1);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (short) 100);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap12.iterator();
        boolean boolean15 = iterator14.hasNext();
        boolean boolean16 = iterator14.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = iterator14.value();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.get((-1));
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator6.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 2);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 1, (double) 1.0f);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        double double9 = openIntToDoubleHashMap1.put((int) ' ', (double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = openIntToDoubleHashMap2.containsKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        int int10 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.put((int) (short) 100, (double) 0.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        boolean boolean15 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int17 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        boolean boolean6 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = iterator5.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        double double11 = openIntToDoubleHashMap1.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = iterator13.value();
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
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        int int4 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int9 = openIntToDoubleHashMap2.size();
        double double12 = openIntToDoubleHashMap2.put((int) (byte) 100, (double) (byte) -1);
        double double14 = openIntToDoubleHashMap2.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (-1));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.put(0, (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        iterator7.advance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        int int16 = iterator13.key();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass4 = iterator3.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        iterator9.advance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double9 = openIntToDoubleHashMap1.put((int) (byte) 10, 10.0d);
        double double12 = openIntToDoubleHashMap1.put(32, 0.0d);
        double double14 = openIntToDoubleHashMap1.get((int) (short) 0);
        double double17 = openIntToDoubleHashMap1.put(32, (double) (short) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean15 = openIntToDoubleHashMap13.containsKey((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        boolean boolean20 = iterator14.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap5.get((int) 'a');
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap5.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        double double8 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put((int) (short) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 0L);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 100);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) (short) 1, (double) '#');
        double double8 = openIntToDoubleHashMap2.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (-1L));
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 100, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator6.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = openIntToDoubleHashMap7.containsKey(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        iterator8.advance();
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
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean7 = openIntToDoubleHashMap5.containsKey(32);
        double double10 = openIntToDoubleHashMap5.put((int) '4', (double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = iterator11.key();
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
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = iterator5.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double14 = openIntToDoubleHashMap1.get(100);
        double double16 = openIntToDoubleHashMap1.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put(1, (double) (-1L));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        double double10 = openIntToDoubleHashMap1.put((int) 'a', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.get((int) (short) 100);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 10);
        double double9 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        iterator15.advance();
        // The following exception was thrown during execution in test generation
        try {
            iterator15.advance();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        boolean boolean13 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = iterator14.value();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double6 = openIntToDoubleHashMap1.put(0, 52.0d);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.get((int) (short) 0);
        int int7 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        double double16 = openIntToDoubleHashMap1.put(0, (double) 100L);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double8 = openIntToDoubleHashMap1.get(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double12 = openIntToDoubleHashMap1.put((int) ' ', 32.0d);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = iterator14.value();
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
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        int int5 = openIntToDoubleHashMap4.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = openIntToDoubleHashMap4.containsKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 0);
        double double9 = openIntToDoubleHashMap1.remove(1);
        int int10 = openIntToDoubleHashMap1.size();
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int12 = openIntToDoubleHashMap1.size();
        double double14 = openIntToDoubleHashMap1.remove(100);
        double double16 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        boolean boolean9 = iterator5.hasNext();
        double double10 = iterator5.value();
        double double11 = iterator5.value();
        int int12 = iterator5.key();
        int int13 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        iterator14.advance();
        boolean boolean16 = iterator14.hasNext();
        double double17 = iterator14.value();
        double double18 = iterator14.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (byte) -1);
        double double4 = openIntToDoubleHashMap2.remove(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double4 = openIntToDoubleHashMap1.put(2, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        boolean boolean15 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) '#');
        double double15 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap16.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, 0.0d);
        double double5 = openIntToDoubleHashMap2.put(1, (double) ' ');
        double double7 = openIntToDoubleHashMap2.get((int) (short) -1);
        double double10 = openIntToDoubleHashMap2.put(2, (double) (byte) 0);
        double double13 = openIntToDoubleHashMap2.put((int) (short) 0, 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap6.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 100.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        double double12 = openIntToDoubleHashMap1.get(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        double double13 = iterator10.value();
        java.lang.Class<?> wildcardClass14 = iterator10.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.put((int) 'a', (double) (short) -1);
        double double9 = openIntToDoubleHashMap1.put((int) (short) 0, (double) 97);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get((int) '#');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(100);
        double double5 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        int int2 = openIntToDoubleHashMap1.size();
        int int3 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.remove(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 0, (double) (short) 10);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

