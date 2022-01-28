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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put((int) (byte) -1, (double) 2);
        int int7 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10);
        int int3 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.remove((int) (byte) 0);
        int int6 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        double double6 = openIntToDoubleHashMap0.put((int) (short) -1, (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap0.iterator();
        double double9 = openIntToDoubleHashMap0.remove(100);
        int int10 = openIntToDoubleHashMap0.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double16 = openIntToDoubleHashMap1.remove((int) (short) 0);
        boolean boolean18 = openIntToDoubleHashMap1.containsKey((int) 'a');
        double double20 = openIntToDoubleHashMap1.get(10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double7 = openIntToDoubleHashMap2.get((int) (short) -1);
        double double9 = openIntToDoubleHashMap2.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double10 = openIntToDoubleHashMap1.put((int) (short) 1, 0.0d);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double14 = openIntToDoubleHashMap1.get((-1));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap1.get((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        int int9 = openIntToDoubleHashMap7.size();
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
        double double6 = openIntToDoubleHashMap1.get((int) 'a');
        double double8 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey((int) (byte) 100);
        double double8 = openIntToDoubleHashMap4.remove((int) (byte) 1);
        double double10 = openIntToDoubleHashMap4.remove((int) '#');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 1.0d);
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        java.lang.Class<?> wildcardClass12 = iterator9.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (short) -1);
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) -1);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.remove((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double9 = openIntToDoubleHashMap1.put(35, (double) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double11 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 10.0f);
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) -1);
        double double5 = openIntToDoubleHashMap2.put(3, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        boolean boolean5 = openIntToDoubleHashMap0.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        double double15 = openIntToDoubleHashMap1.get(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) -1);
        double double17 = openIntToDoubleHashMap1.put(0, (double) 1L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2);
        int int2 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        double double5 = openIntToDoubleHashMap2.put(10, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean8 = openIntToDoubleHashMap6.containsKey(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (short) 100);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) (short) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double8 = openIntToDoubleHashMap1.put((int) (byte) 10, 10.0d);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass14 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey(10);
        double double8 = openIntToDoubleHashMap2.put((int) (short) -1, (double) (byte) -1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.remove((int) (short) 100);
        double double7 = openIntToDoubleHashMap3.remove((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, 10.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), 32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 1);
        double double6 = openIntToDoubleHashMap2.remove(1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 1L);
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (-1.0d));
        double double5 = openIntToDoubleHashMap2.put(2, 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int5 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openIntToDoubleHashMap6.put((int) (byte) 1, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double18 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        double double17 = openIntToDoubleHashMap15.get((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) (byte) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        int int2 = openIntToDoubleHashMap0.size();
        boolean boolean4 = openIntToDoubleHashMap0.containsKey(10);
        double double7 = openIntToDoubleHashMap0.put((int) '#', (double) 10L);
        boolean boolean9 = openIntToDoubleHashMap0.containsKey((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put(0, (double) (byte) -1);
        double double8 = openIntToDoubleHashMap3.remove(97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.remove(97);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap1.get((int) '4');
        double double14 = openIntToDoubleHashMap1.get(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        double double17 = iterator14.value();
        boolean boolean18 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        double double14 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int15 = openIntToDoubleHashMap14.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap14.iterator();
        double double19 = openIntToDoubleHashMap14.put(100, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        double double12 = iterator5.value();
        boolean boolean13 = iterator5.hasNext();
        boolean boolean14 = iterator5.hasNext();
        int int15 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(97, (double) 10.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        boolean boolean10 = openIntToDoubleHashMap2.containsKey(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        int int8 = openIntToDoubleHashMap7.size();
        boolean boolean10 = openIntToDoubleHashMap7.containsKey(32);
        double double12 = openIntToDoubleHashMap7.get(3);
        int int13 = openIntToDoubleHashMap7.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        double double10 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get((-1));
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (byte) 1);
        int int6 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        double double6 = openIntToDoubleHashMap0.put((int) (short) -1, (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap0.iterator();
        iterator7.advance();
        iterator7.advance();
        boolean boolean10 = iterator7.hasNext();
        double double11 = iterator7.value();
        int int12 = iterator7.key();
        int int13 = iterator7.key();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put((int) (short) 10, Double.NaN);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put(10, (double) (-1));
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) '4', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((-1), (double) (byte) 0);
        double double9 = openIntToDoubleHashMap2.put((int) '4', (double) 1L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        double double12 = openIntToDoubleHashMap2.get(2);
        double double14 = openIntToDoubleHashMap2.get((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap4.put((int) (byte) 10, (double) '4');
        double double12 = openIntToDoubleHashMap4.put((int) ' ', (double) 100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
        double double8 = openIntToDoubleHashMap3.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap9.remove((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap9.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        int int7 = openIntToDoubleHashMap1.size();
        int int8 = openIntToDoubleHashMap1.size();
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) (byte) 1);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 0);
        double double8 = openIntToDoubleHashMap2.put(10, (double) 10L);
        int int9 = openIntToDoubleHashMap2.size();
        double double12 = openIntToDoubleHashMap2.put((int) (short) 100, (double) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap8.remove((int) (byte) 0);
        double double13 = openIntToDoubleHashMap8.put(35, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(10);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (short) 10);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) -1);
        double double6 = openIntToDoubleHashMap2.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get(1);
        int int4 = openIntToDoubleHashMap1.size();
        double double6 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean11 = openIntToDoubleHashMap1.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean12 = openIntToDoubleHashMap9.containsKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 100.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 0);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) 'a');
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) ' ', 32.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 1);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 100);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.get((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) (-1L));
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.remove(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        iterator9.advance();
        double double13 = iterator9.value();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 100.0f);
        double double5 = openIntToDoubleHashMap2.put((int) '4', (double) 2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        boolean boolean14 = iterator13.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 1);
        double double6 = openIntToDoubleHashMap2.remove((-1));
        double double8 = openIntToDoubleHashMap2.get((-1));
        double double10 = openIntToDoubleHashMap2.get(1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        iterator8.advance();
        boolean boolean12 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        boolean boolean13 = iterator10.hasNext();
        boolean boolean14 = iterator10.hasNext();
        boolean boolean15 = iterator10.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
        iterator12.advance();
        boolean boolean14 = iterator12.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.get((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 10, (-1.0d));
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        double double6 = openIntToDoubleHashMap2.get(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap7.put((int) (byte) 1, (double) 2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap7.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        int int6 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap4.iterator();
        int int8 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        boolean boolean11 = openIntToDoubleHashMap4.containsKey(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double13 = openIntToDoubleHashMap1.put((int) '4', (double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, 32.0d);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (-1.0f));
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
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean14 = openIntToDoubleHashMap9.containsKey((int) (short) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int5 = openIntToDoubleHashMap2.size();
        double double7 = openIntToDoubleHashMap2.get((int) (byte) 10);
        double double9 = openIntToDoubleHashMap2.get(3);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        double double21 = iterator14.value();
        double double22 = iterator14.value();
        boolean boolean23 = iterator14.hasNext();
        double double24 = iterator14.value();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        double double13 = openIntToDoubleHashMap9.get((int) (byte) 1);
        boolean boolean15 = openIntToDoubleHashMap9.containsKey((int) ' ');
        double double17 = openIntToDoubleHashMap9.get((int) '4');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap16);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap17.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap19 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        iterator7.advance();
        boolean boolean9 = iterator7.hasNext();
        double double10 = iterator7.value();
        boolean boolean11 = iterator7.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap14.iterator();
        iterator16.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap4.put((int) 'a', (double) (short) -1);
        int int8 = openIntToDoubleHashMap4.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        double double4 = openIntToDoubleHashMap2.get((int) ' ');
        double double6 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.remove(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get(0);
        int int8 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double5 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double7 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        double double9 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap1.get((int) 'a');
        double double14 = openIntToDoubleHashMap1.put(32, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        double double8 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap13.iterator();
        boolean boolean18 = iterator17.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = iterator17.key();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        double double14 = openIntToDoubleHashMap12.remove((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap12.iterator();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        int int5 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        java.lang.Class<?> wildcardClass21 = iterator14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int15 = openIntToDoubleHashMap14.size();
        boolean boolean17 = openIntToDoubleHashMap14.containsKey((int) (byte) 100);
        double double20 = openIntToDoubleHashMap14.put((int) ' ', (double) (byte) 10);
        double double22 = openIntToDoubleHashMap14.get((int) (short) 0);
        int int23 = openIntToDoubleHashMap14.size();
        java.lang.Class<?> wildcardClass24 = openIntToDoubleHashMap14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove((int) (short) 10);
        double double10 = openIntToDoubleHashMap2.put((int) '#', (double) '4');
        int int11 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 100.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        double double6 = openIntToDoubleHashMap1.get(0);
        double double9 = openIntToDoubleHashMap1.put((int) (short) 0, (double) ' ');
        double double12 = openIntToDoubleHashMap1.put((int) 'a', (double) 2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        double double8 = openIntToDoubleHashMap1.put((int) (byte) 1, Double.NaN);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        double double8 = openIntToDoubleHashMap5.put((int) ' ', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap3.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get(0);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        int int10 = openIntToDoubleHashMap1.size();
        double double12 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        double double7 = openIntToDoubleHashMap3.remove(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey(0);
        double double10 = openIntToDoubleHashMap1.put((int) (short) 1, (double) (short) 10);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 1.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double10 = openIntToDoubleHashMap1.get((int) (short) 100);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) 'a');
        double double16 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 100L);
        int int17 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap19 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(100);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 10, (-1.0d));
        double double12 = openIntToDoubleHashMap1.get(10);
        double double14 = openIntToDoubleHashMap1.get((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        double double4 = openIntToDoubleHashMap1.remove(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.put(1, 10.0d);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        double double7 = openIntToDoubleHashMap2.put(2, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35, (double) 97);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((-1), (double) (byte) 0);
        double double9 = openIntToDoubleHashMap2.put((int) '4', (double) 1L);
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) 0.0f);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        java.lang.Class<?> wildcardClass2 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (short) 0);
        double double4 = openIntToDoubleHashMap2.get(0);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        double double17 = openIntToDoubleHashMap1.put(32, (double) 32);
        boolean boolean19 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) '#');
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double6 = openIntToDoubleHashMap2.put((int) (byte) -1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double12 = openIntToDoubleHashMap1.put((int) 'a', (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 1.0f);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double11 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 10.0f);
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator14.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 100);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 100, (double) 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) 100);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(32);
        double double9 = openIntToDoubleHashMap2.remove((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        double double13 = iterator10.value();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get(2);
        double double6 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        double double8 = openIntToDoubleHashMap2.remove((int) (short) 1);
        double double11 = openIntToDoubleHashMap2.put(1, (double) (short) 10);
        double double14 = openIntToDoubleHashMap2.put(2, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap2.iterator();
        iterator15.advance();
        iterator15.advance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 1);
        double double4 = openIntToDoubleHashMap2.remove(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int13 = openIntToDoubleHashMap12.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap12.iterator();
        iterator14.advance();
        boolean boolean16 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        boolean boolean11 = iterator9.hasNext();
        boolean boolean12 = iterator9.hasNext();
        iterator9.advance();
        boolean boolean14 = iterator9.hasNext();
        int int15 = iterator9.key();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        int int14 = iterator10.key();
        int int15 = iterator10.key();
        double double16 = iterator10.value();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        int int9 = iterator5.key();
        boolean boolean10 = iterator5.hasNext();
        double double11 = iterator5.value();
        boolean boolean12 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) (-1.0f));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        double double8 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.get(10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        boolean boolean18 = openIntToDoubleHashMap16.containsKey(2);
        boolean boolean20 = openIntToDoubleHashMap16.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap21 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap16);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator22 = openIntToDoubleHashMap21.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap5.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap5.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, 32.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 0.0f);
        int int3 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) 32);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
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
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 100L);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 100);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(100);
        int int6 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        boolean boolean8 = iterator7.hasNext();
        boolean boolean9 = iterator7.hasNext();
        boolean boolean10 = iterator7.hasNext();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap13.iterator();
        int int17 = openIntToDoubleHashMap13.size();
        double double19 = openIntToDoubleHashMap13.get(0);
        double double22 = openIntToDoubleHashMap13.put(2, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        double double9 = openIntToDoubleHashMap1.put((int) (short) 100, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        boolean boolean13 = iterator10.hasNext();
        int int14 = iterator10.key();
        int int15 = iterator10.key();
        boolean boolean16 = iterator10.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        double double9 = openIntToDoubleHashMap1.get(1);
        double double11 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int12 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 10L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double8 = openIntToDoubleHashMap5.remove(32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        int int6 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap4.iterator();
        int int8 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean17 = openIntToDoubleHashMap2.containsKey((int) (short) 100);
        int int18 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap11.remove((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int6 = openIntToDoubleHashMap5.size();
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        double double6 = openIntToDoubleHashMap3.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) 1);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        boolean boolean7 = openIntToDoubleHashMap4.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap4.iterator();
        double double10 = openIntToDoubleHashMap4.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        double double13 = iterator5.value();
        boolean boolean14 = iterator5.hasNext();
        int int15 = iterator5.key();
        boolean boolean16 = iterator5.hasNext();
        java.lang.Class<?> wildcardClass17 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean14 = openIntToDoubleHashMap12.containsKey(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 1);
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 97);
        double double4 = openIntToDoubleHashMap2.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap11.get((int) (short) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove(3);
        boolean boolean7 = openIntToDoubleHashMap3.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator22 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = iterator22.key();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        int int9 = iterator5.key();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        double double12 = iterator5.value();
        double double13 = iterator5.value();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 100L);
        double double5 = openIntToDoubleHashMap2.put(2, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap15.remove(100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        double double6 = openIntToDoubleHashMap1.get(0);
        double double9 = openIntToDoubleHashMap1.put((int) (short) 0, (double) ' ');
        int int10 = openIntToDoubleHashMap1.size();
        double double12 = openIntToDoubleHashMap1.remove(0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        double double12 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        int int10 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = iterator11.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = iterator11.key();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) 'a');
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(97);
        double double9 = openIntToDoubleHashMap2.remove((int) (short) 10);
        double double11 = openIntToDoubleHashMap2.get(10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) (-1));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        double double11 = openIntToDoubleHashMap1.remove(32);
        double double14 = openIntToDoubleHashMap1.put((int) (short) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int4 = openIntToDoubleHashMap1.size();
        double double6 = openIntToDoubleHashMap1.get((int) (short) 0);
        int int7 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove(1);
        double double6 = openIntToDoubleHashMap2.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 10);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double5 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double7 = openIntToDoubleHashMap1.get(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        double double7 = openIntToDoubleHashMap2.put((int) '4', 0.0d);
        double double10 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) 0);
        int int11 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap12.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        double double14 = openIntToDoubleHashMap1.remove(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.remove((-1));
        int int6 = openIntToDoubleHashMap2.size();
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 'a');
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap14.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        java.lang.Class<?> wildcardClass11 = iterator8.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 0.0d);
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
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        double double15 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1L);
        double double17 = openIntToDoubleHashMap1.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey(32);
        int int17 = openIntToDoubleHashMap1.size();
        double double20 = openIntToDoubleHashMap1.put(2, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap9.get(0);
        double double13 = openIntToDoubleHashMap9.get((int) 'a');
        double double15 = openIntToDoubleHashMap9.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap9.iterator();
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1.0f));
        double double3 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double9 = openIntToDoubleHashMap5.put((int) 'a', (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 1.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 1);
        double double6 = openIntToDoubleHashMap2.get(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
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
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap2.remove((int) (short) 0);
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        int int13 = iterator10.key();
        boolean boolean14 = iterator10.hasNext();
        double double15 = iterator10.value();
        boolean boolean16 = iterator10.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 2);
        double double7 = openIntToDoubleHashMap2.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (short) 1);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass8 = iterator7.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap6.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        double double13 = openIntToDoubleHashMap6.put(2, (double) 3);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(3, (double) 1L);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 32);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        double double11 = openIntToDoubleHashMap8.put((int) (byte) 100, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        double double7 = openIntToDoubleHashMap2.put(100, 100.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        boolean boolean10 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        double double5 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        double double13 = openIntToDoubleHashMap1.put(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        int int16 = iterator14.key();
        boolean boolean17 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        boolean boolean8 = iterator5.hasNext();
        boolean boolean9 = iterator5.hasNext();
        int int10 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap2.put(0, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 35);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        double double15 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(1, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = iterator8.key();
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
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        boolean boolean13 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        double double16 = openIntToDoubleHashMap2.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double8 = openIntToDoubleHashMap5.put((int) 'a', (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap5.iterator();
        boolean boolean10 = iterator9.hasNext();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey(0);
        int int9 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((-1));
        int int12 = openIntToDoubleHashMap9.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
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
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) '#');
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        boolean boolean13 = iterator5.hasNext();
        int int14 = iterator5.key();
        double double15 = iterator5.value();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
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
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        double double6 = openIntToDoubleHashMap3.get(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get((int) (short) 100);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = iterator8.key();
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
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        double double15 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1L);
        double double18 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 2);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 1, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.get(35);
        boolean boolean12 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.get((int) (short) 100);
        int int4 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
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
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
        iterator12.advance();
        boolean boolean14 = iterator12.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        int int3 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass5 = iterator4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        int int11 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double6 = openIntToDoubleHashMap2.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.remove(0);
        int int10 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        double double8 = openIntToDoubleHashMap4.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap4.iterator();
        double double11 = openIntToDoubleHashMap4.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap4.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean9 = openIntToDoubleHashMap7.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap7.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double6 = openIntToDoubleHashMap1.put(0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        double double9 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) 3);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 10L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove((-1));
        int int5 = openIntToDoubleHashMap2.size();
        double double8 = openIntToDoubleHashMap2.put((int) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(3, (double) 1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (-1.0f));
        int int3 = openIntToDoubleHashMap2.size();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap2.put(32, (double) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        boolean boolean14 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean15 = openIntToDoubleHashMap13.containsKey((int) (short) -1);
        double double17 = openIntToDoubleHashMap13.get((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap18 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        double double20 = openIntToDoubleHashMap18.remove(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap16.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get(1);
        double double13 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        boolean boolean15 = iterator14.hasNext();
        iterator14.advance();
        double double17 = iterator14.value();
        boolean boolean18 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 1);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) -1, (double) '#');
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double8 = openIntToDoubleHashMap2.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap5.containsKey((int) (short) 1);
        double double11 = openIntToDoubleHashMap5.put((int) (byte) 0, 2.0d);
        double double13 = openIntToDoubleHashMap5.remove((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove(100);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        int int9 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        boolean boolean18 = openIntToDoubleHashMap16.containsKey(2);
        double double20 = openIntToDoubleHashMap16.remove(100);
        int int21 = openIntToDoubleHashMap16.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((-1));
        int int5 = openIntToDoubleHashMap2.size();
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        int int9 = iterator5.key();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        double double12 = iterator5.value();
        double double13 = iterator5.value();
        int int14 = iterator5.key();
        double double15 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double12 = openIntToDoubleHashMap1.put((int) 'a', (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        int int15 = openIntToDoubleHashMap13.size();
        java.lang.Class<?> wildcardClass16 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double14 = openIntToDoubleHashMap1.get(100);
        double double16 = openIntToDoubleHashMap1.get((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double20 = openIntToDoubleHashMap17.put((int) '#', (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap6.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        double double11 = openIntToDoubleHashMap9.get((int) (short) 10);
        int int12 = openIntToDoubleHashMap9.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean13 = openIntToDoubleHashMap11.containsKey(2);
        double double15 = openIntToDoubleHashMap11.get(35);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap1.get((int) (short) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35, (double) (byte) 1);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap10);
        double double14 = openIntToDoubleHashMap10.put((int) (byte) -1, 32.0d);
        boolean boolean16 = openIntToDoubleHashMap10.containsKey(97);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        int int5 = openIntToDoubleHashMap2.size();
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap2.get(35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
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
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 10L);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        int int17 = iterator14.key();
        boolean boolean18 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        int int9 = iterator5.key();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        double double12 = iterator5.value();
        int int13 = iterator5.key();
        double double14 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 2);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap12.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        double double8 = iterator5.value();
        boolean boolean9 = iterator5.hasNext();
        boolean boolean10 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int12 = openIntToDoubleHashMap11.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) (short) -1);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put((int) (short) 1, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        double double13 = openIntToDoubleHashMap9.put(1, (double) 'a');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', 2.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        boolean boolean12 = openIntToDoubleHashMap9.containsKey((int) (byte) 1);
        double double15 = openIntToDoubleHashMap9.put((int) (short) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 35);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        double double4 = openIntToDoubleHashMap2.remove(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) '#');
        double double5 = openIntToDoubleHashMap2.put((int) '#', (double) 0L);
        int int6 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        double double20 = openIntToDoubleHashMap1.put((int) '4', (double) 32);
        double double22 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator23 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = iterator23.key();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 35.0d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
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
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 100);
        int int3 = openIntToDoubleHashMap2.size();
        int int4 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double9 = openIntToDoubleHashMap1.put((int) (byte) 1, 52.0d);
        double double11 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        boolean boolean8 = iterator7.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        boolean boolean13 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap1.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap1.iterator();
        boolean boolean18 = iterator17.hasNext();
        iterator17.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        int int13 = iterator11.key();
        int int14 = iterator11.key();
        boolean boolean15 = iterator11.hasNext();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        boolean boolean16 = iterator11.hasNext();
        int int17 = iterator11.key();
        boolean boolean18 = iterator11.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 1L);
        double double4 = openIntToDoubleHashMap2.remove(3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        boolean boolean10 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        iterator16.advance();
        int int18 = iterator16.key();
        boolean boolean19 = iterator16.hasNext();
        double double20 = iterator16.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int14 = openIntToDoubleHashMap13.size();
        double double17 = openIntToDoubleHashMap13.put((int) (short) 100, (double) (short) 10);
        int int18 = openIntToDoubleHashMap13.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap19 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap20 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        double double22 = openIntToDoubleHashMap13.get((int) '#');
        java.lang.Class<?> wildcardClass23 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 10);
        int int5 = openIntToDoubleHashMap2.size();
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1.0f));
        double double3 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap4.remove((int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        boolean boolean9 = iterator5.hasNext();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        int int13 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int6 = openIntToDoubleHashMap2.size();
        double double9 = openIntToDoubleHashMap2.put((int) (byte) 100, 32.0d);
        double double12 = openIntToDoubleHashMap2.put((int) (short) 10, (double) 10L);
        int int13 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap8.get((int) (short) 0);
        boolean boolean12 = openIntToDoubleHashMap8.containsKey((int) '4');
        int int13 = openIntToDoubleHashMap8.size();
        boolean boolean15 = openIntToDoubleHashMap8.containsKey(97);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap14.iterator();
        boolean boolean17 = iterator16.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap13.iterator();
        iterator16.advance();
        boolean boolean18 = iterator16.hasNext();
        int int19 = iterator16.key();
        int int20 = iterator16.key();
        boolean boolean21 = iterator16.hasNext();
        double double22 = iterator16.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap4.getClass();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap1.remove(100);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) '4');
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 10);
        double double6 = openIntToDoubleHashMap2.get((int) (byte) 1);
        int int7 = openIntToDoubleHashMap2.size();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, 10.0d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int7 = openIntToDoubleHashMap6.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        double double7 = openIntToDoubleHashMap3.put(1, (double) 10);
        int int8 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap2.containsKey(0);
        double double7 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) -1);
        double double4 = openIntToDoubleHashMap2.remove(0);
        double double6 = openIntToDoubleHashMap2.remove((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap4.iterator();
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
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        double double8 = openIntToDoubleHashMap1.put(10, (double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove(10);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double11 = openIntToDoubleHashMap2.remove(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double6 = openIntToDoubleHashMap2.get((int) (short) 10);
        double double9 = openIntToDoubleHashMap2.put(3, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap5.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (short) 100);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((-1), (double) (byte) 0);
        double double9 = openIntToDoubleHashMap2.put((int) '4', (double) 1L);
        double double11 = openIntToDoubleHashMap2.get((int) (short) 10);
        double double13 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        double double3 = openIntToDoubleHashMap1.get(100);
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap5.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 100);
        double double17 = openIntToDoubleHashMap1.put(100, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
        iterator12.advance();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int11 = openIntToDoubleHashMap10.size();
        boolean boolean13 = openIntToDoubleHashMap10.containsKey((int) (byte) 100);
        double double15 = openIntToDoubleHashMap10.get((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 2.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.remove(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap9.put((int) '4', (double) 100.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        boolean boolean18 = openIntToDoubleHashMap16.containsKey(2);
        int int19 = openIntToDoubleHashMap16.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap20 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) 32);
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) (byte) 1);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        boolean boolean13 = iterator11.hasNext();
        double double14 = iterator11.value();
        double double15 = iterator11.value();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 0.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 10);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        boolean boolean13 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (-1.0f));
        double double4 = openIntToDoubleHashMap2.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 10, 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        iterator11.advance();
        double double13 = iterator11.value();
        boolean boolean14 = iterator11.hasNext();
        double double15 = iterator11.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        double double13 = iterator11.value();
        double double14 = iterator11.value();
        double double15 = iterator11.value();
        double double16 = iterator11.value();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.remove((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        boolean boolean8 = openIntToDoubleHashMap3.containsKey(32);
        double double11 = openIntToDoubleHashMap3.put((int) (short) 10, (double) 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap8.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '#');
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100.0f);
        double double4 = openIntToDoubleHashMap1.put((int) ' ', (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        int int18 = iterator14.key();
        double double19 = iterator14.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap3.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap3.iterator();
        double double11 = openIntToDoubleHashMap3.remove((-1));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        double double13 = iterator5.value();
        double double14 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double8 = openIntToDoubleHashMap1.put((int) (byte) 10, 10.0d);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap15);
        boolean boolean19 = openIntToDoubleHashMap17.containsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        iterator11.advance();
        int int13 = iterator11.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35, 0.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(0);
        java.lang.Class<?> wildcardClass11 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
        double double3 = openIntToDoubleHashMap1.remove((-1));
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        double double9 = openIntToDoubleHashMap1.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = iterator10.hasNext();
        boolean boolean12 = iterator10.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        double double7 = openIntToDoubleHashMap3.remove((int) ' ');
        boolean boolean9 = openIntToDoubleHashMap3.containsKey((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        int int9 = openIntToDoubleHashMap1.size();
        double double12 = openIntToDoubleHashMap1.put(97, (double) 32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (-1));
        double double5 = openIntToDoubleHashMap2.put((int) 'a', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove((-1));
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        double double11 = iterator8.value();
        double double12 = iterator8.value();
        boolean boolean13 = iterator8.hasNext();
        iterator8.advance();
        boolean boolean15 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        double double4 = openIntToDoubleHashMap2.get(32);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey(32);
        double double18 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(0);
        double double11 = openIntToDoubleHashMap1.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
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
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int12 = openIntToDoubleHashMap11.size();
        double double15 = openIntToDoubleHashMap11.put(3, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        double double9 = openIntToDoubleHashMap1.put((int) '4', (double) 'a');
        double double12 = openIntToDoubleHashMap1.put((int) (short) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double9 = openIntToDoubleHashMap5.put((-1), (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap5.iterator();
        iterator10.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        int int7 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        double double3 = openIntToDoubleHashMap1.remove((int) ' ');
        double double5 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double9 = openIntToDoubleHashMap1.get((int) ' ');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap7.get(2);
        double double11 = openIntToDoubleHashMap7.remove(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        int int2 = openIntToDoubleHashMap0.size();
        double double5 = openIntToDoubleHashMap0.put((int) (short) -1, (double) 10.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap6.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        double double5 = openIntToDoubleHashMap1.remove(0);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.get(35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0L);
        int int3 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        boolean boolean17 = iterator16.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        boolean boolean6 = iterator5.hasNext();
        boolean boolean7 = iterator5.hasNext();
        boolean boolean8 = iterator5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = iterator5.key();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap6.containsKey(97);
        int int9 = openIntToDoubleHashMap6.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean3 = iterator2.hasNext();
        boolean boolean4 = iterator2.hasNext();
        boolean boolean5 = iterator2.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
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
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, 52.0d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 1);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap6.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap6.put((int) ' ', (double) 1);
        double double11 = openIntToDoubleHashMap6.remove(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap15.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        double double5 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        double double8 = openIntToDoubleHashMap1.remove((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        double double8 = openIntToDoubleHashMap1.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        iterator9.advance();
        boolean boolean11 = iterator9.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean11 = openIntToDoubleHashMap1.containsKey(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
        boolean boolean7 = iterator6.hasNext();
        java.lang.Class<?> wildcardClass8 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        double double15 = openIntToDoubleHashMap2.get((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap2.iterator();
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        double double13 = openIntToDoubleHashMap9.put((int) 'a', (double) '4');
        double double15 = openIntToDoubleHashMap9.get((int) (byte) 100);
        double double17 = openIntToDoubleHashMap9.get((int) (byte) 100);
        double double20 = openIntToDoubleHashMap9.put((int) (byte) 0, (double) 100.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap21 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        java.lang.Class<?> wildcardClass22 = openIntToDoubleHashMap21.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double10 = openIntToDoubleHashMap8.remove(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        boolean boolean10 = iterator5.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put(0, (double) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        iterator11.advance();
        double double13 = iterator11.value();
        boolean boolean14 = iterator11.hasNext();
        boolean boolean15 = iterator11.hasNext();
        int int16 = iterator11.key();
        int int17 = iterator11.key();
        int int18 = iterator11.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap3.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        double double6 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        double double8 = openIntToDoubleHashMap2.remove(0);
        double double10 = openIntToDoubleHashMap2.get((int) '#');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get(100);
        double double5 = openIntToDoubleHashMap1.get((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.put((int) '4', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        double double6 = openIntToDoubleHashMap1.put(1, (double) 10L);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) '#');
        double double11 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        int int5 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        boolean boolean13 = iterator11.hasNext();
        double double14 = iterator11.value();
        boolean boolean15 = iterator11.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double5 = openIntToDoubleHashMap1.get(0);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        double double11 = openIntToDoubleHashMap1.get(0);
        double double14 = openIntToDoubleHashMap1.put(97, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int5 = openIntToDoubleHashMap4.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openIntToDoubleHashMap4.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        double double8 = iterator5.value();
        int int9 = iterator5.key();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        int int12 = iterator5.key();
        double double13 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.put((int) ' ', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean12 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

